# 🧠 Object Oriented Programming 1 – Practical Assignment 1 (Java)

## 📘 Overview
This repository contains solutions for the **OOP1 Practical Assignment 1** in Java. It demonstrates core object-oriented principles such as abstraction, inheritance, file handling, stream operations, and custom exception handling.

---

## 🧾 Assignment Breakdown

### 🔹 Question 1: Banking System [25 Marks]
Create a banking system using an abstract class and inheritance.

#### ✅ Files:
- `Bank.java`: Abstract class with `accountName`, `balance`, and abstract methods `deposit()`, `withdraw()`, and `getBalance()`.
- `Account.java`: Implements `Bank`. Handles deposits, withdrawals (with balance checks), and balance retrieval.
- `test_account.java`: Tests all banking operations.
- `Bank.txt`: Stores transaction logs in the root directory.

#### 💡 Features:
- Prevents overdraft withdrawals.
- Accepts only positive deposit amounts.
- Logs all transactions to `Bank.txt`.

---

### 🔹 Question 2: Streams & Exceptions [25 Marks]

#### a. Stream Filtering [10 Marks]
- `DivisibleByFive.java`: Filters and prints numbers divisible by 5 from a list using Java Streams.

#### b. Custom Exception [15 Marks]
- `ExceptionHandling.java`: Defines and handles a user-defined exception with a meaningful message.
  
---

## 🚀 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Macoolphan-19/OOP-Practical-Assignment-1.git
   ## Authors
Tinashe Brendon Tigere and Kevin Mutenga
