package backers.patterns.behavioral.chainOfResponsibility.auth.chains;

public class AuthenticationProcessor extends AuthChain{

    public AuthenticationProcessor(AuthChain nextChain) {
        super(nextChain);
    }

    @Override
    public boolean isAuthorized(UserDetails userDetails) {
        boolean isUserAuthorized = userDetails.getUsername().equals("admin");
        if (isUserAuthorized && nextChain != null){
            System.out.println("Authorized " + userDetails + "and hang out request in " + this.getClass().getName());
            return nextChain.isAuthorized(userDetails);
        }else {
            System.out.println("Last chain is:" + this.getClass().getName());
            return isUserAuthorized;
        }
    }
}
