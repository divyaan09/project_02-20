# 🔐 SimpleIntegrityChecker

A beginner-friendly Java program to check the integrity of a file by comparing its current SHA-256 hash value with a known good (original) hash.

---

## 📌 What It Does

This program:
- Calculates the SHA-256 hash of a given file.
- Compares it with the original hash value.
- Tells you whether the file is **unchanged** or **modified**.

---

## 💻 How to Use

### 1. 📝 Save the Code
Save the code in a file named `SimpleIntegrityChecker.java`.

### 2. 📂 Prepare the File
Create or place a file named `test.txt` (or any file you want to check) in the same directory.

### 3. 🔧 Compile the Code
Open your terminal and run:

```bash
javac SimpleIntegrityChecker.java
```

### 4. ▶️ Run the Program
```bash
java SimpleIntegrityChecker
```

### 5. 🔍 Get and Use Original Hash
- On the first run, the program will print the file's current hash.
- Copy that hash and paste it in the code here:

```java
String originalHash = "your_known_good_hash_here";
```

- Recompile and run again to check for file changes in the future.

---

## 📎 Example Output

```bash
Current File Hash: a3b1f3c4e2d...
✅ File is not changed. Integrity is OK.
```

or

```bash
Current File Hash: b4e9a6d1c5f...
⚠️ File has been modified! Integrity check failed.
```

---

## 🧰 Requirements

- Java JDK installed
- Basic understanding of command line
- A text file to check (e.g., `test.txt`)

---

## 📂 File Structure

```
/SimpleIntegrityChecker
│
├── SimpleIntegrityChecker.java   # Java source code
├── test.txt                      # File to verify
└── README.md                     # This file
```

---

## 📥 Optional Improvement Ideas

- Store the original hash in a file (e.g., `hash.txt`)
- Check multiple files
- GUI version using Swing or JavaFX

---

## 🙋‍♂️ Author

Created by **Divyanshu** – A simple tool for learning file integrity in Java.
# project_02-30
