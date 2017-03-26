# Skilling - Test Framework

## INTRO
As promised I've decided to use the technologies we have mentioned during the interview (Geb, Spock, Groovy) with a simple page object pattern.
Tests are annotated to give them a category even though at the moment doesn't have a real implementation hence is not possible to filter test and include/exclude based on that.
There's also a perfomance and security check to make the test suite more complete.

## Browsers
So far the implemntation only support Google Chrome, adding more browser is just a matter of adding more drivers (e.g. Firefox, PhantomJs) into the gebconfig file and point them to their relative driver

## Cross-platform support
 
## Reports
* Gradle: see build/reports folder
* Geb: see the geb-reports folder as specified in the gebconfig file

## TODOs
* cross platform driver
* extend documentation
* Fix Geb reports



