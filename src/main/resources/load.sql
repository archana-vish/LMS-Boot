drop table user if exists;

drop table allowance if exists;

drop table leave if exists;

drop table status if exists;

drop table type if exists;

drop table unit if exists;



--SCRIPTS FOR STATUS

create table status (
  statusid int,
  statusname varchar2(20)
);

insert into status values (1, 'NEW');

insert into status values (2, 'APPROVED');

insert into status values (3, 'CANCELLED');

--SCRIPTS FOR UNIT

create table unit (
  unitid int primary key AUTO_INCREMENT ,
  unitname varchar2(20)
);

insert into unit values (1, 'DAYS');

insert into unit values (2, 'HOURS');


--SCRIPTS FOR TYPE

create table type (
  typeid int,
  typename varchar2(20)
);

insert into type values (1, 'HOLIDAY');
insert into type values (2, 'SICK');


--SCRIPTS FOR USER

create table user(
  userid int primary key AUTO_INCREMENT ,
  loginid varchar2(20),
  email varchar2(40),
  firstname varchar2(20),
  lastname varchar2(20),
  password varchar2(20)
);

insert into user  (loginid, email, firstname, lastname, password) values (
  'av8242n', 'av8242n@gre.ac.uk','Archana','V','admin'
);

insert into user  (loginid, email, firstname, lastname, password)  values (
  'manager', 'manager@gre.ac.uk','Manager','XXX','manager'
);

insert into user  (loginid, email, firstname, lastname, password) values (
  'student', 'student@gre.ac.uk','Student','YYY','student'
);



--SCRIPTS FOR ALLOWANCE DETAILS

create table allowance (
  userid int,
  allowanceid int PRIMARY KEY AUTO_INCREMENT,

  unitid int,
  hoursperday decimal,

  annualentitlement decimal,
  carriedover decimal,
  bankholiday decimal,
  adjustments decimal,
  totalleave decimal,

  balancedays decimal,
  balancehours decimal,
  FOREIGN KEY (unitid) REFERENCES unit(unitid)
);

insert into allowance values (1, 1, 2, 6.4, 166.4, 32.0, 64.0, 56.0, 206.5, 32.3, 206.5);

insert into allowance values (2, 2, 1, 7, 24, 0, 8, 0, 32, 32, 224);

insert into allowance values (3, 3, 1, 6, 20, 2, 8, 0, 30, 30, 180);


--SCRIPTS FOR LEAVE

create table leave (
  userid int,
  allowanceid int,
  leaveid int,
  startdate date,
  enddate date,
  totaldays int,
  totalhours decimal,
  statusid int,
  typeid int,
  createdate date,
  submitdate date,
  modifydate date,
  approverid int
);

insert into leave values (1, 1, 1, {ts '2017-06-15 00:00:00.00'}, {ts '2017-06-15 00:00:00.00'}, 1, 6.4, 2, 1, {ts '2017-06-16 00:00:00.00'}, {ts '2017-06-16 00:00:00.00'}, {ts '2017-06-16 00:00:00.00'},2 );
