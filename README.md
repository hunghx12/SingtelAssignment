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
c. Use properties of the Chicken class to verify its type such as age, sex. For instance, a male and 3-year-old chicken is definitely a rooster.<br/>

```bash
4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
    a. A parrot living with dogs says: “Woof, woof”
    b. A parrot living with cats says: “Meow”
    c. A parrot living near the rooster says: “Cock-a-doodle-doo”
    d. How do you keep the parrot maintainable? What if we need another parrot
    lives near a Duck? Or near a phone that rings frequently?
```
Because I have seperated the animal class code and its behaviours, it is easy to extend the ability of an animal at runtime. A parrot can be initialized with any sound you want a parrot to make, just pass a behaviour to its constructor. It is easy to maintain as well. When you want a new parrot with a new sound, you do not need to modify the Parrot class. 

## B. Model fish as well as other swimming animals

```bash
1. In addition to the birds, can you model a fish? 
    a. Fishes don’t sing
    b. Fishes don’t walk 
    c. Fishes can swim
2. Can you specialize the fish as a Shark and as a Clownfish? 
    a. Sharks are large and grey
    b. Clownfish are small and colourful (orange) 
    c. Clownfish make jokes
    d. Sharks eat other fish
3. Dolphins are not exactly fish, yet, they are good swimmers
    a. Can you model a dolphin that swims without inheriting from a fish class? b. How do you avoid duplicating code or introducing unneeded overhead?
```
3.b: Dolphin class implemented **SwimableBehaviour** directly.

## D. Model animals that change their behaviour over time
This should be C

```bash
1. Can you model a butterfly? 
    a. A butterfly can fly
    b. A butterfly does not make a sound
2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?
    a. A caterpillar cannot fly
    b. A caterpillar can walk (crawl)
```
Done within the same instance. When a new butterfly is initialized, it will act as a caterpillar. After calling the metamorphose() method, it will change its behaviours to an adult butterfly's behaviours.

## BONUS
```bash
1. Can you add a second language (if you know a language other than English) Use the rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds differently depending on language
```
Used Internationalization and Localization in Java to handle this.