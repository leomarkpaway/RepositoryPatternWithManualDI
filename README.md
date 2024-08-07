﻿# Repository Pattern With Manual DI
## Description
The Repository Pattern with Manual Dependency Injection (DI) refers to a software design pattern used in object-oriented programming. Here's a breakdown of what it involves:

1. Repository Pattern:

    Purpose: The primary goal of the Repository Pattern is to create an abstraction layer between the data access code and the business logic in an application.
    Key Concepts:
    Repositories: These are classes or components that encapsulate the logic required to access data sources (like local databases, api services, etc.).
    Entities: Represent domain objects (e.g., User, Product) that the repository operates upon.
    Separation of Concerns: By using repositories, you separate the logic that retrieves the data from the business logic that requires the data, promoting a cleaner architecture.

2. Manual Dependency Injection (DI):

   Definition: Dependency Injection is a technique where one object supplies the dependencies of another object rather than the object creating them itself.
   Manual DI: Refers to the practice of injecting dependencies into objects manually, without relying on a framework or automated tools to manage dependencies.
   Advantages:
   Control: Provides explicit control over how dependencies are wired together.
   Simplicity: May be simpler for smaller applications or scenarios where a full-fledged DI framework is unnecessary or overkill.

Repository pattern reference: https://medium.com/@dugguRK/the-real-repository-pattern-in-android-refers-to-an-architectural-approach-that-abstracts-the-fd4f4cc573c3
