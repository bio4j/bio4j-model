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

import com.bio4j.model.relationships.comment.OnlineInformationComment;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author ppareja
 */
public class OnlineInformationCommentRel extends BasicCommentRel implements OnlineInformationComment{

    public static final String NAME = "COMMENT_ONLINE_INFORMATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "online information";

    public static final String NAME_PROPERTY = "online_information_comment_name";
    public static final String LINK_PROPERTY = "online_information_comment_link";

    public OnlineInformationCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getName(){
        return String.valueOf(edge.getProperty(NAME_PROPERTY));
    }
    @Override
    public String getLink(){
        return String.valueOf(edge.getProperty(LINK_PROPERTY));
    }

    @Override
    public void setName(String value){
        edge.setProperty(NAME_PROPERTY, value);
    }
    @Override
    public void setLink(String value){
        edge.setProperty(LINK_PROPERTY, value);
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

