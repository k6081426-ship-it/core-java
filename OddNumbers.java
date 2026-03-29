class OddNumbers {
    public static void getOddNumbers(int num) {
        int i = 1;

        while(i <= 20) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}