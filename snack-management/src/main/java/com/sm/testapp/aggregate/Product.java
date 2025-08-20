package com.sm.testapp.aggregate;

import java.util.Arrays;

public class Product {
    private int proNo;
    private String proName;
    private String[] ingredient;
    private String madeDate;
    private String expirationDate;
    private Category category;
    private ProduceStatus produceStatus;

    public Product() {
    }

    public Product(int proNo, String proName, String[] ingredient, String madeDate, String expirationDate, Category category, ProduceStatus produceStatus) {
        this.proNo = proNo;
        this.proName = proName;
        this.ingredient = ingredient;
        this.madeDate = madeDate;
        this.expirationDate = expirationDate;
        this.category = category;
        this.produceStatus = produceStatus;
    }

    public int getProNo() {
        return proNo;
    }

    public void setProNo(int proNo) {
        this.proNo = proNo;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }

    public String getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(String madeDate) {
        this.madeDate = madeDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProduceStatus getProduceStatus() {
        return produceStatus;
    }

    public void setProduceStatus(ProduceStatus produceStatus) {
        this.produceStatus = produceStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proNo=" + proNo +
                ", proName='" + proName + '\'' +
                ", ingredient=" + Arrays.toString(ingredient) +
                ", madeDate='" + madeDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", category=" + category +
                ", produceStatus=" + produceStatus +
                '}';
    }
}
