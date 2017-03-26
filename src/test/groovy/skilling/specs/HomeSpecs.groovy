package skilling.specs

import geb.spock.GebSpec
import groovy.time.*
import skilling.annotations.*
import skilling.pages.HomePage

/**
 * Created by lorenzo on 25/03/2017.
 */
class HomeSpecs extends GebSpec {
    @smoke
    def "free demo button is displayed in the home page"() {
        when:
        to HomePage

        then:
        //Note: Due to the geb implicit assertions this is an assert.
        waitFor { freeDemoButton.present }
    }

    @performance
    def "home page loads in less than 10 seconds"() {
        when:
        def timeStart = new Date()
        to HomePage

        then:
        waitFor { freeDemoButton.present }
        def timeStop = new Date()
        TimeDuration duration = TimeCategory.minus(timeStop, timeStart)
        println "# Homepage loading time: " + duration
        assert duration.seconds < 10
    }
}
