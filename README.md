[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RdwQD1tm)
# Java Programming Assignment 5

## Overview
This assignment is designed to test your knowledge of Java concepts, including:
- **Autoboxing and Unboxing**
- **Serialization & Deserialization**
- **File Handling**
- **Efficient Data Processing & Management**

You will work on three levels of difficulty: **Easy, Medium, and Hard.** Complete each level step-by-step to strengthen your Java skills.

---

## 📌 Easy Level: Sum of Integers using Autoboxing & Unboxing
### 🎯 Task
Write a Java program to calculate the sum of a list of integers using **Autoboxing and Unboxing**. Implement methods to parse strings into their respective wrapper classes using `Integer.parseInt()`.

### 🔹 Steps to Follow
1. Create an **ArrayList** of integers.
2. Read a list of numbers from the user as a string.
3. Convert the input into Integer objects using **autoboxing**.
4. Compute the sum of the integers using **unboxing**.
5. Display the result.

### 📄 Sample Output
```
Enter numbers separated by spaces: 10 20 30 40 50
Sum of numbers: 150
```

---

## 📌 Medium Level: Student Object Serialization & Deserialization
### 🎯 Task
Create a **Student** class and implement serialization & deserialization.

### 🔹 Steps to Follow
1. Define a **Student** class with **id, name, and GPA**.
2. Implement **Serializable** interface.
3. Create methods to:
   - Serialize a Student object and save it to a file.
   - Deserialize the Student object from the file and display its details.
4. Handle **FileNotFoundException, IOException, and ClassNotFoundException** properly.

### 📄 Sample Output
```
Student details saved successfully!

Reading from file...
Student ID: 101
Student Name: John Doe
Student GPA: 3.8
```

---

## 📌 Hard Level: Employee Management System
### 🎯 Task
Develop a **menu-based application** with the following options:
1️⃣ **Add an Employee**
2️⃣ **Display All Employees**
3️⃣ **Exit**

### 🔹 Steps to Follow
1. Create an **Employee** class with:
   - Employee ID
   - Name
   - Designation
   - Salary
2. Implement file handling to **store employee details** persistently.
3. Provide an interactive **menu-based** system for user input.
4. Ensure proper **exception handling**.

### 📄 Sample Output
```
Menu:
1. Add an Employee
2. Display All Employees
3. Exit

Choose an option: 1
Enter Employee ID: 1001
Enter Employee Name: Alice
Enter Designation: Software Engineer
Enter Salary: 60000
Employee added successfully!

Menu:
1. Add an Employee
2. Display All Employees
3. Exit

Choose an option: 2
Employee ID: 1001, Name: Alice, Designation: Software Engineer, Salary: 60000
```

---

## 🎯 Expected Outcomes
By completing this assignment, you will:
✅ Gain hands-on experience with **Autoboxing and Unboxing**.
✅ Understand **Serialization & Deserialization** in Java.
✅ Develop **File Handling** techniques.
✅ Enhance your **exception handling** skills.
✅ Build a **real-world menu-based application**.

---

## 📌 Submission Guidelines
📂 **Submit a ZIP file** containing:
1️⃣ **Source Code Files (.java)**
2️⃣ **Serialized Student Object File**
3️⃣ **Employee Data File**


Good Luck & Happy Coding! 🚀

