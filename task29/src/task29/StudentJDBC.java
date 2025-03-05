package task29;
import java.sql.*;

	public class StudentJDBC {
	    private static final String URL = "jdbc:mysql://localhost:3306/school";
	    private static final String USER = "root"; // Change if needed
	    private static final String PASSWORD = "password"; // Change if needed

	    public static void main(String[] args) {
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            insertStudent(conn, "Alice", 20, "A");
	            updateStudent(conn, 1, "Alice Brown");
	            deleteStudent(conn, 1);
	            retrieveStudents(conn);
	            callStoredProcedure(conn);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void insertStudent(Connection conn, String name, int age, String grade) throws SQLException {
	        String sql = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setInt(2, age);
	            pstmt.setString(3, grade);
	            pstmt.executeUpdate();
	            System.out.println("Student inserted successfully.");
	        }
	    }

	    private static void updateStudent(Connection conn, int id, String newName) throws SQLException {
	        String sql = "UPDATE students SET name = ? WHERE id = ?";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, newName);
	            pstmt.setInt(2, id);
	            pstmt.executeUpdate();
	            System.out.println("Student updated successfully.");
	        }
	    }

	    private static void deleteStudent(Connection conn, int id) throws SQLException {
	        String sql = "DELETE FROM students WHERE id = ?";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            pstmt.executeUpdate();
	            System.out.println("Student deleted successfully.");
	        }
	    }

	    private static void retrieveStudents(Connection conn) throws SQLException {
	        String sql = "SELECT * FROM students";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
	                        ", Age: " + rs.getInt("age") + ", Grade: " + rs.getString("grade"));
	            }
	        }
	    }

	    private static void callStoredProcedure(Connection conn) throws SQLException {
	        String sql = "{CALL GetEmployeeDetails()}";
	        try (CallableStatement cstmt = conn.prepareCall(sql);
	             ResultSet rs = cstmt.executeQuery()) {
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
	                        ", Position: " + rs.getString("position") + ", Salary: " + rs.getDouble("salary"));
	            }
	        }
	    }
	}


