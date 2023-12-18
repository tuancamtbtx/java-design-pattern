# Prototype Pattern
 The Prototype pattern is creational pattern that lets you copy existing objects without making your code dependent on their class.

## Problem
1. Say you have an object, and you want to create an exact copy of it. How would you do it? 
   First, you have to create a new object of the same class. Then you have to go through all the fields of the original object and copy their values over to the new object.
2. Not all objects can be copied that way because some of the object's fields may be private and not visible from outside the object itself.
## Solution
The Prototype pattern delegates the cloning process to the actual objects that are being cloned. The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object. Usually, such an interface contains just a single clone method.

The implementation of the clone method is very similar in all classes. The method creates an object of the current class and carries over all the field values of the old object into the new one. You can even copy private fields because most programming languages let objects access private fields of other objects that belong to the same class.

An object that supports cloning is called a prototype. When your objects have dozens of fields and hundreds of possible configurations, cloning them might serve as an alternative to subclassing.
## Pros and Cons
### Pros of Prototype Pattern:
1. **Dynamic Object Creation**: Allows dynamic creation of objects by specifying the kind of object to create using prototypical instance, allowing objects to be cloned rather than created from scratch.
2. **Reduced Subclassing**: Helps in reducing the need to subclass the object creator, as new objects are created by copying an existing object.
3. **Flexibility**: Provides flexibility in creating new objects by cloning existing instances, allowing changes to individual objects without affecting the prototype.
4. **Reduced Overhead**: Can be more efficient than creating new instances from scratch, especially when the cost of creating a new instance is high.
5. **Customization**: Allows customization of complex objects without having to directly modify their class.

### Cons of Prototype Pattern:
1. **Complexity**: Can lead to complex code if the prototype objects themselves are complex and require deep cloning.
2. **Cloning Limitations**: Not all objects can be cloned easily, especially if they contain circular references or non-serializable objects.
3. **Confusion with Shallow Copies**: If not implemented carefully, the prototype pattern may result in shallow copies that can lead to unexpected behavior when modifying cloned objects.
4. **Design Complexity**: Introducing the prototype pattern may increase the design complexity of the system, especially when dealing with complex object graphs.
5. **Testing Complexity**: Testing cloned objects may be challenging, especially when dealing with complex prototypes.

When using the Prototype pattern, it's important to weigh its benefits against the potential drawbacks and carefully consider its application within the context of the specific system or application. While it provides advantages in terms of flexibility and object creation, its limitations should be considered