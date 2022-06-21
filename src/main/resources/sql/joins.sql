--INNER JOIN

    -- ADDRESS INFORMATION WITH CITIES AND COUNTRIES

        SELECT ad.id_Address, ad.postal_code, ad.street_name, ad.street_number, cit.name, coun.name FROM address ad
        JOIN cities cit ON cit.id_Cities = ad.Cities_id_Cities
        JOIN country coun ON coun.id_Country = cit.Country_id_Country;

    -- CASES WITH COURTS AND JUDGES

        SELECT cas.id_Cases, cas.name, cas.defendant, cou.name, jud.first_name, jud.last_name FROM cases cas
        JOIN courts cou ON cou.id_Courts = cas.Courts_id_Courts
        JOIN judge jud ON jud.id_Judge = cas.Judge_id_Judge;

    -- CASES WITH COURTS, JUDGES, AND JURY MEMBERS

        SELECT cas.id_Cases, cas.name, cas.defendant, cou.name, jud.first_name, jud.last_name, jur.first_name, jur.last_name FROM cases cas
        JOIN courts cou ON cou.id_Courts = cas.Courts_id_Courts
        JOIN judge jud ON jud.id_Judge = cas.Judge_id_Judge
        JOIN jury_members jur ON jur.Cases_id_Cases = cas.id_Cases;

    -- CASES WITH CLIENTS (PLAINTIFF) AND DEFENDANT

        SELECT pl.id_Demandent, cli.first_name, cli.last_name, cas.name, cas.defendant from plaintiffies pl
        JOIN clients cli ON cli.id_clients = pl.Clients_id_clients
        JOIN cases cas ON cas.id_Cases = pl.Cases_id_Cases;

    -- ONLY LAWYERS FROM EMPLOYEES WITH THEIR LICENSES

        SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
        JOIN employees em ON em.id_Employees = lic.id_Employees;

--RIGHT JOIN

    -- ALL EMPLOYEES, WITH LICENCES FOR THOSE WHO ARE LAWYERS

        SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
        RIGHT JOIN employees em ON em.id_Employees = lic.id_Employees;

    -- ALL CASES, WITH THEIR CASES DOCS FOR THOSE WHO HAVE SOME

        SELECT cas.id_Cases, cas.name, cas.defendant, cd.description FROM case_docs cd
        RIGHT JOIN cases cas ON cas.id_Cases = cd.Cases_id_Cases;

    -- ALL JUDGES, WITH THEIR COURT SCHEDULE IF THEY HAVE ANY

        SELECT jud.id_Judge, jud.first_name, jud.last_name, cour.name, cs.dateAndTime from court_schedules cs
        RIGHT JOIN courts cour ON cour.id_Courts = cs.id_Courts
        RIGHT JOIN judge jud ON jud.id_Judge = cs.id_Judge;

    -- CITIES AND COUNTRIES WITH CITIES FOR THOSE WHO HAVE SOME.

        SELECT ad.id_Address, ad.postal_code, ad.street_name, ad.street_number, cit.name, coun.name FROM address ad
        RIGHT JOIN cities cit ON cit.id_Cities = ad.Cities_id_Cities
        RIGHT JOIN country coun ON coun.id_Country = cit.Country_id_Country;

    -- ALL JUDGES WITH CASES FOR THOSE WHO HAVE SOME.

        SELECT cas.id_Cases, cas.name, cas.defendant, cou.name, jud.first_name, jud.last_name FROM cases cas
        RIGHT JOIN courts cou ON cou.id_Courts = cas.Courts_id_Courts
        RIGHT JOIN judge jud ON jud.id_Judge = cas.Judge_id_Judge;

--LEFT JOIN

    -- ONLY LAWYERS FROM EMPLOYEES. WITH THEIR LICENSES.

        SELECT em.id_Employees, em.first_name, em.last_name, lic.id_LawyerLicences, lic.expiration_date from lawyer_licenses lic
        LEFT JOIN employees em ON em.id_Employees = lic.id_Employees;

    -- ALL CASES THAT HAVE SOME CASE DOCUMENTS (WITH THOSE DOCUMENTS).

        SELECT cas.id_Cases, cas.name, cas.defendant, cd.description FROM case_docs cd
        LEFT JOIN cases cas ON cas.id_Cases = cd.Cases_id_Cases;

    -- ALL JUDGES THAT HAVE A COURT SCHEDULE.

        SELECT jud.id_Judge, jud.first_name, jud.last_name, cour.name, cs.dateAndTime from court_schedules cs
        LEFT JOIN courts cour ON cour.id_Courts = cs.id_Courts
        LEFT JOIN judge jud ON jud.id_Judge = cs.id_Judge;

    -- ADDRESS INFORMATION WITH CITIES AND COUNTRIES

         SELECT ad.id_Address, ad.postal_code, ad.street_name, ad.street_number, cit.name, coun.name FROM address ad
         LEFT JOIN cities cit ON cit.id_Cities = ad.Cities_id_Cities
         LEFT JOIN country coun ON coun.id_Country = cit.Country_id_Country;

    -- CASES WITH COURTS AND JUDGES

         SELECT cas.id_Cases, cas.name, cas.defendant, cou.name, jud.first_name, jud.last_name FROM cases cas
         RIGHT JOIN courts cou ON cou.id_Courts = cas.Courts_id_Courts
         RIGHT JOIN judge jud ON jud.id_Judge = cas.Judge_id_Judge;