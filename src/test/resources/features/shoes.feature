Feature: Shoes
  Scenario Outline: Process Shoe Orders
    Given there is a shoe order with following details:
      | orderId   | customerName   | shippingBillingAddress   | shoeModel   | quantity   | subtotal   |
      | <orderId> | <customerName> | <shippingBillingAddress> | <shoeModel> | <quantity> | <subtotal> |
    When the user processes the shoe order, generating an invoice for following order:
      | orderId   | customerName   | shippingBillingAddress   | shoeModel   | quantity   | unitPrice   | subtotal   | taxRate   | taxAmount   | totalAmount   |
      | <orderId> | <customerName> | <shippingBillingAddress> | <shoeModel> | <quantity> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> | <totalAmount> |

    Then the user should see the invoice generated for following order:

      | orderId   | customerName   | shippingBillingAddress   | shoeModel   | quantity   | unitPrice   | subtotal   | taxRate   | taxAmount   | totalAmount   |
      | <orderId> | <customerName> | <shippingBillingAddress> | <shoeModel> | <quantity> | <unitPrice> | <subtotal> | <taxRate> | <taxAmount> | <totalAmount> |

    Examples:
      | orderId | customerName | shippingBillingAddress     | shoeModel     | quantity | unitPrice | subtotal | taxRate | taxAmount | totalAmount |
      | 54321   | Alice Smith  | 456 Oak Avenue, Townsville | Running Shoes | 3        | 60.00     | 180.00   | 5       | 9.00      | 189.00      |