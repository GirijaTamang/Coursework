/**
 * InformaticCollege develop a gui system that stores  details  of  teachers .
 *
 * @author (Girija Tamang)
 * @Londonmet ID (18030995)
 */
//importing java utilities
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InformaticCollege
{
    //declaration of frame ,textfield and button
    JFrame frame;
  
    JTextField txtSubject;
    JTextField txtInterviewerName;
    JTextField txtClassPerDay;
    JTextField txtSalary;
    JTextField txtAppointedBy;
    JTextField txtTerminationDate;
    JTextField txtTeacherNumber;
    JTextField txtTeacherName;
    JTextField txtAppointedDate;
    JTextField TerminationDatetxt;
    JTextField txtQualification;
    
    JTextField fldSubject;
    JTextField fldInterviewerName;
    JTextField fldClassPerDay;
    JTextField fldSalary;
    JTextField fldDailyWorkingHour;
    JTextField fldTeacherNumber;
    JTextField fldTeacherName;
    JTextField fldStartingDate;
    JTextField fldAdvanceSalary;
    JTextField fldAcademicBlockNumber;
    
    JButton btnAddSubjectTutor;
    JButton btnHireTutor;
    JButton btnAddSubjectLecturer;
    JButton btnHireLecturer;
    JButton btnTermination;
    JButton btnDisplay;
    JButton btnClear;
    
    ArrayList<Teacher> Data= new ArrayList();//Array list  named Dataa created.
    
    public InformaticCollege(){
        frame= new JFrame("Teacher Appointment System");
        frame.setSize(1300,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
      
        JLabel lblTutor=new JLabel("~*~*~* Tutor Appointment *~*~*~");//it only show the tutor appoint label in gui
        lblTutor.setBounds(5,15,500,40);
        frame.add(lblTutor);
      
        JLabel subjectLbl=new JLabel("Subject:");//adding label name subject
        subjectLbl.setBounds(15,65,300,40);
        frame.add(subjectLbl);
        txtSubject=new JTextField();//addiing text field for subject
        txtSubject.setBounds(200,65,350,35);
        frame.add(txtSubject);
      
        
        JLabel interviewerLbl=new JLabel("Interviewer's Name:");
        interviewerLbl.setBounds(15,110,300,40);
        frame.add(interviewerLbl);
        txtInterviewerName=new JTextField();
        txtInterviewerName.setBounds(200,110,350,35);
        frame.add(txtInterviewerName);
      
      
        JLabel appointLbl=new JLabel("Appointed By:");
        appointLbl.setBounds(15,155,300,40);
        frame.add(appointLbl);
        txtAppointedBy=new JTextField();
        txtAppointedBy.setBounds(200,155,350,35);
        frame.add(txtAppointedBy);
      
      
        JLabel classLbl=new JLabel("Class Per Day:");
        classLbl.setBounds(600,65,300,40);
        frame.add(classLbl);
        txtClassPerDay=new JTextField();
        txtClassPerDay.setBounds(720,65,200,35);
        frame.add(txtClassPerDay);
      
      
        JLabel salaryLbl=new JLabel("Salary:");
        salaryLbl.setBounds(600,110,300,40);
        frame.add(salaryLbl);
        txtSalary=new JTextField();
        txtSalary.setBounds(720,110,200,35);
        frame.add(txtSalary);
      
      
        JLabel terminationDateLbl=new JLabel("Termination Date:");
        terminationDateLbl.setBounds(600,155,300,40);
        frame.add(terminationDateLbl);
        txtTerminationDate=new JTextField();
        txtTerminationDate.setBounds(720,155,200,35);
        frame.add(txtTerminationDate);
      
       //Adding button name Add Subject in Frame 
        btnAddSubjectTutor = new JButton();
        btnAddSubjectTutor.setText("Add Subject");
        btnAddSubjectTutor.setBounds(950,180,200,40);
        frame.add(btnAddSubjectTutor);
        //adding action listener in button Tutor    
        btnAddSubjectTutor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String subject=txtSubject.getText();
            String interviewerName= txtInterviewerName.getText();
            String classPerDay=txtClassPerDay.getText();
            String salary=txtSalary.getText();
            String terminationDate=txtTerminationDate.getText();
            String appointedBy=txtAppointedBy.getText();
            if(subject.equals("")|| interviewerName.isEmpty()|| appointedBy.isEmpty()|| 
            terminationDate.isEmpty()|| classPerDay.isEmpty() || salary.isEmpty()){
                JOptionPane.showMessageDialog(frame,"** Please input data in  fields  completedly. **",
                "NonValid!!!",JOptionPane.WARNING_MESSAGE);
            }
            else{
                 try{    
                     int ClassPerDay = Integer.parseInt(txtClassPerDay.getText());
                     double Salary = Double.parseDouble(txtSalary.getText());
                     Tutor tutor = new Tutor(subject,interviewerName,ClassPerDay,Salary,appointedBy,terminationDate);
                     Data.add(tutor);
                     JOptionPane.showMessageDialog(frame,"Tutor Successfully added in ArrayList.","Congratulation!!!",
                     JOptionPane.INFORMATION_MESSAGE);
                     txtSubject.setText(null);
                     txtInterviewerName.setText(null);
                     txtClassPerDay.setText(null);
                     txtSalary.setText(null);
                     txtAppointedBy.setText(null);
                     txtTerminationDate.setText(null);
                 }
                 catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(frame,"** Please Enter Suitable Data Format ** .","Invalid!!",
                        JOptionPane.WARNING_MESSAGE);
                    }
            }
               
            }       
        }); 
        
        JLabel teacherNoLbl=new JLabel("Teacher Number:");
        teacherNoLbl.setBounds(15,250,300,40);
        frame.add(teacherNoLbl);
        txtTeacherNumber=new JTextField();
        txtTeacherNumber.setBounds(200,250,200,35);
        frame.add(txtTeacherNumber);
      
      
        JLabel appointDateLbl=new JLabel("Appointed Date:");
        appointDateLbl.setBounds(15,295,300,40);
        frame.add(appointDateLbl);
        txtAppointedDate=new JTextField();
        txtAppointedDate.setBounds(200,295,250,35);
        frame.add(txtAppointedDate);
      
        
        JLabel qualificationLbl=new JLabel("Qualification:");
        qualificationLbl.setBounds(15,340,300,40);
        frame.add(qualificationLbl);
        txtQualification=new JTextField();
        txtQualification.setBounds(200,340,350,35);
        frame.add(txtQualification);
      
        
        JLabel teacherLbl=new JLabel("Teacher Name:");
        teacherLbl.setBounds(600,250,300,40);
        frame.add(teacherLbl);
        txtTeacherName=new JTextField();
        txtTeacherName.setBounds(720,250,350,35);
        frame.add(txtTeacherName);
      
        
        JLabel terminationLbl=new JLabel("Termination Date:");
        terminationLbl.setBounds(600,295,300,40);
        frame.add(terminationLbl);
        TerminationDatetxt=new JTextField();
        TerminationDatetxt.setBounds(720,295,200,35);
        frame.add(TerminationDatetxt);
      
      //Adding Hiring Button  for tutor  
        btnHireTutor= new JButton("Hire");
        btnHireTutor.setBounds(980,350,100,40);
        frame.add(btnHireTutor);
        btnHireTutor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String teachernumber=txtTeacherNumber.getText();
            String teachername= txtTeacherName.getText();
            String appointeddate=txtAppointedDate.getText();
            String terminationdate=TerminationDatetxt.getText();
            String qualification=txtQualification.getText();
            if(teachernumber.isEmpty()||teachername.isEmpty()|| appointeddate.isEmpty()|| terminationdate.isEmpty()||
            qualification.isEmpty()){
                JOptionPane.showMessageDialog(frame,"** Please input data in  fields  completedly. **","NonValid!!!",
                JOptionPane.WARNING_MESSAGE);
            }
           else{ 
                try{
                    int TeacherNumber=Integer.parseInt(teachernumber);
                    if(TeacherNumber>=Data.size() || TeacherNumber<0){
                        JOptionPane.showMessageDialog(frame ,"Please Enter Correct Teacher Number","Error",
                        JOptionPane.ERROR_MESSAGE);

                    }
                    else{
                        Tutor tutor = (Tutor)Data.get(TeacherNumber);
                        tutor.appointTutor(teachername,appointeddate,terminationdate,qualification);
                        JOptionPane.showMessageDialog(frame,"Hiring tutor sucessfully Done ","Information",
                        JOptionPane.INFORMATION_MESSAGE);
                        txtTeacherNumber.setText(null);
                        txtTeacherName.setText(null);
                        txtAppointedDate.setText(null);
                        TerminationDatetxt.setText(null);
                        txtQualification.setText(null);
                    }
                }

                catch(NumberFormatException Error){
                    JOptionPane.showMessageDialog(frame,"Number Format Exception ","Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(ClassCastException Error){
                    JOptionPane.showMessageDialog(frame,"Tutor Not Found","Error",JOptionPane.ERROR_MESSAGE);
                }
           }
           }
         });
     
         JLabel  lecturerLbl=new JLabel("~*~*~* Lecturer Appointment *~*~*~");
         lecturerLbl.setBounds(5,425,500,40);
         frame.add(lecturerLbl);
      
      
         JLabel lblSubject=new JLabel("Subject:");
         lblSubject.setBounds(15,470,300,40);
         frame.add(lblSubject);
         fldSubject=new JTextField();
         fldSubject.setBounds(200,470,350,35);
         frame.add(fldSubject);
        
      
         JLabel lblInterviewer=new JLabel("Interviewer's Name:");
         lblInterviewer.setBounds(15,515,300,40);
         frame.add(lblInterviewer);
         fldInterviewerName=new JTextField();
         fldInterviewerName.setBounds(200,515,350,35);
         frame.add(fldInterviewerName);
        
      
         JLabel lblDailyWorkingHour=new JLabel("Daily Working Hour:");
         lblDailyWorkingHour.setBounds(15,560,300,40);
         frame.add(lblDailyWorkingHour);     
         fldDailyWorkingHour=new JTextField();
         fldDailyWorkingHour.setBounds(200,560,200,35);
         frame.add(fldDailyWorkingHour);
        
      
         JLabel lblClass=new JLabel("Class Per Day:");
         lblClass.setBounds(600,470,300,40);
         frame.add(lblClass);
         fldClassPerDay=new JTextField();
         fldClassPerDay.setBounds(720,470,200,35);
         frame.add(fldClassPerDay);
      
        
         JLabel lblSalary=new JLabel("Salary:");
         lblSalary.setBounds(600,515,300,40);
         frame.add(lblSalary);
         fldSalary=new JTextField();
         fldSalary.setBounds(720,515,200,35);
         frame.add(fldSalary);
        
         //Adding Subject Button for Lecturer
        btnAddSubjectLecturer = new JButton("Add Subject");
        btnAddSubjectLecturer.setBounds(950,580,200,40);
        frame.add(btnAddSubjectLecturer);
        btnAddSubjectLecturer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String subject=fldSubject.getText();
            String interviewerName= fldInterviewerName.getText();
            String classPerDay=fldClassPerDay.getText();
            String salary=fldSalary.getText();
            String dailyworkinghour=fldDailyWorkingHour.getText();
                
            if(subject.isEmpty()|| interviewerName.isEmpty()|| classPerDay.isEmpty()|| salary.isEmpty()|| 
            dailyworkinghour.isEmpty()){
                JOptionPane.showMessageDialog(frame,"** Please fiil up data in txt fields  completedly. **",
                "NonValid!!!",JOptionPane.WARNING_MESSAGE);
            }
            else{
                 try{    
                     int ClassPerDay = Integer.parseInt(classPerDay);
                     double Salary = Double.parseDouble(salary);
                     int DailyWorkingHour=Integer.parseInt(fldDailyWorkingHour.getText());
                     Lecturer lecturer = new Lecturer(subject,ClassPerDay,interviewerName,Salary,DailyWorkingHour);
                     Data.add(lecturer);
                     JOptionPane.showMessageDialog(frame,"Lecturer Successfully added in ArrayList.","Congratulation!!!"
                     ,JOptionPane.INFORMATION_MESSAGE);
                     fldSubject.setText(null);
                     fldInterviewerName.setText(null);
                     fldClassPerDay.setText(null);
                     fldSalary.setText(null);
                     fldDailyWorkingHour.setText(null);
                       
                    }
                    catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(frame,"** Please Enter Suitable Data Format ** .","Invalid!!",
                        JOptionPane.WARNING_MESSAGE);
                    }
            }
            }       
        });
      
       
      
        JLabel lblTeacherNo=new JLabel("Teacher Number:");
        lblTeacherNo.setBounds(15,645,300,40);
        frame.add(lblTeacherNo);
        fldTeacherNumber=new JTextField();
        fldTeacherNumber.setBounds(200,645,200,35);
        frame.add(fldTeacherNumber);
        
      
        JLabel lblStartingDate=new JLabel("Starting Date:");
        lblStartingDate.setBounds(15,690,300,40);
        frame.add(lblStartingDate);
        fldStartingDate=new JTextField();
        fldStartingDate.setBounds(200,690,250,35);
        frame.add(fldStartingDate);
        
      
        JLabel lblAcademicBlockNumber=new JLabel("Academic Block Number:");
        lblAcademicBlockNumber.setBounds(15,735,300,40);
        frame.add(lblAcademicBlockNumber);
        fldAcademicBlockNumber=new JTextField();
        fldAcademicBlockNumber.setBounds(200,735,350,35);
        frame.add(fldAcademicBlockNumber);
        
      
        JLabel lblTeacherName=new JLabel("Teacher Name:");
        lblTeacherName.setBounds(600,645,300,40);
        frame.add(lblTeacherName);
        fldTeacherName=new JTextField();
        fldTeacherName.setBounds(720,645,350,35);
        frame.add(fldTeacherName);
        
      
        JLabel lblAdvanceSalary=new JLabel("Advance Salary:");
        lblAdvanceSalary.setBounds(600,690,300,40);
        frame.add(lblAdvanceSalary);
        fldAdvanceSalary=new JTextField();
        fldAdvanceSalary.setBounds(720,690,200,35);
        frame.add(fldAdvanceSalary);
        
        //Adding Hire Button for lecturer
        btnHireLecturer = new JButton("Hire");
        btnHireLecturer.setBounds(720,770,100,40);
        frame.add(btnHireLecturer);
        btnHireLecturer.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           String teacherNumber=fldTeacherNumber.getText();
           String teachername= fldTeacherName.getText();
           String startingdate=fldStartingDate.getText();
           String advancesalary=fldAdvanceSalary.getText();
           String academicblockno=fldAcademicBlockNumber.getText();
           if(teacherNumber.isEmpty()||teachername.isEmpty()|| startingdate.isEmpty()|| advancesalary.isEmpty()||
           academicblockno.isEmpty()){
               JOptionPane.showMessageDialog(frame,"** Please input data in  fields  completedly. **","NonValid!!!",
               JOptionPane.WARNING_MESSAGE);
             }
           else{ 
                try{
                    int Teachernumber=Integer.parseInt(teacherNumber);
                    double AdvanceSalary=Double.parseDouble(advancesalary);
                    if(Teachernumber>=Data.size() || Teachernumber<0){
                        JOptionPane.showMessageDialog(frame ,"Please Enter Correct Teacher Number","Error",
                        JOptionPane.ERROR_MESSAGE);

                    }
                    else{
                         Lecturer lecturer = (Lecturer)Data.get(Teachernumber);
                         lecturer.appointLecturer(teachername,startingdate,AdvanceSalary,academicblockno);
                         JOptionPane.showMessageDialog(frame,"Hiring Lecturer sucessfully Done ","Information",
                         JOptionPane.INFORMATION_MESSAGE);
                         fldTeacherNumber.setText(null);
                         fldTeacherName.setText(null);
                         fldStartingDate.setText(null);
                         fldAdvanceSalary.setText(null);
                         fldAcademicBlockNumber.setText(null);
                    }
                }
                catch(NumberFormatException Error){
                    JOptionPane.showMessageDialog(frame,"Number Format Exception ","Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(ClassCastException Error){
                    JOptionPane.showMessageDialog(frame,"Sorry we cannot find Lecturer","Error",JOptionPane.ERROR_MESSAGE);
                }
           }
           }
        });
      
      
        btnTermination = new JButton("Termination");
        btnTermination.setBounds(950,770,150,40);
        frame.add(btnTermination);
        //this button terminates the lecture and remove the lecturer;
        btnTermination.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String teacherno=fldTeacherNumber.getText();
            String teachername= fldTeacherName.getText();
            String startingdate=fldStartingDate.getText();
            String advancesalary=fldAdvanceSalary.getText();
            String academicblockno=fldAcademicBlockNumber.getText(); 
            if(teacherno.isEmpty()||teachername.isEmpty()|| startingdate.isEmpty()|| advancesalary.isEmpty()
            || academicblockno.isEmpty()){
                JOptionPane.showMessageDialog(frame,"** Please input data in  fields  completedly. **","NonValid!!!",
                JOptionPane.WARNING_MESSAGE);
            }
            else{ 
                 try{
                     int teacherNumber=Integer.parseInt(teacherno);
              
                     if(teacherNumber>=Data.size() || teacherNumber<0){
                         JOptionPane.showMessageDialog(frame ,"Please Enter Correct Teacher Number","Error",
                         JOptionPane.ERROR_MESSAGE);

                     }
                     else{
                          Lecturer terlecturer = (Lecturer)Data.get(teacherNumber);
                          terlecturer.lecturerTermination();
                          Data.remove(teacherNumber);
                          JOptionPane.showMessageDialog(frame," Lecturer terminated sucessfully Done ","Information",
                          JOptionPane.INFORMATION_MESSAGE);
                          fldTeacherNumber.setText(null);
                          fldTeacherName.setText(null);
                          fldStartingDate.setText(null);
                          fldAdvanceSalary.setText(null);
                          fldAcademicBlockNumber.setText(null);
                     }
                  }
                  catch(NumberFormatException Error){
                      JOptionPane.showMessageDialog(frame,"Number Format Exception ","Error",JOptionPane.ERROR_MESSAGE);
                  }
                  catch(ClassCastException Error){
                      JOptionPane.showMessageDialog(frame,"Lecturer Not Found","Error",JOptionPane.ERROR_MESSAGE);
                  } 
            }
            }
        });
        
   
      
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(850,900,100,40);
        frame.add(btnDisplay);
        btnDisplay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for (Teacher data:Data){
                    data.display();
                }
            }
        });
      
        btnClear = new JButton("Clear");
        btnClear.setBounds(980,900,100,40);
        frame.add(btnClear);
        btnClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    txtSubject.setText(null);
                    txtInterviewerName.setText(null);
                    txtClassPerDay.setText(null);
                    txtSalary.setText(null);
                    txtAppointedBy.setText(null);
                    txtTerminationDate.setText(null);
                    txtTeacherName.setText(null);
                    txtTeacherNumber.setText(null);
                    txtAppointedDate.setText(null);
                    TerminationDatetxt.setText(null);
                    txtQualification.setText(null);
                    fldSubject.setText(null);
                    fldInterviewerName.setText(null);
                    fldClassPerDay.setText(null);
                    fldSalary.setText(null);
                    fldDailyWorkingHour.setText(null);
                    fldTeacherName.setText(null);
                    fldTeacherNumber.setText(null);
                    fldStartingDate.setText(null);
                    fldAdvanceSalary.setText(null);
                    fldAcademicBlockNumber.setText(null);
                }
        });
      
        frame.setVisible(true);
  
    }
    public static void main(String[]args)
            { 
                new InformaticCollege();
            }
}