import java.util.*;
public class TypeC extends Thing {// class representing a type c obkect that extends the abstract parent class
    public int timeSinceLast; //initializes int for since the last turn
    public TypeC (int row, int col, char lab) {  //contructor thast initializes type a with row col and lab
        super(row, col, lab); //call the contructor of the parent thing class
    }
    public void maybeTurn(Random rand) { //implementation of the abstract method from the parent class thing
        if (this.timeSinceLast == 100) { //checks if 20 time has passed since last turn
            this.timeSinceLast = 0; //resrts the counter
            if (dir == 0 || dir == 2) { // if faciting north or south turn right
                this.rightTurn();
            }
            else {
                this.leftTurn(); //if it is facing west or east then turn left
            }
        }
    }
}
