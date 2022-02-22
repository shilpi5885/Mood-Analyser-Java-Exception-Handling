package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	
	public String message;

	public String analyseMood (String message) throws MoodAnalysisException {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}		
	}
	
	public String analyseMood() throws MoodAnalysisException {
		if (this.message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}		
	}
	
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

}
