package Inheritance.Exercise2;

public class Test {
    public static void main(String[] args) {
        CourseBootcamp courseBootcamp = new CourseBootcamp();
        courseBootcamp.setId("1");
        courseBootcamp.setPrice(100);
        courseBootcamp.setName("Java");
        courseBootcamp.setDescription("Java");
        courseBootcamp.setTrainerName("Trainer");
        courseBootcamp.setTeacherName("Teacher");
        courseBootcamp.setHours(10);
        courseBootcamp.printInfo();

    }
}
