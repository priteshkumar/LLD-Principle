package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode.hw1;

enum ProductType {
    ELECTRONICS,
    CLOTHING;
}

public class Product {
    ProductType type;
    double price;
    double getPrice() {
        return price;
    }

    ProductType getType() {
        return type;
    }
}
