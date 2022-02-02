use ZaliczenieBD_181960
go

--dodanie samolotów

insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Boeing 737',215,37900,879,'2010-07-05',1);
insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Boeing 777',277,49200,885,'2019-04-21',1);
insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Boeing 767',366,49300,673,'1996-02-29',1);
insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Boeing 787',237,38200,803,'2008-02-07',1);
insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Airbus A220',355,49100,690,'2001-09-16',1);
insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Airbus A300',151,24700,817,'2019-01-17',0);
insert into Samolot(Model,MaksPasa¿erów,PojemnoœæBaku,MaksPrêdkoœæ,DataPrzyjêcia,CzyRejsowy) values ('Airbus A318',236,38400,812,'2009-02-20',1);

--dodanie lotnisk

insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('San Francisco, CA','USA','QSF-All',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Mao, Minorca','Spain','MAH',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Melbourne, Vic.','Australia','AVV',1);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Edmonton, AB','Canada','YEG',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Narrabri, N.S.W.','Australia','NAA',1);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Port Macquarie, N.S.W.','Australia','PQQ',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Cardiff','Wales','CWL',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Fort Walton Beach, FL','USA','VPS',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('Tijuana','Mexico','TIJ',0);
insert into Lotnisko(NazwaLotniska,Kraj,SkrotLotniska,CzyObslugujeRejsowe) values ('New Bern, NC','USA','EWN',0);

--dodanie pilotów

insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Newton','K',59,3977);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Stokes','M',27,4043);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Mason','K',49,2365);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Ramsey','K',30,3397);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Fuentes','K',32,4955);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Gregory','M',36,5604);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Patel','K',36,1984);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Petty','K',27,3164);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('James','M',60,3172);
insert into Pilot(Nazwisko,P³eæ,Wiek,IloœæGodzinLotu) values ('Perkins','M',35,5385);


--dodanie lotów

insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (161,70,'2020-12-09','13:20','12:40',1004,'South Korea');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (101,20,'2020-02-27','22:30','06:20',1008,'Pakistan');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (121,90,'2021-06-21','14:20','05:40',1008,'Nigeria');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (161,100,'2020-09-24','17:50','07:30',1006,'Tanzania');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (141,10,'2021-11-11','21:50','07:30',1016,'Canada');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (161,50,'2021-03-13','01:40','09:50',1000,'Egypt');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (151,40,'2020-09-25','00:40','07:20',1018,'Vietnam');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (151,30,'2020-01-23','13:10','05:00',1016,'South Africa');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (111,80,'2020-01-01','15:10','13:20',1006,'Germany');
insert into Lot(IdSamolotu,IdPilota,DataWylotu,GodzinaWylotu,CzasLotu,IdLotniskoWylotu,CelLotu) values (111,60,'2020-08-31','20:20','11:20',1016,'Afghanistan');


--dodanie biletów

insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10001,'Denzel','Mason','+36462120794','DR Congo');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10000,'Kamden','English','+98097449031','Colombia');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10007,'Lyric','Wang','+77169457031','Japan');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10005,'Amari','Wong','+19686746080','Spain');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10006,'Tristan','Harris','+71980996174','Argentina');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10009,'Lisa','Solomon','+51142130833','Myanmar');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10008,'Cailyn','Gates','+80830071487','Iran');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10002,'Avah','Whitehead','+99660723895','Afghanistan');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10009,'Britney','Oneal','+19397853696','Sudan');
insert into Bilet(IdLotu,Imiê,Nazwisko,NrTel,KrajPochodzenia) values (10002,'Maximus','Barton','+55615025180','Argentina');
