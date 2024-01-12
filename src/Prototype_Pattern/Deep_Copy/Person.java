package Prototype_Pattern.Deep_Copy;

public class Person implements Cloneable {
    private String name;
    private int age;
    private String message;

    public Person(String name, int age, String note) {
        this.name = name;
        this.age = age;
        this.message = note;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    void dispalyPerson() {
        System.out.println("Name: " + name + ", Age: " + age + ", Message: " + message);
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.name = new String(this.name);
            cloned.age = this.age;
            cloned.message = new String(this.message);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
