package test_1;

public class Class {
    int number_of_students;
    String teacher_name;
    public static void main(String[] args) {
        Student student1 = new Student("ariel", "goldberg", 16, 10);
        Student student2 = new Student("shlomo", "choen", 11, 60);
        Student student3 = new Student("yuda", "levy", 17, 90);
        Student student4 = new Student("alex", "black", 18, 70);
        if (student1.grades_average > student2.grades_average && student1.grades_average > student3.grades_average && student1.grades_average > student4.grades_average) {
            System.out.println(student1.name);
        }
        else if (student2.grades_average > student1.grades_average && student2.grades_average > student3.grades_average && student2.grades_average > student4.grades_average) {
            System.out.println(student2.name);
        }
        else if (student3.grades_average > student1.grades_average && student3.grades_average > student2.grades_average && student3.grades_average > student4.grades_average) {
            System.out.println(student3.name);
        }
        else if (student4.grades_average > student1.grades_average && student4.grades_average > student2.grades_average && student4.grades_average > student3.grades_average) {
            System.out.println(student4.name);
        }
    }
}
