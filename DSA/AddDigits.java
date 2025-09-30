class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        while (num > 9) {
            if(num > 0) {
                int re = num % 10;
                num = num / 10;
                int sum = re + num;
                num = sum;
            }
        }
        System.out.println(num);
        // return num;
    }
}