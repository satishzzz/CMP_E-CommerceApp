## 🏗️ Architecture

This project follows **Clean Architecture** with the **MVVM (Model-View-ViewModel)** pattern to build a scalable, maintainable, and platform-independent application (Android & iOS) using **Compose Multiplatform**.

The architecture separates the application into three distinct layers, ensuring a clear separation of responsibilities and making the codebase easier to test, extend, and maintain.

### 📱 UI Layer

The UI layer is built with **Compose Multiplatform** and is responsible for rendering the user interface and handling user interactions.

Responsibilities:
- Displays application data
- Collects user input
- Observes UI state from the ViewModel
- Sends user events to the ViewModel
- Contains composable screens and reusable UI components

### ⚙️ Domain Layer

The domain layer contains the core business logic of the application and remains completely independent of any platform or framework.

Responsibilities:
- Business use cases
- Repository interfaces
- Domain models
- Business rules

This layer has no dependency on the UI or Data layers, making it highly reusable and easy to test.

### 🌐 Data Layer

The data layer is responsible for fetching, processing, and providing data to the domain layer.

Responsibilities:
- Repository implementations
- Remote API communication using **Ktor**
- DTOs (Data Transfer Objects)
- Mapping DTOs to domain models
- Error handling and data transformation

---

## 🔄 Application Flow

```text
Compose UI
     │
     ▼
ViewModel
     │
     ▼
Use Case
     │
     ▼
Repository Interface
     │
     ▼
Repository Implementation
     │
     ▼
Ktor API Client
     │
     ▼
Remote API
     │
     ▼
DTO → Domain Mapper
     │
     ▼
Domain Model
     │
     ▼
ViewModel updates UI State
     │
     ▼
Compose UI recomposes
```

---

## 📂 Project Structure

```text
shared/
├── data/
│   ├── remote/
│   ├── repository/
│   ├── dto/
│   └── mapper/
│
├── domain/
│   ├── model/
│   ├── repository/
│   └── usecase/
│
└── presentation/
    ├── screen/
    ├── components/
    ├── state/
    └── viewmodel/
```

---

## ✨ Why Clean Architecture?

- Clear separation of concerns
- Platform-independent business logic
- Easier testing and debugging
- Scalable project structure
- Reusable domain layer
- Easier maintenance
- Improved code readability
- Flexible data source replacement

---

## 🛠️ Tech Stack

- Kotlin
- Compose Multiplatform
- MVVM Architecture
- Clean Architecture
- Ktor Client
- Kotlin Coroutines
- StateFlow
- Kotlinx Serialization
- Navigation (Compose Navigation3)
- Dependency Injection (KOIN)