# Introduction to Programming - Exercise 3

This repository contains the solutions for the 3rd assignment of the **Introduction to Programming** module at the **University of Duisburg-Essen** (Prof. Dr. Pedro José Marrón).

## 🎯 Learning Objectives
Practical application of primitive data types, operators, and control structures (especially simple conditional statements) in Java.

## 📂 Project Structure & Tasks

### [Task 1 & 2: Logic and Debugging](docs/Task%201%20&%202.pdf)
* **Task 1:** Formulation of Java comparison operations (e.g., checking car brands, inspection/TÜV seals, prices, and manufacturing years).
* **Task 2:** Code correction of faulty syntax expressions (e.g., incorrect assignments using `=` instead of `==` or data type errors for `String` and `boolean`).

### [Task 3: The `Auto` Class](src/Auto.java)
Extension of a provided base class:
* Implementation of passenger tracking through the `einsteigen()` (get in) and `aussteigen()` (get out) methods, considering a maximum capacity limit.
* Tracking and printing the total number of passengers transported over time.
* Utilizing a `switch` statement to detect specific colors (like "Bordeaux" or "Kobalt") and outputting the corresponding messages.

### [Task 4: The `Programm` Class]
Implementation of various data processing methods:
* **String Manipulation:** Concatenating strings, performing lexicographical comparisons (`compareTo`), extracting single characters at specific index positions, and replacing substrings within delimiter boundaries (`substring`, `indexOf`, `replace`).
* **Mathematical Operations:** Addition, subtraction, multiplication, and calculating the sum of digits (cross sum / *Quersumme*) of a number using the modulo operator (`%`).
* **Interest Calculation (`millionaer`):** Calculating the required number of years for an initial investment to reach one million, implemented using a `while` loop.
