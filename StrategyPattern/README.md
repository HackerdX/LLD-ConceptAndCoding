# STRATEGY PATTERN:
YT => https://www.youtube.com/watch?v=u8DttUrXtEw&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=4&ab_channel=Concept%26%26Coding

## Life Before Strategy Pattern (Ye thi AAM ZINDAGI)
Location code => /src/main/java/com/StrategyPattern/WithoutStrategy
1) Suppose we have a parent class Vehicle which has a drive method.
2) Now we have created some child classes extending vehicle which will also implement that drive method.
3) But there may be some "child classes" that may have the same drive code, and parent doesn't have that code.
4) Therefore, it comes under code duplication problem.

## Life With Strategy Pattern (Ab hai MENTOS ZINDAGI)
Location code => /src/main/java/com/StrategyPattern/WithStrategy
1) We have defined an interface DriveStrategy which has drive method to be implemented by the class extending it.
2) Created two class NormalDriveStrategy and SportDriveStrategy which implements DriveStrategy method in their own way.
3) Now the Vehicle class creates a reference of DriveStrategy and initializes DriveStrategy object using constructor injection.
4) Then create three child classes of Vehicle (same as above) and sends the object of NormalDriveStrategy or SportDriveStrategy through super in their constructor.
5) In Main class, create an object of child class and call drive method according to what we are passing.