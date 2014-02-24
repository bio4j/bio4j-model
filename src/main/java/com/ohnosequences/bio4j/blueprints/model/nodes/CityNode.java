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

package com.ohnosequences.bio4j.blueprints.model.nodes;

import com.ohnosequences.bio4j.blueprints.model.nodes.citation.BookNode;
import com.ohnosequences.bio4j.blueprints.model.relationships.citation.book.BookCityRel;
import com.ohnosequences.bio4j.model.nodes.City;
import com.ohnosequences.bio4j.model.nodes.citation.Book;
import com.tinkerpop.blueprints.Direction;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Just nodes representing different cities of the world
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CityNode extends Vertex implements City{

    public static final String NODE_TYPE = CityNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "city_name";


    public CityNode(com.tinkerpop.blueprints.Vertex v){
        super(v);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}
    
    
    @Override
    public List<Book> getBooks(){
        List<Book> list = new LinkedList<Book>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, BookCityRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new BookNode(iterator.next()));
        }
        return list;
    }


    @Override
    public String toString(){
        return "name = " + getName();
    }

}
