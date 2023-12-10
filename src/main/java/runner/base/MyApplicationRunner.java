package runner.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
        String dbURL = "jdbc:derby:memory;create=true"; // 組み込みモード
        try (Connection conn = DriverManager.getConnection(dbURL)) {
            try (Statement stmt = conn.createStatement()) {
                // テーブルの作成
                stmt.executeUpdate("CREATE TABLE myTable (id INT, name VARCHAR(255))");

                // データの挿入
                stmt.executeUpdate("INSERT INTO myTable VALUES (1, 'Sample Data')");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    	// ジョブに渡すためのコンテキストを作成
    	JobContext context = new JobContext("INFO", 0);
    	
    	// ジョブを生成して実行
    	Job1 job = new Job1();
    	job.main(context);
    }
}