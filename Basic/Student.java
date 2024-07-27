package Basic;
public class Student {
    String name;
    int age;
    int ID;
    char section;
    String branch;
    void introduceYourSelf(){
        System.out.println("Hi, my name is: "+name+". My ID is: "+ID+". My major is: "+branch+" of section "+section+". Age is "+age);
    }
    public Student(){

    }
    public Student(String name, int age, int ID, char section, String branch) throws Exception{
        this.name = name;
        // this.age = age;
        try{if(age > 17){
            this.age = age;
        }
        else{
            throw new Exception("Wrong Input");
        }}
        catch(Exception e){
            e.printStackTrace();
        }
        this.ID = ID;
        this.section = section;
        this.branch = branch;
    }
}