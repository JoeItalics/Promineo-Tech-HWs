// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        

        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
        System.out.println(ages[0] - ages[ages.length -1] + "\n");
        

        float avgAge = 0;
        for(int age : ages){avgAge+=age;}
        System.out.println(avgAge / ages.length + "\n");
        
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        float avgLetters = 0;
        for(String name : names){ avgLetters += name.length();}
        
        String allNames = "";    
        for(String newName : names){allNames += newName+ " ";}


        
        System.out.print(avgLetters / names.length + "\n");
        System.out.print("All names: " + allNames + "\n");
        
        int[] nameLengths = new int[names.length];
        for(int i = 0; i<names.length; i++){nameLengths[i] = names[i].length();}

        
        int sumOfAllLengths = 0;
        for(int nameLength : nameLengths){sumOfAllLengths+= nameLength;}
        System.out.println("Sum of All Lengths: "+sumOfAllLengths + "\n");
        
        
        System.out.println(concatonateString("Hello", 3) + "\n");
        
        System.out.println(createFullName("Joseph", "Italico") + "\n");
        
        // Refrencing nameLengths on line 31.
        System.out.println(checkSum(nameLengths) + "\n");
        
        double[] doubleArray = {20, 33, 330, 12};
        System.out.println(returnDoubleAvg(doubleArray) + "\n");
        
        double[] testArrayOne = {10,20,30,50};
        double[] testArrayTwo = {20,33,54};
        System.out.println(takeTwoArrays(testArrayOne, testArrayTwo) + "\n");
        
        System.out.println(willBuyDrink(true, 20.50) + "\n");
        
        //Custom metod
        double[] studentScores = {80.5, 99, 43.8, 78, 82.3};
        System.out.println("Student Avg: " + getStudentAvg(studentScores) + "\n");
    }
    
    public static String concatonateString(String word, int n){
        String output = "";
        for(int i = 0; i< n; i++){
            output += word;
        }
        return output;
    }
    
    public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    
    
    
    public static boolean checkSum(int[] arr){
        boolean greaterThan100 = false;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        if( sum > 100){
            greaterThan100 = true;
        }
        
        return greaterThan100;
    }
    
    
    public static int returnDoubleAvg(double[] arr){
        int subTotal = 0;
        for(int i = 0; i<arr.length; i++){
            subTotal += arr[i];
        }
        return subTotal / arr.length;
    }
    
    
    public static boolean takeTwoArrays(double[] arr1, double[] arr2){
        double firstArrayValue = 0;
        double secondArrayValue = 0;
        boolean output = false;
        
        for(int i = 0; i< arr1.length; i++){firstArrayValue += arr1[i];}
        for(int i = 0; i< arr2.length; i++){secondArrayValue += arr2[i];}
        
        if (firstArrayValue > secondArrayValue){
            output = true;
        }
        
        return output;
        
    }
    
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
        boolean buyDrink = false;
        
        if(isHotOutside && moneyInPocket >= 10.50){
            buyDrink = true;
        }
        return buyDrink;
        
    }    
    public static int getStudentAvg(double[] arr){
        // My custom method will easily return the avg score for a class of students tests scores dynamiclly
        // So no matter what size the class is you will always get an avg of the classes score.
        int studentScoreSum = 0;
        for(int i=0; i< arr.length; i++){studentScoreSum += arr[i];}
        return studentScoreSum / arr.length;
    }
        
        
        
    
    
    
}
