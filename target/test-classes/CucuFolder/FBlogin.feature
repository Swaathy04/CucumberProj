Feature: Facebook Login Funtion Test 

Scenario Outline: User Test Valid Login Credintial

Given user launch chrome browser

And user enter url

When user enter valid "<UserId>" and "<Password>"

Then user click login button

And user validate test


Examples:

             |UserId| Password|
             
             |swathi| sweet1234|
