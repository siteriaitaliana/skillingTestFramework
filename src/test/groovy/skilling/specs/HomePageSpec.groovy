package skilling.specs

import geb.spock.GebSpec
import skilling.pages.HomePage

/**
 * Created by lorenzo on 25/03/2017.
 */
class HomePageSpec extends GebSpec {

    def "free demo button is displayed in the home page"() {
        when:
            to HomePage
        then:
            //TODO: change this into an assertion
            waitFor { freeDemoButton.present }
    }
}
