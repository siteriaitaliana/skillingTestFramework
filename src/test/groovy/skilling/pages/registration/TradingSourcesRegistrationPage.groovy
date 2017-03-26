package skilling.pages.registration

import geb.Page
import geb.module.RadioButtons
import geb.module.Select
import skilling.pages.registration.TradingExperienceRegistrationPage

/**
 * Created by lorenzo on 25/03/2017.
 */
class TradingSourcesRegistrationPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { continueButton.present }
    }

    static content = {
        continueButton(to: TradingExperienceRegistrationPage) { $("#continueBtn", type: "submit") }
        interestForTradingSelect = $("#interestForTrading").module(Select)
        originOfFundsForDepositelect = $("#originOfFundsForDeposit").module(Select)
        incomeRadio = $(name: "annualIncome").module(RadioButtons)
        totalOutstandingDebtsRadio = $(name: "totalOutstandingDebts").module(RadioButtons)
    }

    void fillTradingExpForm() {
        interestForTradingSelect.selected = "Leisure"
        originOfFundsForDepositelect.selected = "Salary"
        incomeRadio.checked = "0 - 25k"
        totalOutstandingDebtsRadio.checked = "100 - 50k"
        continueButton.click()
    }
}
