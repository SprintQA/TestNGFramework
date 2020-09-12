$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmployeeStatusFeature.feature");
formatter.feature({
  "name": "Add user feature testing",
  "description": "",
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
formatter.step({
  "name": "user login with username \"admin.username\" and password \"admin.password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.user_login_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdef.HomeSteps.verify_user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify data on user listing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@datatable1"
    }
  ]
});
formatter.step({
  "name": "user clicks on Job title tab under admin and job menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdef.HomeSteps.clickOnJobTitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on job titles page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdef.JobTitleSteps.verify_user_is_on_job_title_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify job title data",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdef.JobTitleSteps.verifyJobTitleData(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});