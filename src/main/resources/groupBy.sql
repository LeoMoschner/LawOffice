
--Lawyers group by Licenses.

    SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
            JOIN employees em ON em.id_Employees = lic.id_Employees group by id_LawyerLicences