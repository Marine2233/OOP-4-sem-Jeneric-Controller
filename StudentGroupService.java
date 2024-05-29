import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup sg;

    public StudentGroupService(StudentGroup sg) {
        this.sg = sg;
    }

    public List<Student>getSortedStudentGroup(){
        List<Student>studentsList = new ArrayList<>(sg.getStudentList());
        Collections.sort(studentsList);
        return studentsList;
    }

    public List<Student> getSortedByFIO(){
        List<Student>studentsList = new ArrayList<>(sg.getStudentList());
        studentsList.sort(new UserComparator<Student>());
        return studentsList;
    }
}
