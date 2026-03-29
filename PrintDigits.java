class PrintDigits {
    public static void getPrintDigits(int num) {
        while(num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }
    }
}