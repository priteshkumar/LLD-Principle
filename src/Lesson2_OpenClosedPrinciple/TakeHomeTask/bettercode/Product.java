package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode;

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
