import java.util.*;

public class ThingList { // classs representing a list of thing objecs

  private class Node { //private inner class representing a node in the linked list
    public Thing data;
    public Node  next;
  
  public Node (Thing data) { //contructor initializes a node with a thing object
    this.data = data;
    this.next = null;
  }
}
  Node head = null; // head of the linked list

public void addThing (Thing thing) { //mehtod to add a thing to the list
  Node New = new Node (thing); // create a new node with a given thing

  if (head == null) { //if the list is empty set the new node as the head
    head = New;
    head.next = null;
  }
      New.next = head; // set the new node at the beginning of the list
      head = New;
    }
  
  public void printAll () { // method to print all the things in the list
    for( Node T = head; T != null; T = T.next ) {
        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
    }
  }

  public void moveAll (Random rand) { // methid to modve all the things in the list
    for( Node T = head; T != null; T = T.next ) {
    T.data.maybeTurn(rand);
    head.data.step();
    }
  }
}

