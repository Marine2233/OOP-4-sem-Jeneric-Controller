import java.util.ArrayList;

public class StudentController implements  InterfaceUserController<Student>{

     StudentGroup sg = new StudentGroup(new ArrayList<>());
     UserView<Student> userView = new UserView<>();

    @Override
    public void creat(String name, String secondName, String lastName) {
        int maxId = 0;
        if(!sg.getStudentList().isEmpty())
        maxId = sg.getStudentList().get(sg.getStudentList().size()-1).getStudentID()+1;
        Student st = new Student(maxId, name, secondName, lastName);
        sg.addStudent(st);
    }

    public void printStudentList(){
        userView.sendOnConsole(sg.getStudentList());
        }

    }
