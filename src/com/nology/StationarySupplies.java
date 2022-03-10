package com.nology;

public class StationarySupplies implements IStationary {

    private int pens;
    private int staplers;
    private int staples;
    private int rulers;
    private int a4Booklets;
    private int totalSupplies;

    public StationarySupplies(int pens, int staplers, int staples, int rulers, int a4Booklets, int totalSupplies) {
        this.pens = pens;
        this.staplers = staplers;
        this.staples = staples;
        this.rulers = rulers;
        this.a4Booklets = a4Booklets;
        this.totalSupplies = totalSupplies;
    }


    @Override
    public int totalPens() {
        return this.pens;
    }

    @Override
    public int totalStaplers() {
        return this.staplers;
    }

    @Override
    public int totalStaples() {
        return this.staples;
    }

    @Override
    public int totalRulers() {
        return 1;
    }

    @Override
    public int totalA4Booklets() {
        return this.a4Booklets;
    }

    @Override
    public void addPens(int amount) {
        pens += amount;

    }

    @Override
    public void addStaplers(int amount) {
        staplers += amount;
    }

    @Override
    public void addStaples(int amount) {
        staples += amount;
    }

    @Override
    public void assRulers(int amount) {

    }

    @Override
    public void addA4Booklets(int amount) {
        a4Booklets += amount;
    }

    @Override
    public void removePens(int amount) {
        pens -= amount;
    }

    @Override
    public void removeStaplers(int amount) {
        staplers -= amount;
    }

    @Override
    public void removeStaples(int amount) {
        staples -= amount;
    }

    @Override
    public void removeRulers(int amount) {

    }

    @Override
    public void removeA4Booklets(int amount) {
        a4Booklets -= amount;
    }
}
