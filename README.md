# Library Management

# Create Library Table and Inserting Values Into Table 
```js
CREATE TABLE librarytable(bookname varchar(200) not null,author varchar(200) not null,book_publication varchar(200) not null, yearofPublication number, No_of_Copies number not       null);
  // INSERTING VALUES INTO TABLE 
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies) values ('Mobile Computing' , 'Vinay Kumar Singhal'  , 'K Nath and Sons' , '1987' , '10'  );
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies)values ('Computer Networks' , 'Sharad Kumar Verma'  , 'Sun India Publication' , '2010' , '10'  );
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies)values ( '.NET Framework and C#' , 'Sharad Kumar Verma',  'Sun India Publication' , '2002' , '10'  );
insert into librarytable(bookname ,author,book_publication,yearofPublication,no_of_copies)values('Client Server Computing','Lalit Kumar','Sun India Publications',2012,20);
insert into librarytable(bookname , author , book_publication ,yearofPublication, no_of_copies)values ('Junior Level Books Introduction to Computer' , 'Amit Garg ' , 'Readers Zone ' , '2012' , '10'  );
```
 Display Table 
```
SELECT * FROM LIBRARY TABLE 
```

# Library Table 
  | Book Name | Author | Book Publications | Year Of Publication | No Of Copies |
  |:----------|:-------|:------------------|:--------------------|:-------------|
  |Junior Level Books Introduction to Computer|	Amit Garg | Readers Zone|2011|20|
  |Publish News Letter|Amit Garg|MCA Department MIET|2011|20|
  |Client Server Computing|lalit kumar | Sun India | 1918 | 20 |
  |Mobile Computing | Vinay Kumar | K Nath | 1987 | 20 |
  |Computer Networks| Sharad Kumar | Sun India | 2010 | 20 |
  
  
  # LIBRARY BOOK TABLE 
