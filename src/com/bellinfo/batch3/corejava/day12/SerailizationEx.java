package com.bellinfo.batch3.corejava.day12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerailizationEx {

	public static void main(String[] args) {
		
		String fileName = "website.txt";
		String absPath = System.getProperty("user.dir");
		String fullPath = absPath+File.separator+fileName;
		
		WebSite ws = new WebSite();
		ws.setwName("Google");
		ws.setRank(1);
		ws.setPurpose("searching");
		
		try(FileOutputStream fos = new FileOutputStream(fullPath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			oos.writeObject(ws);
			oos.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

class WebSite implements Serializable{

	private static final long serialVersionUID = 12343434;
	private String wName;
	private int rank;
	private transient String purpose;
	
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String toString(){
		return "Website Details "+wName+" "+rank+" "+purpose;
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj instanceof WebSite){
			WebSite otherSite = (WebSite)obj;
			if(wName.equals(otherSite.getwName()) &&
					rank == otherSite.getRank() &&
					purpose.equals(otherSite.getPurpose())){
				return true;
			}	
		}
		return false;
	}
	
	public int hashCode(){
		
		return 31*rank*wName.hashCode()*purpose.hashCode();
	}
}