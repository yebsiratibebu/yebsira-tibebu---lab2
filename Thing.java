import java.util.*;
    
    public abstract class Thing {
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;

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
      public abstract void maybeTurn(Random rand);

      public void step() {
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        this.row += dr[this.dir];
        this.col += dc[this.dir];
      }
      
      public String toString() {
        return row + " " + col + " " + lab;
      }
  }




