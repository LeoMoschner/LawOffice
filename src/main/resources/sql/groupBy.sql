
--Lawyers group by Licenses.

    SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
            JOIN employees em ON em.id_Employees = lic.id_Employees group by id_LawyerLicences

--Lawyers group by salary

    SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
            JOIN employees em ON em.id_Employees = lic.id_Employees group by salary

--All Employees group by salary

      SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
            RIGHT JOIN employees em ON em.id_Employees = lic.id_Employees group by salary

--Address group by country Id

      SELECT ad.id_Address, ad.postal_code, ad.street_name, ad.street_number, cit.name, coun.name FROM address ad
             JOIN cities cit ON cit.id_Cities = ad.Cities_id_Cities
             JOIN country coun ON coun.id_Country = cit.Country_id_Country group by Country_id_Country;

--Cases group by Judge id

      SELECT cas.id_Cases, cas.name, cas.defendant, cou.name, jud.first_name, jud.last_name FROM cases cas
             JOIN courts cou ON cou.id_Courts = cas.Courts_id_Courts
             JOIN judge jud ON jud.id_Judge = cas.Judge_id_Judge group by Judge_id_Judge;
