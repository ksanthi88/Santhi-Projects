class Student {
    //Name of student
    public void name_of_student(String name) {
        System.out.println(String.format("Student name is : %s", name));
    }

    //Grade of the Student
    public void grade(double grade) {
        System.out.println(String.format("Student grade is : %f", grade));
    }
}


public class InstanceMethod {
    public static void main(String[] args){
        // create student1 object
        Student  student1= new Student();
        student1.name_of_student("Deepi");
        student1.grade(9.78);

        // create student2 object
        Student  student2= new Student();
        student2.name_of_student("Karthik");
        student2.grade(8.9);

    }

}
