package oop.example;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private Integer id;
    private String title;
    private Double price;
    private Integer qty;

}
