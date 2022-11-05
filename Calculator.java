public class Calculator {
   
    public static void main(String[] args) {
       
       // create a new calculator object
       Calculator calculator = new Calculator();
       
       // use the object to perform addition, subtraction, multiplication and division
       int sum = calculator.add(5, 7);
       int difference = calculator.subtract(45, 11);
       int product = calculator.multiply(2, 9);
       int quotient = calculator.divide(10, 5);
       
       // print the results
       System.out.println("5 + 7 = " + sum);
       System.out.println("45 - 11 = " + difference);
       System.out.println("2 * 9 = " + product);
       System.out.println("10 / 5 = " + quotient);
    }
    
    public int add(int a, int b) {
       return a + b;
    }
    
    public int subtract(int a, int b) {
       return a - b;
    }
    
    public int multiply(int a, int b) {
       return a * b;
    }
    
    public int divide(int a, int b) {
       return a / b;
    }
 }