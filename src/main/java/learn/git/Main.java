package learn.git;

/**
 * @author Sergii Stets
 *         Date 15.11.2015
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Experimental code goes here...");
        // waiting for a person class here
        Person person = new Person("Sergii Stets");
        System.out.println(person);
        if (person.getFullName().equalsIgnoreCase("Sergii Stets")){
            System.out.println("We found him");
            System.out.println("aaaaaa");
        }
    }
}
