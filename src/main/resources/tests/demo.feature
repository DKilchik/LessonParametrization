
  Feature: Demo feature

    Scenario Outline: Buy phone '<phone>'
      Given application is opened
      When user click to buy '<phone>' phone
      And user select '<tariffPlan>'

      Examples:

      |phone|tariffPlan|
      |Samsung Galaxy A53|Go Light |
      |Iphone 14         |Go Plus   |
      |Xiaonmi 13        |Go Intense |