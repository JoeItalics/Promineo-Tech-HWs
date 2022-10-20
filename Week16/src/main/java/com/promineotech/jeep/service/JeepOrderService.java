/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.Optional;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;


public interface JeepOrderService {

  
  Order createOrder(OrderRequest orderRequest);

}
