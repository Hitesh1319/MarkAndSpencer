package MarkSpencer.Test;

public class UrlLAndLandingPageVerification extends BaseClass {
    public static void main(String[] args) {
        setup();
        verification("(//a[@class='navigation-mns-logo navigation-logo'])[1]","M&S");
        close();
    }
}
