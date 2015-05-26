CREATE TABLE testdb.product
(
  product_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  cost FLOAT(8,2) NOT NULL
)CHARACTER set utf8;
ALTER TABLE testdb.product ADD CONSTRAINT unique_id UNIQUE (id);



CREATE TABLE testdb.ingredient
(
  ingredient_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL
)CHARACTER set utf8;
ALTER TABLE testdb.ingredient ADD CONSTRAINT unique_id UNIQUE (id);


CREATE TABLE testdb.product_ingredient (
  product_id INT NOT NULL,
  ingredient_id INT NOT NULL,
  PRIMARY KEY (product_id, ingredient_id),
  CONSTRAINT FK_PRODUCT FOREIGN KEY (product_id) REFERENCES product (product_id),
  CONSTRAINT FK_INGREDIENT FOREIGN KEY (ingredient_id) REFERENCES ingredient (ingredient_id)
)CHARACTER set utf8;