package com.harsh.request;

import com.harsh.model.Size;

import java.util.HashSet;
import java.util.Set;

public class CreateGreenProductRequest {
    private String title;

    private String description;

    private int price;

    private int discountedPrice;

    private int discountPersent;

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size=new HashSet<>();

    private String imageUrl;

    private String topLavelCategory;
    private String secondLavelCategory;
    private String thirdLavelCategory;
    private int sustainability_score;
    private float carbon_footprint;
    private float water_footprint;
    private float energy_efficiency;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getDiscountPersent() {
        return discountPersent;
    }

    public void setDiscountPersent(int discountPersent) {
        this.discountPersent = discountPersent;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<Size> getSize() {
        return size;
    }

    public void setSize(Set<Size> size) {
        this.size = size;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTopLavelCategory() {
        return topLavelCategory;
    }

    public void setTopLavelCategory(String topLavelCategory) {
        this.topLavelCategory = topLavelCategory;
    }

    public String getSecondLavelCategory() {
        return secondLavelCategory;
    }

    public void setSecondLavelCategory(String secondLavelCategory) {
        this.secondLavelCategory = secondLavelCategory;
    }

    public String getThirdLavelCategory() {
        return thirdLavelCategory;
    }

    public void setThirdLavelCategory(String thirdLavelCategory) {
        this.thirdLavelCategory = thirdLavelCategory;
    }

    public int getSustainability_score() {
        return sustainability_score;
    }

    public void setSustainability_score(int sustainability_score) {
        this.sustainability_score = sustainability_score;
    }

    public float getCarbon_footprint() {
        return carbon_footprint;
    }

    public void setCarbon_footprint(float carbon_footprint) {
        this.carbon_footprint = carbon_footprint;
    }

    public float getWater_footprint() {
        return water_footprint;
    }

    public void setWater_footprint(float water_footprint) {
        this.water_footprint = water_footprint;
    }

    public float getEnergy_efficiency() {
        return energy_efficiency;
    }

    public void setEnergy_efficiency(float energy_efficiency) {
        this.energy_efficiency = energy_efficiency;
    }

    public boolean isGreen_marker() {
        return green_marker;
    }

    public void setGreen_marker(boolean green_marker) {
        this.green_marker = green_marker;
    }

    public int getRecyclability() {
        return recyclability;
    }

    public void setRecyclability(int recyclability) {
        this.recyclability = recyclability;
    }

    private boolean green_marker;
    private int recyclability;
}
