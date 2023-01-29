# JetsProject


## Overview

The purpose of this project is to create a fleet of jets with different characteristics and capabilities, store the fleet in an airfield and allow it to be accessed and manipulated by a user. The information for the initial five jets populated to the airfield is written in from the text file jets.txt. This is done using a try-with-resources syntax utilizing the AutoCloseable interface. Within the while loop of the try-with-resources, the text file is split at each comma and stored into a string array. Each index of that array is then stored in a local variable corresponding to what the text information is representative of. Next an if statement is used to determine which subclass of Jet needs to be created either FighterJet or Transporter. Once the type is determined, the object is created and the information taken in from the text file is parsed into the correct data type. Finally, these objects are stored in the array list instantiated at the beginning of the class jetsList. 

The abstract superclass Jet's fields establish that every jet will have a model, speed, range and price which is written into its multi-argument constructor. Jet also has an abstract method that ensures that each subclass that extends it will have a specific type of fly behavior. 

The subclasses FighterJet, Transporter and PassengerJet extend the Jet superclass and therefore inherit all of its fields and abstract methods. These three classes are the same in their fields, but are different in their fly method behavior and which interfaces they implement. The FighterJet class implements the GunRun interface which allows it to perform the method attack, and the Transporter implements the LoadTroops interface which allows it to perform the gearUp method. The PassengerJet does not implement any interfaces as it is used for the jet creation portion of the project. 

The front-facing portion of this project is held in the class JetsApp. This class, and inherently the program, begins with the instantiation of the AirField bagram. When this instantiation occurs the Airfield is automatically populated through the AirField classes no-argument constructor. After this the main method beings with the instantiation of a JetApp object that will serve as the invoking object for the non-static methods in the JetsApp class. This object is used to call the method run which is used to call the method userSelection. In the userSelection method, a while loop is used to encase a switch case that will cycle the entirety of the project. The while loop begins by calling the displayUserMenu method which prints the userMenu to the screen. The user is prompted to make a number selection based on what portion of the program they would like to run. This input is taken in using a scanner with the userSelection method. 

Case 1 of the switch case prints the entirety of the fleet of Jets at any given time. This takes advantage of the array lists' mutable size, allowing it to print the list regardless of how many jets are added or removed. 

Case 2 calls all of the fly methods from each jet type that is currently listed in the jetsList array list. If it is not currently listed the fly method will not be called. Case 1 and 2 use for each loops to iterate over the entire current array list.

Case 3 and 4 have a similar function in that they produce all of the information for the fastest jet and the jet with the longest range. This is accomplished through a method call to the AirField class which then iterates a for loop over the entire existing array list. The Jet superclass methods getSpeed and getRange are used to retrieve the information for each subclass of Jet. The index that is determined to be the fastest and have the longest range is printed. 

Case 5 and 6 also have a similar function in that they call methods in the AirField class which in turn calls the correct subclass of jet to be printed. The loadUp and shoot methods use a for each loop to iterate over the entire existing list looking for instances of the correct subclass of Jet. Once the correct subclass is determined, the local Jet object listAllJets is cast to the respective subclass so that it can call the subclass's implemented behavior. 

Case 7 calls the Airfield method addJet to the fleet which prompts the user to create a new PassengerJet. The user is prompted to enter each piece of information from the Jet class multi-argument constructor. (model, speed, range and price). This information is then used to instantiate a new PassengerJet object which is stored into the array using the list add method. 

Case 8 works similarly to case 7 except it prompts the user to remove a jet from the fleet based on a numbered menu. The jet is then removed using the list remove method. The removed jet is then saved and then printed to the screen.

Case 9 ends the program by changing the boolean usingMenu, which is used to keep the while loop running, to false and prints a goodbye message to the screen.      



## Technologies Used
Java, Eclipse 

## Lessons Learned 
The major lessons I learned involved array lists, use of abstract classes and methods and how inheritance and polymorphism are used with them, and use of interfaces. 

Array lists and their advantage of a mutable element amount is one of the largest takeaways from this project. Being able to use the same list for jets in the airfield regardless of how many the user adds or removes is much more convenient than having to rely on a set amount as would have to be done with a regular array. This benefit also becomes evident when using for each loops to iterate through the list as we can simply call the size method and not have to worry about a null pointer exception. 

Abstract classes and methods were another aspect in which my knowledge improved greatly throughout working on this project. Seeing how each subclass inherits and overrides the superclass's methods displayed to me the benefits of having overarching superclasses and extending them to more precise subclasses. This also allows the programmer to keep code dry. 

Interfaces were also an important part of this project that I learned quite a bit about. While they have somewhat of a similar function as abstract classes, they are useful in that a class can implement more than one interface and those classes also inherit and must implement the interfaces classes. This as well as with abstract classes and methods allows to keep code dry. 