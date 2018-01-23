public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList ssl1 = new SinglyLinkedList();
        
        //JVM threw "java.lang.NoClassDefFoundError" without this piece of code
        //Node.class file didn't compile INITIALLY when running ListTester class
        // Node testNode = new Node();

        ssl1.add(54);
        ssl1.add(56);
        ssl1.add(64);

        ssl1.printValues();


        int value1 = ssl1.remove();
        System.out.println(value1);

        ssl1.printValues();
    }
}