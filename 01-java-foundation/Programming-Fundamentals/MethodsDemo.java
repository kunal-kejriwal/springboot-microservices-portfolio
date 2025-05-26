public class MethodsDemo {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Sum: " + result);

        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5: " + factorialOf5);
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}
