-- Employees with salary > 3000

    SELECT * from employees having salary > 3000

-- Payments with amount > 2000

    SELECT * from payments having amount > 2000

-- Lawyer licenses that won't expire until some given date

    SELECT * from lawyer_licenses having expiration_date > '2025-05-24'

-- Address with a given postal code (could just use where)

    SELECT * from address having postal_code = 3500

-- Court schedules from 2022.

    SELECT * from court_schedules having dateAndTime < '2023/01/01'