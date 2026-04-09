public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void borrowResource(LibraryResource resource) {
        System.out.print(name + " (ID: " + studentId + ") has ");
        resource.borrowItem();
    }

}
