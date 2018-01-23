// Tasks:

// ● Create a Node class with the value and next attributes

// ● Create a constructor method that sets the value to a given number and next to null of your Node objects

// ● Create a SinglyLinkedList class with the head attribute

// ● Create a constructor method that sets the head to null of your SinglyLinkedList objects

// ● Create a add(int) method that will add a node to the end of your list with the value in the parameter

// ● Create a remove() method that will remove a node from the end of your list

// ● Create printValues() method that will print all the values of each node in the list in order

// ● Create a ListTester class to test your methods
// Optional Challenges:f

// ● Implement a find(int) method that will return the first node with the value in the parameter

// ● Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.




public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node n1 = new Node(value);
        if (head == null) {
            head = n1;
        } else {
            Node curr = head;  

            while(curr.getNext() != null) {
                curr = curr.getNext();
            }
            
            curr.next = n1;
        }
    }

    public int remove() {
        Node curr = head;
        if (curr.getNext() == null) {
            curr.setNext(null);
        }

        while(curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }


        Node returnNode = curr.getNext();
        int returnVal = returnNode.value;

        curr.setNext(null);
        return returnVal;
        
    }

    public void printValues() {
        Node curr = head;
        
        while(curr != null) {
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
    }
}