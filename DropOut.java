
/**
 * This following is DropOut Class which serve as a child class,also known as sub class
 * DropOut inherits properties of Student class.
 * consist of attributes,constructor,accessor method,mutator method
 * a method for billspayable,removeStudent and a method to display all student information.
 * @author (Sujal Tuladhar)
 * @version (5.0.1A)
 */
//DropOut Class
public class DropOut extends Student
{
    //Private access modifier is used so the class regular cant be access from outside.
    //DropOut class has five attribute
    private int numOfRemainingModules;//A variable name numOfRemainingModules with int data type is created using private
    private int numOfMonthsAttended;//A variable name numOfMonthsAttended with int data type is created using private
    private String dateOfDropOut; //A variable name dateOfDropOut with String data type is created using private
    private int remainingAmount;//A variable name remainingAmoubnt with int data type is created using private
    private boolean hasPaid;////A variable name hasPaid with boolean data type is created using private
    /*Constructor accepts seven parameter*/
    public DropOut(String dateOfBirth,String studentName,int courseDuration,
    int tutionFee,int numOfRemainingModules,int numOfMonthsAttended,
    String dateOfDropOut,int enrollmentID,String dateOfEnrollment,String courseName)
    {
        super(dateOfBirth,studentName,courseDuration,tutionFee);//Calls the super constructor of Student class that passes four parameters: dateOfBirth,studentName,courseDuration,tutionFee
        setenrollmentID(enrollmentID);//calls the setters method: setEnrollmentID with a parameter: enrollmentID 
        setdateOfEnrollment(dateOfEnrollment);//calls the setter method: setDateOfEnrollment with a parameter: dateOfEnrollment
        setcourseName(courseName);//calls the setter method: setCourseName with a parameter: courseName
        //this to access from protected access modifier
        this.numOfRemainingModules=numOfRemainingModules;//assigning the value of instance variable numOfRemainingModules to the parameter NumOfRemainingModules
        this.numOfMonthsAttended=numOfMonthsAttended;//assigning the value of instance variable numOfMonthsAttended to the parameter NumOfMonthsAttended
        this.dateOfDropOut=dateOfDropOut;//assigning the value of instance variable dateOfDropOut to the parameter DateOfDropOut
        this.remainingAmount=remainingAmount;//assigning the value of instance variable remainingAmount to the parameter RemainingAmount
        this.remainingAmount=0;//assigning the value of instance variable remainingAmount to zero
        this.hasPaid=false;//assigning the value of instance variable hasPaid to false boolean

    }
    //accessor method or getter method of the class DropOut
    public int getnumOfRemainingModules()
    {
        return this.numOfRemainingModules;  
    }

    public int getnumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
    }

    public String getdateOfDropOut()
    {
        return this.dateOfDropOut;
    }

    public int getremainingAmount()
    {
        return this.remainingAmount;
    }

    public boolean gethasPaid()
    {
        return this.hasPaid;
    }
    //Method of BillsPayable to calculate the remainingamount
    public void billsPayable()
    {
    this.remainingAmount=(getcourseDuration()-this.numOfMonthsAttended) * gettutionFee();
    this.hasPaid=true;
    }
    //removed student method to clear the record
    public void removeStudent()
    {
        if(hasPaid==true){
            setdateOfBirth("");
            setcourseName("");
            setstudentName("");
            setdateOfEnrollment("");
            setcourseDuration(0);
            settutionFee(0);
            numOfRemainingModules=0;
            numOfMonthsAttended=0;
            remainingAmount=0;
            dateOfDropOut=("");
        }
        else{
            System.out.println("All Bills Not Cleared");
        }
    }
    //Display all the information from dropout and student
    public void display()
    {
        super.display(); //calling the display method of Student class
        System.out.println("Number Of Remaining Modules :"+this.numOfRemainingModules);
        System.out.println("Number Of Month Attended :"+this.numOfMonthsAttended);
        System.out.println("Date Of Dropout :"+this.dateOfDropOut);
        System.out.println("Remaining Amount :"+this.remainingAmount);
    }
}
