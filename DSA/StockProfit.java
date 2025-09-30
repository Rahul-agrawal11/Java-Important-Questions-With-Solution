class StockProfit {
    public static void main (String[] args) {
        int price[] = {7,5,1,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int k = 0;
        int i;
        for(i = 0; i < price.length; i++) {
           if (min > price[i]) {
               min = price[i];
                k = i;
           }
        }
        // System.out.println(k);
   
        for( ; k < price.length; k++) {
          max = Math.max(price[k],max);
        }
        // System.out.println(min);
        // System.out.println(max);
        System.out.println("Total Profit: "+(max-min));
    }
}