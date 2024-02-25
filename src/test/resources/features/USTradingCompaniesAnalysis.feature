Feature: Analyzing Data of US Trading Companies

  Scenario Outline: Analyze Data of US Trading Companies
    Given there are 3 US trading companies in the market
    And the company <companyName> is headquartered in <headquarters>
    And the company manages assets worth $<companyAssets> billion
    And the company holds shares in <topShares> top companies
    And there are <companyEmployees> employees working at the company
    And the company is represented by <representativeName>
    And the company was established in <establishmentYear>

    When I analyze the assets, shares, employees, headquarters, representatives, and establishment year of <companyName>

    Then I should see the following data for <companyName>:
      | Data               | Value                         |
      | Assets             | $<expectedAssets> billion     |
      | Top Shares         | <expectedTopShares> companies |
      | Employees          | <expectedEmployees> employees |
      | Headquarters       | "<expectedHeadquarters>"      |
      | Representative     | "<expectedRepresentative>"    |
      | Establishment Year | <expectedEstablishmentYear>   |

    And I calculate the total value of shares held by <companyName>
    And I identify the highest-paid employee at <companyName>
    And I check the total assets managed by <companyName>
    And I verify the number of top shares held by <companyName>
    And I determine the number of employees at <companyName>
    And I look into the headquarters of <companyName>
    And I find the representative's name at <companyName>
    And I estimate the year of establishment of <companyName>

    Then I should see the additional data for <companyName>:
      | Data                      | Value                          |
      | Total Share Value         | $<expectedShareValue> billion  |
      | Highest Paid Employee     | <expectedHighestPaid>          |
      | Total Managed Assets      | $<expectedTotalAssets> billion |
      | Number of Top Shares Held | <expectedTopShares> companies  |
      | Number of Employees       | <expectedEmployees> employees  |
      | Headquarters              | <expectedHeadquarters>         |
      | Representative            | <expectedRepresentative>       |
      | Establishment Year        | <expectedEstablishmentYear>    |

    Examples:
      | companyName | headquarters  | companyAssets | topShares | companyEmployees | representativeName | establishmentYear | expectedAssets | expectedTopShares | expectedEmployees | expectedHeadquarters | expectedRepresentative | expectedEstablishmentYear | expectedShareValue | expectedHighestPaid | expectedTotalAssets |
      | "Company A" | "New York"    | 100           | 10        | 1000             | "John Smith"       | 1995              | 100            | 10                | 1000              | "New York"           | "John Smith"           | 1995                      | 50                 | "John Smith"        | 100                 |
      | "Company B" | "Chicago"     | 75            | 8         | 800              | "Emily Johnson"    | 2000              | 75             | 8                 | 800               | "Chicago"            | "Emily Johnson"        | 2000                      | 40                 | "Emily Johnson"     | 75                  |
      | "Company C" | "Los Angeles" | 50            | 5         | 500              | "Michael Brown"    | 2005              | 50             | 5                 | 500               | "Los Angeles"        | "Michael Brown"        | 2005                      | 30                 | "Michael Brown"     | 50                  |