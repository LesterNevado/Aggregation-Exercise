import java.util.*;
public class BlockSection{
    private String blockCode;
    private String description;
    private String adviser;
    private ArrayList<Student> studentList;

    //setters
    public void setBlockCode(String blockCode){
        this.blockCode=blockCode;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setAdviser(String adviser){
        this.adviser=adviser;
    }
    public void setStudentList(ArrayList<Student> studentList){
        this.studentList=studentList;
    }

    //getters
    public String getBlockCode(){
        return blockCode;
    }
    public String getDescription(){
        return description;
    }
    public String getAdviser(){
        return adviser;
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public String toString(){
        String result = new String();
        for(Student student: studentList){
            result += "Block Section: " + blockCode + "\t" +
                      "Block Section Description: "+ description + "\n" + 
                      "Class Adviser: " + adviser + "\n\n";
            result += student;
        }
        return result;
    }
}
