package OOPS.Programming_Challenges;

public class Course {
    static int maxCapacity;
    int enrolledStudents;
    String courseName;
    boolean isEnrolled;


    {
        enrolledStudents++;
    }

    Course(String courseName){
        this.courseName = courseName;
    }

    static void setMaxCapacity(int max){
        maxCapacity = max;
    }
    void enrollStudent(String studentName){
        if (enrolledStudents<maxCapacity) {
            if (this.isEnrolled) {
                System.out.println(studentName + " has already enrolled for this course");
            } else {
                isEnrolled = true;
                System.out.println(studentName + " is enrolled this course");
                this.enrolledStudents++;
            }
        } else {
            System.out.println("Sorry there are no more seats left for this course");
        }
    }
    void unenroll(String studentName){
        if (this.isEnrolled){
            isEnrolled = false;
            System.out.println(studentName+" is unenrolled from this course");
            this.enrolledStudents--;
        } else {
            System.out.println(studentName+" has already unenrolled for this course");
        }
    }

    public static void main(String[] args) {
        Course course1 = new Course("Arjun");
        Course course2 = new Course("Lakshay");
        Course.setMaxCapacity(5);

        course1.enrollStudent("Sharad");
        course1.enrollStudent("Rahul");
        course1.enrollStudent("Prachi");
        course2.enrollStudent("Shivam");

        String a1 = "Sharad";
        String a2 = "Sharad";
        String a3 = new String("Sharad");
        System.out.println(a1==a2);
        System.out.println(a1.equals(a3)); // Here equals() method compare the object creted and == compare reference
        System.out.println(course1.enrolledStudents);

    }
}
