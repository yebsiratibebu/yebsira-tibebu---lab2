
import java.util.*;
   
    public abstract class Thing extends ThingList { //abstract class the represents the  thing
      protected int row; //current row position
      protected int col; // current col position
      protected int dir; //dir: 0=North, 1=East, 2=South, 3=West
      protected char lab; //character representhing the things types

    public Thing (int row, int col, char lab) {
      this.row = row; //sets the row pos
      this.col = col; // sets the col pos
      this.dir = 0; // initiailizes dir to 0
      this.lab = lab; // sets the labe
    }
    
      public void rightTurn() { // method for right turn
        this.dir = (this.dir + 1) % 4;
      }
      public void leftTurn() { //method for left turn
        this.dir = (this.dir + 3) % 4;
      } 
      public abstract void maybeTurn(Random rand); // calling an abtract method for maybeturn
      

      public void step() { //method to move the thing
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        this.row += dr[this.dir];
        this.col += dc[this.dir];
      }
      
      public String toString() { //method to return a string rep of the row col and lab
        return row + " " + col + " " + lab;
      }
  }

    

