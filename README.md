# Cars
A simple project that demonstrates the use of a few design patterns

Currently used design patterns: Decorator

---------------------------

Pros: 

+ I can add new modifiers easily by adding a new car:
+ If I want to make a car with light wheels but a powerful engine, all I have to do is-

	>> Car newcar = new LightWheels(new TurboEngine(new BasicCar()));

Cons: 

- There is nothing preventing me from writing - 

	>> Car newcar = new LightWheels(new TurboWheels(new BasicCar()))
  
  This makes no sense! I plan to solve this by switching to a Builder(?) design pattern
  and implementing a Decorator design pattern for each component.
