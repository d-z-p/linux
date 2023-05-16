package com.maike.service;

import java.util.List;

import com.maike.model.Trade;
import com.maike.model.TradeDto;

public interface UserService {
    
    int insertUser(String userName,String userPwd,String userRePwd);
    int judgeLogin(String userName,String userPwd);
    
    List<Trade> seleTradeAll();
    int addTrade(TradeDto tradeDto);
    int updateTrade(Trade trade);
    int deleteTrade(Integer pid);
    Trade getTradeByName(Integer tradeId);

}

