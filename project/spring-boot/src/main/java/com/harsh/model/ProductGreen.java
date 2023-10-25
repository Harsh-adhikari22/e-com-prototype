package com.harsh.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
public class ProductGreen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "discounted_price")
    private int discountedPrice;
    @Column(name="discount_persent")
    private int discountPersent;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "brand")
    private String brand;
    @Column(name = "color")
    private String color;
    @Embedded
    @ElementCollection
    @Column(name = "sizes")
    private Set<Size> sizes=new HashSet<>();
    @Column(name = "image_url")
    private String imageUrl;
    @OneToMany(mappedBy = "productGreen",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Rating> ratings=new ArrayList<>();
    @OneToMany(mappedBy = "productGreen",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Review>reviews=new ArrayList<>();
    @Column(name = "num_ratings")
    private int numRatings;
    @Column(name = "sustainability_score")
    private int sustainability_score;
    @Column(name = "carbon_footprint")
    private float carbon_footprint;
    @Column(name = "water_footprint")
    private float water_footprint;
    @Column(name = "energy_efficiency")
    private float energy_efficiency;
    @Column(name = "green_marker")
    private boolean green_marker;
    @Column(name = "recyclability")
    private int recyclability;
    @ManyToOne()
    @JoinColumn(name="category_id")
    private Category category;
    private LocalDateTime createdAt;
    public ProductGreen() {

    }

    public ProductGreen(Long id, String title, String description, int price, int discountedPrice, int discountPersent,
                   int quantity, String brand, String color, Set<Size> sizes, String imageUrl, List<Rating> ratings,
                   List<Review> reviews, int numRatings, Category category, LocalDateTime createdAt, int recyclability, boolean green_marker,
                        float energy_efficiency, float water_footprint, float carbon_footprint, int sustainability_score
    ) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountPersent = discountPersent;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.sizes = sizes;
        this.imageUrl = imageUrl;
        this.ratings = ratings;
        this.reviews = reviews;
        this.numRatings = numRatings;
        this.category = category;
        this.createdAt = createdAt;
        this.carbon_footprint=carbon_footprint;
        this.energy_efficiency=energy_efficiency;
        this.green_marker=green_marker;
        this.recyclability=recyclability;
        this.sustainability_score=sustainability_score;
        this.water_footprint=water_footprint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Set<Size> getSizes() {
        return sizes;
    }

    public void setSizes(Set<Size> sizes) {
        this.sizes = sizes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public int getNumRatings() {
        return numRatings;
    }

    public void setNumRatings(int numRatings) {
        this.numRatings = numRatings;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
