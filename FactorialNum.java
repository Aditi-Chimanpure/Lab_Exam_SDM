public class FactorialNum {
    public static void main(String[] args) {
        int number = 4; 
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial of given number :  " + number + " is : " + factorial);
    }
}
