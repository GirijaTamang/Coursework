select Pt.Patient_Id, Ap.Appointment_Id, Pr.Name, Ap.Appoint_Date from Patient Pt  join Person Pr on Pt.Patient_Id = Pr.Person_Id join Appointment Ap on Pt.Patient_Id = Ap.Patient_Id where Ap.Appoint_Date ='13-Nov-2019';