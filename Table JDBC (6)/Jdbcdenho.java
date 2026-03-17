package jdbcdenho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Jdbcdenho {

public static void main(String[] args) {

Connection con = null;
Statement st = null;
ResultSet rs = null;

try {

// Load driver
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

// Connect to database
con = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");

// Create statement
st = con.createStatement();

// Delete old records
st.executeUpdate("DELETE FROM student");

// Insert records
st.executeUpdate("INSERT INTO student VALUES(101,'ramjan')");
st.executeUpdate("INSERT INTO student VALUES(102,'yasmeen')");
st.executeUpdate("INSERT INTO student VALUES(103,'vaishnavi')");
st.executeUpdate("INSERT INTO student VALUES(104,'rashid')");
st.executeUpdate("INSERT INTO student VALUES(105,'rashid')");

// Update record
st.executeUpdate("UPDATE student SET name='sanjai' WHERE regno=104");

// Fetch records
rs = st.executeQuery("SELECT * FROM student");

// Display output
while(rs.next()){
System.out.println("---------------------------");
System.out.println("Register No: " + rs.getInt("regno"));
System.out.println("Name: " + rs.getString("name"));
}

// Close connection
con.close();

}
catch(Exception e){
System.out.println("Error: " + e);
}
}
}