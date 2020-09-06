$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "This feature we created to test all login fuctionality",
  "description": "  Developer - Vildan\n  Tester - Chirag",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify login successful for valid cred",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens the website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdef.LoginSteps.open_website()"
});
