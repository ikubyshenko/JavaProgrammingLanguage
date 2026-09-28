package ik.ku.module2.exercises.ex3;

class ShoppingCart {

    public static void main(String[] args) {

        double[] itemPrices = {19.99, 5.50, 75.00, 2.99};

        for (int i = 0; i < itemPrices.length; i++) {
            System.out.println(itemPrices[i]);
        }

        double calculatingTotal = calculateTotal(itemPrices);
        double tax = calculateTax(itemPrices);
        double checkTax = checkTax(itemPrices);

        System.out.println("Cart total: " + calculatingTotal);
        System.out.println("Tax: " + checkTax);
        System.out.println("Total cost: " + tax);

    }



    public static double calculateTotal(double[] Prices) {

        double calculatingTotal = 0;

        for (int i = 0; i < Prices.length; i++) {
            calculatingTotal += Prices[i];
        }

        return calculatingTotal;
    }

    // I know that calculateTax shouldn’t calculate the tax on its own;
    // it should just pass the amount to another method.
    // But it looked unattractive.
    // I wanted to have outputs both without tax and with tax,
    // but I couldn’t do it because I didn’t know how,
    // so I fixed it (the way it should be).

    public static double checkTax(double[] Prices) {
        double taxcheck = 0;

        for (int i = 0; i < Prices.length; i++) {
            taxcheck += Prices[i];
        }

        return taxcheck * 0.10;

    }

    public static double calculateTax(double[] Prices) {
        double tax = 0;

        for (int i = 0; i < Prices.length; i++) {
            tax += Prices[i];
        }

        return tax * 1.10;

    }


    // public double calculateTax(double price) {
    //        return price * 1.10;
    //    }
    //
    //    public double calculateTotal(double[] prices) {
    //        double calculatingTotal = 0;
    //
    //        for (double price : prices) {
    //            calculatingTotal += price;
    //        }
    //
    //        return calculateTax(calculatingTotal);
    //    }
}