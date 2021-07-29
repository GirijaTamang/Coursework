
/**
 * Description of class Tutor.
 *
 * @author (Girija Tamang)
 * @londonmetId (18030995)
 */
public class Tutor extends Teacher
{
    private double salary;
    private String appointedDate;
    private  String evaluationPeriod;
    private String terminationDate;
    private String qualification;
    private String appointedBy ;
    private boolean joined;
    public Tutor(String subject,String interviewerName,int classPerDay,double Salary,String appointedBy,String terminationDate)
    {
        super(subject,classPerDay,interviewerName);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.appointedDate=("");
        this.evaluationPeriod=("");
        this.qualification=("");
        this.joined=false;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getAppointedDate()
    {
        return appointedDate;
    }
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    public String getTerminationDate()
    {
        return terminationDate;
    }
    public String getQualification()
    {
        return qualification;
    }
    public String getAppointedBy()
    {
        return appointedBy;
    }
    public boolean getJoined()
    {
        return joined;
    }
    public void salary(double newSalary)
    {
        if(joined==false)
        {
            this.salary=newSalary;
        }
        else
        {
            System.out.println("We cannot change the salary");
        }
    }
    public void appointTutor(String tutorName,String appointedBy,String terminationDate,String qualification)
    {
        if (joined==false)
        {
            super.setTeacherName(tutorName);
            joined=true;
        }
        else
        {
            System.out.println("The tutor has already appointed");
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.qualification=qualification;
        }
    }
        public void displayTutor()
    {
        //calling parents class display
        super.display();
        if (joined==true)
        {
            System.out.println("Appointed date is:"+appointedDate);
            System.out.println("Name of the tutor is:"+getTeacherName());
            System.out.println("The peroid of evaluation is:"+evaluationPeriod);
            System.out.println("The date of termination is:"+terminationDate);
            System.out.println("The salary of tutor is:"+salary);
            System.out.println("The qualification of tutor is:"+qualification);
            System.out.println("The tutor appointed by"+appointedBy);
        }
    }
}

    