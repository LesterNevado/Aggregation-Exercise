import java.io.*;
import java.util.*;
public class StudentDA {
    private ArrayList<Student> studentList;

    public StudentDA() throws FileNotFoundException{
        Scanner studentInfo = new Scanner(new FileReader("studentInfo.csv"));

        studentList = new ArrayList<>();

        while(studentInfo.hasNext()){
            String rowStudent =  new String();
            rowStudent = studentInfo.nextLine();
            String[] rowStudentSpecific = new String[4];
            rowStudentSpecific = rowStudent.split(",");

            Student student = new Student();
            student.setStudentNo(rowStudentSpecific[1].trim());
            student.setName(rowStudentSpecific[2].trim());
            student.setProgram(rowStudentSpecific[3].trim());

            CourseDA courseDA = new CourseDA(student.getStudentNo());

            student.setCourseList(courseDA.getCourseList());
            studentList.add(student);
        }
        studentInfo.close();
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }
}
