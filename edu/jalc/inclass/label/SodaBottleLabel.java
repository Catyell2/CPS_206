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
  this.color=null;
  this.sodaBottleLogo=null;

}
  public SodaBottleLabel(double height, SodaBottleLogo sodaBottleLogo,Color color){
    this.height = height;
    this.color= color;
    this.sodaBottleLogo = sodaBottleLogo;
  }
//the "get..."s are for testing puropuses, I belive
  public double getHeight(){
    return height;
  }
  public Color getColor(){
    return color;
  }
  public SodaBottleLogo getSodaBottleLogo(){
    return sodaBottleLogo;
  }




}
