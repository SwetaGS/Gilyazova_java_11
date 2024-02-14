//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a : ");
        int a = in.nextInt();
        System.out.print("Input b : ");
        int b = in.nextInt();
        if (a < b) {System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a+b= "+ (a+b));
        System.out.println("a-b= "+ (a-b));
        System.out.println("a/b= "+ (a/b));
        System.out.println("a*b= "+ (a*b));
    }

}