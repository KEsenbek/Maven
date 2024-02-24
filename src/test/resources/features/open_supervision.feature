Feature: Supervision of Agents

  Scenario: Open supervision of agents in a call center
    Given a team of agents is working in a call center
    And the call center is currently open
    And some agents are on active calls
    When a supervisor initiates open supervision
    Then the supervisor should be able to monitor the agents' calls