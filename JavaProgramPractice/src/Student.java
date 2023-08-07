/* Create a class Subject and use its property in a class student print the student class object 
 * by overriding the hash code and equals method in Java. */

public class Student {
    private int studentId;
    private String name;
    private Subject favoriteSubject;

    public Student(int studentId, String name, Subject favoriteSubject) {
        this.studentId = studentId;
        this.name = name;
        this.favoriteSubject = favoriteSubject;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((favoriteSubject == null) ? 0 : favoriteSubject.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (favoriteSubject == null) {
            return other.favoriteSubject == null;
        } else return favoriteSubject.equals(other.favoriteSubject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", favoriteSubject=" + favoriteSubject +
                '}';
    }
}
