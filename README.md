## Behavioural design pattern
## Use Case 1:Observer Pattern Demo

## Description
This project demonstrates the Observer design pattern. It simulates a weather monitoring system where multiple display devices (like temperature and humidity displays) get updated whenever the weather data changes.

## Classes
- `WeatherStation` (Subject Interface)
- `WeatherData` (Concrete Subject)
- `WeatherObserver` (Observer Interface)
- `TemperatureDisplay` (Concrete Observer)
- `HumidityDisplay` (Concrete Observer)
- `ObserverPatternDemo` (Test class)

## How to Run
1. Compile the code:
    ```sh
    javac ObserverPatternDemo.java
    ```
2. Run the code:
    ```sh
    java ObserverPatternDemo
    ```
    
## Use Case 2:Strategy Pattern Demo

## Description
This project demonstrates the Strategy design pattern. It simulates a payment system that supports multiple payment methods like Credit Card and PayPal.

## Classes
- `PaymentStrategy` (Strategy Interface)
- `CreditCardPayment` (Concrete Strategy 1)
- `PayPalPayment` (Concrete Strategy 2)
- `PaymentContext` (Context)
- `StrategyPatternDemo` (Test class)

## How to Run
1. Compile the code:
    ```sh
    javac StrategyPatternDemo.java
    ```
2. Run the code:
    ```sh
    java StrategyPatternDemo
    ```

## Creational design pattern
## Use Case 1:Singleton Pattern Demo

## Description
This project demonstrates the Singleton design pattern. It simulates a logging service where only one instance should exist throughout the application.

## UML Diagram


## Class
- `Logger` (Singleton)

## How to Run
1. Compile the code:
    ```sh
    javac SingletonPatternDemo.java
    ```
2. Run the code:
    ```sh
    java SingletonPatternDemo
    ```

## Use Case 2:Factory Method Pattern Demo

## Description
This project demonstrates the Factory Method design pattern. It simulates a system that creates different types of documents (e.g., Word and PDF documents).

## Classes
- `Document` (Product Interface)
- `WordDocument` (Concrete Product 1)
- `PdfDocument` (Concrete Product 2)
- `DocumentCreator` (Creator)
- `WordDocumentCreator` (Concrete Creator 1)
- `PdfDocumentCreator` (Concrete Creator 2)
- `FactoryMethodPatternDemo` (Test class)

## How to Run
1. Compile the code:
    ```sh
    javac FactoryMethodPatternDemo.java
    ```
2. Run the code:
    ```sh
    java FactoryMethodPatternDemo
    ```

    
## Structural design pattern
## Use Case 1:Adapter Pattern Demo

## Description
This project demonstrates the Adapter design pattern. It simulates an application that needs to integrate with an external legacy system that has a different interface.

## Classes
- `Target` (Target Interface)
- `Adaptee` (Adaptee)
- `Adapter` (Adapter)
- `AdapterPatternDemo` (Test class)

## How to Run
1. Compile the code:
    ```sh
    javac AdapterPatternDemo.java
    ```
2. Run the code:
    ```sh
    java AdapterPatternDemo
    ```


## Use Case 2: Decorator Pattern Demo

## Description
This project demonstrates the Decorator design pattern. It simulates a notification system where notifications can have additional features like priority or encryption.

## Classes
- `Notification` (Component Interface)
- `BasicNotification` (Concrete Component)
- `NotificationDecorator` (Decorator)
- `PriorityNotificationDecorator` (Concrete Decorator 1)
- `EncryptedNotificationDecorator` (Concrete Decorator 2)
- `DecoratorPatternDemo` (Test class)

## How to Run
1. Compile the code:
    ```sh
    javac DecoratorPatternDemo.java
    ```
2. Run the code:
    ```sh
    java DecoratorPatternDemo
    ```

