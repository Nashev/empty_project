INSERT INTO House (id, version, address) VALUES (1, 0, 'ул.Цюрупы, 16');
INSERT INTO House (id, version, address) VALUES (2, 0, 'ул.Лунина, 7');

INSERT INTO Person (id, version, first_name, age) VALUES (1, 0, 'Пётр', 20);
INSERT INTO Person (id, version, first_name, age) VALUES (2, 0, 'John', 25);
INSERT INTO Person_House (person_id, house_id) VALUES (1, 1);
INSERT INTO Person_House (person_id, house_id) VALUES (1, 2);

INSERT INTO Doc (id, name) VALUES (1, 'Паспорт РФ');
INSERT INTO Doc (id, name) VALUES (2, 'Загран-паспорт РФ');
INSERT INTO Doc (id, name) VALUES (3, 'Права на управление транспортным средством');
INSERT INTO Doc (id, name) VALUES (4, 'Международные права на управление транспортным средством');
INSERT INTO Doc (id, name) VALUES (5, 'USA ID Card');

INSERT INTO Country (id, name) VALUES (1, 'Россия');
INSERT INTO Country (id, name) VALUES (2, 'Украина');
INSERT INTO Country (id, name) VALUES (3, 'Германия');
INSERT INTO Country (id, name) VALUES (4, 'США');
INSERT INTO Country (id, name) VALUES (5, 'Гондурас');

INSERT INTO Organization (id, name, fullName, inn, kpp, address, phone, isActive) VALUES (1, 'Рога и Копыта', 'ООО "Рога и Копыта"', '111111', '1111', 'Нск, ул. Строителей, д.1', '+78008888888', true);
    INSERT INTO Office (id, orgID, name, address, phone, isActive) VALUES (1, 1, 'Головной оффис', 'Нск, ул. Строителей, д.1', '+78008888888', true);
        INSERT INTO User (id, officeID, firstName, secondName, middleName, position, phone, citizenshipID, isIdentified) VALUES (1, 1, 'Иванов', 'Иван', 'Иванович', 'Владелец', '+71234567890', 1, true);
            INSERT INTO UserDoc (userID, docID, docNumber, docDate) VALUES (1, 1, '1234 567890', DATE '2019-01-01');
            INSERT INTO UserDoc (userID, docID, docNumber, docDate) VALUES (1, 2, '111111', DATE '2020-12-31');
        INSERT INTO User (id, officeID, firstName, secondName, middleName, position, phone, citizenshipID, isIdentified) VALUES (2, 1, 'Петров', 'Пётр', 'Петрович', 'Начальник', '+71234567891', 1, true);
            INSERT INTO UserDoc (userID, docID, docNumber, docDate) VALUES (2, 3, '1234 567891', DATE '2009-10-20');
    INSERT INTO Office (id, orgID, name, address, phone, isActive) VALUES (2, 1, 'Филлиал', 'Нск, ул. Строителей, д.10', '+78008888889', true);
INSERT INTO Organization (id, name, fullName, inn, kpp, address, phone, isActive) VALUES (2, 'MMM', 'ООО "MMM"', '2222222', '2222', 'Омск, ул. Копателей, д.2', '+78003333333', true);
    INSERT INTO Office (id, orgID, name, address, phone, isActive) VALUES (3, 2, 'Главкасса', 'Омск, ул. Копателей, д.2', '+78003333333', true);
        INSERT INTO User (id, officeID, firstName, secondName, middleName, position, phone, citizenshipID, isIdentified) VALUES (3, 2, 'Сидоров', 'Сидор', 'Сидорович', 'Владелец', '+71234567892', 1, true);
            INSERT INTO UserDoc (userID, docID, docNumber, docDate) VALUES (3, 1, '1234 567892', DATE '2000-04-01');
INSERT INTO Organization (id, name, fullName, inn, kpp, address, phone, isActive) VALUES (3, 'Microsoft', 'Microsoft Ltd', '3333333', '3333', 'New York', '1111111111', false);
    INSERT INTO Office (id, orgID, name, address, phone, isActive) VALUES (4, 3, 'Main campus', 'New York', '1111111111', true);
        INSERT INTO User (id, officeID, firstName, secondName, middleName, position, phone, citizenshipID, isIdentified) VALUES (4, 4, 'Smith', 'John', 'Roland', 'Субподрядчик', '+11234567890', 4, false);
            INSERT INTO UserDoc (userID, docID, docNumber, docDate) VALUES (4, 5, '987654', DATE '2010-09-11');
