import java.util .*;

public class TypeB extends Thing {
    private int timeSinceLast;
    public TypeB (int row, int col, char lab) {
        super(row, col, lab);    
    }
    public void maybeTurn(Random rand) {
       
        if (this.timeSinceLast == 10) {
            this.timeSinceLast = 0;
        int i = rand.nextInt(3);
            if (i == 1) {
                 if (i == 2) {
                    this.leftTurn();
                }
            }
        }
    }
}

