Zoo Project

Your task is to implement a simulation of a Zoo.

There are 4 kinds of animals in the Zoo, caretaker should give them 
food every day.
The 4 kinds are the following:
 - Wolf
 - Rabbit
 - Bear
 - Hedgehog

The caretaker gives food to all the animals once a day, and he can only choose
from these kinds of food:
 - Vegetables
 - Fruit
 - Meat
The chosen food will be given to all the animals.
   
Different kind of animals react differently to the food given to them:
 - if they like it, they gain weight
 - if they eat it, but they do not like it, their weight stays the same
 - if they do not like it, they lose weight

An animal can starve to death, or can be deceased because of obesity.

Different reactions of animals:

Rabbit: 
meat -> weight decreases by 1
vegetables -> weight increases by 2
fruit -> weight increases by 1
Obesity: >=4
Wolf:
meat -> weight increases by 3
vegetables -> weight decreases by 1
fruit -> weight decreases by 1
Obesity: >=6
Hedgehog:
meat -> weight decreases by 1
vegetables -> weight does not change
fruit -> weight increases by 2
Obesity: >=5
Bear:
meat -> weight increases by 1
vegetables -> weight increases by 1
fruit -> weight decreases by 1
Obesity: >=10

Run a simulation of this Zoo:
Animals:
Akela the wolf, starter weight: 3
Balu the bear, starter weight: 4
Tapsi the rabbit, starter weight: 2
Brumi the bear, starter weight: 6
Durum the hedgehog, starter weight: 4

Foods given: meat, vegetables, meat, fruit, meat

**Use MVC and factory pattern in this task!**
_Possible development options:_
 - let your Zoo able to read the animals and the food from a file (development is in progress)
 - let your Zoo able to read the animals and the food from a database (development is in prgress)
