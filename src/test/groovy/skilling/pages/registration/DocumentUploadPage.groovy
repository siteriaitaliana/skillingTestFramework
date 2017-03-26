package skilling.pages.registration

import geb.Page
import geb.module.Select

/**
 * Created by lorenzo on 25/03/2017.
 */
class DocumentUploadPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { continueButton.present }
    }

    static content = {
        continueButton(to: TradingSourcesRegistrationPage) { $("#continueBtn", type: "submit") }
        documentsSelect = $("#documents-drop-down").module(Select)
        documentUpload = $("#documentID")
    }

    void fillEducationForm() {
        documentsSelect.selected = "Driving Licence"
        // uploadFile variable holding the file instance
        documentUpload = uploadFile.absolutePath
        continueButton.click()
    }
}
