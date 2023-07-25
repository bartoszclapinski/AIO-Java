package Inheritance.Exercise2;

public class CourseBootcamp extends CourseOnline {
    private String trainerName;
    private String teacherName;
    private double hours;

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void printInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Time: " + getTime());
        System.out.println("Learn time: " + getLearnTime());
        System.out.println("Trainer name: " + getTrainerName());
        System.out.println("Teacher name: " + getTeacherName());
        System.out.println("Hours: " + getHours());
    }
}
