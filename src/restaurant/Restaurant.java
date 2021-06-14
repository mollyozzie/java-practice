package restaurant;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Date menuDate = new Date(2021, 6, 10);
        menu.setMenuDate(menuDate);

        MenuItem macAndCheese = new MenuItem();
        macAndCheese.setCategory("Appetizer");
        macAndCheese.setDescription("Macaroni and Cheese Muffins - House made mac and cheese lightly breaded and baked to perfection.");
        macAndCheese.setPrice(6.95);
        Date newDate = new Date(2021, 6, 10);
        macAndCheese.setCreationDate(newDate);
        menu.addMenuItem(macAndCheese);

        MenuItem brussels = new MenuItem();
        brussels.setCategory("Appetizer");
        brussels.setDescription("Flash Fried Brussels Sprouts - Brussels sprouts, flash fried and tossed in a lemon garlic butter.");
        brussels.setPrice(4.95);
        newDate = new Date(2020, 11, 5);
        brussels.setCreationDate(newDate);
        menu.addMenuItem(brussels);

        MenuItem charcuterie = new MenuItem();
        charcuterie.setCategory("Appetizer");
        charcuterie.setDescription("Charcuterie Tray - Chef's choice of meats, cheeses, nuts, fruits, spreads, and breads");
        charcuterie.setPrice(11.95);
        newDate = new Date(2018, 4, 20);
        charcuterie.setCreationDate(newDate);
        menu.addMenuItem(charcuterie);

        MenuItem ribeye = new MenuItem();
        ribeye.setCategory("Main Course");
        ribeye.setDescription("Ribeye - Dry aged 16 ounce ribeye, grilled to perfection and served with house fries and steak sauce.");
        ribeye.setPrice(29.95);
        newDate = new Date(2019, 3, 15);
        ribeye.setCreationDate(newDate);
        menu.addMenuItem(ribeye);

        MenuItem seitan = new MenuItem();
        seitan.setCategory("Main Course");
        seitan.setDescription("Seitan Picatta - Seitan lightly sauteed and finished with a classic lemon, butter, and caper sauce, served over pasta.");
        seitan.setPrice(15.95);
        newDate = new Date(2021, 6, 10);
        seitan.setCreationDate(newDate);
        menu.addMenuItem(seitan);

        MenuItem salmon = new MenuItem();
        salmon.setCategory("Main Course");
        salmon.setDescription("Herb Roasted Salmon - Salmon roasted with a puree of fresh herbs, served with couscous, green beans, and lemon sauce.");
        salmon.setPrice(22.95);
        newDate = new Date(2020, 2, 20);
        salmon.setCreationDate(newDate);
        menu.addMenuItem(salmon);

        MenuItem chocolate = new MenuItem();
        chocolate.setCategory("Dessert");
        chocolate.setDescription("Death by Chocolate - Decadent and rich chocolate cake topped with chocolate ganache and both milk and dark chocolate curls served with smoked vanilla whipped cream.");
        chocolate.setPrice(10.95);
        newDate = new Date(2020, 4, 20);
        chocolate.setCreationDate(newDate);
        menu.addMenuItem(chocolate);

        MenuItem blueberry = new MenuItem();
        blueberry.setCategory("Dessert");
        blueberry.setDescription("Blueberry Galette - Warm and flaky rustic pie filled with local Missouri blueberries, served a la mode with your choice of vanilla, chocolate, or cinnamon ice cream.");
        blueberry.setPrice(9.95);
        newDate = new Date(2021, 6, 10);
        blueberry.setCreationDate(newDate);
        menu.addMenuItem(blueberry);

        menu.printMenu();

        menu.printMenuItem(macAndCheese);

        menu.removeMenuItem(charcuterie);

        menu.printMenu();
    }
}
