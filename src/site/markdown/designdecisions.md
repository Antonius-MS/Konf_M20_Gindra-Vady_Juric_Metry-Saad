## Design decisions ##
Created the **Sellable** Interface with methods for **selling and buying drinks & creating reports**.
The sellable drinks must have that interface implemented, so that the **Registrierkasse** class can run the **buy** methods with no error.

The **ImportantSellInformation** saves the data of the purchase so that the **Registrierkasse** runs the **report** methods.

The **Registrierkasse** takes **drink name and purchase date** as input for the buy method and returns the **information about the purchase**.
There are three possible return values for the buy method:
- *successful purchase*
- *drink is not for sale yet*
- *drink does not exist*


The **Registrierkasse** takes **no params or name of seller or purchase data or name of seller and purchase date** (depending on the report method) as input for the report method and returns the **desired sales report**.
- The report methods return a value that is greater or equal (if no drink was sold with the given params) to 0.
  For these implementations we created two branches:
    -  **featureBuyDrinkInRegistrierkasse** for buying and selling drinks
    -  **featureReportsInRegistrierkasse** for creating reports

Tested all classes with **JUnit 5** tests and reached a code coverage of 100%.
Added all necessary dependencies and plugins to the **pom.xml** to be able to run **maven test** and **maven site** successfully.