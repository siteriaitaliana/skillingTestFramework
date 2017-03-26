# Skilling - Test Framework

## Description
This is a simple test framework using the following Groovy stack of technologies (Geb, Spock, Groovy) with a simple page object pattern.
Tests are annotated to give them a category even though at the moment doesn't have a real implementation hence is not possible to filter test and include/exclude based on that.
There's also a perfomance and security check to make the test suite more complete.

## Usage
* git clone https://github.com/siteriaitaliana/skillingTestFramework.git
* move the command line at project root level
* ./gradlew test (MAC/UNIX)
* gradle.bat test (WINDOWS)

## Browsers
So far the implemntation only support Google Chrome, adding more browser is just a matter of adding more drivers (e.g. Firefox, PhantomJs) into the gebconfig file and phave a test specific task per browser, possibly controlled by the gradlew script for an easy integration in the CI builds.

## Cross-platform support
* The browser driver are platform aware, and at run time the correct driver is downloaded ib the build folder.
 
## Reports
* Gradle: see build/reports folder

## TODOs
* Registration test t.b.c.



