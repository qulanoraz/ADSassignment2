# Custom Data Structures in Java

## 📌 Project Description
This Java project implements core data structures **from scratch**, without using Java's built-in `java.util` collections (except `Iterator`). The project includes:

- Custom implementations of:
  - `MyArrayList<T>` — a dynamic array (similar to `ArrayList`)
  - `MyLinkedList<T>` — a doubly linked list
  - `MyStack<T>` — stack based on `MyArrayList`
  - `MyQueue<T>` — queue based on `MyLinkedList`
  - `MyMinHeap<T>` — min-heap based on `MyArrayList`

---

## ⚙️ Technologies Used
- Java
- No external libraries
- IDE: IntelliJ IDEA
- Version Control: Git & GitHub

---

## ▶️ How to Run
1. Clone the repository:
   ```bash

   git clone https://github.com/your-username/data-structures-java.git

2. Open the project in IntelliJ IDEA.

3. Navigate to Main.java.

4. Run the project to see example outputs from MyStack, MyQueue, and MyMinHeap.

---

## 📦 Project Structure:
├── MyList.java           # Interface for custom list structures
├── MyArrayList.java      # Dynamic array implementation
├── MyLinkedList.java     # Doubly linked list
├── MyNode.java           # Helper class for MyLinkedList
├── MyStack.java          # Stack based on MyArrayList
├── MyQueue.java          # Queue based on MyLinkedList
├── MyMinHeap.java        # Min-Heap based on MyArrayList
└── Main.java             # Demo of all structures

---

## 📚 Class Overview
✅ MyArrayList<T>
Dynamically resizable array

Methods: add, get, remove, clear, size, set, getRawArray

✅ MyLinkedList<T>
Doubly linked list with head and tail

Methods: add, get, remove, clear, size

✅ MyStack<T>
Logical stack (LIFO)

Internally uses MyArrayList<T>

Methods: push, pop, peek, isEmpty

✅ MyQueue<T>
Logical queue (FIFO)

Internally uses MyLinkedList<T>

Methods: enqueue, dequeue, peek, isEmpty

✅ MyMinHeap<T>
Binary min-heap

Internally uses MyArrayList<T> and raw array via getRawArray

Methods: add, poll, peek, isEmpty, size

---

## 🧪 Testing
Tested in Main.java using manual examples. You can write more test cases by adding to the main method and observing behavior through console output.

---

## ✅ Commit & Versioning Strategy
- Minimum 5 meaningful commits across development

- Each commit reflects a completed and tested logical unit:

- Added MyArrayList with core methods

- Implemented MyLinkedList with doubly linked support

- Finished MyStack and basic tests

- etc.
