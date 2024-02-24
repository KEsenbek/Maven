Feature: Client Generator with Parameterized Steps

Scenario: Generate Client
Given the need to generate a new client
When a client's address is set to "123 Main Street"
And the client's name is set to "John Smith"
And the client's plan is set to "Premium"
And the client's last billing date is set to "2023-01-15"
And the client's delivery is enabled
And the client's phone number is set to "+1 (123) 456-7890"
And the client's email is set to "john@example.com"
And the client's payment method is "Credit Card"
Then a new client should be successfully generated with the provided details.