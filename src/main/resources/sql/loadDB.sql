-- Countries
	INSERT INTO country (`name`) VALUES ('Argentina');
	INSERT INTO country (`name`) VALUES ('Brazil');
	INSERT INTO country (`name`) VALUES ('Russia');
	INSERT INTO country (`name`) VALUES ('Belorus');
	INSERT INTO country (`name`) VALUES ('USA');
	INSERT INTO country (`name`) VALUES ('Germany');
	INSERT INTO country (`name`) VALUES ('Netherlands');
	INSERT INTO country (`name`) VALUES ('Poland');
	INSERT INTO country (`name`) VALUES ('Ukraine');
	INSERT INTO country (`name`) VALUES ('Chile');
	INSERT INTO country (`name`) VALUES ('Sweden');
	INSERT INTO country (`name`) VALUES ('Italy');
	INSERT INTO country (`name`) VALUES ('England');
	INSERT INTO country (`name`) VALUES ('France');

-- Cities
	INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Buenos Aires', '1');
	INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Resistencia', '1');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Cordoba', '1');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Rio', '2');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Sao Paolo', '2');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Floripa', '2');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Mosku', '3');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Stalingrado', '3');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Minsk', '4');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Pinsk', '4');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Miami', '5');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('New York', '5');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Chicago', '5');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Berlin', '6');
	INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Munich', '6');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Frankfurt', '6');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Amsterdam', '7');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Roterdam', '7');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Varsovia', '8');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Cracovia', '8');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Kiev', '9');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Jarkov', '9');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Santiago', '10');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Stockholm', '11');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Malmo', '11');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Roma', '12');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Milan', '12');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Napoles', '12');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('London', '13');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Manchester', '13');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Paris', '14');
    INSERT INTO cities (`name`, `Country_id_Country`) VALUES ('Lille', '14');
	
	
-- Addresses
	INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('8523', 'Random street', '5423', '12');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('2563', 'Palangana', '6452', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('3500', 'Mante', '135', '2');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('2326', 'Termo', '1235', '8');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('3530', 'Esto es Boca', '985', '9');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('9832', 'Mufasa', '645', '10');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1235', 'YSY', '465', '11');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('5423', 'Fakeit', '645', '12');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1238', 'Rofllmao', '654', '23');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('3289', 'uwu avenue', '654', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('5862', 'idk street', '546', '3');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('2315', 'Banana', '202', '4');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1583', 'Apple', '9842', '8');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1268', 'Orange', '4652', '4');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1235', 'Tomatoe', '654', '18');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7552', 'Pear', '651', '30');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('8432', 'Dis a pear', '561', '31');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('6523', 'sponge bob', '654', '25');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4512', 'Cepika', '312', '7');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1318', 'Frula', '561', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1592', 'Lampus', '654', '6');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('9872', 'Larth', '654', '8');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1562', 'Kassa', '112', '12');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1238', 'Coldzera', '483', '21');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7892', 'Luken', '652', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1268', 'Fallenga', '5641', '24');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('9842', 'Sorteados', '561', '29');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4564', 'Jallom', '874', '26');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7465', 'Wedtowl', '945', '27');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('9842', 'Gartik', '59', '25');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1355', 'Heich Morl', '26', '26');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1682', 'Itolati', '12', '22');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('9451', 'Eralp', '1223', '26');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('5466', 'Jewlk', '5423', '12');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('2563', 'Kripm', '6452', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4512', 'Calste', '135', '2');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4862', 'Casttle', '1235', '8');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7982', 'Welmulm', '985', '9');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4562', 'Criups', '645', '10');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1358', 'Aslkee', '465', '11');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7820', 'Ahnseem', '645', '12');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1235', 'Ruilms', '654', '23');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4523', 'Keinton', '654', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4822', 'Wasmenbur', '546', '3');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('8792', 'Lentoun', '202', '4');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7853', 'Klims', '9842', '8');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('3256', 'Teunlo', '4652', '4');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1562', 'Parmins', '654', '18');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('8956', 'Popmeunt', '651', '30');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('465', 'Delention', '561', '31');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4562', 'Speunt', '654', '25');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7820', 'Clasurm', '312', '7');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4582', 'Feltom', '561', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('6482', 'Lemtuis', '654', '6');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('1535', 'Lartinson', '654', '8');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4125', 'Kelmiun', '112', '12');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('4238', 'Calsetom', '483', '21');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('8782', 'Lertom', '652', '5');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7823', 'Foulmen', '5641', '24');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7852', 'Sakasaki', '561', '29');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7823', 'Jenson', '874', '26');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7982', 'Winston', '945', '27');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7892', 'Gerner', '59', '25');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7123', 'Hellmount', '26', '26');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7125', 'Itelme', '12', '22');
    INSERT INTO address (`postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) VALUES ('7823', 'Erasmus', '1223', '26');

    
-- Clients
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Lionel', 'Messi', 'leomessi@gmail.com', '3');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Cristiano', 'Ronaldo', 'cr7@gmail.com', '10');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Rodrigo', 'De Paul', 'messifan@gmail.com', '14');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Kylian', 'Mbappe', 'turtle@gmail.com', '5');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('John', 'Titor', 'timetraveler@gmail.com', '8');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Carles', 'Puyol', 'tarzan@gmail.com', '9');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Angel', 'Di Maria', 'fideokoyima@gmail.com', '30');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Sergio', 'Aguero', 'kuni_kru@gmail.com', '26');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Agustin', 'Orion', 'malalactea@gmail.com', '24');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Roman', 'Riquelme', 'jrr10@gmail.com', '14');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Sadio', 'Mane', 'champion@gmail.com', '15');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Alexander', 'Arnold', 'croasser@gmail.com', '17');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Karim', 'Benzema', 'balondeoro@gmail.com', '21');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Gareth', 'Bale', 'golfit@gmail.com', '22');
    INSERT INTO clients (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Sergio', 'Romero', 'arkeritotime@gmail.com', '16');


-- Employees
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Saul', 'Goodman', 'bettercallsaul@gmail.com', '2135', '2');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Saul', 'Menem', 'bettercallsaul@gmail.com', '4652', '3');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Charles', 'Leclerc', 'bettercallsaul@gmail.com', '1328', '4');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Kim', 'Wexler', 'bettercallsaul@gmail.com', '5642', '5');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Keanu', 'Reaves', 'bettercallsaul@gmail.com', '4562', '6');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Juan', 'Perez', 'bettercallsaul@gmail.com', '5425', '7');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('John', 'Smith', 'bettercallsaul@gmail.com', '8423', '8');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Axel', 'Rose', 'bettercallsaul@gmail.com', '1328', '9');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Saul', 'Hudson', 'bettercallsaul@gmail.com', '3523', '10');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Matt', 'Groening', 'bettercallsaul@gmail.com', '4123', '10');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Cristian', 'Albon', 'bettercallsaul@gmail.com', '3985', '20');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Mark', 'Rusell', 'bettercallsaul@gmail.com', '1328', '19');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('George', 'Mendez', 'bettercallsaul@gmail.com', '4123', '18');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Mel', 'Gibson', 'bettercallsaul@gmail.com', '1238', '17');
    INSERT INTO employees (`first_name`, `last_name`, `email`, `salary`, `Address_id_Address`) VALUES ('Lara', 'Ibanez', 'bettercallsaul@gmail.com', '8423', '16');

-- Lawyer Licenses
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2023-03-02', '1');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2024-02-02', '2');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2025-01-02', '3');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2022-09-02', '4');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2021-10-02', '7');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2022-08-02', '8');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2026-12-02', '9');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2023-11-02', '5');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2023-08-02', '6');
    INSERT INTO lawyer_licenses (`expiration_date`, `id_Employees`) VALUES ('2027-03-02', '10');

-- Judges
    INSERT INTO judge (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('John', 'Telme', 'johnytelm@gmail.com', '23');
    INSERT INTO judge (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Mamu', 'Suarez', 'm4mul4@gmail.com', '25');
    INSERT INTO judge (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Ronnie', 'Coleman', 'b0d1building@gmail.com', '27');
    INSERT INTO judge (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Milton', 'Helm', 'casquitobentz@gmail.com', '30');
    INSERT INTO judge (`first_name`, `last_name`, `email`, `Address_id_Address`) VALUES ('Peter', 'Gerard', 'ampiter@gmail.com', '29');

-- Courts
    INSERT INTO courts (`name`, `Address_id_Address`) VALUES ('Supreme', '16');
    INSERT INTO courts (`name`, `Address_id_Address`) VALUES ('Justice4All', '17');
    INSERT INTO courts (`name`, `Address_id_Address`) VALUES ('Demacia', '18');

-- Courts Schedule
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('1', '5', '2022-06-18');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('2', '4', '2022-07-18');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('3', '3', '2022-06-23');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('3', '2', '2022-08-17');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('2', '1', '2022-10-08');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('1', '1', '2022-12-03');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('2', '2', '2023-08-25');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('3', '3', '2022-05-17');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('2', '4', '2023-01-21');
    INSERT INTO court_schedules (`id_Courts`, `id_Judge`, `dateAndTime`) VALUES ('1', '5', '2023-02-20');

-- Cases
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Bank Robery', 'Marcos Rojo', '1', '1');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Assault', 'Mark Welberg', '2', '4');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Car Crash', 'Carlos Mendez', '3', '2');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Payment', 'Lenies Company', '2', '3');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Scam', 'Joe Ralks', '1', '5');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Hacking', 'Jules Maljys', '3', '1');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Cyber Bullying', 'Dan Jelksen', '2', '2');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Drugs Sell', 'Paco Merkas', '1', '3');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('House Robbery', 'Liam Hellsen', '3', '4');
    INSERT INTO cases (`name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) VALUES ('Store Assault', 'Peter Andoumel', '2', '5');

-- Cases Orders
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('1', '1');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('1', '11');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('2', '2');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('2', '12');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('3', '3');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('3', '13');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('4', '4');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('4', '14');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('5', '5');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('5', '15');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('6', '6');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('6', '16');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('7', '7');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('7', '11');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('8', '8');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('8', '12');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('9', '9');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('9', '13');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('10', '10');
    INSERT INTO case_orders (`Cases_id_Cases`, `Employees_id_Employees`) VALUES ('10', '14');

-- Cases Documents
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'camera record', '1');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'criminal pictures', '1');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'criminal interview', '1');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'pictures', '2');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'video camera record', '2');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'witness statement', '2');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'car2 pictures', '3');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'policeman statement', '3');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'car1 pictures', '3');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'last receipts', '4');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'work contract', '4');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'telegram conversation', '4');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'fake website', '5');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'defendant info', '5');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'bank transfers', '5');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'defendants hard disk copy', '6');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'script', '6');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'client hard disk copy', '6');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'instagram conversation', '7');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'whatsapp chat', '7');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'threating pictures', '7');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'defendant pictures selling', '8');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'drugs pictures', '8');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'customer statement', '8');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'house camera record', '9');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'door lock pictures', '9');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'pictures before and after the crime', '9');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 1', 'store camera record', '10');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 2', 'register case activity', '10');
    INSERT INTO case_docs (`name`, `description`, `Cases_id_Cases`) VALUES ('Proofs 3', 'store employee statement', '10');

-- Jury Members
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Antonio', 'Banderas', 'antony@hotmail.com', '34', '1');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Marcos', 'Rulken', 'Marki@hotmail.com', '35', '1');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Mateo', 'Barrol', 'Mates@hotmail.com', '36', '1');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Guillermo', 'Franchela', 'guiller@hotmail.com', '37', '1');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Clarisa', 'Reglar', 'clariart@hotmail.com', '38', '2');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Steff', 'Ierrot', 'ztf@hotmail.com', '39', '2');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Jeb', 'Bezos', 'amazon@hotmail.com', '40', '2');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Jason', 'Chained', 'jasonm@hotmail.com', '41', '2');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Luciano', 'Lenceira', 'luc1@hotmail.com', '42', '3');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Lucian', 'Smithson', 'adc@hotmail.com', '43', '3');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Franco', 'Estebanez', 'frekn@hotmail.com', '44', '3');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Frank', 'Sinatra', 'frank2@hotmail.com', '45', '3');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Santiago', 'Rutelson', 'sant1@hotmail.com', '46', '4');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Melina', 'Neiger', 'melania@hotmail.com', '47', '4');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Florencia', 'Relao', 'pote@hotmail.com', '48', '4');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Nahir', 'Forrenson', 'nanus@hotmail.com', '49', '4');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Rocio', 'Star', 'rocs@hotmail.com', '50', '5');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Fatima', 'Fleita', 'otako@hotmail.com', '51', '5');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Sol', 'Mendez', 'solny@hotmail.com', '52', '5');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Jazmin', 'Apa', 'jazms@hotmail.com', '53', '5');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Juan', 'Ipa', 'jonhynbirra@hotmail.com', '54', '6');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Joaquin', 'Hoppy', 'joaqking@hotmail.com', '55', '6');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Joseph', 'Mouringho', 'mou@hotmail.com', '56', '6');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Jose', 'Astermo', 'astjose@hotmail.com', '57', '6');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Julian', 'Alvarez', 'alvjul@hotmail.com', '58', '7');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Agustin', 'Marken', 'agusmark@hotmail.com', '59', '7');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Ignacio', 'Keiner', 'nach1t0@hotmail.com', '60', '7');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Sebastian', 'Oslom', 'sebolm@hotmail.com', '61', '7');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Rodrigo', 'Relson', 'rodr1@hotmail.com', '62', '8');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Santiago', 'Putin', 'sant1puts@hotmail.com', '63', '8');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Nicolas', 'Merkel', 'nicomerkel@hotmail.com', '64', '8');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Nikola', 'Falos', 'nik0fal@hotmail.com', '65', '8');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Fernando', 'Ruf', 'fertuf@hotmail.com', '66', '9');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Mauricio', 'Pochetino', 'mourice@hotmail.com', '67', '9');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Marina', 'Ruffalo', 'Marinelm@hotmail.com', '68', '9');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Silvina', 'Johnson', 'silv@hotmail.com', '2', '9');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Viviana', 'Machu', 'v1v1@hotmail.com', '3', '10');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Cecilia', 'Gutierrez', 'c3c1@hotmail.com', '4', '10');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Raquel', 'Espindola', 'reichel@hotmail.com', '5', '10');
    INSERT INTO jury_members (`first_name`, `last_name`, `email`, `Address_id_Address`, `Cases_id_Cases`) VALUES ('Teo', 'Moschner', 'teod0r0@hotmail.com', '6', '10');

-- Receipts
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Lionel Messi', 'Law office', '1234', '2022-05-15');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Cristiano Ronaldo', 'Law office', '4523', '2021-10-17');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Rodrigo De Paul', 'Law office', '7823', '2021-11-05');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Angel Di Maria', 'Law office', '8226', '2021-11-25');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('John Titor', 'Law office', '8823', '2021-12-13');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Law Office', 'Saul Goodman', '4543', '2022-01-12');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Law Office', 'Saul Menem', '1325', '2022-01-11');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Law Office', 'Kim Wexler', '2356', '2022-04-07');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Law Office', 'Charles Leclerc', '4523', '2022-03-20');
    INSERT INTO receipts (`from`, `to`, `amount`, `date`) VALUES ('Law Office', 'Mel Gibson', '1235', '2022-04-22');

-- Payments
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `Clients_id_clients`) VALUES ('1234', '2022-05-15', '9', '1');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `Clients_id_clients`) VALUES ('4523', '2021-10-17', '10', '2');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `Clients_id_clients`) VALUES ('7823', '2021-11-05', '11', '3');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `Clients_id_clients`) VALUES ('8226', '2021-11-25', '12', '7');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `Clients_id_clients`) VALUES ('8823', '2021-12-13', '13', '5');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `id_Employees`) VALUES ('4543', '2022-01-12', '14', '2');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `id_Employees`) VALUES ('1325', '2022-01-11', '15', '3');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `id_Employees`) VALUES ('2356', '2022-04-07', '16', '5');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `id_Employees`) VALUES ('4523', '2022-03-20', '17', '4');
    INSERT INTO payments (`amount`, `date`, `Receipts_id_Receipts`, `id_Employees`) VALUES ('1235', '2022-04-22', '18', '15');

-- Plaintiffs
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('1', '1');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('3', '1');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('5', '1');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('2', '2');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('2', '3');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('4', '4');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('6', '5');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('6', '6');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('7', '7');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('8', '7');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('7', '8');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('8', '8');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('9', '9');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('10', '9');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('11', '10');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('12', '10');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('13', '10');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('14', '10');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('15', '10');
    INSERT INTO plaintiffies (`Clients_id_clients`, `Cases_id_Cases`) VALUES ('15', '9');


