#Interview task 
Project could be found on my github page: [Link to GitHub](https://github.com/Gutek18/Ryanair)
##Requirements
1. Please automate a booking up to a declined payment on https://www.ryanair.com/ie/en/
2. Use any card number and verify the error message.
3. Languages, use any one of the following methods:
4. Java (maven, junit), Javascript (protractor),Ruby or Python
5. Use Page Object Pattern
6. Give some documentation on why you chose what you did and documentation on how to run these tests.
7. Show reporting for your resultsAs it was agreed I send you a project with test case implementing flight booking with a wrong card credentials.

##General Requirements:
1. Git - Use a Github account if you have one, to provide the source code
2. We are fans of BDD and Cucumber in Ryanair, use these if you can
3. The test itself is quite simple, though you should use all your skills to prove your knowledge & ability

##Example Test Input
Given I make a booking from “DUB” to “SXF” on 12/03/2017 for 2 adults and 1 child
When I pay for booking with card details “5555 5555 5555 5557”, “10/18” and “265”
Then I should get payment declined message

##Overview
To my test I use Selenium WebDriver, Cucumber BDD and IntelliJ IDE environment.
Selenium WebDriver is common used tool in testing web application because has a support for cross-platform testing and cross-browser. Additional it's open source and available to everyone.
In my test I was using Cucumber BDD (Behavior-driven development), because test cases it's very easy to read, understand and maintain. BDD is allow in easy way add new test cases.
Additional I using Page Object Pattern to avoid code duplication and make it easier to work with web elements. In this case I divided my scenario for a few pages, where in future scenarios these pages could used again.
I also used class PageFactory, where using the @FindBy annotation this will allow us to successfully maintain tests.

####WebDriver Setup
This interview task has been based on Selenium WebDriver to interact with Chrome. In order for the test to work, browser must be installed on the test machine and accessible from the system environment PATH. 
It's possible to execute test in another web browser, but it's required to install web drivers on computer and add instance of new web browser in DriverManager class. 

Example:

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = new Firefox();
        }
        return driver;
    }

#### Execute
Test has been executed on Windows 10, Chrome/Firefox web browser. Unfortunately I don't have access any computer with MacOS, that why Test scenario wasn't tested on Macintosh.
The test can be performed using the feature file, as well as the TestRunner class.
### Report
- Report will be created in sub-folder target\site\cucumber-report\index.html.
- Additionally a screenshot is created when test case has been failed in sub-folder \target\Screenshots\
## Known issues
- After clicking on the login page, the browser did not always display the same page.
- Sometime I have problem with "choosing random sits" button, appears error message "is not clickable at point".
- Very rarely in "Additives Page" appear popup, but I can't deal with it because of how rare it appears.