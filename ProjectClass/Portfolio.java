import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> projects = new ArrayList<Project>();

    public Portfolio(){

    }

    public void addProject(Project project){
        this.projects.add(project);
    }

    public ArrayList<Project> getAllProjects(){
        return this.projects;
    }

    // public Double getPortfolioCost(Portfolio portfolio){
    //     Double sum;
    //     for (int i = 0; i< portfolio.size(); i++){
    //         sum += portfolio.get(i).initialCost;
    //     }
    //     return "Total cost: "+sum;
    // }

}