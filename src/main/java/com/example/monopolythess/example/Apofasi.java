package com.example.monopolythess.example;

public class Apofasi extends Cards{

    public Apofasi(String cardName, String Type,int x,int y) {
        super(cardName, Type,x,y);
    }
    public Apofasi(String cardName, String Type) {
        super(cardName, Type);
    }

    @Override
    public boolean Do(Player player){return  true;}
}
