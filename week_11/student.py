def get_student():
    print("===== Computer Lab Access =====")

    # Prompt users for input
    name = input("Student Name : ")
    student_id = input("Student ID : ")
    registered = input("Registered for today's lab? (Y/N): ")
    lab_open = input("Is the lab open? (Y/N): ")
    computer_available = input("Computer Available? (Y/N): ")

    # Convert Y/N responses to boolean values
    is_registered = registered.strip().upper() == 'Y'
    is_lab_open = lab_open.strip().upper() == 'Y'
    is_computer_available = computer_available.strip().upper() == 'Y'

    return name, student_id, is_registered, is_lab_open, is_computer_available
