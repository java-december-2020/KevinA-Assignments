import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Project> projectList = new ArrayList<>();

    public Portfolio(List<Project> projectList) {
        this.projectList = projectList;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public double getPortfolioCost() {
        double total = 0;
        for (Project project : this.getProjectList()) {
            total += project.getInitialCost();

        }
        return total;

    }

    public void showPortfolio() {
        for (Project project : projectList) {
            System.out.println(project.elevatorPitch());

        }
    }
}
