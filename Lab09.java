/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
       Display.setSpeed(5);
		 Athlete monica = new Athlete(1, 1, Display.EAST, 0);
        
       monica.move();
       monica.move();
       monica.move();
       monica.move();
       monica.move();
       monica.move();
       
       for (int k = 1; k <= 7; k++) {
       int count = 0;
       while (monica.nextToABeeper()){
       monica.pickBeeper();
       count++;}
       monica.move();
       for (int g = 1; g <= count; count--){
       monica.putBeeper();}
       monica.turnAround();
       if (monica.frontIsClear()) {
       monica.move();}
       if (monica.frontIsClear()) {
       monica.move();}
       monica.turnAround();}
       monica.turnAround();   
  }
}
