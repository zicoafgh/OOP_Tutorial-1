
public class Student extends Person {  

    public Student(String name, String id) {
        super(name, id);
    }

    public void introduce() {
        System.out.println("I am a student. Name: " + getName() + ", ID: " + getId());
    }
}