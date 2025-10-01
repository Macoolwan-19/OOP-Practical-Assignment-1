# 🧠 Object-Oriented Programming 1 – Practical Assignment 1 (Java)

## 📘 Overview
This repository contains solutions for **OOP1 Practical Assignment 1** in Java.  
It demonstrates **abstraction, inheritance, file handling, Java Streams, and custom exception handling**.  

**Authors**:  
- *Tinashe Tigere*  
- *Kevin Mutenga*  

**Total Marks:** 50  

---

## 📝 Assignment Questions

### 🔹 Question 1: Banking System [25 Marks]
Write a java program to solve the banking problem. Create an abstract class Bank that declares account
name and balance as state, abstract methods deposit, withdraw and getBalance as behavior. Create a
class Account that extends the abstract Bank.

i. withdraw(), withdraws money from an Account. Ensure that the withdrawal method does not
exceed the Account’s balance. If it does, the balance should be left unchanged and the method
should print a message indicating **“Withdrawal amount exceeded account balance”**.  
ii. deposit() adds only valid (amount greater than 0) amount to the balance.  
iii. getBalance() returns the current balance.  
iv. All bank transactions should be recorded in a file named **Bank.txt** located in the root directory.  

Create another class AccountTest to test the withdraw, deposit and getBalance methods.  

---

### 🔹 Question 2: Streams & Exceptions [25 Marks]

a. Write a java program using a stream to filter the numbers that are divisible by 5 from the
following ArrayList and print them out. [10 Marks]  
`(1, 4, 5, 20, 30, 6)`  

b. Write a java program creating your own custom exception. Throw and catch the exception
displaying a proper message to the user. [15 Marks]  

---

## 📂 Project Structure
📦 OOP-Practical-Assignment-1
┣  Account.java # Implements Bank methods
┣  App.java # Extra driver/utility class
┣  Bank.java # Abstract Bank class
┣  DivisibleByFive.java # Stream filtering example
┣  Exception handling.java # Custom exception handling
┣  test_account.java # Tests deposit, withdraw & balance
┗  Bank.txt # Transaction logs (generated at runtime)

---

## 🚀 How to Run

1. **Compile all files**  
   ```bash
   javac *.java
Run the programs

Banking system:

java test_account


Stream filtering:

java DivisibleByFive


Custom exception:

java "Exception handling"


