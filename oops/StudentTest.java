package oops;
class Student{
    private int rollNumber;
    private String name;
    private String course;
    private double marks1; 
    private double marks2;
    private double marks3;
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public void getRollNumber(){
        System.out.println(rollNumber);
    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(name);
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void getCourse(){
        System.out.println(course);
    }
    public void setMarks1(double marks1){
        this.marks1 = marks1;
    }
    public void getMarks1(){
        System.out.println(this.marks1);
    }
    public void setMarks2(double marks2){
        this.marks2 = marks2;
    }
    public void getMarks2(){
        System.out.println(this.marks2);
    }
    public void setMarks3(double marks3){
        this.marks3 = marks3;
    }
    public void getMarks3(){
        System.out.println(this.marks3);
    }
    public double calculateTotal(){
        return marks1+marks2+marks3;
    }
    public double calculateAverage(){
        return calculateTotal()/3;
    }
    public char calculateGrade(){
        double avg = calculateAverage();
        if(avg >= 90){
            return 'A';
        }
        if(avg >= 70){
            return 'B';
        }
        if(avg >= 50){
            return 'C';
        }
        return 'D';
    }
    public String toString(){
        return "Roll no: "+rollNumber+", name: "+name+", course: "+course+", marks1: "+marks1+", marks2: "+marks2+", marks3"+
               marks3+", total: "+calculateTotal()+", average: "+String.format("%.2f",calculateAverage())+", grade: "+calculateGrade();
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setRollNumber(1);
        s1.setName("Rahul");
        s1.setCourse("English");
        s1.setMarks1(50);
        s1.setMarks2(80);
        s1.setMarks3(70);

        s2.setRollNumber(2);
        s2.setName("Shivam");
        s2.setCourse("Science");
        s2.setMarks1(60);
        s2.setMarks2(86);
        s2.setMarks3(70.5);

        s3.setRollNumber(3);
        s3.setName("Manish");
        s3.setCourse("Art");
        s3.setMarks1(65);
        s3.setMarks2(76);
        s3.setMarks3(40.5);

        s4.setRollNumber(4);
        s4.setName("Yash");
        s4.setCourse("Commerce");
        s4.setMarks1(45.78);
        s4.setMarks2(68);
        s4.setMarks3(30);

        s5.setRollNumber(5);
        s5.setName("Sahil");
        s5.setCourse("Math");
        s5.setMarks1(35.78);
        s5.setMarks2(58);
        s5.setMarks3(70);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
    }
}
