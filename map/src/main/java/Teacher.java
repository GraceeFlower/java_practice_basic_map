import java.util.Map;
import java.util.Set;

public class Teacher {

    private String name;
    private Map<String, Integer> stuMap;

    public Teacher(String name, Map<String, Integer> stuMap) {
        this.name = name;
        this.stuMap = stuMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getStuMap() {
        return stuMap;
    }

    public void setStuMap(Map<String, Integer> stuMap) {
        this.stuMap = stuMap;
    }

    public void addStudent(Student newStudent) {
        this.stuMap.put(newStudent.getName(), newStudent.getAge());
    }

    public void printStudentInfo() {
        Set<Map.Entry<String, Integer>> stuSet = stuMap.entrySet();
        for(Map.Entry<String, Integer> i: stuSet) {
            System.out.println("姓名：" + i.getKey() + " 年龄：" + i.getValue());
        }
    }
}
