// Tasks:

// ● Create a Project class that has the fields of name and description.

// ● Create an instance method called elevatorPitch that will return the name and description separated by a colon.

// ● Overload the constructor method in three different ways.

// public Project() {}

// public Project(String name) {}

// public Project(String name, String description) {}

// ● Create getter and setters for each field

// ● Create a ProjectTest file that will test all the functionality.
// Optional Challenges:

// ● Add an additional initialCost member variable that is of type double and has both getters and setters

// ● Add this the elevator pitch in parentheses after the name, e.g.: name (cost): description

// ● Create a Portfolio class that will keep an ArrayList of Projects in the field projects. Use generics to ensure these are Project objects.

// ● Add the appropriate getters/setters/constructors for this class to work

// ● Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.

// ● Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.



class Project {
    private String name;
    private String description;
    
    public Project() {
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch() {
        return name + " : " + description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}