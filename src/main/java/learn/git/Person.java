package learn.git;

/**
 * This class holds all the information about person.
 *
 * @author Sergii Stets
 *         Date 05.12.2015
 */
public class Person {

    private String fullName;
    private int age;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
