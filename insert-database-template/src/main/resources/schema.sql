CREATE TABLE products (
  productId VARCHAR(255) UNIQUE,
  nameProduct VARCHAR(255),
  brand VARCHAR(255),
  modelProduct VARCHAR(255),
  categoryProduct VARCHAR(255),
  fullCategoryProduct VARCHAR(255),
  country VARCHAR(255),
  productionDate VARCHAR(255),
  description VARCHAR(255),
  imageProduct VARCHAR(255),
  imageBrand VARCHAR(255),
  PRIMARY KEY (productId));
