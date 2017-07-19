/**
 *
 * @author Hong Sung
 */
public class Student {

	private String name;
	private String nextClass;

	public Student(String name, String nextClass) {
		this.name = name;
		this.nextClass = nextClass;
	}

	public String getName() {
		return name;
	}

	public String getNextClass() {
		return nextClass;
	}

        @Override
	public String toString() {
		return "name["+name+"] next_class["+nextClass+"]";
	}

}
