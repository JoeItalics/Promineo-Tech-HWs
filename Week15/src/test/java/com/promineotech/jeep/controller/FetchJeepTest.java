/**
 * 
 */
package com.promineotech.jeep.controller;
import static org.assertj.core.api.Assertions.assertThat;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import com.promineotech.jeep.controller.support.FetchJeepTestSupport;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Sql(scripts = {"classpath:flyway/migrations/V1.0__Jeep_Schema.sql", "classpath:flyway/migrations/V1.1__Jeep_Data.sql"}, config = @SqlConfig(encoding = "utf-8"))

class FetchJeepTest extends FetchJeepTestSupport{
  
  @Autowired
  private TestRestTemplate restTemplate;
  
  @LocalServerPort
  private int serverPort;
  @Disabled
  @Test
  void testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied() {
    // Given a valid model, trim and URI
    JeepModel model = JeepModel.WRANGLER;
    String trim = "Sport";
    String uri = (String.format("http://localhost:%d/jeeps?model=%s&trim=%s", serverPort, model, trim));
        
    
    
    // When: a connection is made to the URL
    ResponseEntity<List<Jeep>> response = 
        restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
    
    
    // Then: a success (200 OK ) Status code is returned
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    
    // And: the actual list returned is the same as the expected list

    List<Jeep> actual = response.getBody();
    List<Jeep> expected = buildExpected();
   
    assertThat(actual).isEqualTo(expected);
    
  }
  
  
// INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) VALUES('WRANGLER', 'Sport', 2, 17, 28475.00);
//  INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) VALUES('WRANGLER', 'Sport', 4, 17, 31975.00);


  
}


//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//class FetchJeepTest extends FetchJeepTestSupport {
//
//  @Test
//  void testThatJeepsAreReturnedWhenAValidModelAndTrimAreSuppled() {
//    // Given a valid model, trim and URI
//    JeepModel model = JeepModel.WRANGLER;
//    String trim = "Sport";
//    String uri = String.format("%s?mdoel=%s&trim=%s", getBaseUri(), model, trim);
//    
//    
//    // When: a connection is made to the URL
//    ResponseEntity<List<Jeep>> response = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
//    
//    
//    // Then: a success (200 OK ) Status code is returned
//    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//    
//  }
//
//}
