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

package com.jeroenjanssens.presto.views.earth.tools;

import java.awt.event.MouseEvent;


/**
 * @author Jeroen Janssens
 * @created June 6, 2009
 */

public class FreeTransformTool extends AbstractTool {

	public FreeTransformTool(EarthViewToolBar earthViewToolBar) {
		super(earthViewToolBar, "Free Transform Tool","icons/navigate.png", EarthViewToolBar.TOOL_FREETRANSFORM);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed in " + name);
	}

}
