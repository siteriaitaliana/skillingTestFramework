package skilling.pages.registration

import geb.Page
import skilling.pages.registration.RegisterOptionsPage

/**
 * Created by lorenzo on 25/03/2017.
 */
class CreateAccountPage extends Page {

    static at = {
        title == "Skilling - trading starts here."
        waitFor { continueButton.present }
    }

    static content = {
        emailInput { $("#email") }
        passwordInput { $("#password") }
        continueButton(to: RegisterOptionsPage) { $("button#continue") }
    }

    void fillRegistrationForm(String password) {
        emailInput.value("new" + Math.abs(new Random().nextInt() % 10000000) + 1 + "@gmail.com")
        passwordInput.value(password)
    }

}


