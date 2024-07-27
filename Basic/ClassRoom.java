package Basic;
public class ClassRoom {
    public static void main(String[] args) throws Exception{
        Student s = new Student("Ujjwal", 2, 168, 'C', "CSE");
        // Student s = new Student();
        // s.name = "Ujjwal";
        // s.age = -9;
        // s.ID = 168;
        // s.branch = "CSE";  
        // s.section = 'C';
        s.introduceYourSelf();
    }
}
