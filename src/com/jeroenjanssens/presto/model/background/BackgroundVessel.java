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

public class BackgroundVessel implements Serializable {

	private static final long serialVersionUID = 4243891499965382111L;
	
	private int IMONumber;
	private int MMSINumber;
  
	public int getIMONumber() {
		return IMONumber;
	}
	
	public void setIMONumber(int number) {
		IMONumber = number;
	}
	
	public void setMMSINumber(int number) {
		MMSINumber = number;
	}
	
	public int getMMSINumber() {
		return MMSINumber;
	}
}
