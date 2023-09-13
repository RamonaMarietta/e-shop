package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table(name= "product")

public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private int price;

   // public Integer stock_quantity;
    @Column(name="image_url")
    public String image_url;
    /*
    only one photo
     */

    @ManyToOne
    @JoinColumn(name="category_id", nullable=true)
    private CategoryEntity category;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getTitle(), that.getTitle())
                && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getPrice(),
                that.getPrice())  && Objects.equals(getImage_url(),
                that.getImage_url());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription(), getPrice(), getImage_url());
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image_url='" + image_url + '\'' +
                '}';
    }

    /** add product
     * update product
     * delete product
     * remove product
     */



}
