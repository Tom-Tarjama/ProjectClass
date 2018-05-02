public class Project{
    private String name;
    private String description;
    private Double initialCost;

    public String elevatorPitch(){
        return this.name+" ("+this.initialCost+"): "+this.description;
    }

    public Project(){

    }

    public Project(String nameParam, String descParam){
        this.name = nameParam;
        this.description = descParam;
    }

    public Project(String nameParam){
        this.name = nameParam;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public Double getCost(){
        return this.initialCost;
    }

    public void setName(String nameParam){
        this.name = nameParam;
    }

    public void setDescription(String descParam){
        this.description = descParam;
    }

    public void setCost(Double costParam){
        this.initialCost = costParam;
    }
}