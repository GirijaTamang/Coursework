Select staf.staff_Id, Prsn.Name from Staff Staf join Patient Pt on Staf.Staff_Id = Pt.Patient_Id join Person Prsn on Staf.Staff_Id = Prsn.Person_Id;

