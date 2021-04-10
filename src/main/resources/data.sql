INSERT INTO doc (id, version, code, name) VALUES (1, 1, 'pas', 'Паспорт РФ');
INSERT INTO doc (id, version, code, name) VALUES (2, 1, 'zagran', 'Загран-паспорт РФ');
INSERT INTO doc (id, version, code, name) VALUES (3, 1, 'lic', 'Права на управление транспортным средством');
INSERT INTO doc (id, version, code, name) VALUES (4, 1, 'lic_int', 'Международные права на управление транспортным средством');
INSERT INTO doc (id, version, code, name) VALUES (5, 1, 'usa_id', 'USA ID Card');

INSERT INTO country (id, version, code, name) VALUES (1, 1, 'ru', 'Россия');
INSERT INTO country (id, version, code, name) VALUES (2, 1, 'uk', 'Украина');
INSERT INTO country (id, version, code, name) VALUES (3, 1, 'de', 'Германия');
INSERT INTO country (id, version, code, name) VALUES (4, 1, 'usa', 'США');
INSERT INTO country (id, version, code, name) VALUES (5, 1, 'gd', 'Гондурас');

INSERT INTO organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (1, 1, 'Рога и Копыта', 'ООО "Рога и Копыта"', '111111', '1111', 'Нск, ул. Строителей, д.1', '+78008888888', true);
    INSERT INTO office (id, version, org_id, name, address, phone, is_active) VALUES (1, 1, 1, 'Головной оффис', 'Нск, ул. Строителей, д.1', '+78008888888', true);
        INSERT INTO user (id, version, office_id, first_name, second_name, middle_name, position, phone, citizenship_id, is_identified) VALUES (1, 1, 1, 'Иванов', 'Иван', 'Иванович', 'Владелец', '+71234567890', 1, true);
            INSERT INTO user_doc (id, version, doc_id, doc_number, doc_date) VALUES (1, 1, 1, '1234 567890', DATE '2019-01-01');
        INSERT INTO user (id, version, office_id, first_name, second_name, middle_name, position, phone, citizenship_id, is_identified) VALUES (2, 1, 1, 'Петров', 'Пётр', 'Петрович', 'Начальник', '+71234567891', 1, true);
            INSERT INTO user_doc (id, version, doc_id, doc_number, doc_date) VALUES (2, 1, 3, '1234 567891', DATE '2009-10-20');
    INSERT INTO office (id, version, org_id, name, address, phone, is_active) VALUES (2, 1, 1, 'Филлиал', 'Нск, ул. Строителей, д.10', '+78008888889', true);
INSERT INTO organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (2, 1, 'MMM', 'ООО "MMM"', '2222222', '2222', 'Омск, ул. Копателей, д.2', '+78003333333', true);
    INSERT INTO office (id, version, org_id, name, address, phone, is_active) VALUES (3, 1, 2, 'Главкасса', 'Омск, ул. Копателей, д.2', '+78003333333', true);
        INSERT INTO user (id, version, office_id, first_name, second_name, middle_name, position, phone, citizenship_id, is_identified) VALUES (3, 1, 2, 'Сидоров', 'Сидор', 'Сидорович', 'Владелец', '+71234567892', 1, true);
            INSERT INTO user_doc (id, version, doc_id, doc_number, doc_date) VALUES (3, 1, 1, '1234 567892', DATE '2000-04-01');
INSERT INTO organization (id, version, name, full_name, inn, kpp, address, phone, is_active) VALUES (3, 1, 'Microsoft', 'Microsoft Ltd', '3333333', '3333', 'New York', '1111111111', false);
    INSERT INTO office (id, version, org_id, name, address, phone, is_active) VALUES (4, 1, 3, 'Main campus', 'New York', '1111111111', true);
        INSERT INTO user (id, version, office_id, first_name, second_name, middle_name, position, phone, citizenship_id, is_identified) VALUES (4, 1, 4, 'Smith', 'John', 'Roland', 'Субподрядчик', '+11234567890', 4, false);
            INSERT INTO user_doc (id, version, doc_id, doc_number, doc_date) VALUES (4, 1, 5, '987654', DATE '2010-09-11');
