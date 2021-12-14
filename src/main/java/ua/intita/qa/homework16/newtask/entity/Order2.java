package ua.intita.qa.homework16.newtask.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Order2 extends Entity {
    private String orderId;
    private String name;
    private String phoneNumber;
    private String type;
    private double price;

    public Order2() {
        orderId = UUID.randomUUID().toString();
    }
}
