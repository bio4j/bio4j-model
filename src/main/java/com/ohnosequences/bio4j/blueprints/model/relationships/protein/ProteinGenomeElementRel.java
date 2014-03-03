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
package com.ohnosequences.bio4j.blueprints.model.relationships.protein;

import com.ohnosequences.bio4j.blueprints.model.Edge;
import com.ohnosequences.bio4j.blueprints.model.nodes.ProteinNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.ohnosequences.bio4j.model.relationships.protein.ProteinGenomeElement;
import com.tinkerpop.blueprints.Direction;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinGenomeElementRel extends Edge implements ProteinGenomeElement{
    
    public static final String NAME = "PROTEIN_GENOME_ELEMENT";

    public ProteinGenomeElementRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }
}
