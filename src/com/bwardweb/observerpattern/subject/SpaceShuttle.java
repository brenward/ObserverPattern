package com.bwardweb.observerpattern.subject;

import java.awt.Point;
import java.util.ArrayList;

import com.bwardweb.observerpattern.observer.Observer;

public class SpaceShuttle implements Subject{
	private ArrayList<Observer> observers;
	private Point location;
	
	public SpaceShuttle(){
		observers = new ArrayList<>();
		setLocation(new Point(0,0));
	}
	
	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
		notifyObservers();
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removerObserver(Observer observer) {
		if(observers.contains(observer)){
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:observers){
			observer.update();
		}
	}
}
