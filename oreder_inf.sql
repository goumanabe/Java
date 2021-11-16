DROP TABLE IF EXISTS order_inf;

CREATE TABLE order_inf(
	order_id INT AUTO_INCREMENT PRIMARY KEY,
	order_day DATE not null,
    pro_count INT not null,
    pro_id INT not null, 
	id INT not null
);

SELECT * FROM order_inf;

