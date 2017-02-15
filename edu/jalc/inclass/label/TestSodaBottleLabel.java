package edu.jalc.inclass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.logo.SodaBottleLogo;

public class TestSodaBottleLabel{
  public void testGetHeight(){
  System.out.println("Testing SodaBottleLabel::getHeight");
  SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, null, null);
  assert(sodaBottleLabel.getHeight() == 1.0);
}

public void testGetColor(){
  System.out.println("Testing SodaBottleLabel::getColor");
  Color color = new Color((byte)1,(byte)1,(byte)1);
  SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, Color, null);
  assert(sodaBottleLabel.getColor() == Color);
}

public void testGetLogo(){
  System.out.println("Testing SodaBottleLabel::getLogo");
  Logo logo = new Logo(1.0);
  SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, null, logo);
  assert(sodaBottleLabel.getLogo() == Logo);
}


public static void main(String... args){
  SodaBottleLabelTest sodaBottleLabelTest = new SodaBottleLabelTest();
  sodaBottleLabelTest.testGetHeight();
  sodaBottleLabelTest.testGetLogo();
  sodaBottleLabelTest.testGetColor();
  System.out.println("SodaBottleLabelTest complete");
}
}
