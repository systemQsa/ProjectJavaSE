package ua.intita.qa.homework19.entity;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Order implements Serializable{

    private final int id;
    private final String name;
    private final String phoneNumber;
    private final String type;
    private final double price;
}