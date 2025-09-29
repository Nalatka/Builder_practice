This code is fully functional to "build" one type of robot. 

The structure follows Builders.Builder Pattern including Builders.Director function

Clean Code Principles Applied and listed below

Very Small Functions:
All builder methods are 2–3 lines long and do one thing.

One Level of Abstraction

Descriptive Naming:
All methods are named consistently (setName, setId, setMaterial).

Minimal Arguments:
All setters take one argument.
The Robot constructor groups all fields together and is never called directly outside the builder.

Validation

DRY Principle:
There is no duplicated object construction logic — all Robot creation is centralized in the builder

P.S:
I will add more, I really interested in this topic and think it definetily will be useful
