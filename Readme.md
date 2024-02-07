#Be Cognizant Home Page header View

**Project Overview**
 
This Selenium automation testing project focuses on automating tasks related to the Be.Cognizant portal. The primary objectives include capturing user information, showing all the header tabs in Be.Cognizant Portal. Navigating through the portal, verifying the presence of specific elements, and finding Ethics and Compliance page Which is a sub-header element inside main header tab of Be.Cognizant portal. The project uses various dependencies and libraries to facilitate automation.The whole project is developed using a framework which contains several page objects under which there are classes which describes the functionality of the program.
 
**Project Structure**
 
1.Maven Repository
 
- Version: 3.12.1
- Purpose: Used for project Management and dependency resolution.
 
2.Dependencies
  
TestNG
- Version: 7.9.0
- Purpose: Framework for test automation that allows for parallel execution and flexible test configuration.
 
Extent Report
- Version: 5.1.1
- Purpose: Generates interactive and detailed HTML reports to enhance test result analysis.
 
Selenium
- Version: 4.15.0
- Purpose: Enables interaction with web elements, navigation, and form submission in the browser.

 
**Automation Test Flow**
 
1. Open Be.Cognizant Page
- Navigate to the Be.Cognizant portal.
 
2. Checking if the correct website of Be.Cognizant page opened or not 
- Verify the authenticate webpage opened or not.

3. Verify the user 
- Click on the profile.
- Capture user information.
- Show the username and Email id of the user.

4. Check the header tabs of be.cognizant page
- Print the number of header tabs present in the becognizant page.
- Select and drop down each header tab
- Select and drop down for Company,Service Line, Sales Resources, Market and Countries, Corporate Functions and People header
 
5. Select Corporate Functions header
- Go to Legal & Corporate Affairs.
- Click Ethics and Compliance.

6. Open Ethics and Compliance Page 
- Verify Whether Ethics and Compliance Page opened.
- Scroll Down Below of the page.
- Go to Key Ethics and Compliance Focus Areas portion of the Webpage.

7. Navigate to Key Ethics & Compliance Focus Areas
- Show the 4 subsection under the Key Ethics & Compliance Focus Areas.
- Print Global Anti-Corruption, Global Trade Compliance, Internal Investigations, Ethics & Compliance Training and Communications in console.


**Screenshots**

- Taking the screenshot after clicking on every dropdown available in the Header of Be.cognizant.

**How to Run the Tests**
 
1. Open Eclipse IDE:
- Launch Eclipse IDE on your machine.
 
2. Import Project:
- Select 'File' -> 'Import' from the menu.
- Choose 'Existing Maven Projects' and click 'Next'.
- Browse to the directory where you cloned the repository and select the project.
 
3. Update Maven Project:
- Right-click on the project in the Project Explorer.
- Choose 'Maven' -> 'Update Project'.
- Click 'OK' to update dependencies.
 
4. Run Test Suite:
- Locate the test suite file (e.g., 'src/test/java/TestSuite.java').
- Right-click on the file and choose 'Run As' -> 'TestNG Suite'.
 
6. View Reports:
- After execution, open the 'report' folder.
- Find the Extent Report HTML file ('myReport.html') for detailed test reports.
 
**Author Information**
 
- Subhash B(2303528)
- S Durga(2303465)
- M Navish(2303496)
- Bhartendu Singh(2303461)
- Ashishkumar Ramesh(2303584)

**Disclaimer**
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.
