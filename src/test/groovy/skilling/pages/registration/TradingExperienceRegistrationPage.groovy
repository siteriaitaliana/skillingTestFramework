package skilling.pages.registration

import geb.Page
import geb.module.Checkbox
import geb.module.RadioButtons
import skilling.pages.registration.DocumentUploadPage

/**
 * Created by lorenzo on 25/03/2017.
 */
class TradingExperienceRegistrationPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { continueButton.present }
    }

    static content = {
        continueButton(to: DocumentUploadPage) { $("#continueBtn", type: "submit") }
        forexExpRadio = $(name: "foreignExchangeTradingHowLongHaveYouTraded").module(RadioButtons)
        commoditiesExpRadio = $(name: "commoditiesHowLongHaveYouTraded").module(RadioButtons)
        equityExpRadio = $(name: "equityHowLongHaveYouTraded").module(RadioButtons)
        optionsExpRadio = $(name: "optionsHowLongHaveYouTraded").module(RadioButtons)
        extraRiskCheckBox = $("#extraRisk_label").module(Checkbox)
    }

    void fillTradingExpForm() {
        forexExpRadio.checked = "NONE"
        commoditiesExpRadio.checked = "NONE"
        equityExpRadio.checked = "NONE"
        optionsExpRadio.checked = "NONE"
        extraRiskCheckBox.check()
        continueButton.click()
    }
}
