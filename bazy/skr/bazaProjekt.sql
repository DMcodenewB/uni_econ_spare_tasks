use ZaliczenieBD_181960
go

--utworzenie tabeli Pasażer

create table Pasażer(
IdPasażera int identity(1,1) not null,
Imię varchar(25) not null,
Nazwisko varchar(30) not null,
NrTel varchar(12) not null,
KrajPochodzenia varchar(25) not null,
constraint pk_IdPasażera primary key(IdPasażera)
);

--utworzenie tabeli Samolot

create table Samolot(
IdSamolotu int identity(101, 10) not null,
Model varchar(20) not null,
MaksPasażerów int not null,
PojemnośćBaku int not null,
MaksPrędkość int not null,
DataPrzyjęcia date not null,
CzyRejsowy bit not null check (CzyRejsowy in (0,1)),
constraint pk_IdSamolotu primary key(IdSamolotu)
);

--utworzenie tabeli Pilot

create table Pilot(
IdPilota int identity(10, 10) not null,
Nazwisko varchar(30) not null,
Płeć varchar(1) not null check (Płeć in ('K','M')),
Wiek int not null,
IlośćGodzinLotu int not null,
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
GodzinaWylotu time not null,
CzasLotu time not null,
IdLotniskoWylotu int not null,
CelLotu varchar(50) not null,
constraint pk_IdLotu primary key(IdLotu),
constraint fk_IdSamolotu foreign key(IdSamolotu) references Samolot(IdSamolotu),
constraint fk_IdPilota foreign key(IdPilota) references Pilot(IdPilota),
constraint fk_IdLotniskoWylotu foreign key(IdLotniskoWylotu) references Lotnisko(IdLotniska)
);

--utworzenie tabeli Bilet

create table Bilet(
IdBiletu int identity(100000,101) not null,
IdPasażera int not null,
IdLotu int not null,
constraint pk_IdBiletu primary key(IdBiletu),
constraint fk_IdPasażera foreign key(IdPasażera) references Pasażer(IdPasażera),
constraint fk_IdLotu foreign key(IdLotu) references Lot(IdLotu)
);