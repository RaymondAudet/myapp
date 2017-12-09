public class Deployment {

    private DeploymentType type;
    private String projectName;
    private String projectVersion;
    private String configmapVersion;


    public Deployment(DeploymentType type, String projectName, String projectVersion, String configmapVersion) {
        this.type = type;
        this.projectName = projectName;
        this.projectVersion = projectVersion;
        this.configmapVersion = configmapVersion;
    }

    public DeploymentType getType() {
        return type;
    }

    public void setType(DeploymentType type) {
        this.type = type;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getConfigmapVersion() {
        return configmapVersion;
    }

    public void setConfigmapVersion(String configmapVersion) {
        this.configmapVersion = configmapVersion;
    }

    @Override
    public String toString() {
        return "Deployment{" +
                "type=" + type +
                ", projectName='" + projectName + '\'' +
                ", projectVersion='" + projectVersion + '\'' +
                ", configmapVersion='" + configmapVersion + '\'' +
                '}';
    }
}
