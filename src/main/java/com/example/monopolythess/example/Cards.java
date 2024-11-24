package com.example.monopolythess.example;
public class Cards {
    private String CardName;
    private String Type;
    private int x,y;
    public Cards(){}
    public Cards(String cardName,String Type, int x, int y){
        this.CardName=cardName;
        this.Type=Type;
        this.x=x;
        this.y=y;
    }

    // Constructor with cardName and Type only
    public Cards(String cardName, String Type) {
        this.CardName = cardName;
        this.Type = Type;
    }

    public boolean Do(Player player){
        return true;
    };

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCardName() {
        return CardName;
    }
    public String getType() {
        return Type;
    }
    public void setCardName(String cardName) {
        CardName = cardName;
    }
    public void setType(String type) {
        Type = type;
    }
}
