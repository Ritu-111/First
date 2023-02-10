package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcPractice", "root", "root");
			 Statement st=con.createStatement();
			  
			    //table creation
			     //st.execute("create table hospital(id int,name varchar(30),adress varchar(50))");
			   // st.execute("insert into hospital(id,name,adress) values (25,'gandhi hos','shivaji chauk pune'),(16,'gajanan hos','vaibhav nagar latur'),(55,'sita hos','deccan pune'),(22,'jay hos','deccan pune')");
			    //delete op
			   // st.execute("delete from hospital where id=16");
			    //update
			   // st.execute("update hospital set name='shine hos' where id=55");
			 ResultSet rs=st.executeQuery("select * from hospital");
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
			 
		}
		catch (ClassNotFoundException e) {
			
		}
        catch (SQLException e) {
			
		}


	}

}
