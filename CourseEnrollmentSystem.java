// Course Enrollment and Grade Management System in Java

import java.util.*;

// Student Class
class Student {
    private String name;
    private String id;
    private Map<Course, Double> grades;
    private List<Course> enrolledCourses;

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
        this.enrolledCourses = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Enroll student in a course
    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course) && course.getEnrolledStudents() < course.getMaxCapacity()) {
            enrolledCourses.add(course);
            course.incrementEnrolledStudents();
        } else {
            System.out.println("Cannot enroll in course: Maximum capacity reached or already enrolled.");
        }
    }

    // Assign grade for a course
    public void assignGrade(Course course, double grade) {
        if (enrolledCourses.contains(course)) {
            grades.put(course, grade);
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    // Calculate overall grade
    public double calculateOverallGrade() {
        double total = 0;
        for (double grade : grades.values()) {
            total += grade;
        }
        return grades.size() > 0 ? total / grades.size() : 0;
    }
}

// Course Class
class Course {
    private String courseCode;
    private String name;
    private int maxCapacity;
    private static int totalEnrolledStudents = 0;
    private int enrolledStudents;

    // Constructor
    public Course(String courseCode, String name, int maxCapacity) {
        this.courseCode = courseCode;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    // Increment enrolled students
    public void incrementEnrolledStudents() {
        enrolledStudents++;
        totalEnrolledStudents++;
    }

    // Static method to retrieve total enrolled students
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }
}

// CourseManagement Class
class CourseManagement {
    private static List<Course> courses = new ArrayList<>();
    private static Map<Student, Double> overallGrades = new HashMap<>();

    // Add a new course
    public static void addCourse(String courseCode, String name, int maxCapacity) {
        Course course = new Course(courseCode, name, maxCapacity);
        courses.add(course);
    }

    // Enroll a student in a course
    public static void enrollStudent(Student student, Course course) {
        student.enrollCourse(course);
    }

    // Assign grade to a student for a course
    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
    }

    // Calculate overall grade for a student
    public static double calculateOverallGrade(Student student) {
        double overallGrade = student.calculateOverallGrade();
        overallGrades.put(student, overallGrade);
        return overallGrade;
    }

    // Retrieve list of courses
    public static List<Course> getCourses() {
        return courses;
    }
}

// Administrator Interface
public class CourseEnrollmentSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nAdministrator Menu:");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate Overall Grade");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCourseInterface();
                    break;
                case 2:
                    enrollStudentInterface();
                    break;
                case 3:
                    assignGradeInterface();
                    break;
                case 4:
                    calculateOverallGradeInterface();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addCourseInterface() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter maximum capacity: ");
        int maxCapacity = scanner.nextInt();
        scanner.nextLine();
        CourseManagement.addCourse(courseCode, name, maxCapacity);
        System.out.println("Course added successfully.");
    }

    private static void enrollStudentInterface() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        Student student = new Student(studentName, studentId);
        System.out.println("Available courses:");
        for (int i = 0; i < CourseManagement.getCourses().size(); i++) {
            Course course = CourseManagement.getCourses().get(i);
            System.out.println((i + 1) + ". " + course.getName() + " (Code: " + course.getCourseCode() + ")");
        }
        System.out.print("Choose a course by number: ");
        int courseChoice = scanner.nextInt() - 1;
        scanner.nextLine();
        if (courseChoice >= 0 && courseChoice < CourseManagement.getCourses().size()) {
            Course course = CourseManagement.getCourses().get(courseChoice);
            CourseManagement.enrollStudent(student, course);
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Invalid course choice.");
        }
    }

    private static void assignGradeInterface() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        Student student = new Student(studentName, studentId);
        System.out.println("Available courses:");
        for (int i = 0; i < CourseManagement.getCourses().size(); i++) {
            Course course = CourseManagement.getCourses().get(i);
            System.out.println((i + 1) + ". " + course.getName() + " (Code: " + course.getCourseCode() + ")");
        }
        System.out.print("Choose a course by number: ");
        int courseChoice = scanner.nextInt() - 1;
        scanner.nextLine();
        if (courseChoice >= 0 && courseChoice < CourseManagement.getCourses().size()) {
            Course course = CourseManagement.getCourses().get(courseChoice);
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            CourseManagement.assignGrade(student, course, grade);
            System.out.println("Grade assigned successfully.");
        } else {
            System.out.println("Invalid course choice.");
        }
    }

    private static void calculateOverallGradeInterface() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        Student student = new Student(studentName, studentId);
        double overallGrade = CourseManagement.calculateOverallGrade(student);
        System.out.println("Overall grade for " + student.getName() + ": " + overallGrade);
    }
}
