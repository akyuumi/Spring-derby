package job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import base.JobContext;

// Derbyを試すためのクラス
public class Job1 {
	
	public Job1() {
		
	}
	
	public String print(String value) {
		return value;
	}
	
	public int main(JobContext context) {
		
		String dbURL = "jdbc:derby:memory;create=true"; // 組み込みモード
		try (Connection conn = DriverManager.getConnection(dbURL)) {
		    try (Statement stmt = conn.createStatement()) {
		        // テーブルの作成
		        stmt.executeUpdate("CREATE TABLE myTablex (id INT, name VARCHAR(255))");

		        // データの挿入
		        stmt.executeUpdate("INSERT INTO myTablex VALUES (1, 'Sample Data')");

		        // データの選択
		        ResultSet rs = stmt.executeQuery("SELECT * FROM myTablex");
		        while (rs.next()) {
		            int id = rs.getInt("id");
		            String name = rs.getString("name");
		            System.out.println("ID: " + id + ", Name: " + name);
		        }
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}

		
//		System.out.println(context.getLogLevel());
		
		return 0;
	}
	
}
