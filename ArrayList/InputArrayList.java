
import java.util.ArrayList;
import java.util.Scanner;

// Taking Input of ArrayList by user 
class InputArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        // System.out.println("List: " + list);

		// Printing ArrayList Elements in num by for-each loop
        for (int num:list) {
			System.out.println("Num: " + num);
		}
    }
}
