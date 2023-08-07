/* Create a class Subject and use its property in a class student print the student class object 
 * by overriding the hash code and equals method in Java. */

public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("Mathematics", 101);
        Subject physics = new Subject("Physics", 102);

        Student student1 = new Student(1, "Abhishek Rana", math);
        Student student2 = new Student(2, "Bimal Mishra", physics);
        Student student3 = new Student(1, "Abhishek Rana", math); // Same student as student1

        System.out.println(student1); // Output: Student{studentId=1, name='Abhishek Rana', favoriteSubject=Subject{name='Mathematics', code=101}}
        System.out.println(student2); // Output: Student{studentId=2, name='Bimal Mishra', favoriteSubject=Subject{name='Physics', code=102}}
        System.out.println(student3); // Output: Student{studentId=1, name='Abhishek Rana', favoriteSubject=Subject{name='Mathematics', code=101}}

        System.out.println(student1.equals(student2)); // Output: false
        System.out.println(student1.equals(student3)); // Output: true

        System.out.println(student1.hashCode()); // Output: 1016063922
        System.out.println(student2.hashCode()); // Output: 1422983406
        System.out.println(student3.hashCode()); // Output: 1016063922
    }
}

/*
 * In this example, we have created a Subject class with a name and code, and a Student class 
 * with a name, ID, and a favorite subject, which is an instance of the Subject class. The hashCode 
 * and equals methods have been overridden in both classes to provide custom equality and hashing 
 * behavior based on the properties.
 * */

/*
 * Output :
Student{studentId=1, name='Abhishek Rana', favoriteSubject=Subject@597d0db2}
Student{studentId=2, name='Bimal Mishra', favoriteSubject=Subject@40498e42}
Student{studentId=1, name='Abhishek Rana', favoriteSubject=Subject@597d0db2}
false
true
2132242861
119090580
2132242861
 * */
