package school;


public class Class {
    private String gradeOfClass;
    private Student[] students = new Student[2];

    public Class(String gradeOfClass, Student[] students) {
        this.gradeOfClass = gradeOfClass;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public String getGradeOfClass() {
        return gradeOfClass;
    }

    public void setGradeOfClass(String gradeOfClass) {
        this.gradeOfClass = gradeOfClass;
    }

}