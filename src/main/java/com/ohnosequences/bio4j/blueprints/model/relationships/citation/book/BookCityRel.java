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

package com.ohnosequences.bio4j.blueprints.model.relationships.citation.book;

import com.ohnosequences.bio4j.blueprints.model.nodes.CityNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.citation.BookNode;
import com.ohnosequences.bio4j.blueprints.model.relationships.BasicRelationshipBlueprints;
import com.ohnosequences.bio4j.model.relationships.citation.book.BookCity;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;

/**
 * City where a book is published in
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BookCityRel extends BasicRelationshipBlueprints implements BookCity{

    public static final String NAME = "BOOK_CITY_REL";

    public BookCityRel(Edge e){
        super(e);
    }
    
    @Override
    public BookNode getBook(){
        return new BookNode(getVertex(Direction.IN));
    }
    
    @Override
    public CityNode getCity(){
        return new CityNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
