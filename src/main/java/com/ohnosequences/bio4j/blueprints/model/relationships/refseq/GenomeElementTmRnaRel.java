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
package com.ohnosequences.bio4j.blueprints.model.relationships.refseq;

import com.ohnosequences.bio4j.blueprints.model.Edge;
import com.ohnosequences.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.refseq.rna.TmRNANode;
import com.ohnosequences.bio4j.model.relationships.refseq.GenomeElementTmRna;
import com.tinkerpop.blueprints.Direction;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GenomeElementTmRnaRel extends Edge implements GenomeElementTmRna{

    public static final String NAME = "GENOME_ELEMENT_TMRNA";

    public GenomeElementTmRnaRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public TmRNANode getTmRNA(){
        return new TmRNANode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
