import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String mySuffix;

    
    public Student() {
        firstName = "";
        middleName = "";
        lastName = "";
        mySuffix = "";
    }

    
    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        firstName = first_name;
    }

    public String getMiddle_name() {
        return middleName;
    }

    public void setMiddle_name(String middle_name) {
        middleName = middle_name;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        lastName = last_name;
    }

    public String getSuffix() {
        return mySuffix;
    }

    public void setSuffix(String suffix) {
        mySuffix = suffix;
    }

    
    public String getFullName() {
        String fullName = firstName + " " + middleName + " " + lastName;
        if (!mySuffix.isEmpty()) {
            fullName += " " + mySuffix;
        } else {
            fullName += " N/A";
        }
        return fullName;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        Student student = new Student();
        student.setFirst_name(firstName);
        student.setMiddle_name(middleName);
        student.setLast_name(lastName);
        student.setSuffix(suffix);

        System.out.println("Full Name: " + student.getFullName());

        scanner.close();
    }
}
