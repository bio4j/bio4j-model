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

package com.ohnosequences.bio4j.blueprints.model.relationships.ncbi;

import com.ohnosequences.bio4j.blueprints.model.relationships.BasicRelationshipBlueprints;
import com.ohnosequences.bio4j.model.relationships.ncbi.NCBITaxonParent;
import com.tinkerpop.blueprints.Edge;


/**
 * Rel. leading to the child of the current NCBITaxon node
 * @author ppareja
 */
public class NCBITaxonParentRel extends BasicRelationshipBlueprints implements NCBITaxonParent{

    public static final String NAME = "TAXON_PARENT_NCBI";

    public NCBITaxonParentRel(Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}