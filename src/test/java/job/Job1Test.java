package job;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import base.JobContext;

class Job1Test {
	
    Job1 job;

    @BeforeEach
    void setUp() {
        job = new Job1();
    }
	
	@Test
	void test() {
		Assertions.assertEquals("Hello World", job.print("Hello World"));
	}
	@Test
    void testMainMethod() {
        // JobContextのモックを作成
        JobContext mockContext = Mockito.mock(JobContext.class);

        // モックの振る舞いを設定（例: getLogLevelが特定の値を返すようにする）
        when(mockContext.getLogLevel()).thenReturn("INFO");

        // Job1のインスタンスを作成し、mainメソッドを呼び出す
        Job1 job = new Job1();
        job.main(mockContext);

        // 必要に応じて、モックの振る舞いを検証
        verify(mockContext).getLogLevel();
    }
 
}
