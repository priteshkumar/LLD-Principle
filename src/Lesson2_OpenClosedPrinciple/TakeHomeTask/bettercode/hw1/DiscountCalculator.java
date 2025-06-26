package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode.hw1;

public class DiscountCalculator {
    public double calculateDiscount(Product product,
                                    ProductDiscountCalculator productDiscountCalculator){
        return productDiscountCalculator.calculateDiscount(product.getPrice());
    }
}
