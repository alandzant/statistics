public class Main {
        public static void main(String[] ars) {
            long[] income  = new long[] {100, 50, 125, 356, 200, 500, 25};
            SalesManager salesManager = new SalesManager(income);
            System.out.println(salesManager.cropped_average());
        }
    }
