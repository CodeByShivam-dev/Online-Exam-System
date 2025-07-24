# 🧾 Online Exam Submission System

A professionally structured Java application that simulates an online exam submission system using multithreading. Each student submits their paper via a dedicated thread, and the server records all submissions safely and efficiently.

This project was crafted as part of my deep dive into **Java multithreading** — not just to learn syntax, but to apply concepts like `Thread`, `join()`, and `synchronization` in a real-world-inspired scenario.

---

## 🔍 Why This Project?

Multithreading is a core concept in Java, widely used in backend systems, games, real-time applications, and high-performance servers. Instead of learning it theoretically, I chose to build a practical example that reflects how multiple clients (students) interact with a shared resource (the server).

---

## 🧠 Key Features

- 📦 Multiple student submissions handled via threads
- 🔒 Safe shared resource access (exam server)
- 📊 Print final submission records after all threads complete
- 🧵 Uses `Thread`, `List<Thread>`, and `join()` to manage concurrency

---

## 🚀 How to Run

1. Clone this repo or download the ZIP
2. Open in **IntelliJ IDEA**
3. Navigate to `Main.java`
4. Click `Run`

---

## ⚙️ Technologies Used

- Java 17+
- Multithreading (Core Java)
- IntelliJ IDEA (recommended IDE)

---

## 📁 Project Structure

Online Exam Submission System/
├── src/
│   ├── Main.java             # Entry point of the application
│   ├── ServerDemo.java       # Server logic to handle student submissions
│   └── StudentThread.java    # Represents each student submitting the exam
├── .gitignore                # Git ignored files
└── README.md                 # Project overview and documentation



## 📌 Learning Outcome

This project helped me:
- Understand how threads work under the hood
- Practice thread-safe operations
- Gain confidence in debugging concurrent logic
- Organize code professionally for public sharing

## 🙋 About Me

**Shivam Kumar**  
Learning Java in public | Exploring backend systems  
🔗 [LinkedIn] www.linkedin.com/in/shivam-kumar-1147a934b
