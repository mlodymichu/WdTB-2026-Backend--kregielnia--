-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
insert into user_account (email, display_name, role, created_at) values
('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
('kuba@student.merito.pl',  'Oliwier',  'USER',    current_timestamp),
('firma@example.com',       'Igor', 'USER', current_timestamp),
('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).

-- ===== LAB 02 · <tabela 1> =====

-- ===== LAB 02 · <tabela 2> =====

-- ===== LAB 02 · <tabela 3> =====

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

