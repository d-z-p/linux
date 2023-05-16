package com.maike.model;

public class TradeDto {

    private String tradeId;
    
    private String tradeName;
      
    private String tradePrice;

    public String getTradeId() {
        return tradeId;
    }

    public void setStuId(String tradeId) {
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

    public  void setTradePrice(String tradePrice) {
       this.tradePrice=tradePrice;
    }

    @Override
    public String toString() {
        return "TradeDto [tradeId=" + tradeId + ", tradeName=" + tradeName + ",  tradePrice=" + tradePrice + "]";
    }

}