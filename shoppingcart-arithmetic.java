import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //shopping cart program
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello! welcome to the online convenience store");
        System.out.println("what would you like to buy?");
        String item;
        item=scan.nextLine();
        System.out.println("what is the price of each quantity?");
        double price;
        price= scan.nextDouble();
        System.out.println("how much quantity would you like?");
        int q;
        q = scan.nextInt();
        double total= q*price;
        System.out.println("Your Total price is " + total+ " rupees");
        System.out.println("Thank you for shopping with us :)");








        scan.close();






    }
}