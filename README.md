CREATE TABLE librarytable(bookname	varchar(200) not null,author varchar(200) not null,book_publication varchar(200) not null,yearofPublication number, No_of_Copies number not null);
insert into librarytable(bookname ,author,book_publication,yearofPublication,no_of_copies)
values('Client Server Computing','Lalit Kumar','Sun India Publications',2012,20);

/
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies) values ('Mobile Computing' , 'Vinay Kumar Singhal'  , 'K Nath and Sons' , '1987' , '10'  );
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies) values ('Computer Networks' , 'Sharad Kumar Verma'  , 'Sun India Publication' , '2010' , '10'  );
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies) values ( '.NET Framework and C#' , 'Sharad Kumar Verma',  'Sun India Publication' , '2002' , '10'  );
commit;
/

insert into librarytable(bookname , author , book_publication ,yearofPublication, no_of_copies) values ('Junior Level Books
Introduction to Computer' , 'Amit Garg ' , 'Readers Zone ' , '2012' , '10'  );

insert into librarytable(bookname , author , book_publication ,yearofPublication, no_of_copies) values ('Client Server Computing' , 'lalit kumar ' , ' Sun India Publications, New Delhi' , '1918' , '10'  );
/
drop table librarytable;

/

select * from librarytable;

/
--2
create table AdminTable ( admin1_id number , admin2_id number , admin3_id number , adminpassword VARCHAR(20)  );

insert into AdminTable values ( 2643 , 2650 , 2776 , 'ITMPK2643');

commit;

/

--3
create table user_details(user_mobilenumber number not null , user_name varchar(25) not null , user_libraryid number primary key not null );

insert into user_details values(9750586361 , 'Vander' , 1001);

insert into user_details values(9959566367 , 'milner' , 1002);

insert into user_details values(9850586331 , 'Mount' , 1003);

insert into user_details values(9340586362 , 'Johann' , 1004);

insert into user_details values(9580587861 , 'zuber' , 1005);

commit;

select * from user_details;
/
--4
create table book_table(book_serial_no number not null , book_name varchar(250) not null, available_book varchar(25) not null);		
				create table user_details(user_mobilenumber bigint not null , user_name varchar(25) not null , user_libraryid primary key int not null );
	             commit;
                 drop table book_table;
                 /
 insert into book_table values(1718908 , 'Mobile Computing' , 'yes');
                
  insert into book_table values(1718909 , 'Computer Networks' , 'yes');
  
    insert into book_table values(1718909 , '.NET Framework and C#' , 'yes');
    
        insert into book_table values(1718910 , 'Junior Level Books Introduction to Computer' , 'no');
        
            insert into book_table values(1718912 , 'Client Server Computing' , 'yes');

select * from book_table;
commit;
