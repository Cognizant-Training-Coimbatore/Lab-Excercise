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
	String msAccDB="D:/mydb2.mdb";
	String dbURL="jdbc:ucanaccess://"+msAccDB;
  @Test
  public void test1() throws SQLException 
  {
	  resultSet=statement.executeQuery("SELECT * FROM DEPT");
	  while(resultSet.next())
	  {
		  System.out.println("Department id"+resultSet.getInt(2));
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
	  Connection connection = DriverManager.getConnection(dbURL);
	  statement=connection.createStatement();
	  
  }

  @AfterMethod
  public void afterMethod() throws SQLException {
	  Connection connection = null;
	connection.close();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
