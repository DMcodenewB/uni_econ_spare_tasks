use lab5

-- zad 1

select zw.Id_zawodnik, zw.Nazwisko, kon.Dystans, (kon.Data) as Miesiac
from grupa2.konkurencja as kon inner join grupa2.zawodnik zw on zw.Id_zawodnik = kon.Id_zawodnik
where upper(kon.Konkurencja)='SZTAFETA' and kon.Dystans=400 and month(kon.Data)=2

--zad 2

select max(kon.Dystans)
from grupa2.konkurencja as kon inner join grupa2.zawodnik zw on zw.Id_zawodnik = kon.Id_zawodnik
where kon.Dystans is not null
having count(kon.Id_zawodnik) > 0

--zad 3

select distinct zw.Nazwisko, zw.Klub
from grupa2.konkurencja as kon inner join grupa2.zawodnik as zw on zw.Id_zawodnik = kon.Id_zawodnik
where zw.Plec='K' and zw.Klub='Stokrotka' and kon.Ciê¿ar < 95 and kon.Ciê¿ar is not null

--zad 4

select count(zw.Id_zawodnik)
from grupa2.zawodnik as zw

--zad 5

select distinct zw.Nazwisko, zw.Klub
from grupa2.konkurencja as kon inner join grupa2.zawodnik as zw on zw.Id_zawodnik = kon.Id_zawodnik
where kon.Ciê¿ar between 90 and 130