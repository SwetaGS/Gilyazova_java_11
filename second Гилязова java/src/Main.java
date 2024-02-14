//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку : ");
        String first = in.nextLine();
        System.out.print("Введите вторую строку : ");
        String second = in.nextLine();
        if(first.equals(second)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки не идентичны");
        }
        }
    }