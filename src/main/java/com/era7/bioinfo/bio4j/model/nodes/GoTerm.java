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
package com.era7.bioinfo.bio4j.model.nodes;

import java.util.List;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public interface GoTerm extends BasicNode{
    
    //----GETTERS---
    public String getId();
    public String getName();
    public String getDefinition();
    public String getNamespace();
    public Boolean getObsolete();
    public String getComment();
    public String[] getAlternativeIds();
    
    public List<Protein> getAssociatedProteins();
    public List<GoTerm> getIsAGoNodes();
    public List<GoTerm> getNegativelyRegulatesNodes();
    public List<GoTerm> getPositivelyRegulatesNodes();
    public List<GoTerm> getPartOfNodes();
    public List<GoTerm> getHasPartOfNodes();

    //----SETTERS----
    public void setId(String value);
    public void setName(String value);
    public void setDefinition(String value);
    public void setNamespace(String value);
    public void setObsolete(Boolean value);
    public void setComment(String value);
    public void setAlternativeIds(String[] value);
  
}
