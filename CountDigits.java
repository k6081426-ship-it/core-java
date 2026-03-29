class CountDigits {
    public static void getCountDigits(int num) {
        int count = 0;
        while(num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}