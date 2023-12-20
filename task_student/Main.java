package task_student;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("ariel",100,170,16);

        Student student2 = new Student("b",80);
        student2.setHeight(180);
        student2.setAge(17);

        Student student3 = new Student();    
        student3.setName("Bob");
        student3.setLast_grade(70);
        student3.setHeight(190);
        student3.setAge(17);   
        System.out.println("Enter student name: "); 
        String name = scanner.nextLine();
        System.out.println("Enter student last_grade: "); 
        int last_grade = scanner.nextInt();
        System.out.println("Enter student height: "); 
        int height = scanner.nextInt();
        System.out.println("Enter student age: "); 
        int age = scanner.nextInt();

        Student student4 = new Student(name,last_grade,height,age);
        
        if (student3.isPass() && student3.getAge() > 16) {
            System.out.println(student3.getName());
        }
    }

}
