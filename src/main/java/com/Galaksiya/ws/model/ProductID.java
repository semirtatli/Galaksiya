package com.Galaksiya.ws.model;
//ProductId is special so it needs its own class
public class ProductID {

    private final String id;

    public ProductID(final String id) {this.id = id;}

    public String getId(){return this.id;}
}
