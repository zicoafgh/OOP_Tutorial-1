def check_access(is_registered, is_lab_open, is_computer_available):
    # Use conditional statements and logical AND operator
    if is_registered and is_lab_open and is_computer_available:
        return "Access Granted"
    else:
        return "Access Denied"


def get_reason(is_registered, is_lab_open, is_computer_available):
    # Return the specific reason for access denial
    if not is_registered:
        return "Student is not registered"
    elif not is_lab_open:
        return "Computer lab is closed"
    elif not is_computer_available:
        return "No available computer"
    else:
        return "Welcome to the lab"
