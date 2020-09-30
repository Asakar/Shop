/*
This class extends ShopItems, this is the class specific for DVD items.
This enables us to efficiently have DVD objects.
 */

public class DVD extends ShopItems {

    private String playingTime;

    public DVD(String name, double price, int discountPercentage, String playingTime) {
        super(name, price, discountPercentage);
        this.playingTime = playingTime;
    }

    public String getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(String playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String toString() {
        if(getDiscountPercentage()>0){
            return "The price of the DVD: " + getName() +
                    " after discount is " + applyDiscount() +
                    " and the playing time is " + playingTime + "." ;
        } else
        return "The price of the DVD: " + getName() +
                " is " + getPrice() +
                " and the playing time is " + playingTime + ".";
    }

    public static void main(String[] args) {

        DVD backToTheFuture = new DVD("back to the future", 200.09,0, "01:30");
        DVD dragonBallZ = new DVD("Dragon ball Z", 2000.00,10, "11:30");
        DVD dragonBall = new DVD("Dragon ball", 2000.00,100, "11:30");
        DVD dragonsOnly = new DVD("Dragons", 2000.00,-1, "11:30");
        System.out.println(backToTheFuture.toString());
        System.out.println(dragonBallZ.toString());
        System.out.println(dragonBall.toString());
        System.out.println(dragonsOnly.toString());

    }

}
