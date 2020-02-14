import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class dbtest {
	Statement statement=null;
	ResultSet resultSet=null;
	String msAccDB= "E:\\abc.mdb";
	String dbURL="jdbc:ucanaccess://"+msAccDB;
	 Connection connection;
  @Test
  public void test1() throws SQLException 
  {
	  resultSet=statement.executeQuery("SELECT * FROM DEPT");
	  while(resultSet.next())
	  {
		  System.out.println("Department id"+resultSet.getString(2));
	  }
  }
  @Test
  public void test2() throws SQLException 
  {
	  resultSet=statement.executeQuery("SELECT * FROM DEPT");
	  while(resultSet.next())
	  {
		  System.out.println("Department name"+resultSet.getString(1));
	  }
  }
  @BeforeMethod
  public void beforeMethod() throws SQLException
  {
	  connection = DriverManager.getConnection(dbURL);
	  statement=connection.createStatement();
	  
  }

  @AfterMethod
  public void afterMethod() throws SQLException {

	connection.close();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
