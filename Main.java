//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //MAD LIBS
        Scanner scan =new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("enter adjective");
        adjective1=scan.nextLine();
        System.out.println("enter noun");
        noun1=scan.nextLine();
        System.out.println("enter adjective");
        adjective2=scan.nextLine();
        System.out.println("enter verb");
        verb1=scan.nextLine();
        System.out.println("enter adjective");
        adjective3=scan.nextLine();


        System.out.println("I am a "+adjective1+" boy");
        System.out.println("and i love to be in the "+noun1);
        System.out.println("this is the most "+adjective2+" place i have ever been");
        System.out.println("i want to "+verb1+" immediately");
        System.out.println("this is just"+ adjective3);







    }
}