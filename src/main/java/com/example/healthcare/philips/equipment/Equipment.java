package com.example.healthcare.philips.equipment;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@ToString
@Table(name = "Equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer rentingCost;
    private Integer quantity;
    private String imageUrl;

    public Equipment(String name, Integer rentingCost, Integer quantity, String imageUrl)
    {
        this.name = name;
        this.rentingCost = rentingCost;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }
}
