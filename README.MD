# Lab (JC-Session 5): Exploring Inheritance and Method Overrides
#### Author: Nicholo Pardines

# 1. Basic Inheritance
- Prediction: A
- Outcome: A

![img_3.png](img_3.png)
## Mini-Challenge (Inheritance)
![](Images/uno.png)
![img_4.png](img_4.png)
![img_5.png](img_5.png)

# 2. Abstract Classes
- Predicted: B
- Outcome: B

![img_6.png](img_6.png)
## Mini-Challenge (Abstract)
![img_2.png](img_2.png)
![img_7.png](img_7.png)
### in-main:
```java
Dog dog = new Dog();
dog.breathe();
dog.makeSound();
```
### output:
```text
Inhale... Exhale...
New breathe!
Woof!
```

# 3. Method Overriding: Providing a new Implementation
- Prediction: B
- Outcome: B (since all methods are non-static, the method called depends entirely on object type, not reference type)
  - Hence, the methods called are predictably correctly called
```text
--- Regular Editor ---
Opening a generic file.

--- Code Editor ---
Applying syntax highlighting...
Opening a generic file.

--- Polymorphic Editor ---
Applying syntax highlighting...
Opening a generic file.
```
## Mini-Challenge (Method Overriding)
![img_1.png](img_1.png)
![img_8.png](img_8.png)
![img_9.png](img_9.png)
### Output
```text
Regular Guy takes 100 damage. New health: 0
Guy Fieri with a bowl cut takes 50 damage. New health: 50

Process finished with exit code 0
```

# 4. Inheriting Variables & Access Rules + Mini-Challenge
## Mini-Challenge
![img.png](img.png)
![img_10.png](img_10.png)
Solution: A setter to maintain encapsulation
- The protected access modifier may open up the balance to improper handling.
  - Additionally, we can keep the balance logic consolidated in the parent class for maintainability.

**Output:**
```text
Fee deducted. New balance: 95.0
```


