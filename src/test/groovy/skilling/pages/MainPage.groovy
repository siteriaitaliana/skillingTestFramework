package skilling.pages

import geb.Page

/**
 * Created by lorenzo on 25/03/2017.
 */
class MainPage extends Page {
    static at = {
        title == "Skilling - trading starts here."
        waitFor { customerName.present }
        waitFor { signalsCarousel.present }
    }

    static content = {
        customerName { $("#customerID a")}
        signalsCarousel { $(".carousel")}
        startTradingButton { $("button.btn-dash-start_trading", type: "submit")}
    }
}
