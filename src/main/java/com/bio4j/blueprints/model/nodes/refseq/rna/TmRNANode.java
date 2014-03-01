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
package com.bio4j.blueprints.model.nodes.refseq.rna;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementMRnaRel;
import com.bio4j.model.nodes.refseq.GenomeElement;
import com.bio4j.model.nodes.refseq.rna.TmRNA;
import com.bio4j.blueprints.model.Vertex;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TmRNANode extends RNANode implements TmRNA{
    
    public static final String NODE_TYPE = TmRNANode.class.getCanonicalName();
    
    public TmRNANode(com.tinkerpop.blueprints.Vertex v){
        super(v);
    }
    
    @Override
    public GenomeElement getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(com.tinkerpop.blueprints.Direction.IN, GenomeElementMRnaRel.NAME).iterator().next());
    }
    
}  
    