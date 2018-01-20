import java.util.ArrayList;

// class Portfolio<Project> {
class Portfolio<Project>{
    // private ArrayList<Project> projects = new ArrayList<Project>();
    private ArrayList<TestInterface> projects = new ArrayList<TestInterface>();

    public Portfolio() {   
    }

    public Portfolio(Project project) {
        projects.add(project);

        for (TestInterface t: projects) {
            // System.out.println("Object Name: " + t.getName());
            System.out.println(t);
        }
        
        // int i = 0;
        // for (Project currProject: projects) {
        //     // System.out.println("inside loop" + currProject);
        //     // System.out.println(currProject);
        //     // System.out.println(currProject.getName());
        //     String name = currProject;
        //     System.out.println(name);
        //     // System.
        // }

        // for (int i = 0; i < projects.size(); i++) {
        //     System.out.println(((Project)projects.get(i)).getName());
        // }
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public ArrayList<TestInterface> getProjects() {
        return projects;
    }

    public void getPortfolioCost () {

    }

    public void showPortfolio() {

    }

}