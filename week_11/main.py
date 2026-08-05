from student import get_student
from access import check_access, get_reason
from display import print_result


def main():
    # Get student information and conditions
    name, student_id, is_registered, is_lab_open, is_computer_available = get_student()

    # Check access status
    status = check_access(is_registered, is_lab_open, is_computer_available)

    # Get the reason for the result
    reason = get_reason(is_registered, is_lab_open, is_computer_available)

    # Display the final result
    print_result(name, student_id, status, reason)


if __name__ == "__main__":
    main()
