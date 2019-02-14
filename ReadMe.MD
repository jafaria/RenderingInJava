# Rendering in Java

## Set up
Download the javalib jar file. 
Open Intellij and create a new project from a template. 
Navigate to File > Project Structure
Go to Modules tab on the left, and select 'Dependencies'
Add the javalib jar file using + 

## In your Maze class
Make sure you have all the correct import statements:
'import javalib.impworld.World;
 import javalib.impworld.WorldScene;
 import javalib.worldimages.*;'
 
 Your class should then 'extend' World. World is an abstract class
 that has several useful methods. Once you extend that class you need to
 @Override makeScene() method. 
 
 You may look through the world class to see what's available to you. A 
 WorldScene is a canvas on which you draw a WorldImage on. 
 
 ## Testing
 Click on a class and press option + enter (on mac) to see the possible 
 option dropdown. Select create Test(). Select Junit4 for adding tests. 
 You may then add tests using @Test signature as shown in MainTest.  