package com.maike.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class ConnectionUtil {
     private static String url = "jdbc:mysql://192.168.0.121:3306/nafeng?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
     private static String rootName = "dzp";
     private static String rootPwd = "124263192a";
     
    private ConnectionUtil() {};
     
     static {
        try {
           
             Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
        }
     }
    
     /**
      * getConnection:.<br/>
      * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
         return DriverManager.getConnection(url,rootName,rootPwd);
     }
     
     /**
     * closeRe:.<br/>
     * @param con
     * @param pt
     * @param rs
      */
    public static void closeRe(Connection con,PreparedStatement pt,ResultSet rs) {
         if(rs != null) {
             try {
                 rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
           }finally {
                 if(pt != null) {
                    try {
                         pt.close();
                     } catch (SQLException e) {
                        // TODO Auto-generated catch block
                         e.printStackTrace();
                     }finally{
                        if(con != null) {
                            try {
                                con.close();
                            } catch (SQLException e) {
                              // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                         }
                     }
                }
            }
         }
     }
     
     /**
      * closeRe:.<br/>
      * @param con
      * @param pt
      */
    public static void closeRe(Connection con,PreparedStatement pt) {
         if(pt != null) {
            try {
                 pt.close();
             } catch (SQLException e) {
                // TODO Auto-generated catch block
                 e.printStackTrace();
             }finally {
                 if(con != null) {
                     try {
                         con.close();
                    } catch (SQLException e) {
                         // TODO Auto-generated catch block
                         e.printStackTrace();
                   }
                 }
             }
        }
     }
 
 }