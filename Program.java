
public class Program{
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.creat("jjgg", "hbniu", "iug");
        studentController.creat("iujhb", "fghgh", "fghgf");
        // studentController.printStudentList();
        

        ControllerTeacher controllerTeacher = new ControllerTeacher();
        controllerTeacher.creat("Marcinkus", "Antanas", "Iono");
        // controllerTeacher.creat("Marcincus", "Kira", "Antanasovna");
        // controllerTeacher.creat("Marcinkus", "Marine", "Bogosovna");
        controllerTeacher.printTeacherList();
        // controllerTeacher.modifyF();
        controllerTeacher.printTeacherList();
    }  
}
       