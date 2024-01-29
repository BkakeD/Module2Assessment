/**
 * @author Blake Dykstra - bdykstra
 * CIS175 - Spring 2024
 * Jan 28, 2024
 */
package model;

/**
 * 
 */
public class Webnovel {
	private String name;
	private int chapters;
	private int chaptersPerWeek;
	private boolean completed;
	
	public Webnovel() {}
	
	public Webnovel(String name) {
		this.name = name;
		this.completed = false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getChapters() {
		return chapters;
	}
	
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
	public int getChaptersPerWeek() {
		return chaptersPerWeek;
	}
	
	public void setChaptersPerWeek(int chPerWeek) {
		this.chaptersPerWeek = chPerWeek;
	}
	
	public boolean isCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
		
		if (completed) {
			this.chaptersPerWeek = 0;
		}
	}
	
	public int chapterProjection(int weeks) {
		int newChapters = this.chaptersPerWeek * weeks;
		newChapters += this.chapters;
		return newChapters;
	}
	
	public String howLong() {
		
		if (chapters < 100) {
			return "Not very long.";
		}
		else if (chapters < 500) {
			return "Kind of long.";
		}
		else if (chapters < 1000) {
			return "Pretty long.";
		}
		else {
			return "Very long.";
		}
		
	}
	
}
