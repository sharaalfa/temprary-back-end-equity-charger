package io.equitycharger.sharhack.databasetemplatejson;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productsss {
    @Id
    private String productId;
    private String nameProduct;
    private String brand;
    private String modelProduct;
    private String categoryProduct;
    private String fullCategoryProduct;
    private String country;
    private String productDate;
    private String  description;
    private String imageProduct;
    private String imageBrand;

    public Productsss() {
    }

    public Productsss(String productId, String nameProduct, String brand, String modelProduct, String categoryProduct,
                      String fullCategoryProduct, String country, String productDate, String description,
                      String imageProduct, String imageBrand) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.modelProduct = modelProduct;
        this.categoryProduct = categoryProduct;
        this.fullCategoryProduct = fullCategoryProduct;
        this.country = country;
        this.productDate = productDate;
        this.description = description;
        this.imageProduct = imageProduct;
        this.imageBrand = imageBrand;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelProduct() {
        return modelProduct;
    }

    public void setModelProduct(String modelProduct) {
        this.modelProduct = modelProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getFullCategoryProduct() {
        return fullCategoryProduct;
    }

    public void setFullCategoryProduct(String fullCategoryProduct) {
        this.fullCategoryProduct = fullCategoryProduct;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public String getImageBrand() {
        return imageBrand;
    }

    public void setImageBrand(String imageBrand) {
        this.imageBrand = imageBrand;
    }
}
