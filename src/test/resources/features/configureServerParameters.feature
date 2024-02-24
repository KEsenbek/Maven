Feature: Configuring Server Parameters
  Scenario: Configure Server Parameters
    Given a new server needs to be configured
    When the host is set to "example-server"
    And the IP Address is set to "192.168.1.100"
    And the Server Name is set to "Production Server"
    And the Rules and Policies are configured with "Firewall rules applied"
    And the Access Control is limited to "authorized personnel only"
    And the Expiration Date is set to "2023-12-31"
    And the Responsible User is defined as "John Doe"
    And the Disk Space is allocated with "500 GB"
    And the Server Status is set to "Running"
    Then the server should be successfully configured with the provided parameters.