public class Array {
    public static void main(String[] args){
        String[] studentNames;
        studentNames= new String[]{"Deepi","Karthik","Vihaan","Varun"};
        int[] studentAge;
        studentAge= new int[]{35,35,6,3};
        double[] studentGrade = new double[]{88,90,100,100};
        String[] studentCity= new String[4];
        studentCity[0]="Karur";
        studentCity[1]="Nama";
        studentCity[2]="MN";
        studentCity[3]="MIN";
        System.out.println(studentNames[0] +         studentAge[0]);
        System.out.println(studentNames[1] +         studentAge[1]);
        System.out.println(studentNames[2] +         studentAge[2]);
        System.out.println(studentNames[3] +         studentAge[3]);
        System.out.println(studentNames[0] +         studentGrade[0]);
        System.out.println(studentCity[0]);

    }
}
