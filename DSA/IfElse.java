
import java.util.Random;
import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        
        // Problem I 
        /*int a = 10;
        if (a==11) {
            System.out.println("I am 11.");
        } else {
            System.out.println("I am not 11.");
        }
        */

       // Problem II
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject I marks:");
        int sub_1 = sc.nextInt();
        System.out.println("Enter Subject II marks:");
        int sub_2 = sc.nextInt();
        System.out.println("Enter Subject III marks:");
        int sub_3 = sc.nextInt();

        if (sub_1>100 || sub_2>100 || sub_3>100) {
            System.out.println("Marks can't be greater than 100.");
        } else {
            if (sub_1>=33 && sub_2>=33 && sub_3>=33) {
            System.out.println("You are pass.");
            float total = sub_1 + sub_2 + sub_3;
            float percentage = (total/300)*100;
            System.out.println("Percentege: "+percentage+"%");
        } else {
            System.out.println("You are fail.");
            }
        }
        */

       // Problem III
       /*Scanner sc = new Scanner(System.in);
       System.out.println("Enter your Income:");
       float income = sc.nextFloat();
        int tax_percentage;
        float tax;

       if (income<=250000) {
        tax_percentage = 0;
        tax = (income/100)*tax_percentage;
        System.out.println("Your Tax: "+tax);
       } else if (income>250000 && income<=500000) {
        tax_percentage = 5;
        tax = (income/100)*tax_percentage;
        System.out.println("Your Tax: "+tax);
       } else if (income>500000 && income<=1000000) {
        tax_percentage = 10;
        tax = (income/100)*tax_percentage;
        System.out.println("Your Tax: "+tax);
       } else {
        tax_percentage = 20;
        tax = (income/100)*tax_percentage;
        System.out.println("Your Tax: "+tax);
       }
       */

    // Problem IV
    /* Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number to check Weekday- ");
    int num = sc.nextInt();
        switch(num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter Number between 1 and 7.");
        }
        */

       // Problem V
       /* Scanner sc = new Scanner(System.in);
       System.out.println("Enter Year: ");
       int year = sc.nextInt();

       if (year%4==0) {
        System.out.println(year+" is a leap year.");
       } else {
        System.out.println(year+ "is not a leap year.");
       } */

      // Problem VI
      /* Scanner sc = new Scanner(System.in);
      String website = sc.next();
      if (website.endsWith(".com")) {
        System.out.println(website + " is a Commercial Website.");
      } else if (website.endsWith(".org")) {
        System.out.println(website + " is an Organisation Website.");
      } else if (website.endsWith(".in")) {
        System.out.println(website + " is an Indian Website.");
      } */

    //  Problem VI
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int rounds = 0;
    int userscore = 0;
    int computerscore = 0;

    String choices[] = {"Rock","Paper","Scissor"};

    System.out.println("Welcome to Rock, Paper, Scissors!");
    System.out.println("Rules: Enter 0 for Rock, 1 for Paper, 2 for Scissors");

    while(rounds<5) {
        System.out.print("\nRound " + (rounds + 1) + " - Enter your choice (0=Rock, 1=Paper, 2=Scissors): ");
        int userChoice = sc.nextInt();

         if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input! Please enter 0, 1, or 2.");
            continue;
            }
        
        int computerChoice = rand.nextInt(3);

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie.");
        } else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You Win this round.");
            userscore++;
        } else {
            System.out.println("Computer win this round.");
            computerscore++;
            }
        rounds++;
        }
        System.out.println("\n--- Game Over ---");
        System.out.println("Your Score: " + userscore);
        System.out.println("Computer Score: " + computerscore);

        if (userscore > computerscore) {
            System.out.println("Congratulations! You are the overall winner!");
        } else if (computerscore > userscore) {
            System.out.println("Computer wins the game! Better luck next time.");
        } else {
            System.out.println("It's a tie overall!");
        }
    }
}