
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ayoub", "I556");  
        Person p2 = new Student("Jack", "S556");
        Person p3 = new Lecturer("Imane", "A556");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}