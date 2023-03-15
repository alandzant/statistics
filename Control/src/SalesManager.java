public class SalesManager {
    protected int[] sales;

     public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
         for (int sale : sales) {
             if (sale > max) {
                    max = sale;
            }
         }
         return max;
     }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int cropped_average(){
         int total_sum =0;
        for (int sale: sales) {
            total_sum = total_sum + sale;
        }
        return (total_sum - (min() + max()))/(sales.length -2);
    }
}

