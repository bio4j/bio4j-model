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

package com.ohnosequences.bio4j.blueprints.model.relationships.features;

import com.ohnosequences.bio4j.blueprints.model.Edge;
import com.ohnosequences.bio4j.blueprints.model.nodes.FeatureTypeNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.ProteinNode;
import com.ohnosequences.bio4j.model.relationships.features.BasicFeature;
import com.tinkerpop.blueprints.Direction;

/**
 * Basic feature relationship
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public abstract class BasicFeatureRel extends Edge implements BasicFeature{

    public static final String NAME = "BASIC_FEATURE";

    public static final String DESCRIPTION_PROPERTY = "feature_description";
    public static final String ID_PROPERTY = "feature_id";
    public static final String STATUS_PROPERTY = "feature_status";
    public static final String EVIDENCE_PROPERTY = "feature_evidence";
    public static final String BEGIN_PROPERTY = "feature_begin";
    public static final String END_PROPERTY = "feature_end";
    public static final String ORIGINAL_PROPERTY = "feature_original";
    public static final String VARIATION_PROPERTY = "feature_variation";
    public static final String REF_PROPERTY = "feature_ref";
    

    public BasicFeatureRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String getDescription(){
        return String.valueOf(edge.getProperty(DESCRIPTION_PROPERTY));
    }
    @Override
    public String getStatus(){
        return String.valueOf(edge.getProperty(STATUS_PROPERTY));
    }
    @Override
    public String getEvidence(){
        return String.valueOf(edge.getProperty(EVIDENCE_PROPERTY));
    }
    @Override
    public String getId(){
        return String.valueOf(edge.getProperty(ID_PROPERTY));
    }
    @Override
    public String getOriginal(){
        return String.valueOf(edge.getProperty(ORIGINAL_PROPERTY));
    }
    @Override
    public String getVariation(){
        return String.valueOf(edge.getProperty(VARIATION_PROPERTY));
    }
    @Override
    public String getRef(){
        return String.valueOf(edge.getProperty(REF_PROPERTY));
    }
    @Override
    public String getBegin(){
        return String.valueOf(edge.getProperty(BEGIN_PROPERTY));
    }
    @Override
    public String getEnd(){
        return String.valueOf(edge.getProperty(END_PROPERTY));
    }   
    @Override
    public FeatureTypeNode getFeatureType(){
        return new FeatureTypeNode(edge.getVertex(Direction.OUT));
    }
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(edge.getVertex(Direction.IN));
    }

    @Override
    public void setDescription(String value){
        edge.setProperty(DESCRIPTION_PROPERTY, value);
    }
    @Override
    public void setId(String value){
        edge.setProperty(ID_PROPERTY, value);
    }
    @Override
    public void setEvidence(String value){
        edge.setProperty(EVIDENCE_PROPERTY, value);
    }
    @Override
    public void setStatus(String value){
        edge.setProperty(STATUS_PROPERTY, value);
    }
    @Override
    public void setRef(String value){
        edge.setProperty(REF_PROPERTY,value);
    }
    @Override
    public void setBegin(String value){
        edge.setProperty(BEGIN_PROPERTY, String.valueOf(value));
    }
    @Override
    public void setEnd(String value){
        edge.setProperty(END_PROPERTY, String.valueOf(value));
    }
    @Override
    public void setOriginal(String value){
        edge.setProperty(ORIGINAL_PROPERTY, value);
    }
    @Override
    public void setVariation(String value){
        edge.setProperty(VARIATION_PROPERTY, value);
    }

    @Override
    public String toString(){
        return "description = " + getDescription() + "\n" +
                "status = " + getStatus() + "\n" +
                "evidence = " + getEvidence() + "\n" +
                "id = " + getId() + "\n" +
                "begin = " + getBegin() + "\n" +
                "end = " + getEnd() + "\n" +
                "ref = " + getRef() + "\n" +
                "original = " + getOriginal() + "\n" +
                "variation = " + getVariation();
    }

}
