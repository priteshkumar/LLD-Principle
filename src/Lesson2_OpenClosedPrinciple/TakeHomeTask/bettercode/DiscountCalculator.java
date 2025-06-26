package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode;

public class DiscountCalculator {
    public double calculateDiscount(Product product,
                                    ProductDiscountCalculator productDiscountCalculator){
        return productDiscountCalculator.calculateDiscount(product.getPrice());
    }
}
