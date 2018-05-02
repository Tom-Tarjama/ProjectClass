public class ProjectTest{
    public static void main(String[] args){
        Project a = new Project("Robots!", "take over the world with robots");

        Project b = new Project();
        b.setName("Bees!");
        b.setDescription("Bee farm");
        System.out.println(b.getName());
        System.out.println(b.getDescription());

        Project c = new Project("Puppies!");
        c.setName("Kittens!");
        c.setCost(25.00);
        System.out.println(c.getCost());

        System.out.println(a.elevatorPitch());
        System.out.println(b.elevatorPitch());
        System.out.println(c.elevatorPitch());

        Portfolio x = new Portfolio();
        x.addProject(a);
        x.addProject(b);
        x.addProject(c);
        System.out.print(x.getAllProjects());
        // System.out.print(x.getPortfolioCost(x));
    }
}