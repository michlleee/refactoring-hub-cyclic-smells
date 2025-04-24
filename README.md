# Refactoring Hub-like and Cyclic Dependency Code Smells in Java

This repository demonstrates common **object-oriented code smells**—specifically **Hub-like dependencies** and **Cyclic dependencies**—in Java, along with refactored solutions following clean code and design principles.

## 📁 Structure
```
├── Cyclic/
│   └── src/
│       ├── problems/       # Code with cyclic dependencies
│       └── solutions/      # Refactored code with decoupled structure
├── Hub-like/
│   └── src/
│       ├── problems/       # Code showing hub-like dependency issues
│       └── solutions/      # Refactored code with better modularity
```
---

## 🔍 Code Smells Overview

### Cyclically-Deficient Modularization
When classes depend on each other in a circular way, making the code harder to test and maintain.

### Hub-like Dependencies
When one class is connected to many others, becoming a central point that can easily break the system if changed.

---

### 🛠️ Refactoring Techniques Used

- **Extract Method**: Break down long or repetitive code blocks into smaller, reusable methods
- **Extract Class**: Split large classes with too many responsibilities into smaller, focused ones
- **Extract Interface**: Not implemented but can be used as a solution for Hub-like dependency
- **Dependency Inversion**: Depend on abstractions (interfaces), not concrete implementations
- **Encapsulation**: Hide internal details and expose only what's necessary

These techniques are applied in the refactored versions of both Cyclic and Hub-like dependency problems.

---

## Tech Stack

- **Language:** Java (JDK 17 or newer)
- **Tools:** Any IDE (like IntelliJ IDEA or Eclipse), or command-line

---

## How to Run

You can run the code using an IDE or from the terminal.

### Terminal Example

```bash
# Go to the refactored solution folder
cd HubLike/src/solutions

# Compile the Java files
javac *.java

# Run the main class
java Main  # Replace 'Main' with the actual main class name if needed
