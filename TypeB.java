import java.util .*;

public class TypeB extends Thing {
    public TypeB (int row, int col, char lab) {
        super(row, col, lab);
    }
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
            if (i == 1) {
                 if (i == 2) {
                    this.leftTurn();
                }
            }
    }
}
