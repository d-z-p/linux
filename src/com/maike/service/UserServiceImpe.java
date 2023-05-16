package com.maike.service;

import java.util.List;

import com.maike.dao.TradeDao;
import com.maike.dao.TradeDaoImpl;
import com.maike.dao.UserDao;
import com.maike.dao.UserDaoImpl;
import com.maike.model.Trade;
import com.maike.model.TradeDto;
import com.maike.model.User;

public  class UserServiceImpe implements UserService {
    UserDao userDao = new UserDaoImpl();

    /**
     * insertUser: ʵ��ע�Ṧ��.<br/>
     */
    @Override
    public int insertUser(String userName, String userPwd, String userRePwd) {
        // TODO Auto-generated method stub
        int k = 0;
        if(userName == "" || userName == null || userPwd == "" || userRePwd == null) {
            return k;
        }
        if(!userPwd.equals(userRePwd)) {
            return k;
        }
        
        k = userDao.insert(userName,userPwd);
        
        return k;
    }

    /**
     * judgeLogin:��¼�ж� .<br/>
     */
    @Override
    public int judgeLogin(String userName, String userPwd) {
        // TODO Auto-generated method stub
        int k = 0;
        if(userName == "" || userName == null || userPwd == ""|| userPwd == null) {
            return k;
        }
        User user = userDao.selectByName(userName);
        
        if(!userPwd.equals(user.getUserPwd())) {
            k = 0;
        }else {
            k = 1;
        }
        return k;
    }
    /**
     * seleStuAll:��ѯ������Ʒ��Ϣ. <br/>
     */
//    private TradeDao tradeDao;
    @Override
    public   List<Trade> seleTradeAll() {
        // TODO Auto-generated method stub
    	TradeDao tradeDao = new TradeDaoImpl();
        return tradeDao.selectAll();
    }

    /**
     * addSTrade:���ѧ����Ϣ .<br/>
     */
    @Override
    public int addTrade(TradeDto tradeDto) {
        // TODO Auto-generated method stub
    	System.out.println("--------------2----------------");
    	TradeDao tradeDao = new TradeDaoImpl();
        int k = 0;
        String tradeName = tradeDto.getTradeName();
        String tradePrice = tradeDto.getTradePrice();
        if(tradeName == null || tradePrice == null) {
            return k;
        }
//        int IntPrice = Integer.parseInt(tradePrice);
        Trade trade = new Trade();
        trade.setTradeName(tradeName);
        trade.setTradePrice(tradePrice);
        System.out.println("--------------3----------------");
        k = tradeDao.insert(trade);
        return k;
    }

    /**
     * updateTrade:修改 .<br/>
     */
    @Override
    public int updateTrade(Trade trade) {
        // TODO Auto-generated method stub
    	TradeDao tradeDao = new TradeDaoImpl();
        return tradeDao.update(trade);
    }

    /**
     * deleteTrade :删除.<br/>
     */
    @Override
    public int deleteTrade(Integer pid) {
        // TODO Auto-generated method stub
    	TradeDao tradeDao = new TradeDaoImpl();
        return tradeDao.delete(pid);
    }

    /**
     * ͨ�����ֲ�ѯ��Ʒ
     */
    @Override
    public Trade getTradeByName(Integer tradeId) {
        // TODO Auto-generated method stub
    	TradeDao tradeDao = new TradeDaoImpl();
        return tradeDao.selectByName(tradeId);
    }


}



