import java.math.BigDecimal;
import java.util.ArrayList;

// remember that a BigDecimal is immutable

public class Portfolio{
    protected ArrayList<Project> portfolio = new ArrayList<Project>();
    
    public Portfolio() {
    }

    public Portfolio(Project project) {
        portfolio.add(project);
    }

    public void addProject(Project p) {
        portfolio.add(p);
    }

    public ArrayList<Project> getProjects() {
        return portfolio;
    }

    public BigDecimal getPortfolioCost () {
        BigDecimal totalCost = new BigDecimal(0.00);
        for (Project p: portfolio) {
            if (p.getInitialCost() != null) {
                totalCost = totalCost.add(p.getInitialCost());
            }
        }

        return totalCost;
    }

    public void showPortfolio() {
        String totalstr = "";
        
        int count = 1;
        for (Project p: portfolio) {
            totalstr += "Project #" + count + "::";
            totalstr += " Name: " + p.getName();
            totalstr += " Description: " + p.getDescription() + " ";
            count++;
        }


        BigDecimal totalCost = this.getPortfolioCost();


        System.out.println(totalstr + " Total Cost of Portfolio: $" + totalCost);
    }

}