import java.math.BigDecimal;


class ProjectTest{

    public static void main(String[] args) {

        Project p1 = new Project();
        Project p2 = new Project("Kenya");
        Project p3 = new Project("Colorado", "Moving to colorado!!!");
        Project p4 = new Project("Watercolouring", "Watercolouring for those in need", 643.34);

        p1.setName("Friends");
        p1.setDescription("Hang out with Friends");

        p2.setInitialCost(53.943484843289);
        p3.setInitialCost(6543.00);

        System.out.println(p4.getInitialCost());

        System.out.println("p1 Name: "+ p1.getName());
        System.out.println(p2.getInitialCost());
        System.out.println(p3.getDescription());

        System.out.println(p1.elevatorPitch());
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.elevatorPitch());

        Portfolio po1 = new Portfolio();
        po1.addProject(p1);
        po1.addProject(p2);

        Portfolio po2 = new Portfolio(p1);
        po2.addProject(p2);
        po2.addProject(p3);
        po2.addProject(p4);

        BigDecimal totalCost1 = po1.getPortfolioCost();        
        System.out.println(totalCost1);

        BigDecimal totalCost2 = po2.getPortfolioCost();
        System.out.println(totalCost2);

        po1.showPortfolio();
        po2.showPortfolio();
    }




    

}