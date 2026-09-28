package ik.ku.module2.exercises.ex3.ex3wrong;

public class calculateTotal {
    public calculateTotal() {
    }

    double calculate(itemPrices prices) {
        double total = (double)0.0F;

        for(int i = 0; i < prices.itemPrices.length; ++i) {
            total += prices.itemPrices[i];
            System.out.println(prices.itemPrices[i]);
        }

        return total;
    }
}
