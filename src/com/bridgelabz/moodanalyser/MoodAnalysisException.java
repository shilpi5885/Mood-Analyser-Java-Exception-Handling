package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -426855185169002787L;
	
	public enum Code {
		IS_NULL,
		IS_EMPTY,
	};
	public MoodAnalysisException(Code code) {
		super(code.name());
	}
}
