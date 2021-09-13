###### Part 1

* Create a class **Car**

* Add fields **model**, **color**, **speed**

* Add getter/setter for the **model** and **color**

* Add getter for **speed**

* Add methods **accelerate()** and **slowDown()** to increase/decrease car's **speed**. The acceleration should be different

###### Part 2

In the main() method of application class (class we run)

* Create two instances of the Car class for different models (e.g. Tesla and BMW)

* Add different colors for the cars

* Accelerate both to 100

* Output the winner car - the car which achieved 100km/h faster

* Slow down both to 0

###### Part 3

In the main() method of application class (class we run)

* Create two constructors with different parameters (Constructor with less parameters must invoke the constructor with more parameters)

* Hide constructor without parameter (make it private)

* Adapt Part II code to use the constructors

* \* Not mandatory. Add an Exception generation if a car's speed is bigger than allowed 250km/h. Add the exception processing logic when accelerate() method is invoked

###### Part 4

Using the measurements

System.out.println("Max mem: " + Runtime.getRuntime().maxMemory());
System.out.println("Total mem: " + Runtime.getRuntime().totalMemory());
System.out.println("Free mem: " + Runtime.getRuntime().freeMemory());

* Measure memory before all the action (from the main application class)

* Create 100 Car instances

* Measure memory

* Call garbage collector

* Measure memory and compare with previous

* \* Not mandatory. Achieve Out Of Memory

#### Part 5

* Run %JAVA_HOME%\bin\jconsole.exe

* Add a loop or stop the app on a breakpoint

* Open the app in **jconsole** to check thread and memory

