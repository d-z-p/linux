package com.maike.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.maike.model.Trade;
import com.maike.util.ConnectionUtil;

public class TradeDaoImpl implements TradeDao {
    Trade trade;
    Connection con = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    String sql;

    /**
     * 查询所有宿舍
     */
    @Override
    public List<Trade> selectAll() {
        // TODO Auto-generated method stub
    	System.out.println("---------------10-----------------------");
        List<Trade> list = new ArrayList<Trade>();
        sql = "select * from trade";
        try {
        	System.out.println("---------------11-----------------------");
            con = ConnectionUtil.getConnection();
            pt = con.prepareStatement(sql);
            rs = pt.executeQuery();
            
            while(rs.next()) {
            	System.out.println("---------------12-----------------------");
                trade = new Trade();
                trade.setTradeId(rs.getInt("tradeId"));
                trade.setTradeName(rs.getString("tradename"));
                trade.setTradePrice(rs.getString("tradeprice"));
                System.out.println("---------------13-----------------------");
                list.add(trade);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeRe(con, pt, rs);
        }
        return list;
    }

    /**
     * 查询
     */
    @Override
    public Trade selectByName(Integer tradeId) {
        // TODO Auto-generated method stub
        sql = "select * from trade where tradeId = ?";
        try {
            con = ConnectionUtil.getConnection();
            pt = con.prepareStatement(sql);
            pt.setLong(1, tradeId);
            rs = pt.executeQuery();
            
            while(rs.next()) {
                trade = new Trade();
                trade.setTradeId(rs.getInt("tradeId"));
                trade.setTradeName(rs.getString("tradename"));
                trade.setTradePrice(rs.getString("tradeprice"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeRe(con, pt, rs);
        }
        return trade;
    }

    /**
     * 插入、添加
     */
    @Override
    public int insert(Trade trade) {
        // TODO Auto-generated method stub
    	System.out.println("--------------4----------------");
        int k = 0;
        sql = "insert into trade values(null,?,?)";
        try {
            con = ConnectionUtil.getConnection();
            pt = con.prepareStatement(sql);
            pt.setString(1, trade.getTradeName());
            pt.setString(2, trade.getTradePrice());
            System.out.println("--------------5----------------");
            
            k = pt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeRe(con, pt);
        }
        return k;
    }

    /**
     * 修改
     */
    @Override
    public int update(Trade  trade) {
        // TODO Auto-generated method stub
        int k = 0;
        sql = "update trade set tradeprice = ?, tradename = ? where tradeid = ?";
        try {
            con = ConnectionUtil.getConnection();
            pt = con.prepareStatement(sql);
            pt.setString(1, trade.getTradePrice());
            pt.setString(2, trade.getTradeName());
            pt.setInt(3, trade.getTradeId());
            
            k = pt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeRe(con, pt);
        }
        return k;
    }

    /**
     * 删除
     */
    @Override
    public int delete(Integer pid) {
        // TODO Auto-generated method stub
        int k = 0;
        sql = "delete from trade where tradeId = ?";
        try {
            con = ConnectionUtil.getConnection();
            pt = con.prepareStatement(sql);
            pt.setLong(1, pid);
            
            k = pt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeRe(con, pt);
        }
        return k;
    }

}