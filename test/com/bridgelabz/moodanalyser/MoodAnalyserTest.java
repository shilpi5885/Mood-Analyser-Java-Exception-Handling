package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
	private MoodAnalyser moodAnalyser;
	
	@Before
	public void MoodAnalyserObj() {
		moodAnalyser = new MoodAnalyser();
	}
	
	@Test
	public void testSadMood_thenAssertionSucceeds() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		
		String mood = moodAnalyser.analyseMood("This is a sad message");
		
		Assert.assertEquals(mood, "SAD");
	}
	
	@Test
	public void testHappyMood_thenAssertionSucceeds() {
		try {
			String mood = moodAnalyser.analyseMood("This is any message");
			Assert.assertEquals(mood, "HAPPY");
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSadMood_thenAssertionSucceeds1() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad");
		
		String mood = moodAnalyser.analyseMood();
		
		Assert.assertEquals(mood, "SAD");
	}
	
	@Test
	public void testHappyMood_thenAssertionSucceeds1() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
		
		String mood = moodAnalyser.analyseMood();
		
		Assert.assertEquals(mood, "HAPPY");
	}

	@Test
	public void testInvalidMood_whenMoodIsNull() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		
			String mood = moodAnalyser.analyseMood();
			System.out.println("invalid mood");
			Assert.assertNull(mood);
		}
		catch (NullPointerException e) {
			System.out.println(); 
		}
		catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testInvalidMood_whenMoodIsEmpty() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
		
			String mood = moodAnalyser.analyseMood();
		
			Assert.assertNull(mood);
		}
		catch (NullPointerException e) {
			System.out.println(); 
		}
		catch (MoodAnalysisException ex) {
			System.out.println(ex);
		}
	}
}
