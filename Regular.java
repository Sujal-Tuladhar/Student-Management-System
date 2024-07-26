
/**
 * The following is Regular class i.e. a child class also known as sub class.
 * Regular class inherits the properties of Student class.
 * consist of attributes,constructor,accessor method,mutator method 
 * a method to display PresentPercentage,GrantCertificate and  all the infromation of student 
 * @author (Sujal Tuladhar)
 * @version (5.0.1a)
 */
//Regular Class
public class Regular extends Student
{
    //access modifier to private so the class regular cant be access from outside.
    //Regular Class Has Four Attributes
    private int numOfModules;//A variable name numOfModules with int data type is created using private
    private int numOfCreditHours;//A variable name numOfCreditHours with int data type is created using private
    private double daysPresent;//A variable name daysPresent with double data type is created using private 
    private boolean isGrantedScholarship;//A variable isGrantedScholarship with boolean data type is created using private 
    /*constructor accepts ten parameter:dateOfBirth,studentName,courseDuration,tutionFee,enrollmentID,courseName,dateOfEnrollment,numOfModules,numOfCreditHours,daysPresent*/
    public Regular(String dateOfBirth,String studentName,int courseDuration,  
    int tutionFee,int enrollmentID,String courseName,String dateOfEnrollment,  int numOfModules,
    int numOfCreditHours,double daysPresent)
    {

        super(dateOfBirth,studentName,courseDuration,tutionFee);//Calls the super constructor of Student class that passes four parameters: dateOfBirth,studentName,courseDuration,tutionFee
        setenrollmentID(enrollmentID);//calls the setters method: setenrollmentID with a parameter: EnrollmentID
        setcourseName(courseName);//calls the setters method: setcourseName with a parameter: CourseName
        setdateOfEnrollment(dateOfEnrollment);//calls the setters method: setdateOfEnrollment with a parameter: DateOfEnrollment
        this.numOfModules=numOfModules;//assigning the value of instance variable numOfModules to the parameter NumOfModules
        this.numOfCreditHours=numOfCreditHours;//assigning rhe value of instance variable numOfCreditHours to the parameter NumOfCreditHours
        this.daysPresent=daysPresent;//assigning the value of instance variable daysPresent to the parameter, DaysPresent
        this.isGrantedScholarship=false;//assigning the value of instance variable,isGrantedScholarship to false boolean
    }
    //accesor method or getter method to each attribute of Regular class
    public int getnumOfModules()
    {
        return this.numOfModules;
    }

    public int getnumOfCreditHours()
    {
        return this.numOfCreditHours;
    }

    public double getdaysPresent()
    {
        return this.daysPresent;
    }

    public boolean getisGrantedScholarship()
    {
        return this.isGrantedScholarship;
    }

    /* Creating  a method PresentPercentage() which accepts the parameter DaysPresent*/
    public char presentPercentage(double daysPresent)
    {
        double PresentPercentage=(daysPresent/(getcourseDuration()*30))*100;

        if( daysPresent>(getcourseDuration()*30))
        {
            System.out.println("DaysPresent Of Student Can't Be Greater Than CourseDuration");
            return'\0';
        }
        else if(PresentPercentage<=100 && PresentPercentage>=80){
            this.isGrantedScholarship=true;
            return'A';
        }
        else if(PresentPercentage<=79 && PresentPercentage>=60)
        {
            return'B';
        }
        else if(PresentPercentage<=59 && PresentPercentage>=40)
        {
            return'C';
        }
        else if(PresentPercentage<=39 && PresentPercentage>=20)
        {
            return'D';
        }
        else
        {
            return'E';
        }
    }

    /* Creating a method GranteCertificate() which has three parameters: courseName,enrollmentID,dateofEnrollment*/

    public void grantCertificate(String courseName,int enrollmentID,String dateOfEnrollment)
    {
        System.out.println("The Student Has Graduated.");
        System.out.println("Your CourseName is "+getcourseName());
        System.out.println("Your EnrollmentID is "+getenrollmentID());
        System.out.println("Your Date Of Enrollment is "+getdateOfEnrollment());
        //condition for granting scholarship message
        if(isGrantedScholarship==true)
        {
            System.out.println("The Scholarship is Granted");
        }
    }

    //Method to display All detail of student
    public void display()
    {
        super.display();//calling the display method of Student class
        System.out.println("Number Of Modules:"+this.numOfModules);
        System.out.println("Number Of CreditHours:"+this.numOfCreditHours);
        System.out.println("Days Present:"+this.daysPresent);
    }

}
