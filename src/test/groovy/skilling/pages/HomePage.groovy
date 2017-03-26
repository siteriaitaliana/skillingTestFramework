package skilling.pages

import geb.Page
import skilling.pages.registration.CreateAccountPage

/**
 * Created by lorenzo on 25/03/2017.
 */
class HomePage extends Page {
    //TODO: move into config file
    static url = "https://propero:forex2016@stg.pro.skilling.com/"

    static at = {
        title == "Skilling - trading starts here."
        waitFor { freeDemoButton.present }
        waitFor { loginButton.present }
        waitFor { createAccountButton.present }
    }

    static content = {
        freeDemoButton { $("button", id: "get-started-button", type: "submit") }
        loginButton(to: LoginPage) { $("#loginButton a") }
        createAccountButton(to: CreateAccountPage) { $("#createAccountButton a") }
    }
}
