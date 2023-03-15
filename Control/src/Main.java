public class Main {
        public static void main(String[] ars) {
            int[] income  = new int[] {100, 50, 125, 356, 200, 500, 25};
            SalesManager salesManager = new SalesManager(income);
            System.out.println(salesManager.min());
            System.out.println(salesManager.max());
            System.out.println(salesManager.cropped_average());
        }
    }
