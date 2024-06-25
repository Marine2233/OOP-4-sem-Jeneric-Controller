/*— Создать класс УчительКонтроллер и реализовать возможность создания, 
редактирования конкретного учителя 
и отображения списка учителей, имеющихся в системе. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerTeacher implements InterfaceUserController<Teacher> {

private Scanner sc = new Scanner(System.in);
// UserView<Teacher> userView = new UserView<>();
private List<Teacher>list = new ArrayList<>();


    @Override
    public void creat(String name, String secondName, String lastName) {
        Teacher teacher = new Teacher(lastName, secondName, lastName);
        list.add(teacher);
    }

public void modifyF(){
    System.out.println("Введите фамилию учителя: ");
    String consol = sc.nextLine();
    String fName;
    for (Teacher teacher : list) {
        if(teacher.getFirstName() == consol){
            System.out.println("Введите новую фамилию: ");
            fName = sc.nextLine();
            teacher.setFirstName(fName);
            System.out.println(teacher);
            System.out.println("Фамилия изменена на: "+teacher.getFirstName());
            
        }
        else{
            System.out.println("Такого преподавателя нет, попробуйте еще раз.");
            modifyF();
        }
    }
} 

public void modifyName(){
    System.out.println("Введите имя учителя: ");
    String consol = sc.nextLine();
    String name;
    for (Teacher teacher : list) {
        if(teacher.getName() == consol){
            System.out.println("Введите новое имя: ");
            name = sc.nextLine();
            teacher.setSecondName(name);
            System.out.println(teacher);
            System.out.println("Имя изменено на: "+teacher.getSecondName());
            
        }
        else{
            System.out.println("Такого преподавателя нет, попробуйте еще раз.");
            modifyF();
        }
    }
} 

public void modifyLastName(){
    System.out.println("Введите отчество учителя: ");
    String consol = sc.nextLine();
    String name;
    for (Teacher teacher : list) {
        if(teacher.getLastName() == consol){
            System.out.println("Введите новое отчество: ");
            name = sc.nextLine();
            teacher.setLastName(name);
            System.out.println(teacher);
            System.out.println("Отчество изменено на: "+teacher.getLastName());
            
        }
        else{
            System.out.println("Такого преподавателя нет, попробуйте еще раз.");
            modifyF();
        }
    }
}

public void remove(){
    printTeacherList();
    System.out.println("Введите id Преподавателя: ");
    int consol = sc.nextInt();
    for (Teacher teach : list) {
        if(teach.getIdTeacher() == consol ){
            list.remove(teach);
        }  
    }
}

public void printTeacherList(){
    for (Teacher teacher : list) {
        System.out.println(teacher);  
        }
    }
}

