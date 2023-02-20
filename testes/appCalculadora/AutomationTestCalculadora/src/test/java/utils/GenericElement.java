package utils;

public class GenericElement {

    public static SelenideElement indexInTextView(int indexValue) {
        return $(By.xpath("//android.widget.TextView[" + indexValue + "]"));
    }

    public static SelenideElement contentDescImageView(String el) {
        return $(By.xpath("//android.widget.ImageView[@content-desc='" + el + "']"));
    }

    public static SelenideElement contentDescViewImageView(String el) {
        return $(By.xpath("//android.widget.ImageView[contains(@content-desc,'" + el + "')]"));
    }

    public static SelenideElement inTextView(String el) {
        return $(By.xpath("//android.widget.TextView[@text='" + el + "']"));
    }
}