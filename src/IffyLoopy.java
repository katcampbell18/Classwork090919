import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[]args){
         Scanner keyboard = new Scanner(System.in);
         String value = "";
         String Output= null;
         String s = "";

         while(true) {
             System.out.println("Enter something:");
             value = keyboard.nextLine();
             if(Output == null){
                 s = s + " " + value;
             }
             System.out.println(s);
         }
    }
}
