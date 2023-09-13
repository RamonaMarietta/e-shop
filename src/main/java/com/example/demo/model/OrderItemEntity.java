package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table(name ="oderItem")

public class OrderItemEntity implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getSubtotal(), that.getSubtotal()) && Objects.equals(getQuantity(), that.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSubtotal(), getQuantity());
    }

    @Id
    @GeneratedValue

    private Long id;
    public  Integer  subtotal;

    @Override
    public String toString() {
        return "OrderItemEntity{" +
                "id=" + id +
                ", subtotal=" + subtotal +
                ", quantity=" + quantity +
                '}';
    }

    public  Integer  quantity;
    //update quantityIntem


}
