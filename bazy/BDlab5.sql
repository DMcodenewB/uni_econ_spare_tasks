--Shematy bazy danych
use lab_temp;
go
create schema Sale;
go
CREATE TABLE Sale.Product (
	Id_Product int IDENTITY (1,1),
	Name varchar(30),
	Price money,
	[Date] date
	);
--Dodawanie kolumny
Alter table Sale.Product
add Color varchar(20);

--usuniêcie
Alter table Sale.Product
drop column Color;

--klucz podstawowy
Alter table Sale.Product
Add constraint pk_product primary key(ID_Product);

--dodanie klucza podstawowego podczas tworzenia tabeli
create table Sale.Product (
	Id_Product int identity (100,1) 
				constraint pk_product primary key (Id_Product),
	Name varchar(15) not null
	);
	--Kompozytowe klucze podstawowe (nadane na wiêcej ni¿ jednej kolumnie)
	Create table Sale.Klient(
		Nazwisko varchar(20),
		Imie varchar(20),
		Data_ur date,
		constraint pk_znajomi primary key (Nazwisko,Imie)
		);

--KLucz obcy
Use lab_temp
go
create schema Produkcja;
go
create table Produkcja.Czesci(
	Id_czesci identity (10,1),
	Nazwa varchar(50),
	Opis varchar(255)
	);
Alter table Produkcja.Czesci
Add IDTowaru int references Produkcja.Towary;

--Widoki, view
use AdventureWorksLT2012;
go
create view SalesLT.Vidok
as
select ProductID, ProductNumber, ListPrice
from SalesLT.Product
where SellEndDate is null;
use AdventureWorksLT2012;
select top 10 *
from SalesLT.Vidok
order by ListPrice desc;
