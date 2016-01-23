package com.bellinfo.batch3.corejava.day13;
class Movie{
	private String language;
	private int rating;
	private String name;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name + " "+rating+" "+language;
	}
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj instanceof Movie){
			Movie other = (Movie)obj;
			if(name.equals(other.getName()) &&
			   rating ==other.getRating() &&
			   language.equals(other.getLanguage())){
				return true;
			}
		}
	  return false;	
	}
}