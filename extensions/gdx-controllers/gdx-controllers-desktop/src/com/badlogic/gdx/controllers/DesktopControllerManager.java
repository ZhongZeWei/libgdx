
package com.badlogic.gdx.controllers;

import com.badlogic.gdx.utils.Array;

/** @author Nathan Sweet */
public class DesktopControllerManager implements ControllerManager {
	final Array<Controller> controllers = new Array();
	final Array<ControllerListener> listeners = new Array();

	public DesktopControllerManager () {
		new OisControllers(this);
	}

	public Array<Controller> getControllers () {
		return controllers;
	}

	public void addListener (ControllerListener listener) {
		listeners.add(listener);
	}

	public void removeListener (ControllerListener listener) {
		listeners.removeValue(listener, true);
	}
}
