package backers.patterns.structural.proxy;

import backers.patterns.structural.proxy.projects.Project;
import backers.patterns.structural.proxy.projects.ProxyGaleProject;

public class Main {
    public static void main(String[] args) {
        Project project = new ProxyGaleProject("https:stash/gale/blablabla");

        project.run();
    }
}
