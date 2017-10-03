
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
       while (cpuHand.getTotal() < 15){
           cpuHand.hit();
       }
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
            else if (playerHand.getTotal() == 21){
                if (playerHand.getTotal() > cpuHand.getTotal()){
                    System.out.println("You win! Your hand of " + playerHand.getTotal() + " beat the CPU's total of " + cpuHand.getTotal());
                }
                else {
                    System.out.println("You tied at a total of " + playerHand.getTotal());
                }
                stop = true;
            }
            else {
                System.out.println("Your new total is " + playerHand.getTotal());
            }
        }
        else if (choice.equals("s")){
            if (cpuHand.getTotal() > 21){
                System.out.println("The CPU busted! You win with a total of " + playerHand.getTotal());
            }
            else if (playerHand.getTotal() > cpuHand.getTotal()){
                System.out.println("You win! Your hand of " + playerHand.getTotal() + " beat the CPU's total of " + cpuHand.getTotal());
            }
            else if (playerHand.getTotal() < cpuHand.getTotal() && cpuHand.getTotal() < 22){
                System.out.println("You lose. Your hand of " + playerHand.getTotal() + " lost to the CPU's total of " + cpuHand.getTotal());
            } 
            else {
                System.out.println("You tied at a total of " + playerHand.getTotal());
            }
            stop = true;
        }
        else {
            System.out.println("Invalid input");
        }
       }
   }
}
