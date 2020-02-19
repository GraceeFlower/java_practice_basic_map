import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Student linda = new Student("Linda", 18);
        Student cindy = new Student("Cindy", 19);
        Student mary = new Student("Mary", 18);

        Map<String, Integer> stuMap = new HashMap<>();
        stuMap.put(linda.getName(), linda.getAge());
        stuMap.put(cindy.getName(), mary.getAge());
        stuMap.put(mary.getName(), mary.getAge());

        Teacher teacher = new Teacher("Bob", stuMap);
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));

        teacher.printStudentInfo();
    }

}
