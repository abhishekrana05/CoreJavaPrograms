/* Create a class Subject and use its property in a class student print the student class object 
 * by overriding the hash code and equals method in Java. */

public class Subject {
    private String name;
    private int code;

    public Subject(String name, int code) {
        this.name = name;
        this.code = code;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Subject other = (Subject) obj;
        if (code != other.code)
            return false;
        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }
}
