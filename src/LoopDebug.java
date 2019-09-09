import java.util.Scanner;

public class LoopDebug {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String userInput;

        System.out.println("Say something:");
        userInput = keyboard.next();
        do{
            System.out.println(userInput);
            System.out.println("Say something:");
            userInput = keyboard.next();
        }
        while(userInput != "");
        }

    }

