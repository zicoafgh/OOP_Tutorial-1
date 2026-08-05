# Week 11 - Computer Lab Access System

## Description
A modular Python application that automates student entry into computer laboratories at City University.

## Modules

| File | Description |
|------|-------------|
| `main.py` | Entry point that integrates all modules |
| `student.py` | Handles user input for student details and lab conditions |
| `access.py` | Contains logic to determine access status and reason |
| `display.py` | Formats and prints the final access result |

## How to Run
```bash
python main.py
```

## Access Rules
A student is granted access only if ALL of the following conditions are met:
1. The student is registered for today's lab session
2. The computer laboratory is currently open
3. There are computers available

## Expected Output
```
===== Computer Lab Access =====
Student Name : izzad
Student ID : 202505
Registered for today's lab? (Y/N): Y
Is the lab open? (Y/N): Y
Computer Available? (Y/N): Y

========== ACCESS RESULT ==========
Student Name : izzad
Student ID   : 202505
-----------------------------------
Status : Access Granted
Reason : Welcome to the lab
===================================
```
