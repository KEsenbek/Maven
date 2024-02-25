Feature: F1 Team Representatives and Car Specifications

  Scenario Outline: Explore F1 Teams, Compare, and Explore Car Specifications
    Given there are <totalTeams> F1 teams in the championship
    Given the <teamType> team <teamName> is an F1 team

    When I check the main representatives of the <teamName> <teamRole>
    Then I should see their <representativeTitle> is <representativeName>

    And I compare the <team1Name> and <team2Name> teams
    Then I should see the comparison results

    And I explore the specifications of <teamName>'s F1 car
    Then I should see details about its engine, chassis, and performance

    Examples:
      | totalTeams | teamType     | teamName       | teamRole     | representativeTitle | representativeName | team1Name      | team2Name      |
      | 10         | "leading"    | "Mercedes"     | "management" | "Team Principal"    | "Toto Wolff"       | "Mercedes"     | "Red Bull"     |
      | 10         | "top"        | "Ferrari"      | "executive"  | "Team Principal"    | "Mattia Binotto"   | "Ferrari"      | "McLaren"      |
      | 10         | "challenger" | "Red Bull"     | "leadership" | "Team Principal"    | "Christian Horner" | "Red Bull"     | "Aston Martin" |
      | 10         | "promising"  | "McLaren"      | "management" | "CEO"               | "Zak Brown"        | "McLaren"      | "AlphaTauri"   |
      | 10         | "rising"     | "Alpine"       | "executive"  | "CEO"               | "Laurent Rossi"    | "Alpine"       | "Williams"     |
      | 10         | "rebranded"  | "Aston Martin" | "leadership" | "Team Principal"    | "Otmar Szafnauer"  | "Aston Martin" | "Haas"         |
      | 10         | "rising"     | "AlphaTauri"   | "management" | "Team Principal"    | "Franz Tost"       | "AlphaTauri"   | "Alfa Romeo"   |
      | 10         | "historic"   | "Williams"     | "executive"  | "CEO"               | "Jost Capito"      | "Williams"     | "Mercedes"     |
      | 10         | "underdog"   | "Haas"         | "leadership" | "Team Principal"    | "Guenther Steiner" | "Haas"         | "Ferrari"      |
      | 10         | "persistent" | "Alfa Romeo"   | "management" | "Team Principal"    | "Frederic Vasseur" | "Alfa Romeo"   | "McLaren"      |