import java.util.Scanner;

public class App {
    // LMS2 изучение if, else if, else, а также знакомство с классом Scanner
    public static void main(String[] args) {
        System.out.println("Welcome to LMS!");
        System.out.println("Choose the command:");
        System.out.println("1 - add the book");
        System.out.println("2 - delete the book");
        System.out.println("3 - rename the book");
        System.out.println("4 - find the book");
        System.out.println("5 - book's list");
        System.out.println("6 - exit");

        Scanner scn = new Scanner(System.in);
        int choose = scn.nextInt();

        if(choose == 1) {
            System.out.println("you have choosen ADD command!");
        }else if(choose == 2) {
            System.out.println("you have choosen DELETE command!");
        }else if(choose == 3) {
            System.out.println("you have choosen RENAME command!");
        }else if(choose == 4) {
            System.out.println("you have choosen FIND command!");
        }else if(choose == 5) {
            System.out.println("you have choosen LIST command!");
        }else if(choose == 6) {
            System.out.println("you have choosen EXIT command!");
        }else{
            System.out.println("Wrong command!");
        }

    }
}
