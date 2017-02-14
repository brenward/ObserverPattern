package com.bwardweb.observerpattern.subject;

import com.bwardweb.observerpattern.observer.Observer;

public interface Subject {
	void addObserver(Observer observer);
	void removerObserver(Observer observer);
	void notifyObservers();
}
