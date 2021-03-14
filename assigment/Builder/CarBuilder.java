package com.assigment.Builder;

public class CarBuilder implements Builder{
    private Car car;

public CarBuilder(){
    this.Reset();
}
    @Override
    public Car Reset() {
        this.car=new Car();
  return car;
    }

    @Override
    public String setSeats(int a) {
        return ("Installed Seats in number of "+a);
    }

    @Override
    public String setEngine(int a) {
        return ("Installed Engine in number of "+a);
    }

    @Override
    public String setTripleComputer(int a) {
        return ("Installed TripleComputer in number of "+a);
    }

    @Override
    public String setGps(double a) {
    if (a==0){return ("Gps did not installed ");}else{ return ("Installed Gps ");}

    }
    public String getProduct(int a, int b, int c, double d){
    String product="Car was created"+setSeats(a)+setEngine(b)+setTripleComputer(c)+setGps(d);
    this.Reset();
    return product;
    }
}
