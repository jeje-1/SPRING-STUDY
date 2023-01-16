package strategy.framework.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import strategy.framework.ConnectionCreator;

public class JDBCTemplate {
   
  private ConnectionCreator connectionCreator;
      
   
   public JDBCTemplate(ConnectionCreator connectionCreator) {
      try {
      
         Class.forName("com.mysql.cj.jdbc.Driver");
         this.connectionCreator = connectionCreator;
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   public Connection getConnection() {
	   return connectionCreator.getConnection();
   }
   
   
   public void commit(Connection conn) {
      
      try {
         conn.commit();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }
   
   public void rollback(Connection conn) {
      
      try {
         conn.rollback();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   
   public void close(ResultSet rset) {
      
      try {
         
         if(rset != null && !rset.isClosed()) rset.close();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   
   public void close(Statement stmt) {
      
      try {
         
         if(stmt != null && !stmt.isClosed()) stmt.close();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   public void close(Connection conn) {
      
      try {
         
         if(conn != null && !conn.isClosed()) conn.close();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   
   public void close(ResultSet rset, Statement stmt) {
      close(rset);
      close(stmt);
   }
   
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}