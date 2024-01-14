# Designpatter-Java

ALL IMPLEMENTATIONS ARE IN THE FOLDERS! 

## Factory

The Factory Method is a design pattern that provides an
interface for creating objects in a superclass, but allows
subclasses to alter the type of objects that will be created.

Implementation:
You have an interface for your classes. All classes implement the same interface. 
The next step you need to take is to create a new abstract class which takes the first
interface as a class to create a new object. (Look src/Factory_Patter/Example_1/WindowFactory) 
Now you create a new class and extend it with the abstract class and implement the methods that
the class needs. In the method(s) you create new objects of the classes that needs the interface.

## Abstract Factory

Implementation:
Same as above. The only difference is that the new objects aren't created in the Factory itself. 
You create new factory s for every object you want to create.

## Prototype Pattern

Creates Instance of a Class to do something with it.
Shallow Copy - You have to use the (Typecast) super.clone(); Methode.
For the Deep Copy you have to overwrite the clone() Methode.

Implementation:
Imagine you have a class with the name car, and you don't want to create the class over and over
again. So you decide to clone it. For that the class car has to import the cloneable interface.
With the interface you have to import the function clone -> car clone { as in the examples }
Be careful if the clone is not supported, you get a "CloneNotSupportedException"!

How it looks: 
![img.png](img.png)


## Adapter / Wrapper

Usage: Using mergin unknown classes with a class own written

Implementation:
The Adapter class needs to implement or extends the interface / class
In the Adapter class you create an object of a non supported class.
In the constructor you have to write the newly created object.
Lastly you implement the methode that the abstract class or interface
uses and manage how it should be handelt.


# Fassade

A fassade is a way to build around classes. Imagine you have 5 classes
and every time the class have to start in an exact order to manage
accessory and protect your programm from dumm people you build a fassade
around it. You write a class that calls all functions in the right order.

Implementation: 
You create a methode with runs the other methods in the exact order. The
other methods need to be private so only the fassade method can be called. 

# Composite Pattern

More Objects that can be handled as one object
(Grouping objects)

Implementation:
Let's imagine you have 3 classes, and you want to combine them or combine the output from them.
So you create a new class and implement the same interface then the other classes. In the class 
you create a list of the interface and use it as an storage for all new created objects from the
other classes. In the class you need a removeClass() and a addClass() function. In the constructor
you add the classes in the list. Don't forget to implement the needed methods from the interface.


# Visitor

A visitor is a 

# Decorator

Add features to a class without changing the class or to build 
subclasses.

# Model-View-Controll

It is a pattern that helps you visualize actions.

Implementations: