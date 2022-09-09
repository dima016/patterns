package backers.patterns.behavioral.chainOfResponsibility;

import backers.patterns.behavioral.chainOfResponsibility.auth.chains.AuthChain;
import backers.patterns.behavioral.chainOfResponsibility.auth.chains.AuthenticationProcessor;
import backers.patterns.behavioral.chainOfResponsibility.auth.chains.UserDetails;
import backers.patterns.behavioral.chainOfResponsibility.auth.chains.ValidationProcessor;

public class Main {
    public static void main(String[] args) {
        AuthChain authenticationProcessor = new AuthenticationProcessor(null);
        AuthChain validationProcessor = new ValidationProcessor(authenticationProcessor);
        UserDetails userDetails = new UserDetails("username","password");

        validationProcessor.isAuthorized(userDetails);
    }
}
