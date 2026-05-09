
Feature: Login

@Regression
 Scenario: 1 Login to the application
 Given Base URL
 When Enter user name "abc"
 And Enter password "abc123@"
 And Click OK button
 Then Verify the dashboard page title
 
 @Regression   
 Scenario: 2 Login to the application212
 Given Text field 
 When Enter test "Fail"
 Then Verify the text field


