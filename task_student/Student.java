package task_student;

public class Student {
    private String name;
    private int last_grade;
    private int height;
    private int age;

    public Student(String name,int last_grade,int height,int age){
        this.name = name;
        this.last_grade = last_grade;
        this.height = height;
        this.age = age;
    }
    Student(String name,int last_grade){
        this.name = name;
        this.last_grade = last_grade;
    }
    Student(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setLast_grade(int last_grade){
        this.last_grade = last_grade;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    public boolean isPass(){
        return last_grade >= 60;
    }
}
