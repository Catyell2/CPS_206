package edu.jalc.inclass.logo;

public class SodaBottleLogo{

  private double height;

  private SodaBottleLogo(){
    this.height=0.0;

  }

  public SodaBottleLogo(double height){
    this.height=height;
  }

  public double getHeight(){
    return this.height;
  }

}
