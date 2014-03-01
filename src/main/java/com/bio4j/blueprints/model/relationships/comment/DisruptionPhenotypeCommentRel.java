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

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.DisruptionPhenotypeComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Description of the effects caused by the disruption of a protein-encoding gene
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DisruptionPhenotypeCommentRel extends BasicCommentRel implements DisruptionPhenotypeComment{

    public static final String NAME = "COMMENT_DISRUPTION_PHENOTYPE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "disruption phenotype";

    public DisruptionPhenotypeCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
