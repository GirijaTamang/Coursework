Select St.Staff_Id, Pr.Name, Ap.Appointment_Id ,Ap.Appoint_Date, Ap.Treatment_Fee as "Charge" from Staff St join person Pr on St.Staff_Id = Pr.Person_Id  join Appointment Ap on St.Staff_Id = Ap.Patient_Id where St.Staff_Type = ’UnCertified’ and St.Post = 'Doctor' ;