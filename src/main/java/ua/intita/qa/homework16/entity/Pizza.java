package ua.intita.qa.homework16.entity;

import java.util.Objects;

public class Pizza {
    private String name;
    private double price;

    //additional field ingredients
    // List<String>ingredients;

    public Pizza() {
    }

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Double.compare(pizza.price, price) == 0 && Objects.equals(name, pizza.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
