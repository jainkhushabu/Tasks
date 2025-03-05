package tast15;
import java.sql.*;

public class DataBaseConnection {

    public static void main(String[] args) {
	        // JDBC URL, username, and password of MySQL server
	        String url = "jdbc:mysql://localhost:3306/sampledb"; // Change "sampledb" to your database name
	        String user = "root"; // Change to your database username
	        String password = "password"; // Change to your database password

	        // Query to select all records from a sample table
	        String query = "SELECT * FROM sample_table"; // Change "sample_table" to your actual table name

	        try {
	            // Load MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish the connection
	            Connection conn = DriverManager.getConnection(url, user, password);

	            // Create a statement
	            Statement stmt = conn.createStatement();

	            // Execute the query
	            ResultSet rs = stmt.executeQuery(query);

	            // Process the result set
	            while (rs.next()) {
	                // Assuming the table has columns id (int) and name (varchar)
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                System.out.println("ID: " + id + ", Name: " + name);
	            }

	            // Close resources
	            rs.close();
	            stmt.close();
	            conn.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Database connection error!");
	            e.printStackTrace();
	        }
	    }
	}


