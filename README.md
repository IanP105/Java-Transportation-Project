# CSC-331-Transportation-Project

## Overview
This project demonstrates a few of the fundamental concepts in the Java programming language, such as polymorphism, inheritance, instance variables, constructors, accessors, and mutators.  A driver file is included, which makes use of the classes in this repo.

## The Diagrams
The structure of this project was first layed out in a series of UML Diagrams, alongside an inheritance hierarchy chart to show the relationships between all of the classes. The diagrams and accompanying chart can be found in the "UML-Diagrams" folder in the root of this repo.

## The Structure
The following classes were categorized and then arranged into the representing heirarchy:

Boat, Train, Transportation, Helicopter, LandTransportation, Automobile, Ship, AirTransportation, Submarine, Bus, Dirigible, WaterTransportation, Bike, Plane, Hot Air Balloon

The instance variables were determined for each class and were added to the corresponding UML diagrams, along with the constructors, accessors and mutators.

## The Code
The information contained within the diagrams was then transformed directly into the Java classes seen in "TransportationLab/src".  To make use of this information, a driver file was created, which can be found at "TransportationLab/src/WTCTreadwellPenaWalsh.java".  The driver file contains at least one instance of each class from the bottom level of the hierarchy and implements a polymorphic solution to the problem described below.

**A travel center needs a program to do the following:**
* Ask the user what type of transportation they want to use (Land, Air, Water).
* In a table format, display the options for the type selected, the cost of transportation, whether the purchase is for a ticket or for a rental, the average speed, and the number of passengers allowed.
* Ask the user to select which mode of transportation they want to use.
* Display ALL information about the selected mode using an overridden toString method.
* Ask the user to verify that this is the mode of transportation they want to use.
* Ask the user how many passengers need to travel using that mode of transportation.
* Display the total cost.
* Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental, etc.)

## Authors
* [Ian Peña](https://github.com/IanP105)
* [Brennon Treadwell](https://github.com/BTreadwell)
* [Alex Walsh](https://github.com/alexwalsh136)
