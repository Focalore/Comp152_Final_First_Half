public class FoodItem extends RestaurantItem {
    public boolean hasGluten;

    public FoodItem(String newName, Double newPrice, boolean newHasGluten) {
        super(newName, newPrice);
        name = newName;
        price = newPrice;
        hasGluten = newHasGluten;


    }

    @Override
    public String toString() {
        return "\n Food:\n name = " + name + ", \n Price = " + price + ", \n HasGluten = " + hasGluten + "";
    }
}

