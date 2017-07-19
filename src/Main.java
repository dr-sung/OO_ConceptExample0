import java.util.ArrayList;

/**
 * @author Hong Sung
 * Bad example of OO Program. This is not a real OO program.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> classRoll = new ArrayList<>();
        classRoll.add(new Student("John", "OOP"));
        classRoll.add(new Student("Mary", "P2"));
        classRoll.add(new Student("Suzan", "P1"));
        classRoll.add(new Student("Tom", "P1"));
        classRoll.add(new Student("Sue", "P2"));
        classRoll.add(new Student("Smith", "OOP"));

        for (Student s : classRoll) {
            String name = s.getName();
            String nextClass = s.getNextClass();
            String location = InfoSystem.getLocation(nextClass);
            String direction = InfoSystem.getDirection(location);

            System.out.print("\nHey, " + name + "!");
            System.out.println("\tYour next class is " + nextClass);
            System.out.println("\tLocation is " + location);
            System.out.println("\tDirection is " + direction);
        }

    }

}
