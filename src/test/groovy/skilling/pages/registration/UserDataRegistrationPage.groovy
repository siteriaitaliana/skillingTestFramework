package skilling.pages.registration

import geb.Page
import geb.module.Select
import skilling.pages.registration.EducationDataRegistrationPage

/**
 * Created by lorenzo on 25/03/2017.
 */
class UserDataRegistrationPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { submitButton.present }
    }

    static content = {
        submitButton(to: EducationDataRegistrationPage) { $("#submit2Btn", type: "submit") }
        yearSelect = $("#yearControl").module(Select)
        monthSelect = $("#monthControl").module(Select)
        daySelect = $("#dayControl").module(Select)
    }

    void fillUserForm() {
        yearSelect.selected = "1983"
        monthSelect.selected = "01"
        daySelect.selected = "05"
        submitButton.click()
    }
}
