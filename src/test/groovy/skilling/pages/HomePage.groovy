package skilling.pages

import geb.Page

/**
 * Created by lorenzo on 25/03/2017.
 */
class HomePage extends Page {

    static url = "https://propero:forex2016@stg.pro.skilling.com/"

    static at = { title == "Skilling - trading starts here." }

    static content = {
        freeDemoButton { $("#get-started-button", type: "submit") }
        loginButton(to: LoginPage) { $("#loginButton a") }
    }


}
