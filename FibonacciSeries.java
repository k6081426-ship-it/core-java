class FibonacciSeries {
    public static void getFibonacciSeries(int n) {
        int a = 0, b = 1, count = 1;
        while(count <= n) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
            count++;
        }
		}
		}