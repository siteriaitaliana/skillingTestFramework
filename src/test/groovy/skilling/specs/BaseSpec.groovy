package skilling.specs

import geb.spock.GebSpec

/**
 * Created by lorenzo on 25/03/2017.
 */
class BaseSpec extends GebSpec {
    def cleanup() {
        browser.close()
    }
}
