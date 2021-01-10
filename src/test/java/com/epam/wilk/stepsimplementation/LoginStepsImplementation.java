package com.epam.wilk.stepsimplementation;

public class LoginStepsImplementation extends CommonStepsImplementation {

    public void signIn(String email, String password) {
        fillLoginData(email, password);
        loginPage.SIGN_IN.execute();
    }

    public void openRegistrationView() {
        loginPage.OPEN_REGISTRATION.execute();
        loginPage.waitUntilElementAppears(loginPage.NEW_EMAIL_INPUT);
        loginPage.waitUntilElementAppears(loginPage.NEW_EMAIL_INPUT);
    }

    public void register(String emailAddress, String password, String confirmPassword) {
        fillRegistrationData(emailAddress, password, confirmPassword);
        loginPage.CREATE_ACCOUNT.execute();
    }

    public void loggedInSucceeded() {
        mainPage.verifyMyAccountIsVisible();
    }

    public void loggedInFailed() {
        loginPage.verifySignInButtonIsVisible();
    }

    public void wrongCredentialsMessageAppeared() {
        loginPage.verifyLoginErrorIsDisplayed();
    }

    public void newAccountIsCreated() {
        myAccountPage.verifyMyAccountHeaderIsVisible();
    }

    public void userLogIn(String emailAddress, String password) {
        mainPage.OPEN_SIGN_IN_MODAL.execute();
        fillLoginData(emailAddress, password);
        loginPage.SIGN_IN.execute();
    }

    public void openSignIn() {
        mainPage.OPEN_SIGN_IN_MODAL.execute();
    }

    private void fillRegistrationData(String email, String password, String confPassword) {
        loginPage.NEW_EMAIL.set(email);
        loginPage.NEW_PASSWORD.set(password);
        loginPage.CONF_PASSWORD.set(confPassword);
    }

    private void fillLoginData(String email, String password) {
        loginPage.EMAIL.set(email);
        loginPage.PASSWORD.set(password);
    }
}
