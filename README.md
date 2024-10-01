**BOTest: Automated Black Box Testing Tool for Web APIs**

**Overview:**
BOTest is a desktop application designed to automate the black box testing of RESTful Web APIs. It generates test cases based on OpenAPI specifications and executes them to identify faults and bugs in the APIs.

**Key Features:**
- **Automated Test Case Generation:** Generates both valid and faulty test cases from OpenAPI specifications.
- **Test Execution:** Executes generated test cases using JUnit and RestAssured technologies.
- **Comprehensive Test Reporting:** Produces detailed HTML test reports using Allure Report for easy analysis.

**Technical Details:**
- **Input:** OpenAPI Specification file (JSON format) and server Base URI.
- **Output:** HTML test report displayed in a browser.
- **Core Components:**
  - **TestGenerator:** Creates abstract test cases.
  - **TestWriter:** Converts abstract test cases into executable test cases.
  - **TestRunner:** Executes the test cases and collects results.
  - **TestReport:** Generates human-readable test reports from the results.
- **Technologies Used:** Java, JUnit, RestAssured, Allure Report.

**Usage:**
1. Provide the OpenAPI Specification file and server Base URI.
2. Run the tool to generate and execute test cases.
3. Review the detailed test report for insights on API performance and issues.

**Conclusion:**
BOTest simplifies the process of testing RESTful APIs by automating test case generation and execution, ensuring thorough testing with minimal human intervention.
