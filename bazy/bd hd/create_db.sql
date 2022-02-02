-- Skrypt tworzy baz� danych dla ruchu lotniczego na �wiecie. Baza posiada pi�� tabel: Samolot, Pilot, Lotnisko, Lot i Bilet.
-- Schemat diagramu i kolumny tabel s� przedstawione na zdj�ciu zawartym w folderze

use ZaliczenieBD_181960_HD_Ready
go


--utworzenie tabeli Samolot

create table Samolot(
IdSamolotu int identity(101, 10) not null,
Model varchar(20) not null,
MaksPasa�er�w int not null, --maksymalna liczba pasa�er�w
Pojemno��Baku int not null, --Pojemno�� baku samolotu
MaksPr�dko�� int not null, 
DataPrzyj�cia date not null, --data przyj�cia samolotu do s�u�by
CzyRejsowy bit not null check (CzyRejsowy in (0,1)), --czy samolot jest rejsowy
constraint pk_IdSamolotu primary key(IdSamolotu)
);

--utworzenie tabeli Pilot

create table Pilot(
IdPilota int identity(10, 10) not null,
Nazwisko varchar(30) not null,
P�e� varchar(1) not null check (P�e� in ('K','M')),
Wiek int not null,
Ilo��GodzinLotu int not null, --ilo�� godzin sp�dzonych w powietrzu
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
CelLotu varchar(50) not null, --kraj, do kt�rego leci samolot
constraint pk_IdLotu primary key(IdLotu),
constraint fk_IdSamolotu foreign key(IdSamolotu) references Samolot(IdSamolotu),
constraint fk_IdPilota foreign key(IdPilota) references Pilot(IdPilota),
constraint fk_IdLotniskoWylotu foreign key(IdLotniskoWylotu) references Lotnisko(IdLotniska)
);

--utworzenie tabeli Bilet

create table Bilet(
IdBiletu int identity(100000,101) not null,
IdLotu int not null,
Imi� varchar(25) not null, 
Nazwisko varchar(30) not null, 
NrTel varchar(12) not null, 
KrajPochodzenia varchar(25) not null,
constraint pk_IdBiletu primary key(IdBiletu),
constraint fk_IdLotu foreign key(IdLotu) references Lot(IdLotu)
);
