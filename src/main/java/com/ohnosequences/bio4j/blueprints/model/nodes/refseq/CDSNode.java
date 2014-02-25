/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.ohnosequences.bio4j.blueprints.model.nodes.refseq;

import com.ohnosequences.bio4j.blueprints.model.Vertex;
import com.ohnosequences.bio4j.blueprints.model.relationships.refseq.GenomeElementCDSRel;
import com.ohnosequences.bio4j.model.nodes.refseq.CDS;
import com.tinkerpop.blueprints.Direction;


/**
 * CDS
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CDSNode extends Vertex implements CDS{

    public static final String NODE_TYPE = CDSNode.class.getCanonicalName();
    
    public static final String NOTE_PROPERTY = "note";
    public static final String POSITIONS_PROPERTY = "positions";


    public CDSNode(com.tinkerpop.blueprints.Vertex v){
        super(v);
    }


    @Override
    public String getPositions(){   return String.valueOf(vertex.getProperty(POSITIONS_PROPERTY));}
    @Override
    public String getNote(){   return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}

    @Override
    public void setPositions(String value){ vertex.setProperty(POSITIONS_PROPERTY, value);}
    public void setNote(String value){ vertex.setProperty(NOTE_PROPERTY, value);}

    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(Direction.IN, GenomeElementCDSRel.NAME).iterator().next());
    }

    @Override
    public String toString(){
        return "positions = " + getPositions() + "\n" +
                "note = " + getNote();
    }
    
}
