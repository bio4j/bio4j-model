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

package com.era7.bioinfo.bio4j.blueprints.model.nodes.refseq;

import com.era7.bioinfo.bio4j.blueprints.model.nodes.BasicVertex;
import com.era7.bioinfo.bio4j.blueprints.model.relationships.refseq.GenomeElementCDSRel;
import com.era7.bioinfo.bio4j.model.nodes.refseq.Gene;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Vertex;

/**
 * Gene
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GeneNode extends BasicVertex implements Gene{

    public static final String NODE_TYPE = GeneNode.class.getCanonicalName();

    public static final String NOTE_PROPERTY = "note";
    public static final String POSITIONS_PROPERTY = "positions";


    public GeneNode(Vertex v){
        super(v);
    }


    @Override
    public String getPositions(){   return String.valueOf(vertex.getProperty(POSITIONS_PROPERTY));}
    @Override
    public String getNote(){   return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}


    @Override
    public void setPositions(String value){ vertex.setProperty(POSITIONS_PROPERTY, value);}
    @Override
    public void setNote(String value){ vertex.setProperty(NOTE_PROPERTY, value);}

    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(Direction.IN, GenomeElementCDSRel.NAME).iterator().next());
    }   

}
