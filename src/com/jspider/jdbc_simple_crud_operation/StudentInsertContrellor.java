package com.jspider.jdbc_simple_crud_operation;

  import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentInsertContrellor {
        public static void main(String[] args) {
        	
        Connection connection=null;
			
       try {
    	   
    	   // step-1 load/register Driver
    	   
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   
    
    	   // step-2 create connection
    	   
    	 String url="jdbc:mysql://localhost:3306/qspider";
    	 String user="root";
    	 String pass="root";
    	 
    	 connection=DriverManager.getConnection(url, user, pass);   
    	  
       	
       //    Step-3 create statement
    	 
       Statement statement=connection.createStatement();
       
               //step-4 execute
       
         String insertstudentquery="insert into student values(10 ,'soh','sohit@gmail.com',7543895568)";
        		 
        		 statement.execute(insertstudentquery);
        		 
        		 
        		 System.out.println("++++++++Data-------Store+++++++");
        		 
       }
       catch(ClassNotFoundException | SQLException e) {
    	   
    	   
    	   
    	   // Todo Auto-generated catch block
    	   e.printStackTrace();
       }
       finally {
    	   
    	   try {
    		   
    		 //step-5 close connection
    		   connection.close();
    		   
    	   }
    	   
    	   
    	   catch(SQLException e) {
    		   
    		   //Todo Auto-generated catch block
    		   
    		   e.printStackTrace();
    	   }
       }
        		 
  }
}
        		 
       
       
  
       