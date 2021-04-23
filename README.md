# Software Configuration Management #
### Konf_M20_Gindra-Vady_Juric_Metry-Saad Drinks Project ###
## Contributors ##
##### Gerwald Gindra-Vady, Valentina Juric and Antonius Metry Saad #####

## Description ##
Konf_M20_Gindra-Vady_Juric_Metry-Saad is a drinks project from Gerwald Gindra-Vady, Valentina Juric and Antonius Metry Saad that is based on the Drinks-Sample project. The purpose of this project is to make drinks and display information about the drinks.


## v1.0

---

## Features to implement for Coffee Class ##

- Make a coffee
- Give the coffee a name
- Enter the amount of coffee spoons, sugar spoons and if milk should be added
- Add more sugar spoons after coffee is finished
- Display information about the coffee

## Usage of Coffee Class ##
- Make a coffee with constructor of coffee class
- Pass the coffee name parameter in the constructor
- Also pass following parameters to the constructor: the amount of coffee spoons, sugar spoons and if milk should be added
- Add more sugar spoons after coffee is finished with the addSugarSpoon method
- Display information about the coffee with the toString method

By Antonius Metry Saad (GitHub: Antonius-MS)

## Features to implement for Beer Class ##

- Make a beer
- Give the Beer a name
- Give the bottle of the Beer a boolean value, either it is open (false) or closed (true)
- Add a method to open the Beer bottle if it is not already and display when it is opened

## Usage of Beer Class ##
- Make a beer with constructor of beer class
- Put in the beer name parameter in the constructor
- Also put in whether the bottle is opened (false) or closed (true)
- To open the bottle use the openBottle method and it will print if it is being opened or if it is already open

By Valentina Juric (GitHub: valentinajuric)

## Features to implement for Root_Beer Class ##

- Make a Root Beer
- Give the Root Beer a name
- State if you know this kind of beverage
- Display information about the Root Beer

## Usage of Root_Beer Class ##

- Make a Root Beer with the constructor of the Root_Beer class
- Put the Root Beer name parameter in the constructor
- Put a boolean in the constructor that determines if you already know this kind of beverage
- Display information about the Root Beer with the printInfo method

By Gerwald Gindra-Vady (GitHub: Gerw4ld)

---

## v2.0
---

## Gitignore File
- Specifies intentionally untracked files that Git should ignore

## Branches created for Coffee Class ##

- branch name: testCoffee
- purpose: test all methods in Coffee Class
- framework: JUnit 5
- test objects created: longBlack, latte, cappuccino
- method used for testing: assertEquals(expectedValue, actualValue) 
- explanation: 
  - init three coffees that are completely different for each test [setup]
  - call constructor [exercise]
  - verify that constructor works as expected [verify]
  - call getter methods [exercise]
  - verify that getter works as expected [verify]
  - call void methods [exercise]
  - verify that data in void method is manipulated as expected [verify]
  - pass wrong arguments [exercise]
  - verify that exception occurs as expected [verify]
- amount of tests: 33
- amount of passed tests: 33

## Branches created for Beer Class ##

- branch name: testBeer
- purpose: test all methods in Beer Class
- framework: JUnit 5
- test objects created: heineken, goesser
- method used for testing: assertEquals(expectedValue, actualValue)
- amount of tests: 17
- amount of passed tests: 17

---

## Technologies used ##
- IntelliJ
- Maven
- Git
- GitHub
- dillinger.io

## Currently tested with ##

- open project directory with IntelliJ
- with JDK 15.0.2
