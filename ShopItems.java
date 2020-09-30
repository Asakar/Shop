/*
I have a general class for the shops items which has normal paramaters name, price and
discountPercentage which any normal item would have. I use this class as my parent class.
If a incorrect discountPercentage is added than it will throw a error. In all of the to string methods
I have applied the discount if the discount percentage is greater than 0.
This class can now be used to create objects of your ordinary items, as for items that require more detail such
as DVD and books they can be dealt with using a separate class which extends this class, this is what I have done.
I have also included in this class the applyDiscount which applies the given discount to a item. This discount
method is in this class because all items should be able to apply this discount. The discount is only applied if
the value is between 0 and 100 including 0 and not including 100. When a discount is entered outside the range than a
message is printed stating it is incorrect and the discount is not applied.
 */

public class ShopItems {

    private String name;
    private double price;
    private int discountPercentage;

    public ShopItems(String name, double price, int discountPercentage) {
        this.name = name;
        this.price = price;
        if(discountPercentage>=100 || discountPercentage<0){
            System.out.println("Invalid discount entered for " + this.name);
        } else this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double applyDiscount(){
        double discount = (100 - (double) getDiscountPercentage())/100;
        return getPrice()*discount;
    }

    @Override
    public String toString() {
        if(discountPercentage > 0){
            return "The price of: " + name +
                    " after discount is " + applyDiscount();
        } else return "The price of: " + name +
                " is " + price + ".";
    }

    public static void main(String[] args) {

        ShopItems tablet = new ShopItems("tablet", 100, 0);
        ShopItems computer = new ShopItems("computer", 200, 13);
        ShopItems desk = new ShopItems("desk", 12, 100);
        ShopItems lamp = new ShopItems("lamp", 5, -1);

    }

}
