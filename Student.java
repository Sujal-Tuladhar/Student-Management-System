
/**
 * This is Student Class which serve as a parent class,also known as super class.
 * It consist of constructor, attributes constructor which is a special kind of method,
 * getter methods also known as accessor methods,setter methods also known as mutator method,
 * A method to display the detail of Student.
 * @author (Sujal Tuladhar)
 * @version (5.1.0a)
 */
// Student Class
public class Student    
{
    //access modifier to private
    ///Student class has seven Attributes
    private int enrollmentID;//A variable name enrollmentID with int data type is created using private
    private String dateOfBirth;//A variable name dateOfBirth with String data type is created using private
    private String courseName;//A variable name courseName with String data type is created using private
    private String studentName;//A variable name studentName with String data type is created using private
    private String dateOfEnrollment;//A variable name dateOfEnrollment with String data type is created using private
    private int courseDuration;//A variable name courseDuration with int data type is created using private
    private int tutionFee;//A variable name tutionFee with double data type is created using private
    /*constructor of class Student acccept four parameter: dateOfBirth,studentName,courseDuration,tutionFee*/
    public Student(String dateOfBirth,String studentName,int courseDuration, int tutionFee)
    {
        this.dateOfBirth=dateOfBirth;//assigning the value of instance variable,DateOfBirth to the parameter, dateOfBirth
        this.studentName=studentName;//assigning the value of instance variable,StudentName to the parameter, studentName
        this.courseDuration=courseDuration;//assigning the value of instance variable,CourseDuration to the parameter, courseDuration
        this.tutionFee=tutionFee; //assigning the value of instance variable,TutionFee to the parameter, tutionFee
        this.courseName =""; //initialized  courseName to an empty string
        this.dateOfEnrollment = ""; //initialized  dateofEnrollment to an empty string
        this.enrollmentID = 0; //initialized enrollmentID to zero of int datatype
    }
    //accessor method or getter method
    public int getenrollmentID()
    {
        return this.enrollmentID;
    }
    public String getdateOfBirth()
    {
        return this.dateOfBirth;
    }
    public String getcourseName()
    {
        return this.courseName;
    }
    public String getstudentName()
    {
        return this.studentName;
    }
    public String getdateOfEnrollment()
    {
        return this.dateOfEnrollment;
    }
    public int getcourseDuration()
    {
        return this.courseDuration;
    }
    public int gettutionFee()
    {
         return this.tutionFee;
    }
    //mutator method or Setter Method
    public void setcourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public void setenrollmentID(int enrollmentID)
    {
        this.enrollmentID=enrollmentID;
    }
    public void setdateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment=dateOfEnrollment;
    }
    public void setdateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public void setstudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public void settutionFee(int tutionFee)
    {
        this.tutionFee=tutionFee;
    }
    public void setcourseDuration(int courseDuration)
    {
        this.courseDuration=courseDuration;
    }
    //To display the output
    public void display()
    {
        //condition operator incase the information is fullfilled
        if( this.enrollmentID==0 || this.dateOfBirth=="" || this.courseName=="" || this.studentName=="" 
        || this.dateOfEnrollment=="" || this.courseDuration==0 || this.tutionFee==0){
            System.out.println("Please Check  And Fill All The  Required Information ");
        }
        else{
            System.out.println("Course Name:"+this.courseName);
            System.out.println("Date OF Enrollment:"+this.dateOfEnrollment);
            System.out.println("Enrollment ID:"+ this.enrollmentID);
            System.out.println("DateOfBirth:"+ this.dateOfBirth);
            System.out.println("StudentName:"+ this.studentName);
            System.out.println("CourseDuration:"+ this.courseDuration);
            System.out.println("TutionFee:"+ this.tutionFee);
        }
        
    }
    
}
