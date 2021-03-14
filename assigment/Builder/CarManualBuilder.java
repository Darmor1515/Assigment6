package com.assigment.Builder;

public class CarManualBuilder implements Builder {
    private Car car;

    public CarManualBuilder(){
        this.Reset();
    }
    @Override
    public Car Reset() {
        this.car=new Car();
        return car;
    }

    @Override
    public String setSeats(int a) {
        return ("Install Seats in number of "+a);
    }

    @Override
    public String setEngine(int a) {
        return ("Install Engine in number of "+a);
    }

    @Override
    public String setTripleComputer(int a) {
        return ("Install TripleComputer in number of "+a);
    }

    @Override
    public String setGps(double a) {
        if (a==0){return (" No Gps ");}else{ return ("Install Gps");}

    }
    public String getProduct(int a, int b, int c, double d){
        String product="To create Car you need "+setSeats(a)+setEngine(b)+setTripleComputer(c)+setGps(d);
        this.Reset();
        return product;
    }
}
