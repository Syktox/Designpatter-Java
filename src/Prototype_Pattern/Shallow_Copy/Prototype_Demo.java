package Prototype_Pattern.Shallow_Copy;

public class Prototype_Demo {
    public static void main(String[] args) {
        Person p = new Person("Markus", 20, "I can offer help");
        Person f = (Person) p.clone();
        p.dispalyPerson();
        f.dispalyPerson();
        f.setName("Felix");
        f.setAge(20);
        f.setMessage("I need help fixing a bug");
        f.dispalyPerson();
    }
}
