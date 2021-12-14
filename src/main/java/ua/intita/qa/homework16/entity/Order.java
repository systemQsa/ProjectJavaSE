package ua.intita.qa.homework16.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import ua.intita.qa.homework16.newtask.entity.Entity;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Order extends Entity {

    private final int id;
    private final String name;
    private final String phoneNumber;
    private final String type;
    private final double price;
}
