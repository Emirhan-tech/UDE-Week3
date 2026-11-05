# Introduction to Programming - Exercise 3

This repository contains the solutions for the 3rd assignment of the **Introduction to Programming** module at the **University of Duisburg-Essen** (Prof. Dr. Pedro José Marrón)[cite: 1].

## 🎯 Learning Objectives
Practical application of primitive data types, operators, and control structures (especially simple conditional statements) in Java[cite: 1].

## 📂 Project Structure & Tasks

### [Task 1 & 2: Logic and Debugging](docs/Task%201%20&%202.pdf)
* **Task 1:** Formulation of Java comparison operations (e.g., checking car brands, inspection/TÜV seals, prices, and manufacturing years)[cite: 1, 5].
* **Task 2:** Code correction of faulty syntax expressions (e.g., incorrect assignments using `=` instead of `==` or data type errors for `String` and `boolean`)[cite: 2, 5].

### [Task 3: The `Auto` Class](src/Auto.java)
Extension of a provided base class[cite: 1, 3]:
* Implementation of passenger tracking through the `einsteigen()` (get in) and `aussteigen()` (get out) methods, considering a maximum capacity limit[cite: 3, 6].
* Tracking and printing the total number of passengers transported over time[cite: 3, 6].
* Utilizing a `switch` statement to detect specific colors (like "Bordeaux" or "Kobalt") and outputting the corresponding messages[cite: 3, 6].

### [Task 4: The `Programm` Class](src/Programm.java)
Implementation of various data processing methods[cite: 1, 4]:
* **String Manipulation:** Concatenating strings, performing lexicographical comparisons (`compareTo`), extracting single characters at specific index positions, and replacing substrings within delimiter boundaries (`substring`, `indexOf`, `replace`)[cite: 4, 7].
* **Mathematical Operations:** Addition, subtraction, multiplication, and calculating the sum of digits (cross sum / *Quersumme*) of a number using the modulo operator (`%`)[cite: 4, 7].
* **Interest Calculation (`millionaer`):** Calculating the required number of years for an initial investment to reach one million, implemented using a `while` loop[cite: 4, 7].
