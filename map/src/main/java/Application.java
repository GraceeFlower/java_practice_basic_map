import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Student linda = new Student("Linda", 18);
        Student cindy = new Student("Cindy", 19);
        Student mary = new Student("Mary", 18);

        Map<Integer, List<Student>> groupedStudents = new HashMap<>();
        List<Student> ageEighteen = new ArrayList<>();
        List<Student> ageNineteen = new ArrayList<>();
        ageEighteen.add(linda);
        ageEighteen.add(mary);
        ageNineteen.add(cindy);
        groupedStudents.put(18, ageEighteen);
        groupedStudents.put(19, ageNineteen);

        Teacher teacher = new Teacher("Bob", groupedStudents);
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));

        teacher.printStudentInfo();
    }

}
