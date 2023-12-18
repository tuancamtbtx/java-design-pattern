# Singleton Pattern
This is a creational design pattern that ensures that a class has only one instance and provides a global point of access to it.

## Problem
The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle. 
1. Ensure that a class has just a single instance. Why would anyone want to control how many instances a class has? 
The most common reason for this is to control access to some shared resource—for example, a database or a file.
2.  Provide a global access point to that instance. Remember those global variables that you (all right, me) used to store some essential objects?

Nowadays, the Singleton pattern has become so popular that people may call something a singleton even if solves just one of the listed problems.
## Solution
All implementations of the Singleton have these two steps in common:
- Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field.
  All following calls to this method return the cached object.

If your code has access to the Singleton class, then it's able to call the Singleton's static methods. So whenever that method is called, the same object is always returned.

## Pros and Cons
The Singleton pattern is a widely used design pattern that ensures a class has only one instance and provides a global point of access to that instance. Here are the pros and cons of the Singleton pattern:

### Pros:
1. **Global Access**: Provides a global point of access to the single instance, allowing objects to access it easily.
2. **Lazy Initialization**: Supports lazy initialization, meaning the instance is created only when it is first requested, saving resources until then.
3. **Memory Efficiency**: Ensures memory efficiency by reusing the same instance across the application, especially in resource-intensive applications.
4. **Thread Safety**: Can ensure thread safety when implemented correctly, preventing multiple threads from creating separate instances.
5. **Easier Coordination**: Simplifies access to shared resources and centralized control over configuration settings.

### Cons:
1. **Overuse**: Singleton can be overused, leading to tight coupling and making it difficult to substitute alternative implementations.
2. **Testing Challenges**: Singleton can make unit testing difficult, especially if it tightly couples with other classes or relies on global state.
3. **Hidden Dependencies**: Can introduce hidden dependencies, making it challenging to identify and manage dependencies.
4. **Limited Flexibility**: Limits the flexibility of the code, as it is not easy to subclass a Singleton, and it can hinder future modifications and extensions.
5. **Potential for Abuse**: Can lead to anti-patterns and misuse if not carefully designed, leading to code that is difficult to maintain and extend.

