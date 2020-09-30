/*
This class extends ShopItems, this is the class specific for Book items.
This enables us to efficiently have Book objects.
 */

import java.awt.print.Book;

public class Books extends ShopItems {

    private int numberOfPages;

    public Books(String name, double price, int discountPercentage, int numberOfPages) {
        super(name, price, discountPercentage);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        if(getDiscountPercentage()>0){
            return "The price of the book: " + getName() +
                    " after discount is " + applyDiscount() +
                    " and the number of pages is " + numberOfPages + "." ;
        } else
        return " The price of the book: " + getName() +
                " is " + getPrice() +
                " and the number of pages is " + numberOfPages + ".";
    }

    public static void main(String[] args) {

        Books HarryPotter = new Books("Harry Potter", 30.00, 20,500);
        Books PokemonManga = new Books("Pokemon", 10, 0,30);
        Books StarWars  = new Books("Star wars", 10, -1,300);
        Books Stars  = new Books("Stars", 10, 100,300);

    }

}
