package ua.intita.qa.homework16.entity;

import java.util.List;
import java.util.Objects;

public class Order {
    private List<Pizza> pizza;
    private double receipt;

    public Order() {
    }

    public Order(List<Pizza> pizza, double receipt) {
        this.pizza = pizza;
        this.receipt = receipt;
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(List<Pizza> pizza) {
        this.pizza = pizza;
    }

    public double getReceipt() {
        return receipt;
    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.receipt, receipt) == 0 && Objects.equals(pizza, order.pizza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizza, receipt);
    }

    @Override
    public String toString() {
        return "Order{" +
                "pizza=" + pizza +
                ", receipt=" + receipt +
                '}';
    }
}
