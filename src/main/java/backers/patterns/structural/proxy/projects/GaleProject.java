package backers.patterns.structural.proxy.projects;

public class GaleProject implements Project{
    String repoUrl;

    public GaleProject(String repoUrl) {
        this.repoUrl = repoUrl;
        loadProject();
    }

    private void loadProject(){
        System.out.println("Gale Project is loading from:" + repoUrl);
    }

    @Override
    public void run() {
        System.out.println("Running  Gale Project is loading from:" + repoUrl);
    }
}
