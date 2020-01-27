Feature: To_test_sbs video
  I can test sbs URL
  
   @Shakedown @CSO
  Scenario: TC01_Verify_Video
    Given I start the web browser
    When I open sbs and launch URL
    Then I Play the Video
    Then I close sbs the Browser 

    