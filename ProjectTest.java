class ProjectTest {

    public static void main(String[] args) {

        Project p1 = new Project();
        Project p2 = new Project("Kenya");
        Project p3 = new Project("Colorado", "Moving to colorado!!!");

        p1.setName("Friends");
        p1.setDescription("Hang out with Friends");

        System.out.println(p1.elevatorPitch());
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.elevatorPitch());

    }




    

}