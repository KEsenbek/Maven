Feature: Computer Model Configuration with Parameterized Steps
  Scenario: Configure Computer Model
    Given the need to configure a new computer model
    When the capacity is set to "512 GB"
    And the color is set to "Silver"
    And the availability is set to "In Stock"
    And the price is set to "$999.99"
    And the screen dimensions are set to "15.6 inches"
    And the RAM size is set to "8 GB"
    And the processor is set to "Intel Core i7"
    And the graphics card is set to "NVIDIA GeForce RTX 3080"
    And the operating system is set to "Windows 10"
    And the warranty is set to "2 years"
    Then a new computer model should be successfully configured with the provided details.