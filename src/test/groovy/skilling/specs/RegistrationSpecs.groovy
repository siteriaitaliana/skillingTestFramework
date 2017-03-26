package skilling.specs

import geb.spock.GebSpec
import org.openqa.selenium.By
import skilling.annotations.*

import skilling.pages.HomePage
import skilling.pages.registration.CreateAccountPage
import spock.lang.Unroll

/**
 * Created by lorenzo on 25/03/2017.
 */
class RegistrationSpecs extends GebSpec {
    @known @wip
    def "successful registration flow"() {
        when:
        to HomePage
        then:
        assert false : "User registration scenario still has some page objects missing"
    }

    @wip @Unroll
    def "weak password are not allowed"() {
        when:
        to HomePage
        and:
        createAccountButton.click()
        and:
        fillRegistrationForm password

        then:
        waitFor { $(selector) }
        assert $(selector)*.text() == expectedText

        where:
        password   | selector                                                               | expectedText
        "1"        | ".password-msg ul li.done span"                                        | ["1 number"]
        "l"        | ".password-msg ul li.done span"                                        | ["1 lowercase letter"]
        "L"        | ".password-msg ul li.done span"                                        | ["1 uppercase letter"]
        "123456789"| ".password-msg ul li.done span"                                        | ["8 characters", "1 number"]
        "1lL456789"| By.xpath("//div[@class='has-success']/label[text()='Create password']")| ["Create password"]


    }
}

