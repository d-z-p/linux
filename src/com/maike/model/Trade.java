package com.maike.model;

public class Trade {
    
    private int tradeId;
    
    private String tradeName;
    
    private String tradePrice;

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }


    public String getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
    }

    @Override
    public String toString() {
        return "Trade [tradeId=" + tradeId + ",tradeName=" + tradeName + ", tradePrice=" + tradePrice + "]";
    }

}