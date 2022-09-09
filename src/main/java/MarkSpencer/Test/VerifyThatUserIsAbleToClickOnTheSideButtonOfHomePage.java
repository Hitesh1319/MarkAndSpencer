package MarkSpencer.Test;

public class VerifyThatUserIsAbleToClickOnTheSideButtonOfHomePage extends BaseClass{
    public static void main(String[] args) {
        setup();
        pageFactory.getSideButtonOfHomePage().leftSliderButtonOfImage();
    }
}
