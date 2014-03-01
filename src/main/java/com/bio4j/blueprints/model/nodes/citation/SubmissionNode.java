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
package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.ConsortiumNode;
import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.citation.submission.SubmissionAuthorRel;
import com.bio4j.blueprints.model.relationships.citation.submission.SubmissionDbRel;
import com.bio4j.blueprints.model.relationships.citation.submission.SubmissionProteinCitationRel;
import com.bio4j.model.nodes.Consortium;
import com.bio4j.model.nodes.Person;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.citation.DB;
import com.bio4j.model.nodes.citation.Submission;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * Submission protein citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubmissionNode extends Vertex implements Submission{

    public static final String NODE_TYPE = SubmissionNode.class.getCanonicalName();

    public static final String TITLE_PROPERTY = "submission_title";
    public static final String DATE_PROPERTY = "submission_date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "submission";


    public SubmissionNode(com.tinkerpop.blueprints.Vertex v){
        super(v);
    }


    @Override
    public String getTitle(){    return String.valueOf(vertex.getProperty(TITLE_PROPERTY));}
    @Override
    public String getDate(){    return String.valueOf(vertex.getProperty(DATE_PROPERTY));}


    @Override
    public void setTitle(String value){  vertex.setProperty(TITLE_PROPERTY, value);}
    @Override
    public void setDate(String value){  vertex.setProperty(DATE_PROPERTY, value);}
    
    
    /**
     * Gets the submission DB
     * @return 
     */
    @Override
    public DB getDB(){
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, SubmissionDbRel.NAME).iterator();
        if(iterator.hasNext()){
            return new DBNode(iterator.next());
        }else{
            return null;
        }
    }
    
    /**
     * gets consortium authors (if any) of the submission
     * @return 
     */
    @Override
    public List<Consortium> getConsortiumAuthors(){
        List<Consortium> list = new LinkedList<Consortium>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, SubmissionAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex currentNode = iterator.next();
            if(currentNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(ConsortiumNode.NODE_TYPE)){
                list.add(new ConsortiumNode(currentNode));
            } 
        }
        return list;
    }
    /**
     * gets person authors (if any) of the submission
     * @return 
     */
    @Override
    public List<Person> getPersonAuthors(){
        List<Person> list = new LinkedList<Person>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, SubmissionAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex currentNode = iterator.next();
            if(currentNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(PersonNode.NODE_TYPE)){
                list.add(new PersonNode(currentNode));
            } 
        }
        return list;
    }
    
    @Override
    public List<Protein> getProteinCitations(){
        List<Protein> list = new LinkedList<Protein>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, SubmissionProteinCitationRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinNode(iterator.next()));
        }
        return list;
    }


    @Override
    public String toString(){
        return "title = " + getTitle();
    }

}
