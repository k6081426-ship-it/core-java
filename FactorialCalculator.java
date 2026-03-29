class FactorialCalculator {
    public static void getFactorialCalculator(int n) {
        int i = 1;
        long fact = 1;

        while(i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial = " + fact);
    }
}