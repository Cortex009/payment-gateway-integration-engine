# Payment Gateway Integration Engine

A scalable backend module demonstrating the **Adapter Design Pattern** in Java. This project simulates a digital payment application (like PhonePe) integrating with disparate third-party banking and payment gateway APIs.

## Architecture Highlights
By utilizing the Adapter pattern, this module completely decouples the core application logic from external vendor implementations.

* **`BankAPI` (Target):** The unified interface the core application relies on.
* **`YesBank` & `RazorPay` (Adaptees):** Mock third-party libraries with incompatible method signatures.
* **`YesBankAdapter` & `RazorPayAdapter` (Adapters):** Bridge classes that translate standard `BankAPI` calls into vendor-specific executions.

This architecture ensures that swapping or adding new payment vendors requires zero modifications to the core application code, strictly adhering to the Open/Closed Principle.

## Tech Stack
* **Language:** Java 24
* **Build Tool:** Maven
* **Concepts:** Object-Oriented Programming (OOP), Adapter Design Pattern, Dependency Injection

## How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Compile and execute `Client.java` to view the simulated transaction routing through both Yes Bank and RazorPay configurations.