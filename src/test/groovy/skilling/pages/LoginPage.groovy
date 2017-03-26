package skilling.pages

import geb.Page

/**
 * Created by lorenzo on 25/03/2017.
 */
class LoginPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { emailInput.present }
    }

    static content = {
        emailInput { $("#email") }
        passwordInput { $("#password") }
        loginButton(to: MainPage) { $("button", id: "loginButton", type: "submit") }
    }

    void fillLoginFormAndSubmit(String username, String password) {
        emailInput.value(username)
        passwordInput.value(password)
        loginButton.click()
    }

}
