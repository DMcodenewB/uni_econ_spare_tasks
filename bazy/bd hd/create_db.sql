-- Skrypt tworzy bazê danych dla ruchu lotniczego na œwiecie. Baza posiada piêæ tabel: Samolot, Pilot, Lotnisko, Lot i Bilet.
-- Schemat diagramu i kolumny tabel s¹ przedstawione na zdjêciu zawartym w folderze

use ZaliczenieBD_181960_HD_Ready
go


--utworzenie tabeli Samolot

create table Samolot(
IdSamolotu int identity(101, 10) not null,
Model varchar(20) not null,
MaksPasa¿erów int not null, --maksymalna liczba pasa¿erów
PojemnoœæBaku int not null, --Pojemnoœæ baku samolotu
MaksPrêdkoœæ int not null, 
DataPrzyjêcia date not null, --data przyjêcia samolotu do s³u¿by
CzyRejsowy bit not null check (CzyRejsowy in (0,1)), --czy samolot jest rejsowy
constraint pk_IdSamolotu primary key(IdSamolotu)
);

--utworzenie tabeli Pilot

create table Pilot(
IdPilota int identity(10, 10) not null,
Nazwisko varchar(30) not null,
P³eæ varchar(1) not null check (P³eæ in ('K','M')),
Wiek int not null,
IloœæGodzinLotu int not null, --iloœæ godzin spêdzonych w powietrzu
constraint pk_IdPilota primary key(IdPilota)
);

--utworzenie tabeli Lotnisko

create table Lotnisko(
IdLotniska int identity(1000, 2) not null,
NazwaLotniska varchar(50) not null,
SkrotLotniska varchar(3) not null,
Kraj varchar(30) not null,
CzyObslugujeRejsowe bit not null check (CzyObslugujeRejsowe in (0,1)),
constraint pk_IdLotniska primary key(IdLotniska)
);

--utworzenie tabeli Lot

create table Lot(
IdLotu int identity(10000, 1) not null,
IdSamolotu int not null,
IdPilota int not null,
DataWylotu date not null,
GodzinaWylotu time(0) not null,
CzasLotu time(0) not null,
IdLotniskoWylotu int not null,
CelLotu varchar(50) not null, --kraj, do którego leci samolot
constraint pk_IdLotu primary key(IdLotu),
constraint fk_IdSamolotu foreign key(IdSamolotu) references Samolot(IdSamolotu),
constraint fk_IdPilota foreign key(IdPilota) references Pilot(IdPilota),
constraint fk_IdLotniskoWylotu foreign key(IdLotniskoWylotu) references Lotnisko(IdLotniska)
);

--utworzenie tabeli Bilet

create table Bilet(
IdBiletu int identity(100000,101) not null,
IdLotu int not null,
Imiê varchar(25) not null, 
Nazwisko varchar(30) not null, 
NrTel varchar(12) not null, 
KrajPochodzenia varchar(25) not null,
constraint pk_IdBiletu primary key(IdBiletu),
constraint fk_IdLotu foreign key(IdLotu) references Lot(IdLotu)
);
