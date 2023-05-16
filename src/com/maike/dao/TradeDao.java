package com.maike.dao;


import java.util.List;


import com.maike.model.Trade;

public interface TradeDao {
    
    List<Trade> selectAll();
    Trade selectByName(Integer tradeId);
    int insert(Trade trade);
    int update(Trade trade);
    int delete(Integer pid);

}
