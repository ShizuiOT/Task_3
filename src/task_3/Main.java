package task_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        in.close();
        Word str1 = new Word(str);
        System.out.println("The number of all the vowels: "+ str1.skolko());
        System.out.println("The list of the words: ");
        str1.sort();
    }
}
