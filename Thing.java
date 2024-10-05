import java.util.*;
    
    public abstract class Thing {
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;

    private final int[] dc = {
      0, 1, 0, -1
    };
    private final int[] dr = {
      1, 0, -1, 0
    };
    
    public Thing (int row, int col, char lab) {
      this.row = row;
      this.col = col;
      this.dir = 0;

    }
    
      public void rightTurn() {
        this.dir = (this.dir + 1) % 4;
      }
      public void leftTurn() {
        this.dir = (this.dir + 3) % 4;
      }
  
      public void step() {
       
        this.row += dr[this.dir];
        this.col += dc[this.dir];
      }
      public abstract void maybeTurn(Random rand);
      public String toString() {
        return row + " " + col + " " + lab;
      }
  }




