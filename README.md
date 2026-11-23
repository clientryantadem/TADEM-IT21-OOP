Java OOP Assignment: Polymorphism and Abstraction

What Each Program Does

`PolymorphismDemo.java` models a city emergency dispatch desk. Every vehicle is treated as a `ResponseUnit`, and the desk tells each one to respond to the same incident. The ambulance and the fire engine each respond in their own way.

`AbstractionDemo.java` models order tickets at a neighborhood bakery. `BakeryOrder` is an abstract class. Every ticket prints the same header, and each product (a sourdough loaf or a custom cake) provides its own preparation steps.

To compile and run:

```text
javac PolymorphismDemo.java
java PolymorphismDemo

javac AbstractionDemo.java
java AbstractionDemo
```

How Polymorphism Works in My Code

- Parent class:`ResponseUnit`
- Child classes: `AmbulanceUnit` and `FireEngineUnit` (both use `extends ResponseUnit`)
- Overridden method: `respond(String incident)`, marked with `@Override` in each child

In `main()`, the variables are declared as `ResponseUnit`, but the objects are created as `new AmbulanceUnit(...)` and `new FireEngineUnit(...)` (upcasting). Both are passed to `dispatch()`, which only knows the parent type and calls `unit.respond(incident)`.

At runtime, Java checks which object is really there and runs that class's version of `respond()`. The ambulance runs the paramedic procedure and the fire engine runs the hose-and-ladder procedure. One method call produces two different behaviors, which is runtime polymorphism (dynamic method dispatch).

 How Abstraction Works in My Code

- Abstract class: `BakeryOrder`
- Abstract method:`describePreparation()`
- Implementations:`SourdoughLoafOrder` describes the ferment and bake. `CustomCakeOrder` describes the layers, the raspberry filling, and the inscription.
- Concrete method: `printTicketHeader()` is fully written in `BakeryOrder` and inherited by both children.

`describePreparation()` has no body in the parent because a generic bakery order has no single recipe. Each child has to implement it before it can be used. `BakeryOrder` itself can't be instantiated, so `main()` only creates the two child objects and calls both methods on each.

 Polymorphism vs. Abstraction

Polymorphism is about one call reaching different behavior. `dispatch()` always calls `unit.respond(...)`, and the program picks the matching overridden method at runtime based on the real object.

Abstraction is about leaving a required step unfinished on purpose. `BakeryOrder` shares the finished parts, like the header, and forces every subclass to complete the missing part, `describePreparation()`.

In short, polymorphism lets existing code work with different types through a shared method, while abstraction decides which methods a class must leave for its subclasses to fill in.

 Questions

1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Overriding is what makes the shared call useful. The child keeps the method name and parameters the parent promised, then replaces the steps with its own. Code like `dispatch()` stays written against `ResponseUnit`, and the specific work lives in the class that knows its own equipment.

If `AmbulanceUnit` and `FireEngineUnit` didn't override `respond()`, the program would still compile and run, but `dispatch()` would print the parent's generic sentence twice. It would use inheritance without showing different behavior.

 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

`BakeryOrder` has a method, `describePreparation()`, with no code in it. If `new BakeryOrder(...)` were allowed, calling that method would have nothing to run. The compiler blocks it so an unfinished object can't exist.

The restriction keeps the abstract class as a plan instead of a usable order. It can hold fields, a constructor, and finished methods like `printTicketHeader()`, and it forces subclasses to complete the missing method. Only `SourdoughLoafOrder` and `CustomCakeOrder`, which have real recipes, become objects.

 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

It would handle it without changes, because `dispatch()` is written against the parent. A new class like `RescueBoatUnit` only needs to extend `ResponseUnit` and override `respond()`. Then `main()` adds one more upcast:

```java
ResponseUnit thirdOnScene = new RescueBoatUnit("RB-2");
dispatch(thirdOnScene, incident);
```

`dispatch()` still receives a `ResponseUnit` and calls `respond()`. The ambulance and fire engine classes keep working because nothing in them assumed they were the only children.

 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes. An abstract parent can be the shared type polymorphism needs, and its abstract method can be the one each child overrides.

If `ResponseUnit` were abstract, it could keep a concrete `logDispatch()` for every vehicle and leave `respond()` abstract, since a generic unit has no single procedure. Abstraction forces each new unit to write a procedure, and polymorphism lets the desk call it without knowing which class it got.

```java
abstract class ResponseUnit {
    public void logDispatch(String incident) {
        System.out.println("Logged: " + incident);
    }

    public abstract void respond(String incident);
}

class AmbulanceUnit extends ResponseUnit {
    @Override
    public void respond(String incident) {
        System.out.println("Ambulance stabilizing patients at " + incident);
    }
}

// ResponseUnit unit = new AmbulanceUnit();
// unit.logDispatch(incident);  // concrete method inherited from the abstract parent
// unit.respond(incident);      // overridden body chosen at runtime
```

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

I'd use polymorphism when calling code should keep working as new variants appear, like a payment checkout calling `charge()` on any payment type. A long chain of `if` statements checking an object's type is a sign the behavior belongs in an overridden method.

I'd use abstraction when designing a shared skeleton where some step must exist but has no single correct body yet, especially when the children also share fields or finished methods. I'd use abstraction while planning the design, then rely on polymorphism so the rest of the program can use the children through the parent type.
