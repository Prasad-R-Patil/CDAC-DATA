package io_programming;

import java.io.Serializable;

public class Course  implements Serializable{
	private String title;
	private int duration;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [title=" + title + ", duration=" + duration + "]";
	}
	

}
