package MYSQLprogram;

import java.sql.*;

public class Day12task {

public static  void main(String[]args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String Url="jdbc:mysql://localhost:3306/addon";
	String username ="root";
	String password ="";
	
	
	Connection connect= DriverManager.getConnection(Url,username,password);
	System.out.println("Driver sucessfully loaded");

}
}
