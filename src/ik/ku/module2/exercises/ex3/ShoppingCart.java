package ik.ku.module2.exercises.ex3;

class ShoppingCart {

    public static void main(String[] args) {

        double[] itemPrices = {19.99, 5.50, 75.00, 2.99};

        for (int i = 0; i < itemPrices.length; i++) {
            System.out.println(itemPrices[i]);
        }

        double calc = calculateTotal(itemPrices);
        double tax = calculateTax(itemPrices);
        double taxm = calculateHMTax(itemPrices);
        System.out.println("Cart total: " + calc);
        System.out.println("Tax: " + taxm);
        System.out.println("Total cost: " + tax);

    }



    public static double calculateTotal(double[] Prices) {

        double calc = 0;

        for (int i = 0; i < Prices.length; i++) {
            calc += Prices[i];
        }

        return calc;
    }

    // I know that calculateTax shouldn’t calculate the tax on its own;
    // it should just pass the amount to another method.
    // But it looked unattractive.
    // I wanted to have outputs both without tax and with tax,
    // but I couldn’t do it because I didn’t know how,
    // so I fixed it (the way it should be).

    public static double calculateHMTax(double[] Prices) {
        double taxm = 0;

        for (int i = 0; i < Prices.length; i++) {
            taxm += Prices[i];
        }

        return taxm * 0.10;

    }

    public static double calculateTax(double[] Prices) {
        double tax = 0;

        for (int i = 0; i < Prices.length; i++) {
            tax += Prices[i];
        }

        return tax * 1.10;

    }

    public static void taxCheck(double[] prices) {


    }

    // public double calculateTax(double price) {
    //        return price * 1.10;
    //    }
    //
    //    public double calculateTotal(double[] prices) {
    //        double calc = 0;
    //
    //        for (double price : prices) {
    //            calc += price;
    //        }
    //
    //        return calculateTax(calc);
    //    }
}