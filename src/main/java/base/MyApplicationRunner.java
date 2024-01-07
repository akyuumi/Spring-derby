package base;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import job.Job1;

// job�p�b�P�[�W����job�N���X���Ăяo���ׂ̃G���g���[�|�C���g
@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
    	// �W���u�ɓn�����߂̃R���e�L�X�g���쐬
    	JobContext context = new JobContext("INFO", 0);
    	
    	// �W���u�𐶐����Ď��s
    	Job1 job = new Job1();
    	job.main(context);
    }
}