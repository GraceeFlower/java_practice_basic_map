import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {

    private String name;
    private Map<Integer, List<Student>> stuMap;

    public Teacher(String name, Map<Integer, List<Student>> stuMap) {
        this.name = name;
        this.stuMap = stuMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, List<Student>> getGroupedStudents() {
        return stuMap;
    }

    public void setGroupedStudents(Map<Integer, List<Student>> stuMap) {
        this.stuMap = stuMap;
    }

    public void addStudent(Student stu) {
        if (stuMap.containsKey(stu.getAge())) {
            List<Student> oldList = stuMap.get(stu.getAge());
            oldList.add(stu);
        } else {
            List<Student> newList = new ArrayList<>();
            newList.add(stu);
            stuMap.put(stu.getAge(), newList);
        }
    }

    public void printStudentInfo() {
        Set<Map.Entry<Integer, List<Student>>> stuSet = stuMap.entrySet();
        for(Map.Entry<Integer, List<Student>> i: stuSet) {
            for (Student stu: i.getValue()) {
                System.out.println(stu.toString());
            }
        }
    }
}
