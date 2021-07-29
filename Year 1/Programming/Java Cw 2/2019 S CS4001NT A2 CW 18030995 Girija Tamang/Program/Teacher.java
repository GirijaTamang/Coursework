
/**
 * Description of class Teacher .
 *
 * @author (Girija Tamang)
 * @londonmetId (18030995)
 */
public class Teacher
{
    private String subject;
    private String teacherName;
    private String interviewerName;
    private int classesPerDay;
    public Teacher(String subject,int classPerDay,String interviewerName)
    {
        this.subject=subject;
        this.teacherName=("");
        this.interviewerName=interviewerName;
        this.classesPerDay=classesPerDay;
    }
    //getSubject() method returns the subject 
    public String getSubject()
    {
        return subject;
    }
    //getTeacherName() method returns the teachername 
    public String getTeacherName()
    {
        return teacherName;
    }
    //getInterViewerName() method returns the interviewrName 
    public String getInterviewerName()
    {
        return interviewerName;
    }
    //getClassesPerDay() method returns the classesperday
    public int getClassesPerDay()
    {
        return classesPerDay;
    }
    //setTeacherName() method sets the value of the name
    public void setTeacherName(String freshteacherName)
    {
        this.teacherName=freshteacherName;
    }
    public void display()
    {
        System.out.println("Name of the subject :"+subject+"\nThe total class per day:"+classesPerDay);
        System.out.println("\n The interviewer name is"+interviewerName);
        if(teacherName!=(""))
        {
            System.out.println(teacherName);
        }
    }
}

    