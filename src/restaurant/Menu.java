package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date menuDate;
    private Boolean isNew;
    private ArrayList<MenuItem> currentMenu = new ArrayList<MenuItem>();

//    public void setCurrentMenu(ArrayList<MenuItem> currentMenu) {
//        this.currentMenu = currentMenu;
//    }

    public void setMenuDate(Date menuDate){
        this.menuDate = menuDate;
    }

    public Date getMenuDate() {
        return menuDate;
    }

    private Boolean isNew(int index) {
        if(currentMenu.get(index).getCreationDate().before(menuDate)) {
            return false;
        }
        return true;
    }

    public void addMenuItem(MenuItem addition) {
        for (MenuItem item: this.currentMenu) {
            if(item.getDescription() == addition.getDescription()) {
                System.out.println("This item is already on the menu.");
                return;
            }
        }   this.currentMenu.add(addition);
    }

    public void removeMenuItem(MenuItem deletion) {
        this.currentMenu.remove(currentMenu.indexOf(deletion));
    }

    public void printMenuItem(MenuItem printMe) {
        String menuItemStatus = "";
        if (isNew(currentMenu.indexOf(printMe))) {
            menuItemStatus = "NEW!";
        }
        System.out.println(printMe.getCategory() + " " + printMe.getDescription() + " " + printMe.getPrice() + " " + menuItemStatus);
    }

    public void printMenu() {
        for (MenuItem menuItem: this.currentMenu) {
            printMenuItem(menuItem);
        }
    }

    private boolean equals(MenuItem itemOne, MenuItem itemTwo) {
        if (itemOne.getDescription() == itemTwo.getDescription()) {
            return true;
        } return false;
    }
}
