
import java.util.Scanner;


class KmMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of KiloMeters: ");
        float kiloMeters = sc.nextFloat();
        float constant =  0.621371f;
        float miles = kiloMeters * constant;
        System.out.println("The miles are: "+miles);
    }
}