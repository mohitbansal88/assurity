# Assurity


## Tech Stack
 * Java 8
 * TestNG
 * RestAssured
 * Git
 * Gradle
 
## System requirements
 * Java 8
 * Eclipse 


## Build Assurity
./gradlew clean build
 

## Directory Structure
We have two modules test-common and test-rest.

test-common has all DTO's, configuration files and resources. 
<br>This project is written in such a way that it can be published to artifactory and can be imported into respective test projects of microservices.
<br>It has 2 source folder 
 * src/main/java
    <br>It has 4 packages
    * com.assurity.asserions - this will contains Assertion messages and future AssetionUtils
    * com.assurity.config - this has base test class ServletTestBase, which test classes will inherit and TestConstants in which configurations are loaded from properties file
    * com.assurity.dto - this has all the DTO
    * com.assurity.utils - this has utilities for JSON manipulations, RestBase and DTO. 
 * src/main/resources
   <br>It contains configuration files

test-rest contains all the rest tests.
<br>It has multiple testng files defining suites to run tests. These files are used in build.gradle file to declare tasks.
<br>We can create multiple suites to run at various level of deployment namely qa, stage and prod.
<br>It has 2 source folder 
 * src/integTest/java
   <br>It contains Rest tests
 * src/integTest/resources
   <br>It will contains data files for tests 
 
## Configuration Files 
There are 5 configuration files [local|qa|stage|prod|dev].properties
 * In order to run test, we need to specify which configuration file test will pick.
 * It can be defined using variable TS_TEST_ENV either from command line or in VM Arguments in Eclipse.
 * It takes 5 values [local|qa|stage|prod|dev].
 * If we do not specify TS_TEST_ENV, then test will default to local.properties.
 * From command line -PTS_TEST_ENV=[local|qa|stage|prod|dev]
 * From Eclipse, set -DTS_TEST_ENV=[local|qa|stage|prod|dev] in VM Arguments from Debug Configuration.

## To run Acceptance Criteria test run
 ./gradlew clean build SingleTest -PTS_TEST_ENV=local
 <br>Reports are available at assurity/test-rest/build/reports/tests/SingleTest/index.html
 
 
## Framework allows below operation as well. 

## Run All test
 ./gradlew clean integTest -PTS_TEST_ENV=[local|qa|stage|prod|dev]
 <br>This will run all tests.
 <br>Reports are available at assurity/test-rest/build/reports/tests/integTest/index.html
 
## Run Single test (CategoryTest)
 ./gradlew clean SingleTest -PTS_TEST_ENV=[local|qa|stage|prod|dev]
<br>This will run test suite defined in singleTest_Testng.xml
<br>Reports are available at assurity/test-rest/build/reports/tests/SingleTest/index.html

## Run a single test class
  The standard gradle filtering for tests will work (without having to manipulate XML test suites). e.g. You can run
  <br>./gradlew clean build :test-rest:integTest --tests "*{ClassName}" -PTS_TEST_ENV=[local|qa|stage|prod|dev]
  <br>Reports are available at assurity/test-rest/build/reports/tests/integTest/index.html

## Run E2ETestSuite tests
 ./gradlew clean E2ETestSuite -PTS_TEST_ENV=[local|qa|stage|prod|dev]
<br>This will run the test suite defined in e2e_Testng.xml. 
<br>This will allow to run tests in parallel, which will reduce build time.
<br>Reports are available at assurity/test-rest/build/reports/tests/E2ETestSuite/index.html
<br>In order to check if -PTS_TEST_ENV works, then set it to stage. 
<br>stage.properties has incorrect host name and test will fail.

 
# Environment Variables
TS_TEST_LIB_LOG_LEVEL=[Info|Warning|Debug]
