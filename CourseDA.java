import java.util.*;
import java.io.*;
public class CourseDA {
    private ArrayList<Course> courseList;

    public CourseDA(String studentNo) throws FileNotFoundException{
        Scanner courseInfo = new Scanner(new FileReader("scheduleInfo.csv"));

        courseList = new ArrayList<>();

        while (courseInfo.hasNext()) {
            String rowCourse = new String();
            rowCourse = courseInfo.nextLine();
            String[] rowCourseSpecific = new String[6];
            rowCourseSpecific = rowCourse.split(",");

            if(studentNo.equals(rowCourseSpecific[0])){
                Course course =  new Course();
                course.setCourseCode(rowCourseSpecific[1].trim());
                course.setDescription(rowCourseSpecific[2].trim());
                course.setUnits(Integer.parseInt(rowCourseSpecific[3].trim()));
                course.setDay(rowCourseSpecific[4].trim());
                course.setTime(rowCourseSpecific[5].trim());

                courseList.add(course);
            }
        }
        courseInfo.close();
    }
    public ArrayList<Course> getCourseList(){
        return courseList;
    }
}
