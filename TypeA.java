import java.util .*;

public class TypeA extends Thing { // class representing a type a obkect that extends the abstract parent class
    public TypeA (int row, int col, char lab) { //contructor thast initializes type a with row col and lab
        super(row, col, lab); //call the contructor of the parent thing class
        
    }
    public void maybeTurn(Random rand) { // implementation of the abstract method from the parent class thing
        int i = rand.nextInt(3);
        if (i == 1) {
            this.rightTurn();
        }
        if (i == 2) {
            this.leftTurn();
        }
    }
}

        
    
    
