/*
 * Copyright (C) 2016 PanteLegacy @ karusmc.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.karusmc.raster.history;

import org.bukkit.block.Block;

/**
 *
 * @author PanteLegacy @ karusmc.com
 */
public class EditMemento {
    
    private String world;
    private int[] x, y, z;
    private int[] combinedBlockID;
    
    
    public EditMemento(String world, int editSize) {
        this.world = world;
        
        x = new int[editSize];
        y = new int[editSize];
        z = new int[editSize];
        combinedBlockID = new int[editSize];
    }
    
    public String getWorld() {
        return world;
    }
    
}