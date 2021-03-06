package skilling.specs

import geb.spock.GebSpec
import skilling.annotations.*
import skilling.pages.HomePage
import skilling.pages.MainPage

/**
 * Created by lorenzo on 25/03/2017.
 */
class LoginSpecs extends GebSpec {
    @smoke
    def "successful login"() {
        when:
        def validUser = browser.config.rawConfig.validUser
        to HomePage
        and:
        loginButton.click()
        and:
        fillLoginFormAndSubmit validUser['email'], validUser['password']

        then:
        assert customerName.text() == validUser['username']
    }
}
