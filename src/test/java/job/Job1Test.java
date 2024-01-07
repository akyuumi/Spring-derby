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
        // JobContext�̃��b�N���쐬
        JobContext mockContext = Mockito.mock(JobContext.class);

        // ���b�N�̐U�镑����ݒ�i��: getLogLevel������̒l��Ԃ��悤�ɂ���j
        when(mockContext.getLogLevel()).thenReturn("INFO");

        // Job1�̃C���X�^���X���쐬���Amain���\�b�h���Ăяo��
        Job1 job = new Job1();
        job.main(mockContext);

        // �K�v�ɉ����āA���b�N�̐U�镑��������
        verify(mockContext).getLogLevel();
    }
 
}
