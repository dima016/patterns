package backers.patterns.structural.proxy.projects;

/**
 * This class is Proxy for {@link GaleProject}
 * which means is uses to provide a substitute or placeholder for this class.
 * Use it to access to the original object and allowing you to perform null check before run project in {@link ProxyGaleProject#run()}
 *
 * @author Dmytro Batsunov
 */
public class ProxyGaleProject implements Project {
    private final String url;
    private GaleProject project;

    public ProxyGaleProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(project == null){
           project = new GaleProject(url);
        }
        project.run();
    }
}
