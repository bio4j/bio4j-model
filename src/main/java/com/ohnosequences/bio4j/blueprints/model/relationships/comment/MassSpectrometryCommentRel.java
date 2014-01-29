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

package com.ohnosequences.bio4j.blueprints.model.relationships.comment;

import com.ohnosequences.bio4j.model.relationships.comment.MassSpectometryComment;
import com.tinkerpop.blueprints.Edge;


/**
 * Information derived from mass spectrometry experiments
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MassSpectrometryCommentRel extends BasicCommentRel implements MassSpectometryComment{

    public static final String NAME = "COMMENT_MASS_SPECTROMETRY";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "mass spectrometry";

    public static final String BEGIN_PROPERTY = "mass_spectrometry_comment_begin";
    public static final String END_PROPERTY = "mass_spectrometry_comment_end";
    public static final String MASS_PROPERTY = "mass_spectrometry_comment_mass";
    public static final String METHOD_PROPERTY = "mass_spectrometry_comment_method";

    public MassSpectrometryCommentRel(Edge e){
        super(e);
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
    public String getMass(){
        return String.valueOf(edge.getProperty(MASS_PROPERTY));
    }
    @Override
    public String getMethod(){
        return String.valueOf(edge.getProperty(METHOD_PROPERTY));
    }

    @Override
    public void setBegin(String value){
        edge.setProperty(BEGIN_PROPERTY, value);
    }
    @Override
    public void setEnd(String value){
        edge.setProperty(END_PROPERTY, value);
    }
    @Override
    public void setMass(String value){
        edge.setProperty(MASS_PROPERTY, value);
    }
    @Override
    public void setMethod(String value){
        edge.setProperty(METHOD_PROPERTY, value);
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
