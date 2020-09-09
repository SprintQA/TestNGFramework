$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "This feature we created to test all login fuctionality",
  "description": "  Developer - Vildan\n  Tester - Chirag",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens the website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.open_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify login unsuccessful for valid cred",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Chirag"
    }
  ]
});
formatter.step({
  "name": "user login with invalid credential",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.login_with_invalid_cred()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fail me",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.fail_me()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Failled scenario\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat com.automation.pages.LoginPage.fail(LoginPage.java:50)\r\n\tat com.automation.stepdef.LoginSteps.fail_me(LoginSteps.java:35)\r\n\tat ✽.fail me(file:///C:/Users/khima/java-learning/AssignmentTestNGProject/src/test/resources/features/Login.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens the website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.open_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify login unsuccessful for valid cred",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Chirag"
    }
  ]
});
formatter.step({
  "name": "user login with invalid credential",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.login_with_invalid_cred()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fail me",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.fail_me()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Failled scenario\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat com.automation.pages.LoginPage.fail(LoginPage.java:50)\r\n\tat com.automation.stepdef.LoginSteps.fail_me(LoginSteps.java:35)\r\n\tat ✽.fail me(file:///C:/Users/khima/java-learning/AssignmentTestNGProject/src/test/resources/features/Login.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});