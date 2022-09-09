package backers.patterns.behavioral.chainOfResponsibility.auth.chains;

public class ValidationProcessor extends AuthChain{
    private static final String USERNAME_PATTER = "(.*)";

    public ValidationProcessor(AuthChain nextChain) {
        super(nextChain);
    }

    @Override
    public boolean isAuthorized(UserDetails userDetails) {
        boolean isUserAuthorized = userDetails.getUsername().matches(USERNAME_PATTER);
        if (isUserAuthorized && nextChain != null){
            System.out.println("Authorized " + userDetails + "and hang out request in " + this.getClass().getName());
            return nextChain.isAuthorized(userDetails);
        }else {
            System.out.println("Last chain is:" + this.getClass().getName());
            return isUserAuthorized;
        }
    }
}
