package School;

public class Sinif {
    private String gradeOfClass;
    private Student[] students = new Student[2];

    public void addStudents(Student pStudent){
        switch (students.length){
            case 0:
                this.students[0]=pStudent;
                break;
            case 1:
                this.students[1]=pStudent;
                break;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public String getGradeOfClass() {
        return gradeOfClass;
    }

    public void setGradeOfClass(String gradeOfClass) {
        this.gradeOfClass = gradeOfClass;
    }
}
