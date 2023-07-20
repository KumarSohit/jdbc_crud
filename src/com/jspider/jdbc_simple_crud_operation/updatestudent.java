 /**
 * 
 */
package com.jspider.jdbc_simple_crud_operation;

  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updatestudent {
        public static void main(String[] args) {
        	
        	
        	Scanner scanner=new Scanner(System.in) ;
        	
        	System.out.println("Enter student id to update email");
        	
        	int id=scanner.nextInt();
        	System.out.println("enter new email updated");
        	String email=scanner.next();
        	
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
       
         String updatestudentEmailqueryquery="update student set email='"+email+"' where id="+id;
         
         
        		 
        		 int a=statement.executeUpdate(updatestudentEmailqueryquery);
        		 if(a==1) {
        			 
        			 System.out.println("Data-----Updated----");
        		 }
        		 else {
        			 
        			 System.out.println("Given id is not present");
        		 }
        		 
  
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
        		 
       
