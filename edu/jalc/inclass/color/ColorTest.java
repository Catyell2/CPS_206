package edu.jalc.inclass.color;

public class ColorTest{

  public void getRedTest(){
    System.out.println("Test getRed");
    Color color= new Color ((byte)1, (byte)2, (byte)3);
    assert (color.getRed() == (byte)1);

  }
  public void getBlueTest(){
    System.out.println("Test getBlue");
    Color color= new Color ((byte)1, (byte)2, (byte)3);
    assert (color.getBlue() == (byte)2);
  }
  public void getGreenTest(){
    System.out.println("Test getGreen");
    Color color= new Color ((byte)1, (byte)2, (byte)3);
    assert (color.getGreen() == (byte)3);

  }

public static void main(String[] args) {
  ColorTest colorTest = new ColorTest();
  colorTest.getRedTest();
  colorTest.getBlueTest();
  colorTest.getGreenTest();
  System.out.println("End of ColroTest.");
  }
}
