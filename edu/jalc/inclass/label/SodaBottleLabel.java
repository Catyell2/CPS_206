package edu.jalc.inclass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.logo.SodaBottleLogo;

public class SodaBottleLabel{
  private double height;
  //needs composit object
   SodaBottleLogo sodaBottleLogo;
   Color color;


  private SodaBottleLabel(){
  this.height=0.0;

}
  public SodaBottleLabel(double height, SodaBottleLogo sodaBottleLogo,Color color){
    this.height = height;
    this.sodaBottleLogo = sodaBottleLogo;
  }
//the "get..."s are for testing puropuses, I belive
  public double getHeight(){
    return getHeight;
  }
  public Color getColor(){
    return getColor;
  }
  public SodaBottleLogo getSodaBottleLogo(){
    return getSodaBottleLogo;
  }




}
