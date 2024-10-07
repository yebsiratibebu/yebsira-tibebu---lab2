import java.util.*;
public class TypeC extends Thing {

    public TypeC (int row, int col, char lab) {
        super(row, col, lab);
    }
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(4);
        if (i == 1) {
            this.rightTurn();

        if (i == 2 )
            this.leftTurn();
        }
    }
}

