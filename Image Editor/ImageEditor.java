package edu.byu.cs.imageeditor.studentCode;

import java.io.BufferedReader;

/**
 * Created by Cory on 9/8/16.
 */
public class ImageEditor implements IImageEditor {

    public Image androidImage;

    public void load(BufferedReader bufferedReader) {

        androidImage = new Image(bufferedReader);
    }
    public String invert() {
        androidImage.invert();
        return androidImage.writeToFile();
    }
    public String grayscale() {
        androidImage.grayScale();
        return androidImage.writeToFile();
    }
    public String emboss() {
        androidImage.emboss();
        return androidImage.writeToFile();
    }
    public String motionblur(int blurLength) {
        androidImage.motionblur(blurLength);
        return androidImage.writeToFile();
    }
}