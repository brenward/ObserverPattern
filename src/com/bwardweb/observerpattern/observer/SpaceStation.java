package com.bwardweb.observerpattern.observer;

import com.bwardweb.observerpattern.subject.SpaceShuttle;
import com.bwardweb.observerpattern.subject.Subject;

public class SpaceStation implements Observer{
	Subject shuttle;
	
	public SpaceStation(Subject shuttle){
		this.shuttle = shuttle;
		shuttle.addObserver(this);
	}
	
	@Override
	public void update() {
		if(shuttle instanceof SpaceShuttle){
			System.out.println("Space Shuttle: Logged movement. New coords: " + ((SpaceShuttle)shuttle).getLocation().toString());
		}		
	}
}
