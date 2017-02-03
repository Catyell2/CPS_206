publilc class Car {
  drive(){
    startCar();
    putSeatbeltOn();
    putInGear();
    accelarate();
    turn();
    brake();
  //ect....
  }
  startCar(){
  checkSourceOfIgnition()
  if(key)
    StartKeyCar();
  else StartFobCar();
  }
  putSeatbeltOn(){
    //do you have seat belt
    //click it or ticket
  }
  putInGear(){
    if(manual) shiftManual
    else(automatic) shiftAuto

  }
  workClutch(boolen press){
    if(press)
      //do steps to press
    else //do steps to release

  }

  shiftManual(){
    pressCluch();{workClucth(true)}
    moveGearSHift();
    releaseCluch();{workClucth(false)}
  }
  public void testWorkClucth(){
    workClucth(true)
    assert(isClucthPressed);
    workClucth(false)

    }

}
