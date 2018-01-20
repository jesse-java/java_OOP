interface TestInterface {
    String getName();
}


class ProjectTest implements TestInterface{

    public static void main(String[] args) {

        Project p1 = new Project();
        Project p2 = new Project("Kenya");
        Project p3 = new Project("Colorado", "Moving to colorado!!!");

        p1.setName("Friends");
        p1.setDescription("Hang out with Friends");

        p2.setInitialCost(53.40);
        p3.setInitialCost(6543.00);

        System.out.println("p1 Name: "+ p1.getName());
        System.out.println(p2.getInitialCost());
        System.out.println(p3.getDescription());

        System.out.println(p1.elevatorPitch());
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.elevatorPitch());

        Portfolio<Object> po1 = new Portfolio<Object>();
        po1.addProject(p1);
        // System.out.println(po1.getProjects());

        Portfolio<Object> po2 = new Portfolio<Object>(p2);
        

    }




    

}