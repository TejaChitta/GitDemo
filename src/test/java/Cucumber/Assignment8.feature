@tag
Feature: Employee Login into Facebook website

  @tag2
  Scenario Outline: Multiple Employee login with different set of data
    Given User navigates to Facebook website
    When User enters username and password from testdatafile <file> and clicks on the login button
    Then "Welcome to HomePage" title should be displayed

    Examples: 
      | file  | 
      | C:\\Users\\16122\\eclipse-workspace\\SeleniumAssignments\\src\\main\\java\\Testdata.csv |       
