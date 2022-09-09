package backers.patterns.behavioral.chainOfResponsibility.auth.chains;

public abstract class AuthChain {
    protected AuthChain nextChain;

    public AuthChain(AuthChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract boolean isAuthorized(UserDetails userDetails);
}
