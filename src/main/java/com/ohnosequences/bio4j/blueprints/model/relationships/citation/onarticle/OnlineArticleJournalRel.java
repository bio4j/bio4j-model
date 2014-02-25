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

package com.ohnosequences.bio4j.blueprints.model.relationships.citation.onarticle;

import com.ohnosequences.bio4j.blueprints.model.nodes.citation.OnlineArticleNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.citation.OnlineJournalNode;
import com.ohnosequences.bio4j.model.relationships.citation.onarticle.OnlineArticleJournal;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;

/**
 * Online journal where an online article is published
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineArticleJournalRel extends Edge implements OnlineArticleJournal{

    public static final String NAME = "ONLINE_ARTICLE_JOURNAL";

    public static final String LOCATOR_PROPERTY = "locator";

    public OnlineArticleJournalRel(Edge e){
        super(e);
    }


    @Override
    public String getLocator(){    return String.valueOf(edge.getProperty(LOCATOR_PROPERTY));}

    @Override
    public void setLocator(String value){  edge.setProperty(LOCATOR_PROPERTY, value);}
    
    @Override
    public OnlineArticleNode getOnlineArticle(){
        return new OnlineArticleNode(getVertex(Direction.IN));
    }
    
    @Override
    public OnlineJournalNode getOnlineJournal(){
        return new OnlineJournalNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "locator = " + getLocator();
    }

}