# SingtelAssignment

## A. Let’s start with the basics

```bash
1. Can you implement the sing() method for the bird?
    a. How did you unit test it?
    b. How did you optimize the code for maintainability?
    (Ask yourself the same question for all following exercises)
```
    a. Use ByteArrayOutputStream to verify the console output.<br/>
    b. Write clean and readable code. Do write comments. And Animal class is changed into abstract so it cannot be initialized. <br/>

```bash
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
    a. A duck says: “Quack, quack”
    b. A duck can swim
    c. A chicken says: “Cluck, cluck”
    d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
```
For this question, I have added behaviours such as **FlyBehaviour**, **SpeakBehaviour**. Each different action will be implemented from such behaviours, for example, **Quack** is an implementation of **SpeakBehavior**.
Behaviours will be seperated away from the class and it can be assigned at runtime. Therefore, as birds, duck and chicken can make their own sound as well as act differently when they fly (duck can fly but chicken cannot). It would be easier for code-reusing and maintainance.

```bash
3. Now how would you model a rooster?
    a. A rooster says: “Cock-a-doodle-doo”
    b. How is the rooster related to the chicken?
    c. Can you think of other ways to model a rooster without using inheritance?
```
    b. A rooster is a chicken. It is an adult male chicken. <br/>
    c. Use properties of the Chicken class to verify its type such as age, sex. For instance, a male and 3-year-old chicken is definitely a rooster. <br/>

