package spring.derby;

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
    	
//        String dbURL = "jdbc:derby:myDerbyDB;create=true"; // �g�ݍ��݃��[�h
//        try (Connection conn = DriverManager.getConnection(dbURL)) {
//            try (Statement stmt = conn.createStatement()) {
//                // �e�[�u���̍쐬
//                stmt.executeUpdate("CREATE TABLE myTable (id INT, name VARCHAR(255))");
//
//                // �f�[�^�̑}��
//                stmt.executeUpdate("INSERT INTO myTable VALUES (1, 'Sample Data')");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        System.out.println(concatStr("Hello", "World"));
    }
    
    private String concatStr(String a, String b) {
    	
    	String ab = a + b;
    	return ab;
    	
    }
}