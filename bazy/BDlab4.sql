select *
from SalesLT.ProductCategory;

insert into SalesLT.ProductCategory(Name)
	values('Herbs');

	select *
	into #prod
	from SalesLT.Product
	where ListPrice>100;

	select * from SalesLT.ProductV2;

	select ProductID,[Name],ListPrice*2 as DobledPrice
	into #OverPriced
	from SalesLT.Product;
	select *from #OverPriced;
	
	select * into SalesLT.ProductV2 from SalesLT.Product; --kopiowanie tabeli z danymi 
	
	truncate table #OverPriced;
	Select * from #OverPriced;

	truncate table SalesLT.ProductV2;
	
	select * into SalesLT.ProductV3	--kopiowanie definicji tabeli
	from SalesLT.Product	
	where 1=0;;

	select * from SalesLT.ProductV3;
	insert into SalesLT.ProductV3([Name],
									ProductNumber,
									Color,
									StandardCost,
									ListPrice,
									Size,
									Weight,
									ProductCategoryID,
									ProductModelID,
									SellStartDate,
									SellEndDate,
									DiscontinuedDate,
									ThumbNailPhoto,
									ThumbnailPhotoFileName,
									rowguid,
									ModifiedDate)
		select [name],
				ProductNumber,
				Color,
				StandardCost,
				ListPrice,
				Size,
				[Weight],
				ProductCategoryID,
				ProductModelID,
				SellStartDate,
				SellEndDate,
				DiscontinuedDate,
				ThumbNailPhoto,
				ThumbnailPhotoFileName,
				rowguid,
				ModifiedDate
		from SalesLT.Product;
		
		select * from SalesLT.ProductV3;

		Update SalesLT.ProductV3
		set Color='red';

		update SalesLT.ProductV3
		set Color='Black'
		where ProductCategoryID=11;

		select * from SalesLT.ProductV3
		
		update SalesLT.ProductV3
		set ListPrice=ListPrice-ListPrice*0.1
		where SellEndDate is not null;

		select * from SalesLT.Customer;

		select FirstName, LastName --kopiujemy czêœæ tabeli customer
		into Tab
		From SalesLT.Customer;

		select *
		from dbo.Tab;

		update Tab
		set FirstName=LastName,LastName=FirstName;

		Update P					--Aktualizacja danych za pomoc¹ wyra¿eñ odwo³uj¹cych siê do innych tabel
		set StandardCost *=0.85
		From SalesLT.Product as P
		join SalesLT.SalesOrderDetail as D
			on P.ProductID=D.ProductID
		where D.OrderQty>10;
++