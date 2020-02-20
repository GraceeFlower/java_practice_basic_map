import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Student linda = new Student("Linda", 18);
        Student cindy = new Student("Cindy", 19);
        Student mary = new Student("Mary", 18);

        Map<Integer, List<Student>> stuMap = new HashMap<>();
        List<Student> ageEighteen = new ArrayList<>();
        List<Student> ageNineteen = new ArrayList<>();
        ageEighteen.add(linda);
        ageEighteen.add(mary);
        ageNineteen.add(cindy);
        stuMap.put(18, ageEighteen);
        stuMap.put(19, ageNineteen);

        Teacher teacher = new Teacher("Bob", stuMap);
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));

        teacher.printStudentInfo();
    }

}
