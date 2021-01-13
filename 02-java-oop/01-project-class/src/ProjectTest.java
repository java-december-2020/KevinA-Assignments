import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProjectTest {
    public static void main(String[] args) {
        Project project = new Project();

        project.setName("Project1");
        project.setDescription("Learning List");
        project.setInitialCost(25);
//
//        System.out.println(project.getName() + " " + project.getDescription() + " " + project.elevatorPitch());
        Project project2 = new Project("Accounting");
        project2.setInitialCost(50);
        Project project3 = new Project("Account", "Company");
        project3.setInitialCost(40);

        List<Project> projects = new ArrayList<>();
        projects.add(project3);
        projects.add(project2);

        Portfolio portfolio = new Portfolio(projects);
        System.out.println(portfolio.getProjectList());
        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();


//        System.out.println(project2.getName());
//        System.out.println(project3.elevatorPitch());


    }
}

