package skilling.pages.registration

import geb.Page

/**
 * Created by lorenzo on 25/03/2017.
 */
class RegisterOptionsPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { continueBankIdButton.present }
        waitFor { continueManualButton.present }
    }

    static content = {
        continueBankIdButton { $("#continueBankId", type: "submit") }
        continueManualButton(to: UserDataRegistrationPage) { $("#continueManualBtn", type: "submit") }
    }
}
