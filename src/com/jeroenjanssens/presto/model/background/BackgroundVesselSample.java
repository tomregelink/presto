/**
 * Copyright 2009 Tilburg University. All rights reserved.
 * 
 * This file is part of Presto.
 *
 * Presto is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Presto is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Presto.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jeroenjanssens.presto.model.background;

import java.io.Serializable;


/**
 * @author Jeroen Janssens
 * @created June 6, 2009
 */

public class BackgroundVesselSample implements Serializable {

	private static final long serialVersionUID = -8008697143588732847L;
	
	private BackgroundVessel vessel;
	private double latitude;
	private double longitude;
	private double heading;
	
	public BackgroundVesselSample(BackgroundVessel vessel, double latitude, double longitude, double heading) {
		this.vessel = vessel;
		this.latitude = latitude;
		this.longitude = longitude;
		this.heading = heading;
	}

	public BackgroundVessel getVessel() {
		return vessel;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getHeading() {
		return heading;
	}
}
