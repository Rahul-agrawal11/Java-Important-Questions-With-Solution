
class Loop {

    public static void main(String[] args) {
        // Problem 1

        /* int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        System.out.println();
        } */
        // Problem 2

        /* int n = 20;
        int sum = 0;
        while (n>0) {
            sum += n;
            n -= 2;
        }
        System.out.println("Sum: "+ sum); */
        // Problem 3

        /* int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + n*i); 
        } */
        // Problem 4

        /* int n = 10;
       for (int i = 10; i>0; i--) {
        System.out.println(n + "X" + i + "=" + n*i);
       }   */
        // Problem 5

        /* int n = 6;
       int fact = 1;
       for (int i = 1; i<=n; i++) {
        fact *= i;
       }
       System.out.println(fact);   */
        // Problem 6

        /*  int n = 6;
      int fact = 1;
      int i = 1;
      while (i<=n) {
        fact *= i;
        i++;
      }
      System.out.println(fact); */
        // Problem 7
       /* int n = 4;
        for (int i = n; i > 0; i--) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        } */

        // Problem 8

        /* int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int plus = n*i;
            sum += plus;
            System.out.println(n + "X" + i + "=" + plus); 
        }
        System.out.println("Sum: "+sum); */

        // Problem 9

        int n = 20;
        int sum = 0;
        for (int i = n; i>1; i-=2) {
            sum += i;
        }
        System.out.println("Sum: "+ sum);
    }
}
