
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}

class StudentSerialization {
    public static void serializeStudent(Student student, String filename) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            System.out.println("Student details saved successfully!");
        }
    }

    public static Student deserializeStudent(String filename) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Student) ois.readObject();
        }
    }

    public static void main(String[] args) {
        String filename = "student.ser";
        Student student = new Student(101, "John Doe", 3.8);

        try {
            serializeStudent(student, filename);

            System.out.println("\nReading from file...");
            Student deserializedStudent = deserializeStudent(filename);
            System.out.println("Student ID: " + deserializedStudent.id);
            System.out.println("Student Name: " + deserializedStudent.name);
            System.out.println("Student GPA: " + deserializedStudent.gpa);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
