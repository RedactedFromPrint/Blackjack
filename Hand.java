
/**
 * Write a description of class Hand here.
 * 
 * @author Alexander Malos
 * @version 9/26/17
 */
import java.lang.Math;
public class Hand{
    // instance variables - replace the example below with your own
    private int total;
    private double rand1;
    private double rand2;

    public Hand(){
        // initialise instance variables
        rand1 = ((Math.random())*10)+1;
        rand2 = ((Math.random())*10)+1;
        total = (int)rand1 + (int)rand2;
    }
    
    public int getTotal(){
        return total;
    }
    
    public int hit(){
        total += (int)(((Math.random())*10)+1);
        return total;
    }
}
