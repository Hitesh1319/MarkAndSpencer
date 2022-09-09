package MarkSpencer.Test;

public class DropdownHoverVerification extends BaseClass {
    public static void main(String[] args) {
        setup();
        pageFactory.getDropdownHover().dropdownHover("Women");
        pageFactory.getDropdownHover().dropdownHover("Lingerie");
        pageFactory.getDropdownHover().dropdownHover("Men");
        pageFactory.getDropdownHover().dropdownHover("Kids");
        pageFactory.getDropdownHover().dropdownHover("School");
        pageFactory.getDropdownHover().dropdownHover("Home");
        pageFactory.getDropdownHover().dropdownHover("Furniture");
        pageFactory.getDropdownHover().dropdownHover("Beauty");
        pageFactory.getDropdownHover().dropdownHover("Brands");
        pageFactory.getDropdownHover().dropdownHover("Flowers");
        pageFactory.getDropdownHover().dropdownHover("Gifts");
        pageFactory.getDropdownHover().dropdownHover("Food & Wine");
        pageFactory.getDropdownHover().dropdownHover("Offers");
        verification("(//h1","M&S");
        close();
    }
}
