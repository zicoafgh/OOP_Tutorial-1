
public class Lecturer extends Person {

    public Lecturer(String name, String id) {
        super(name, id);
    }

    public void introduce() {
        System.out.println("I am a lecturer. Name: " + getName() + ", ID: " + getId());
    }
}