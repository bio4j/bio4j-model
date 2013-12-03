/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnosequences.bio4j.model.relationships.protein;

import com.ohnosequences.bio4j.model.nodes.Protein;
import com.ohnosequences.bio4j.model.nodes.SubcellularLocation;
import com.ohnosequences.bio4j.model.relationships.BasicRelationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public interface ProteinSubcellularLocation extends BasicRelationship{
    
    public String getEvidence();
    public String getStatus();
    public String getTopology();
    public String getTopologyStatus();

    public void setEvidence(String value);
    public void setStatus(String value);
    public void setTopology(String value);
    public void setTopologyStatus(String value);

    
    public Protein getProtein();    
    public SubcellularLocation getSubcellularLocation();
    
}
