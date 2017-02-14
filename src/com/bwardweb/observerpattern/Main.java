package com.bwardweb.observerpattern;

import java.awt.Point;

import com.bwardweb.observerpattern.observer.GroundControl;
import com.bwardweb.observerpattern.observer.SpaceStation;
import com.bwardweb.observerpattern.subject.SpaceShuttle;

public class Main {

	public static void main(String[] args) {
		SpaceShuttle shuttle= new SpaceShuttle();
		GroundControl groundControl = new GroundControl(shuttle);
		SpaceStation spaceStation = new SpaceStation(shuttle);
		
		System.out.println("--- SHUTTLE MOVING ---");
		shuttle.setLocation(new Point(2,1));
		System.out.println("--- SPACE STATION CAN'T OBSERVE SHUTTLE ---");
		shuttle.removerObserver(spaceStation);		
		System.out.println("--- SHUTTLE MOVING ---");
		shuttle.setLocation(new Point(2,2));
		System.out.println("--- SPACE STATION CAN OBSERVE SHUTTLE AGAIN ---");
		shuttle.addObserver(spaceStation);		
		System.out.println("--- SHUTTLE MOVING ---");
		shuttle.setLocation(new Point(4,2));

	}

}
