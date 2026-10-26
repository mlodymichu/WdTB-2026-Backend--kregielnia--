-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
insert into user_account (email, display_name, role, created_at) values
('aleksandra@student.merito.pl',   'Ola',   'USER',    current_timestamp),
('jakub@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
('firma@example.com',       'FIRMA', 'PARTNER', current_timestamp),
('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);
insert into user_account (email, display_name, role, created_at) values ('kuba@student.merito.pl', 'Kuba', 'USER', '2026-10-26 12:00:00');
insert into user_account (email, display_name, role, created_at) values ('ola@student.merito.pl', 'Ola', 'USER', '2026-10-26 12:00:00');
insert into user_account (email, display_name, role, created_at) values ('igor.osoba@student.merito.pl', 'Igor', 'USER', '2026-10-26 12:00:00');
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).

-- ===== LAB 02 · <tabela 1> =====
insert into products (id_produktu, nazwa_produktu, kategoria_prod, cena, opis_produktu, dostepny)
values
    (1, 'Frytki', 'PRZEKASKI', 12.00, 'Chrupiące złociste frytki', true),
    (2, 'Coca-Cola', 'NAPOJE', 8.50, 'Zimny napój gazowany 0.5l', true),
    (3, 'Piwo Jasne', 'ALKOHOLE', 14.00, 'Świeże piwo beczkowe 0.5l', true);
-- ===== LAB 02 · <tabela 2> =====
insert into bowling_alley (numer_alejki, status, nazwa_toru, czy_dla_dzieci) values (1, 'DOSTEPNY', 'Tor Mistrzów', false);
insert into bowling_alley (numer_alejki, status, nazwa_toru, czy_dla_dzieci) values (2, 'DOSTEPNY', 'Tor Rodzinny', true);
insert into bowling_alley (numer_alejki, status, nazwa_toru, czy_dla_dzieci) values (3, 'ZAJETY', 'Tor VIP', false);
-- ===== LAB 02 · <tabela 3> =====
insert into clients (imie, nazwisko, data_uro, nr_tel, znizka) values ('Jan', 'Kowalski', '1995-05-12', '123456789', 10.00);
insert into clients (imie, nazwisko, data_uro, nr_tel, znizka) values ('Anna', 'Nowak', '1998-09-20', '987654321', 15.50);
insert into clients (imie, nazwisko, data_uro, nr_tel, znizka) values ('Piotr', 'Zieliński', '1988-02-15', '555666777', 5.00);

-- ===== LAB 02 · Footwear =====
insert into footwear (rozmiar, dostepnosc, id_rezerwacji, plec) values (42.0, 'DOSTEPNE', null, 'MESKIE');
insert into footwear (rozmiar, dostepnosc, id_rezerwacji, plec) values (38.5, 'DOSTEPNE', null, 'DAMSKIE');
insert into footwear (rozmiar, dostepnosc, id_rezerwacji, plec) values (34.0, 'WYPOZYCZONE', 1, 'DZIECINCE');

-- ===== LAB 02 · Orders =====
insert into orders (id_produktu, ilosc_produktu, status_zamowienia, data_zamowienia, uwagi) values (1, 2, 'NOWE', '2026-10-26 14:00:00', 'Dużo soli');
insert into orders (id_produktu, ilosc_produktu, status_zamowienia, data_zamowienia, uwagi) values (2, 1, 'DOSTARCZONE', '2026-10-26 14:05:00', 'Z lodem');
insert into orders (id_produktu, ilosc_produktu, status_zamowienia, data_zamowienia, uwagi) values (3, 1, 'W_PRZYGOTOWANIU', '2026-10-26 14:10:00', 'Bez cebuli');

-- ===== LAB 02 · Reservations (Rezerwacje - min. 3 wiersze, 4+ kolumny) =====
insert into reservations (id_toru, timestamp, dane_klienta, status_rezerwacji, id_klienta, id_zamowienia) values (1, '2026-10-27 16:00:00', 'Jan Kowalski', 'POTWIERDZONA', 1, 1);
insert into reservations (id_toru, timestamp, dane_klienta, status_rezerwacji, id_klienta, id_zamowienia) values (2, '2026-10-27 18:00:00', 'Anna Nowak', 'OCZEKUJACA', 2, 2);
insert into reservations (id_toru, timestamp, dane_klienta, status_rezerwacji, id_klienta, id_zamowienia) values (3, '2026-10-28 17:00:00', 'Piotr Zieliński', 'ANULOWANA', 3, 3);
-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

