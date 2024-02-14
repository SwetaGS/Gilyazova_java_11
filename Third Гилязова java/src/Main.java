//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte[] numArray = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные элементы массива: ");
            for(byte i=0; i<numArray.length; i++)
            {
                if(numArray[i]%2==0)
                {
                    System.out.print(numArray[i] + " ");
                }
            }
        }
    }