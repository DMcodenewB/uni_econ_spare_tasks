use AdventureWorks2016
go

--zad 1

select he.LoginID, he.SickLeaveHours
from HumanResources.Employee as he

--zad 2

select avg(he.SickLeaveHours)
from HumanResources.Employee as he

--zad 3

select he.LoginID, he.SickLeaveHours, 
(select avg(SickLeaveHours) from HumanResources.Employee) as AvgSickLeaveHours
from HumanResources.Employee as he

--zad 4

select he.LoginID, he.SickLeaveHours, 
(select avg(SickLeaveHours) from HumanResources.Employee) as AvgSickLeaveHours,
SickLeaveHours - (select avg(SickLeaveHours) from HumanResources.Employee) as SickLeaveDiff
from HumanResources.Employee as he

--zad 5
select he.LoginID, he.SickLeaveHours, 
(select avg(SickLeaveHours) from HumanResources.Employee) as AvgSickLeaveHours,
SickLeaveHours - (select avg(SickLeaveHours) from HumanResources.Employee) as SickLeaveDiff
from HumanResources.Employee as he
where SickLeaveHours > (select avg(SickLeaveHours) from HumanResources.Employee)
order by SickLeaveDiff desc

--zad dodatkowe

select sal.BusinessEntityID, sal.Bonus
from Sales.SalesPerson as sal
where sal.Bonus = (select Bonus from Sales.SalesPerson as sal where sal.BusinessEntityID=280)


--tajne/poufne

use lab5

--zad 1

select wydz.Nazwa, avg(pr.Wynagrodzenie) as ŒrPensja, count(pr.Id_pracownika) as liczbaPr
from gr1.Pracownik as pr inner join gr1.Wydzial as wydz on pr.Id_wydzial = wydz.Id_wydzial
group by wydz.Nazwa
having count(pr.Id_pracownika) > 2

--zad 2

select pr.Nazwisko, pr.Stanowisko, pr.Wynagrodzenie*12 as Roczna
from gr1.Pracownik as pr
where upper(pr.Stanowisko)='PROGRAMISTA' and pr.Wynagrodzenie*12 <= 25000

--zad 3

select pr.Nazwisko, pr.Stanowisko, pr.Wynagrodzenie
from gr1.Pracownik as pr inner join gr1.Wydzial as wy on pr.Id_wydzial = wy.Id_wydzial
where wy.Nazwa='Ksiegowosc' and (pr.Wynagrodzenie between 3000 and 4000)

--zad 4

select count(pr.Id_pracownika)
from gr1.Pracownik as pr
where pr.Id_wydzial is not null

--zad 5 

select pr.Id_pracownika, pr.Nazwisko, pr.Data_zatrudnienia, wy.Nazwa
from gr1.Pracownik as pr inner join gr1.Wydzial as wy on pr.Id_wydzial = wy.Id_wydzial
where year(pr.Data_zatrudnienia) >= 2016 and wy.Nazwa='Zarzadzanie'