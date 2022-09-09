package MarkSpencer.Test;

public class SignInLinkClick extends BaseClass {
        public static void main(String[] args) {
            setup();
            pageFactory.getHomePage().signInLinkClick();
            verification("//div//h1","Sign In");
            close();
        }
    }
