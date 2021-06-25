#### Selenium webdriver provide 3 types of webdriver wait namely:
- Implicit wait
- Explicit wait
- Fluent wait

1). **Implicit Wait*:* wait for some time to pull DOM(Document Object Model) when locating page element(s). Implicit wait is useful when element(s) are not visible immediately.
It will wait for certain amount of time for the DOM to be visible before execute an action. 

****

How to use implicit wait?
Add implicit wait when after initialise WebDriver as shown below:

***WebDriver driver = new ChromeDriver()***
***driver.manage().timeouts().implicitlyWait(seconds, TimeUnits.SECONDS)***

2). **Explicit Wait*:* This is the most use WebDriver wait because it's wait for DOM for a specified wait time, look for the set condition and execute the code.
If the condition is not visible within the specified time, test execution will fail.
