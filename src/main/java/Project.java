@lombok.extern.slf4j.Slf4j
public class Project {

    private static final String NEVERUPDATED = "neverUpdated";
    private final String name;
    private final ProjectType type;
    private String projectDetails = NEVERUPDATED;
    private String lastUpdateTime = NEVERUPDATED;
    private String loginStatistics = NEVERUPDATED;
    
    public Project(String name, ProjectType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return  name;
    }
    
    public ProjectType getType() {
        return type;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String string) {
        this.lastUpdateTime = string;
    }

    public String getLoginStatistics() {
        return loginStatistics;
    }

    public void setLoginStatistics(String loginStatistics) {
        this.loginStatistics = loginStatistics;
    }

    public void prettyPrint() {
        log.info("Project: {};type: {}", getName(), getType());
        log.info("Project details: {}", getProjectDetails());
        log.info("Last update time: {}", getLastUpdateTime());
        log.info("Login statistics: {}", getLoginStatistics());
    }
}
