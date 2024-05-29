public class Teacher extends User {
    private int idTeacher;
    private String name ;
    
    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.name = "Techer";
        this.idTeacher++;
        
    }
    @Override
    public String toString() {
        
        return "id- "+idTeacher + "; "+super.toString() + ": "+name ;
    }
    public int getIdTeacher() {
        return idTeacher;
    }
    public String getName() {
        return name;
    }
    
}
