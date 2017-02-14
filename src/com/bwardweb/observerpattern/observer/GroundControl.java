package com.bwardweb.observerpattern.observer;

import com.bwardweb.observerpattern.subject.SpaceShuttle;
import com.bwardweb.observerpattern.subject.Subject;

public class GroundControl implements Observer{
	Subject shuttle;
	
	public GroundControl(Subject shuttle){
		this.shuttle = shuttle;
		shuttle.addObserver(this);
	}
	
	@Override
	public void update() {
		if(shuttle instanceof SpaceShuttle){
			System.out.println("Ground Control: Logged movement. New coords: " + ((SpaceShuttle)shuttle).getLocation().toString());
		}		
	}
}
