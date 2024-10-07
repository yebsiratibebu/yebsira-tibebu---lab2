import java.util .*;

public class TypeB extends Thing { //// class representing a type b obkect that extends the abstract parent class
    public int timeSinceLast; //initializes int for since the last turn
    public TypeB (int row, int col, char lab) { //contructor thast initializes type b with row col and lab
        super(row, col, lab);    ////call the contructor of the parent thing class
    }
    public void maybeTurn(Random rand) { // implementation of the abstract method from the parent class thing
       
        if (this.timeSinceLast == 10) { //checks if 10 time has passed since last turn
            this.timeSinceLast = 0; //resrts the counter
        int i = rand.nextInt(3);
            if (i == 1) {
                 if (i == 2) {
                    this.leftTurn();
                }
            }
        }
        this.timeSinceLast++; //shows that each time is tracked after turn
    }
}

