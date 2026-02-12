package Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcConn {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/companydb";
		String user = "root";
		String pass = "system";
		
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement();
			
//			stmt.execute("CREATE TABLE IF NOT EXISTS EMP(EMPNO INT PRIMARY KEY, ENAME VARCHAR(50) UNIQUE NOT NULL, SAL INT CHECK(SAL > 0))");
//			stmt.execute("INSERT INTO EMP (EMPNO, ENAME, SAL) VALUES (101, 'ADITYA', 51000)");
			
			ResultSet res = stmt.executeQuery("SELECT * FROM EMP");
			
			while(res.next()) {
				System.out.println("EMP NO: " + res.getInt("EMPNO") + " EMP NAME: " + res.getString("ENAME") + " EMP SALARY: " + res.getInt("SAL"));
			}
			
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
