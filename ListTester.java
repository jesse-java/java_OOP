public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList ssl1 = new SinglyLinkedList();
        
        //JVM threw "java.lang.NoClassDefFoundError" without this piece of code
        //Node.class file didn't compile INITIALLY when running ListTester class
        // Node testNode = new Node();

        ssl1.add(54);
        ssl1.add(56);
        ssl1.add(64);
        ssl1.add(645);
        ssl1.add(44);
        ssl1.add(-65);

        ssl1.printValues();


        int value1 = ssl1.remove();
        System.out.println(value1);

        ssl1.printValues();

        Node nodeFound = ssl1.find(56);
        System.out.println("Found a node! " + nodeFound.getValue());

        Node nodeFound2 = ssl1.find(-5);
        System.out.println(nodeFound.getValue());


        SinglyLinkedList ssl2 = new SinglyLinkedList();
        ssl2.add(54);
        ssl2.add(56);
        ssl2.add(64);
        ssl2.add(645);
        ssl2.add(44);
        ssl2.add(-65);

        System.out.println("ssl2 values before removeAt");
        ssl2.printValues();
        ssl2.removeAt(1);
        System.out.println("ssl2 values after removeAt");
        ssl2.printValues();
    }
}