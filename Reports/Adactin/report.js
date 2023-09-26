$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel In Adactin Website",
  "description": "",
  "id": "booking-hotel-in-adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-in-adactin-website;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter Username In UserName Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 2231807200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Username_In_UserName_Field()"
});
formatter.result({
  "duration": 112034600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Password_In_Password_Field()"
});
formatter.result({
  "duration": 58968100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 631365000,
  "status": "passed"
});
});