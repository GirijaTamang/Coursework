Select St. Staff_Id, Pr. Name, Ap. Appointment_Id, Ap. Appoint_Date, Ap. Treatment_Fee as "Amount" from Staff St join Person Pr on St.Staff_Id = Pr. Person_Id join Appointment Ap on St.Staff_Id=Ap.Staff_Id where St. Staff_Id = 'P500' ;