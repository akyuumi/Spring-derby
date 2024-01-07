package base;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import job.Job1;

// jobパッケージ内のjobクラスを呼び出す為のエントリーポイント
@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
    	// ジョブに渡すためのコンテキストを作成
    	JobContext context = new JobContext("INFO", 0);
    	
    	// ジョブを生成して実行
    	Job1 job = new Job1();
    	job.main(context);
    }
}