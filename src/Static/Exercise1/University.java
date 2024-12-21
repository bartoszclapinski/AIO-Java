package Static.Exercise1;

public class University {
    public static void main(String[] args) {
        var student1 = new Student("John", "Doe", "123456");
        var student2 = new Student("Jane", "Doe", "654321");

        System.out.println("Number of students: " + Student.studentsCount);
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getIndexNumber());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getIndexNumber());
    }
}
