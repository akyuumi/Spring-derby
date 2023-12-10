package runner.base;

public class Job1 {
	
	public Job1() {
		
	}
	
	public String print(String value) {
		return value;
	}
	
	public int main(JobContext context) {
		
		System.out.println(context.getLogLevel());
		
		return 0;
	}
	
}
