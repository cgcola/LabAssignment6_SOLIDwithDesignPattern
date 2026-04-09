# Lab Assignment 6: SOLID with Design Pattern

## Problem Statement

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. Currently, the `Student` object has methods like `borrowBook()` and `borrowJournal()` with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

## Solution & Architecture

The original design suffered from tight coupling, making it difficult to maintain and expand. The code was refactored by introducing an abstraction layer:

1. **Abstraction (`LibraryResource` Interface):** Defines a standard contract (`getTitle()` and `borrowItem()`) for any item that can be borrowed from the library.
2. **Concrete Implementations (`Book`, `Journal`, `AudioBook`):** These low-level modules implement the interface, handling their specific borrowing/accessing logic. 
3. **Decoupled High-Level Module (`Student`):** The student class was refactored to use a single `borrowResource(LibraryResource resource)` method. It now interacts exclusively with the abstraction.

## SOLID Principles Applied

This refactoring strictly adheres to the following principles:

**Dependency Inversion Principle (DIP):** The refactored code ensures that high-level modules do not depend on low-level modules, but both depend on abstractions. The `Student` class now depends on the `LibraryResource` interface instead of concrete classes like `Book` or `Journal`.

**Open/Closed Principle (OCP):** The software entities are now open for extension but closed for modification. We successfully demonstrated this by adding an `AudioBook` resource class without needing to modify the `Student` class's source code.

## UML Diagram:
