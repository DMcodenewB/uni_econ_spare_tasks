--zad 1 wyswietl wszystkie produkty--

select * from Produkt;

---zad 2 zlicz wszystkie magazyny--

select count(Nazwa) from Lokalizacja;

--zad 3 zlicz wszystkie czarne produkty--

select count(Nazwa) from Produkt 
where UPPER(Kolor) like 'BLACK';

--zad 4 wyswielt produktid nazwe cene oraz nazwe lokalizacji, gdzie CenaZakupu > 1000, posortowaæ po nazwie magazynu--

select p.ProduktID, p.Nazwa, p.CenaZakupu, l.Nazwa
from Produkt p inner join Inwentarz i on p.ProduktID=i.ProduktID
inner join Lokalizacja l on i.LokalizacjaID=l.LokalizacjaID
where p.CenaZakupu > 1000
order by l.Nazwa;

--zad 5 pokazaæ liczbê produktów w poszczególnych kolorach klasach i stylach --

select Kolor, count(*)
from Produkt
group by Kolor;

select Klasa, count(*)
from Produkt
group by Klasa;

select Styl, count(*)
from Produkt
group by Styl;

-- zad 6 pokazaæ tylko kolory, w których wystêpuje min. 30 produktów --

select Kolor, count(*) as ilosc 
from Produkt
where Kolor is not null
group by Kolor
having count(*) > 30

-- zad 7 pokazaæ kolory, gdzie œrednia cena produktu jest wiêksza od 50 --

select Kolor, avg(Cena) as ŒredniaCena
from Produkt
where Kolor is not null
group by Kolor
having avg(Cena) > 50

-- zad 8 wyœwietl numery produktów których CenaZakupu jest mniejsza od œredniej CenyZakupu --

select NumerProduktu
from Produkt
where CenaZakupu < (select avg(CenaZakupu) from Produkt)

-- zad 9 wyœwietl nazwy produktów, których waga jest wiêksza od œredniej wagi produktów --

select Nazwa
from Produkt
where Waga > (select avg(Waga) from Produkt)

-- zad 10 wyœwietliæ listê nazw magazynów (z aliasem Nazwa Magazynu) --
-- i zliczyæ w nich produkty w kolorze Red i Black, posortuj malej¹co --

select l.Nazwa as "Nazwa Magazynu", p.Kolor, count(*)
from Produkt p inner join Inwentarz i on p.ProduktID=i.ProduktID
inner join Lokalizacja l on i.LokalizacjaID=l.LokalizacjaID
where p.Kolor is not null and p.Kolor in ('Red', 'Black')
group by p.Kolor, l.Nazwa
