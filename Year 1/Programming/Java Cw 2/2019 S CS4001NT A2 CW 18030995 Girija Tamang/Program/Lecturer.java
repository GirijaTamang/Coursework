
/**
 * Description of class Lecturer .
 *
 * @author (Girija Tamang)
 * @lodonmetId (18030995)
 */
public class Lecturer extends Teacher
{ 
    private double salary;
    private String startingFrom;
    private String academicBlockNumber;
    private int dailyWorkingHour;
    private double advanceSalary;
    private boolean joined;
    private boolean terminated;
    public Lecturer(String subject,int classPerDay,String interviewerName,double salary,int dailyWorkingHours)
    {
        super(subject,classPerDay,interviewerName);
        this.salary=salary;
        this.dailyWorkingHour=dailyWorkingHour;
        this.startingFrom=("");
        this.academicBlockNumber=("");
        this.advanceSalary=0.0;
        this.joined=false;
        this.terminated=false;
    }
    public double getSalary()
    {
        return salary;   
    }
    public int getDailyWorkingHour()
    {
        return dailyWorkingHour;   
    }
    public String getStartingForm()
    {
        return startingFrom;
    }
    public String getAcademicBlockNumber()
    {
        return academicBlockNumber;
    }
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }
    public boolean getJoined()
    {
        return joined;
    }
    public boolean getTerminated()
    {
        return terminated;
    }
    //setSalary() method sets the value of the salary
    public void setsalary(double newsalary)
    {
        this.salary=newsalary;
    }
    //setWorkingHour() method sets the value of the WorkingHour
    public void setworkingHour(int newworkingHour)
    {
        this.dailyWorkingHour=newworkingHour;
    }
    public void appointLecturer(String lecturerName,String startingFrom,double advanceSalary,String academicBlockNumber)
    {
        if (joined==true)
        {
            System.out.println("The name of the appointed lecturer is:"+lecturerName+"\nThe academic block number is:"+academicBlockNumber);    
        }
        else
        {
            super.setTeacherName(lecturerName);
            this.startingFrom=startingFrom;
            this.academicBlockNumber=academicBlockNumber;
            this.advanceSalary=advanceSalary;
            this.joined=true;
            this.terminated=false;
        }
    }
    public void lecturerTermination()
        {
            if(terminated==true)
            {
                System.out.println("The lecturer is terminated");
            }
            else
            {
                super.setTeacherName("");
                this.startingFrom=("");
                this.advanceSalary=0.0;
                this.joined=false;
                this.terminated=true;
            }
    }
    public void display()
    {
        System.out.println("The name of the subject is:"+getSubject()+"\nThe name of the Lecturer is:"+getTeacherName()+"\nThe amount of salary is:"+salary);
    }
    public void displayLecturer()
    {
        super.display();
        if (joined=true)
        {
            System.out.println("termination status:"+terminated+"\nThe StartingFrom is:"+startingFrom+"\nThe amount of advance salary is:"+advanceSalary+"\nThe name of teacher is:"+getTeacherName());
        }
    }
}