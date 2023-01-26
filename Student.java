package Package;

public class Student extends Person implements Payable{
    private double gpa;
    private double stipend = 36600.00;

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);

    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa <= 2.67) {
            this.stipend = 0;
        }
        return stipend;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString() + " ";

    }
}