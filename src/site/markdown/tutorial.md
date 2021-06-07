# Tutorial for Devs #
### Introduction ###

This drinks project is in continuous development. New features from other devs are always welcome.
Feel free to share new features with us.

---

### Set up your IDE (for non Java Devs) ###

- Install Java https://openjdk.java.net/
- Set Java_Home Variable https://www.java.com/de/download/help/path.html
- Get git (if you haven't) https://git-scm.com/downloads
- Get IntelliJ https://www.jetbrains.com/de-de/idea/download

---

### Clone this Project ###

- git clone https://github.com/Antonius-MS/Konf_M20_Gindra-Vady_Juric_Metry-Saad.git

---

### Open Project ###

1. From the main menu, select File | Open. Alternatively, click Open on the welcome screen.
2. In the dialog that opens, select the pom.xml file of the project you want to open. Click OK.
3. In the dialog that opens, click Open as Project.
   IntelliJ IDEA opens and syncs the Maven project in the IDE.

---

### Overview ###

In **src/main/java/at.fhj.iit** you will find different source files.
The drinks are all based on the classes **Drink and Liquid**.
So if you want to create a new drink, please extend from **Drink or Liquid**.
For a drink template see **SimpleDrink**.
If you want to modify the selling and buying process go to **Registrierkasse**.
In **src/test/java/at.fhj.iit** you will find the tests for all classes.
Try to reach a test coverage of 100% for your implementations otherwise we will not take your code.
In the **pom.xml** all plugins and dependencies are defined in order to make an automated build process possible.
If you need other plugins or dependencies visit https://mvnrepository.com/.

---

### Contact us ###

Add us on GitHub and show us your code.