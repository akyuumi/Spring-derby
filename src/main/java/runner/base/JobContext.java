package runner.base;

public class JobContext {
	
	private String logLevel;
	private int exePattern;
	
	public JobContext(String logLevel, int exePattern) {
		this.setLogLevel(logLevel);
		this.setExePattern(exePattern);
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public int getExePattern() {
		return exePattern;
	}

	public void setExePattern(int exePattern) {
		this.exePattern = exePattern;
	}
	
}
