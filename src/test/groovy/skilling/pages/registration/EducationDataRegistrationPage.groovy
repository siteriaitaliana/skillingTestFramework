package skilling.pages.registration

import geb.Page
import geb.module.Checkbox
import geb.module.RadioButtons
import geb.module.Select

/**
 * Created by lorenzo on 25/03/2017.
 */
class EducationDataRegistrationPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { continueButton.present }
    }

    static content = {
        continueButton(to: TradingSourcesRegistrationPage) { $("#continueBtn", type: "submit") }
        levelOfEducationSelect = $("#levelOfEducation").module(Select)
        natureOfCurrentEmploymentSelect = $("#natureOfCurrentEmployment").module(Select)
        relatedEducationRadio = $(name: "educationRelatedToFinance").module(RadioButtons)
        notPoliticaPersonCheckBox = $("#iAmNotPEP").module(Checkbox)
    }

    void fillEducationForm() {
        levelOfEducationSelect.selected = "Post Graduate University"
        natureOfCurrentEmploymentSelect.selected = "Full-time"
        relatedEducationRadio.checked = "true"
        notPoliticaPersonCheckBox.check()
        continueButton.click()
    }
}
