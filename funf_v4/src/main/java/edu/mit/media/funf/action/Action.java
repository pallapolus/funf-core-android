/**
 * 
 * Funf: Open Sensing Framework
 * Copyright (C) 2010-2011 Nadav Aharony, Wei Pan, Alex Pentland.
 * Acknowledgments: Alan Gardner
 * Contact: nadav@media.mit.edu
 * 
 * Author(s): Pararth Shah (pararthshah717@gmail.com)
 * 
 * This file is part of Funf.
 * 
 * Funf is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Funf is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Funf. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package edu.mit.media.funf.action;

import java.lang.Runnable;

import edu.mit.media.funf.json.IJsonObject;

public class Action implements Runnable {
        
    Action() {
    }
    
    public interface DataAcceptingAction {
        
        public void setDataSource(IJsonObject dataSource);
        
        public void setData(IJsonObject data);
    }
    
    @Override
    public final void run() {
        execute();
    }
    
    /**
     * Override this function to include the action-specific code.
     */
    protected void execute() {
        // Perform action here
    }
    
}
