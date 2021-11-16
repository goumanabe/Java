DROP TABLE IF EXISTS login;

CREATE TABLE login(
	id INT auto_increment PRIMARY KEY,
	pw VARCHAR(100)not null,
	cus_name VARCHAR(100)not null
);

SELECT * FROM login;
