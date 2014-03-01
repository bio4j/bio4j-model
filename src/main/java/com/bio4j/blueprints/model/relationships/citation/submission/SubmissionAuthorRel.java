/*
 * Copyright (C) 2010-2013  "Bio4j"
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

package com.bio4j.blueprints.model.relationships.citation.submission;

import com.bio4j.blueprints.model.nodes.citation.SubmissionNode;
import com.bio4j.model.relationships.citation.submission.SubmissionAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Submission authors
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubmissionAuthorRel extends Edge implements SubmissionAuthor{

    public static final String NAME = "SUBMISSION_AUTHOR";

    public SubmissionAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public SubmissionNode getSubmission(){
        return new SubmissionNode(getVertex(Direction.IN));
    }    
    
    

    @Override
    public String getType() {
        return NAME;
    }

}
