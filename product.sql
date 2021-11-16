DROP TABLE IF EXISTS product;

CREATE TABLE product(
	pro_id INT PRIMARY KEY,
	pro_name VARCHAR(100),
	pro_price INT,
	pro_stock INT,
    pro_photo VARCHAR(100) 
);

INSERT INTO product VALUES(1,'消しゴム',100,1000,'image/01eraser.jpg');
INSERT INTO product VALUES(2,'ノート',120,1000,'image/02notebook.jpg');
INSERT INTO product VALUES(3,'えんぴつ',80,1000,'image/03pen.jpg');
INSERT INTO product VALUES(4,'ぺん',300,200,'image/04fountainpen.jpg');
INSERT INTO product VALUES(5,'ものさし',100,500,'image/05ruler.jpg');
INSERT INTO product VALUES(6,'はさみ',300,300,'image/06scissors.jpg');
INSERT INTO product VALUES(7,'テープ',250,500,'image/07tape.jpg');
INSERT INTO product VALUES(8,'クリップ',20,10000,'image/08clip.jpg');

SELECT * FROM product;