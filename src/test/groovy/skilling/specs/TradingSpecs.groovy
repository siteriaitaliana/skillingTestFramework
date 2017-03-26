package skilling.specs

import geb.spock.GebSpec
import skilling.annotations.*

import skilling.pages.HomePage

/**
 * Created by lorenzo on 25/03/2017.
 */
class TradingSpecs extends GebSpec {
    @known @wip
    def "trading"() {
        when:
        def validUser = browser.config.rawConfig.validUser
        to HomePage
        loginButton.click()
        and:
        fillLoginFormAndSubmit validUser['email'], validUser['password']
        and:
        startTradingButton.click()

        then:
        assert false: "Trading section not ready to be tester yet"
    }
}

