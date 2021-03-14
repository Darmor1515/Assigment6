package com.assigment.Builder;

public class Director {
    public Builder builder;
    public Director(){
    }
    public void setBuilder(Builder builder){}
    public void ConstructSportCar(Builder builder){
        builder.Reset();
        builder.setSeats(1);
        builder.setEngine(4);
        builder.setTripleComputer(2);
        builder.setGps(0);
    }
    public void ConstructEasyCar(Builder builder){
        builder.Reset();
        builder.setSeats(4);
        builder.setEngine(1);
        builder.setTripleComputer(1);
        builder.setGps(1);
    }
}
