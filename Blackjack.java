
/**
 * Write a description of class Blackjack here.
 * 
 * @author Alexander Malos
 * @version 9/28/17
 */
import java.util.Scanner;
public class Blackjack{
   public static void main(){
       Hand playerHand = new Hand();
       Hand cpuHand = new Hand();
       System.out.println("You start with a total of " + playerHand.getTotal());
       boolean stop = false;
       while (stop == false){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to hit or stay? Input 'h' or 's'");
        String choice = scanner.next();
        if (choice.equals("h")){
            playerHand.hit();
            if (playerHand.getTotal() > 21){
                System.out.println("Bust! You had " + playerHand.getTotal());
                stop = true;
            }
            else {
                System.out.println("Your new total is " + playerHand.getTotal());
            }
        }
        else if (choice.equals("s")){
            stop = true;
        }
        else {
            System.out.println("Invalid input");
        }
       }
       
   }
}
