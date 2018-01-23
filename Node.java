public class Node{
    protected int value;
    protected Node next;

    // Constructors
    public Node() 
    {
        value = 0;
        next = null;
    }

    public Node(int value) 
    {
        this.value = value;
        next = null;
    }

    public Node(int value, Node next) 
    {
        this.value = value;
        this.next = next;
    }
    

    // Function to set next node
    public void setNext(Node next)
    {
        this.next = next;
    }

    //Function to set value to current Node
    public void setValue(int value) 
    {
        this.value = value;
    }

    //Function to get link to next node
    public Node getNext() 
    {
        return next;
    }

    //Function to get value from current Node
    public int getValue()
    {
        return value;
    }

}
