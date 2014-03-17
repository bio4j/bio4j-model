
```java
package com.bio4j.blueprints.model.nodes.refseq;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementCDSRel;
import com.bio4j.model.nodes.refseq.CDS;
import com.tinkerpop.blueprints.Direction;


/**
 * CDS
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CDSNode extends Vertex implements CDS{

    public static final String NODE_TYPE = CDSNode.class.getCanonicalName();
    
    public static final String NOTE_PROPERTY = "note";
    public static final String POSITIONS_PROPERTY = "positions";


    public CDSNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getPositions(){   return String.valueOf(vertex.getProperty(POSITIONS_PROPERTY));}
    @Override
    public String getNote(){   return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}

    @Override
    public void setPositions(String value){ vertex.setProperty(POSITIONS_PROPERTY, value);}
    public void setNote(String value){ vertex.setProperty(NOTE_PROPERTY, value);}

    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(Direction.IN, GenomeElementCDSRel.NAME).iterator().next());
    }

    @Override
    public String toString(){
        return "positions = " + getPositions() + "\n" +
                "note = " + getNote();
    }
    
}

```


------

### Index

+ src
  + main
    + java
      + com
        + bio4j
          + blueprints
            + model
              + [Edge.java][main/java/com/bio4j/blueprints/model/Edge.java]
              + nodes
                + [AlternativeProductNode.java][main/java/com/bio4j/blueprints/model/nodes/AlternativeProductNode.java]
                + citation
                  + [ArticleNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/ArticleNode.java]
                  + [BookNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/BookNode.java]
                  + [DBNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/DBNode.java]
                  + [JournalNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/JournalNode.java]
                  + [OnlineArticleNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/OnlineArticleNode.java]
                  + [OnlineJournalNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/OnlineJournalNode.java]
                  + [PatentNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/PatentNode.java]
                  + [PublisherNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/PublisherNode.java]
                  + [SubmissionNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/SubmissionNode.java]
                  + [ThesisNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/ThesisNode.java]
                  + [UnpublishedObservationNode.java][main/java/com/bio4j/blueprints/model/nodes/citation/UnpublishedObservationNode.java]
                + [CityNode.java][main/java/com/bio4j/blueprints/model/nodes/CityNode.java]
                + [CommentTypeNode.java][main/java/com/bio4j/blueprints/model/nodes/CommentTypeNode.java]
                + [ConsortiumNode.java][main/java/com/bio4j/blueprints/model/nodes/ConsortiumNode.java]
                + [CountryNode.java][main/java/com/bio4j/blueprints/model/nodes/CountryNode.java]
                + [DatasetNode.java][main/java/com/bio4j/blueprints/model/nodes/DatasetNode.java]
                + [EnzymeNode.java][main/java/com/bio4j/blueprints/model/nodes/EnzymeNode.java]
                + [FeatureTypeNode.java][main/java/com/bio4j/blueprints/model/nodes/FeatureTypeNode.java]
                + [GoTermNode.java][main/java/com/bio4j/blueprints/model/nodes/GoTermNode.java]
                + [InstituteNode.java][main/java/com/bio4j/blueprints/model/nodes/InstituteNode.java]
                + [InterproNode.java][main/java/com/bio4j/blueprints/model/nodes/InterproNode.java]
                + [IsoformNode.java][main/java/com/bio4j/blueprints/model/nodes/IsoformNode.java]
                + [KeywordNode.java][main/java/com/bio4j/blueprints/model/nodes/KeywordNode.java]
                + ncbi
                  + [NCBITaxonNode.java][main/java/com/bio4j/blueprints/model/nodes/ncbi/NCBITaxonNode.java]
                + [OrganismNode.java][main/java/com/bio4j/blueprints/model/nodes/OrganismNode.java]
                + [PersonNode.java][main/java/com/bio4j/blueprints/model/nodes/PersonNode.java]
                + [PfamNode.java][main/java/com/bio4j/blueprints/model/nodes/PfamNode.java]
                + [ProteinNode.java][main/java/com/bio4j/blueprints/model/nodes/ProteinNode.java]
                + reactome
                  + [ReactomeTermNode.java][main/java/com/bio4j/blueprints/model/nodes/reactome/ReactomeTermNode.java]
                + refseq
                  + [CDSNode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/CDSNode.java]
                  + [GeneNode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/GeneNode.java]
                  + [GenomeElementNode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/GenomeElementNode.java]
                  + rna
                    + [MiscRNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/MiscRNANode.java]
                    + [MRNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/MRNANode.java]
                    + [NcRNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/NcRNANode.java]
                    + [RNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/RNANode.java]
                    + [RRNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/RRNANode.java]
                    + [TmRNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/TmRNANode.java]
                    + [TRNANode.java][main/java/com/bio4j/blueprints/model/nodes/refseq/rna/TRNANode.java]
                + [SequenceCautionNode.java][main/java/com/bio4j/blueprints/model/nodes/SequenceCautionNode.java]
                + [SubcellularLocationNode.java][main/java/com/bio4j/blueprints/model/nodes/SubcellularLocationNode.java]
                + [TaxonNode.java][main/java/com/bio4j/blueprints/model/nodes/TaxonNode.java]
              + relationships
                + aproducts
                  + [AlternativeProductInitiationRel.java][main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductInitiationRel.java]
                  + [AlternativeProductPromoterRel.java][main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductPromoterRel.java]
                  + [AlternativeProductRibosomalFrameshiftingRel.java][main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductRibosomalFrameshiftingRel.java]
                  + [AlternativeProductSplicingRel.java][main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductSplicingRel.java]
                + citation
                  + article
                    + [ArticleAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/article/ArticleAuthorRel.java]
                    + [ArticleJournalRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/article/ArticleJournalRel.java]
                    + [ArticleProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/article/ArticleProteinCitationRel.java]
                  + book
                    + [BookAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/book/BookAuthorRel.java]
                    + [BookCityRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/book/BookCityRel.java]
                    + [BookEditorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/book/BookEditorRel.java]
                    + [BookProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/book/BookProteinCitationRel.java]
                    + [BookPublisherRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/book/BookPublisherRel.java]
                  + onarticle
                    + [OnlineArticleAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/onarticle/OnlineArticleAuthorRel.java]
                    + [OnlineArticleJournalRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/onarticle/OnlineArticleJournalRel.java]
                    + [OnlineArticleProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/onarticle/OnlineArticleProteinCitationRel.java]
                  + patent
                    + [PatentAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/patent/PatentAuthorRel.java]
                    + [PatentProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/patent/PatentProteinCitationRel.java]
                  + submission
                    + [SubmissionAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/submission/SubmissionAuthorRel.java]
                    + [SubmissionDbRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/submission/SubmissionDbRel.java]
                    + [SubmissionProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/submission/SubmissionProteinCitationRel.java]
                  + thesis
                    + [ThesisAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/thesis/ThesisAuthorRel.java]
                    + [ThesisInstituteRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/thesis/ThesisInstituteRel.java]
                    + [ThesisProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/thesis/ThesisProteinCitationRel.java]
                  + uo
                    + [UnpublishedObservationAuthorRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/uo/UnpublishedObservationAuthorRel.java]
                    + [UnpublishedObservationProteinCitationRel.java][main/java/com/bio4j/blueprints/model/relationships/citation/uo/UnpublishedObservationProteinCitationRel.java]
                + comment
                  + [AllergenCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/AllergenCommentRel.java]
                  + [BasicCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/BasicCommentRel.java]
                  + [BioPhysicoChemicalPropertiesCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/BioPhysicoChemicalPropertiesCommentRel.java]
                  + [BiotechnologyCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/BiotechnologyCommentRel.java]
                  + [CatalyticActivityCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/CatalyticActivityCommentRel.java]
                  + [CautionCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/CautionCommentRel.java]
                  + [CofactorCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/CofactorCommentRel.java]
                  + [DevelopmentalStageCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/DevelopmentalStageCommentRel.java]
                  + [DiseaseCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/DiseaseCommentRel.java]
                  + [DisruptionPhenotypeCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/DisruptionPhenotypeCommentRel.java]
                  + [DomainCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/DomainCommentRel.java]
                  + [EnzymeRegulationCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/EnzymeRegulationCommentRel.java]
                  + [FunctionCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/FunctionCommentRel.java]
                  + [InductionCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/InductionCommentRel.java]
                  + [MassSpectrometryCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/MassSpectrometryCommentRel.java]
                  + [MiscellaneousCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/MiscellaneousCommentRel.java]
                  + [OnlineInformationCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/OnlineInformationCommentRel.java]
                  + [PathwayCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/PathwayCommentRel.java]
                  + [PharmaceuticalCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/PharmaceuticalCommentRel.java]
                  + [PolymorphismCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/PolymorphismCommentRel.java]
                  + [PostTranslationalModificationCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/PostTranslationalModificationCommentRel.java]
                  + [RnaEditingCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/RnaEditingCommentRel.java]
                  + [SimilarityCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/SimilarityCommentRel.java]
                  + [SubunitCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/SubunitCommentRel.java]
                  + [TissueSpecificityCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/TissueSpecificityCommentRel.java]
                  + [ToxicDoseCommentRel.java][main/java/com/bio4j/blueprints/model/relationships/comment/ToxicDoseCommentRel.java]
                + features
                  + [ActiveSiteFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/ActiveSiteFeatureRel.java]
                  + [BasicFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/BasicFeatureRel.java]
                  + [BindingSiteFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/BindingSiteFeatureRel.java]
                  + [CalciumBindingRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/CalciumBindingRegionFeatureRel.java]
                  + [ChainFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/ChainFeatureRel.java]
                  + [CoiledCoilRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/CoiledCoilRegionFeatureRel.java]
                  + [CompositionallyBiasedRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/CompositionallyBiasedRegionFeatureRel.java]
                  + [CrossLinkFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/CrossLinkFeatureRel.java]
                  + [DisulfideBondFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/DisulfideBondFeatureRel.java]
                  + [DnaBindingRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/DnaBindingRegionFeatureRel.java]
                  + [DomainFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/DomainFeatureRel.java]
                  + [GlycosylationSiteFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/GlycosylationSiteFeatureRel.java]
                  + [HelixFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/HelixFeatureRel.java]
                  + [InitiatorMethionineFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/InitiatorMethionineFeatureRel.java]
                  + [IntramembraneRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/IntramembraneRegionFeatureRel.java]
                  + [LipidMoietyBindingRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/LipidMoietyBindingRegionFeatureRel.java]
                  + [MetalIonBindingSiteFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/MetalIonBindingSiteFeatureRel.java]
                  + [ModifiedResidueFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/ModifiedResidueFeatureRel.java]
                  + [MutagenesisSiteFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/MutagenesisSiteFeatureRel.java]
                  + [NonConsecutiveResiduesFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/NonConsecutiveResiduesFeatureRel.java]
                  + [NonStandardAminoAcidFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/NonStandardAminoAcidFeatureRel.java]
                  + [NonTerminalResidueFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/NonTerminalResidueFeatureRel.java]
                  + [NucleotidePhosphateBindingRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/NucleotidePhosphateBindingRegionFeatureRel.java]
                  + [PeptideFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/PeptideFeatureRel.java]
                  + [PropeptideFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/PropeptideFeatureRel.java]
                  + [RegionOfInterestFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/RegionOfInterestFeatureRel.java]
                  + [RepeatFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/RepeatFeatureRel.java]
                  + [SequenceConflictFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/SequenceConflictFeatureRel.java]
                  + [SequenceVariantFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/SequenceVariantFeatureRel.java]
                  + [ShortSequenceMotifFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/ShortSequenceMotifFeatureRel.java]
                  + [SignalPeptideFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/SignalPeptideFeatureRel.java]
                  + [SiteFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/SiteFeatureRel.java]
                  + [SpliceVariantFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/SpliceVariantFeatureRel.java]
                  + [StrandFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/StrandFeatureRel.java]
                  + [TopologicalDomainFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/TopologicalDomainFeatureRel.java]
                  + [TransitPeptideFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/TransitPeptideFeatureRel.java]
                  + [TransmembraneRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/TransmembraneRegionFeatureRel.java]
                  + [TurnFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/TurnFeatureRel.java]
                  + [UnsureResidueFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/UnsureResidueFeatureRel.java]
                  + [ZincFingerRegionFeatureRel.java][main/java/com/bio4j/blueprints/model/relationships/features/ZincFingerRegionFeatureRel.java]
                + go
                  + [HasPartOfGoRel.java][main/java/com/bio4j/blueprints/model/relationships/go/HasPartOfGoRel.java]
                  + [IsAGoRel.java][main/java/com/bio4j/blueprints/model/relationships/go/IsAGoRel.java]
                  + [NegativelyRegulatesGoRel.java][main/java/com/bio4j/blueprints/model/relationships/go/NegativelyRegulatesGoRel.java]
                  + [PartOfGoRel.java][main/java/com/bio4j/blueprints/model/relationships/go/PartOfGoRel.java]
                  + [PositivelyRegulatesGoRel.java][main/java/com/bio4j/blueprints/model/relationships/go/PositivelyRegulatesGoRel.java]
                  + [RegulatesGoRel.java][main/java/com/bio4j/blueprints/model/relationships/go/RegulatesGoRel.java]
                + [InstituteCountryRel.java][main/java/com/bio4j/blueprints/model/relationships/InstituteCountryRel.java]
                + [IsoformEventGeneratorRel.java][main/java/com/bio4j/blueprints/model/relationships/IsoformEventGeneratorRel.java]
                + ncbi
                  + [NCBITaxonParentRel.java][main/java/com/bio4j/blueprints/model/relationships/ncbi/NCBITaxonParentRel.java]
                  + [NCBITaxonRel.java][main/java/com/bio4j/blueprints/model/relationships/ncbi/NCBITaxonRel.java]
                + protein
                  + [BasicProteinSequenceCautionRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/BasicProteinSequenceCautionRel.java]
                  + [ProteinDatasetRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinDatasetRel.java]
                  + [ProteinEnzymaticActivityRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinEnzymaticActivityRel.java]
                  + [ProteinErroneousGeneModelPredictionRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousGeneModelPredictionRel.java]
                  + [ProteinErroneousInitiationRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousInitiationRel.java]
                  + [ProteinErroneousTerminationRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousTerminationRel.java]
                  + [ProteinErroneousTranslationRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousTranslationRel.java]
                  + [ProteinFrameshiftRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinFrameshiftRel.java]
                  + [ProteinGenomeElementRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinGenomeElementRel.java]
                  + [ProteinGoRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinGoRel.java]
                  + [ProteinInterproRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinInterproRel.java]
                  + [ProteinIsoformInteractionRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinIsoformInteractionRel.java]
                  + [ProteinIsoformRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinIsoformRel.java]
                  + [ProteinKeywordRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinKeywordRel.java]
                  + [ProteinMiscellaneousDiscrepancyRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinMiscellaneousDiscrepancyRel.java]
                  + [ProteinOrganismRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinOrganismRel.java]
                  + [ProteinPfamRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinPfamRel.java]
                  + [ProteinProteinInteractionRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinProteinInteractionRel.java]
                  + [ProteinReactomeRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinReactomeRel.java]
                  + [ProteinSubcellularLocationRel.java][main/java/com/bio4j/blueprints/model/relationships/protein/ProteinSubcellularLocationRel.java]
                + refseq
                  + [GenomeElementCDSRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementCDSRel.java]
                  + [GenomeElementGeneRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementGeneRel.java]
                  + [GenomeElementMiscRnaRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementMiscRnaRel.java]
                  + [GenomeElementMRnaRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementMRnaRel.java]
                  + [GenomeElementNcRnaRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementNcRnaRel.java]
                  + [GenomeElementRRnaRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementRRnaRel.java]
                  + [GenomeElementTmRnaRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementTmRnaRel.java]
                  + [GenomeElementTRnaRel.java][main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementTRnaRel.java]
                + sc
                  + [ErroneousGeneModelPredictionRel.java][main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousGeneModelPredictionRel.java]
                  + [ErroneousInitiationRel.java][main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousInitiationRel.java]
                  + [ErroneousTerminationRel.java][main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousTerminationRel.java]
                  + [ErroneousTranslationRel.java][main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousTranslationRel.java]
                  + [FrameshiftRel.java][main/java/com/bio4j/blueprints/model/relationships/sc/FrameshiftRel.java]
                  + [MiscellaneousDiscrepancyRel.java][main/java/com/bio4j/blueprints/model/relationships/sc/MiscellaneousDiscrepancyRel.java]
                + [SubcellularLocationParentRel.java][main/java/com/bio4j/blueprints/model/relationships/SubcellularLocationParentRel.java]
                + [TaxonParentRel.java][main/java/com/bio4j/blueprints/model/relationships/TaxonParentRel.java]
                + uniref
                  + [UniRef100MemberRel.java][main/java/com/bio4j/blueprints/model/relationships/uniref/UniRef100MemberRel.java]
                  + [UniRef50MemberRel.java][main/java/com/bio4j/blueprints/model/relationships/uniref/UniRef50MemberRel.java]
                  + [UniRef90MemberRel.java][main/java/com/bio4j/blueprints/model/relationships/uniref/UniRef90MemberRel.java]
              + [Vertex.java][main/java/com/bio4j/blueprints/model/Vertex.java]
  + test
    + java
      + com
        + era7
          + [bio4j-model.java][test/java/com/era7/bio4j-model.java]

[main/java/com/bio4j/blueprints/model/Edge.java]: ../../Edge.java.md
[main/java/com/bio4j/blueprints/model/nodes/AlternativeProductNode.java]: ../AlternativeProductNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/ArticleNode.java]: ../citation/ArticleNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/BookNode.java]: ../citation/BookNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/DBNode.java]: ../citation/DBNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/JournalNode.java]: ../citation/JournalNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/OnlineArticleNode.java]: ../citation/OnlineArticleNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/OnlineJournalNode.java]: ../citation/OnlineJournalNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/PatentNode.java]: ../citation/PatentNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/PublisherNode.java]: ../citation/PublisherNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/SubmissionNode.java]: ../citation/SubmissionNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/ThesisNode.java]: ../citation/ThesisNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/citation/UnpublishedObservationNode.java]: ../citation/UnpublishedObservationNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/CityNode.java]: ../CityNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/CommentTypeNode.java]: ../CommentTypeNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/ConsortiumNode.java]: ../ConsortiumNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/CountryNode.java]: ../CountryNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/DatasetNode.java]: ../DatasetNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/EnzymeNode.java]: ../EnzymeNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/FeatureTypeNode.java]: ../FeatureTypeNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/GoTermNode.java]: ../GoTermNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/InstituteNode.java]: ../InstituteNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/InterproNode.java]: ../InterproNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/IsoformNode.java]: ../IsoformNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/KeywordNode.java]: ../KeywordNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/ncbi/NCBITaxonNode.java]: ../ncbi/NCBITaxonNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/OrganismNode.java]: ../OrganismNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/PersonNode.java]: ../PersonNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/PfamNode.java]: ../PfamNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/ProteinNode.java]: ../ProteinNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/reactome/ReactomeTermNode.java]: ../reactome/ReactomeTermNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/CDSNode.java]: CDSNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/GeneNode.java]: GeneNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/GenomeElementNode.java]: GenomeElementNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/MiscRNANode.java]: rna/MiscRNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/MRNANode.java]: rna/MRNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/NcRNANode.java]: rna/NcRNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/RNANode.java]: rna/RNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/RRNANode.java]: rna/RRNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/TmRNANode.java]: rna/TmRNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/refseq/rna/TRNANode.java]: rna/TRNANode.java.md
[main/java/com/bio4j/blueprints/model/nodes/SequenceCautionNode.java]: ../SequenceCautionNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/SubcellularLocationNode.java]: ../SubcellularLocationNode.java.md
[main/java/com/bio4j/blueprints/model/nodes/TaxonNode.java]: ../TaxonNode.java.md
[main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductInitiationRel.java]: ../../relationships/aproducts/AlternativeProductInitiationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductPromoterRel.java]: ../../relationships/aproducts/AlternativeProductPromoterRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductRibosomalFrameshiftingRel.java]: ../../relationships/aproducts/AlternativeProductRibosomalFrameshiftingRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/aproducts/AlternativeProductSplicingRel.java]: ../../relationships/aproducts/AlternativeProductSplicingRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/article/ArticleAuthorRel.java]: ../../relationships/citation/article/ArticleAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/article/ArticleJournalRel.java]: ../../relationships/citation/article/ArticleJournalRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/article/ArticleProteinCitationRel.java]: ../../relationships/citation/article/ArticleProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/book/BookAuthorRel.java]: ../../relationships/citation/book/BookAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/book/BookCityRel.java]: ../../relationships/citation/book/BookCityRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/book/BookEditorRel.java]: ../../relationships/citation/book/BookEditorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/book/BookProteinCitationRel.java]: ../../relationships/citation/book/BookProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/book/BookPublisherRel.java]: ../../relationships/citation/book/BookPublisherRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/onarticle/OnlineArticleAuthorRel.java]: ../../relationships/citation/onarticle/OnlineArticleAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/onarticle/OnlineArticleJournalRel.java]: ../../relationships/citation/onarticle/OnlineArticleJournalRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/onarticle/OnlineArticleProteinCitationRel.java]: ../../relationships/citation/onarticle/OnlineArticleProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/patent/PatentAuthorRel.java]: ../../relationships/citation/patent/PatentAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/patent/PatentProteinCitationRel.java]: ../../relationships/citation/patent/PatentProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/submission/SubmissionAuthorRel.java]: ../../relationships/citation/submission/SubmissionAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/submission/SubmissionDbRel.java]: ../../relationships/citation/submission/SubmissionDbRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/submission/SubmissionProteinCitationRel.java]: ../../relationships/citation/submission/SubmissionProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/thesis/ThesisAuthorRel.java]: ../../relationships/citation/thesis/ThesisAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/thesis/ThesisInstituteRel.java]: ../../relationships/citation/thesis/ThesisInstituteRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/thesis/ThesisProteinCitationRel.java]: ../../relationships/citation/thesis/ThesisProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/uo/UnpublishedObservationAuthorRel.java]: ../../relationships/citation/uo/UnpublishedObservationAuthorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/citation/uo/UnpublishedObservationProteinCitationRel.java]: ../../relationships/citation/uo/UnpublishedObservationProteinCitationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/AllergenCommentRel.java]: ../../relationships/comment/AllergenCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/BasicCommentRel.java]: ../../relationships/comment/BasicCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/BioPhysicoChemicalPropertiesCommentRel.java]: ../../relationships/comment/BioPhysicoChemicalPropertiesCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/BiotechnologyCommentRel.java]: ../../relationships/comment/BiotechnologyCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/CatalyticActivityCommentRel.java]: ../../relationships/comment/CatalyticActivityCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/CautionCommentRel.java]: ../../relationships/comment/CautionCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/CofactorCommentRel.java]: ../../relationships/comment/CofactorCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/DevelopmentalStageCommentRel.java]: ../../relationships/comment/DevelopmentalStageCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/DiseaseCommentRel.java]: ../../relationships/comment/DiseaseCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/DisruptionPhenotypeCommentRel.java]: ../../relationships/comment/DisruptionPhenotypeCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/DomainCommentRel.java]: ../../relationships/comment/DomainCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/EnzymeRegulationCommentRel.java]: ../../relationships/comment/EnzymeRegulationCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/FunctionCommentRel.java]: ../../relationships/comment/FunctionCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/InductionCommentRel.java]: ../../relationships/comment/InductionCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/MassSpectrometryCommentRel.java]: ../../relationships/comment/MassSpectrometryCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/MiscellaneousCommentRel.java]: ../../relationships/comment/MiscellaneousCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/OnlineInformationCommentRel.java]: ../../relationships/comment/OnlineInformationCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/PathwayCommentRel.java]: ../../relationships/comment/PathwayCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/PharmaceuticalCommentRel.java]: ../../relationships/comment/PharmaceuticalCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/PolymorphismCommentRel.java]: ../../relationships/comment/PolymorphismCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/PostTranslationalModificationCommentRel.java]: ../../relationships/comment/PostTranslationalModificationCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/RnaEditingCommentRel.java]: ../../relationships/comment/RnaEditingCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/SimilarityCommentRel.java]: ../../relationships/comment/SimilarityCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/SubunitCommentRel.java]: ../../relationships/comment/SubunitCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/TissueSpecificityCommentRel.java]: ../../relationships/comment/TissueSpecificityCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/comment/ToxicDoseCommentRel.java]: ../../relationships/comment/ToxicDoseCommentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/ActiveSiteFeatureRel.java]: ../../relationships/features/ActiveSiteFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/BasicFeatureRel.java]: ../../relationships/features/BasicFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/BindingSiteFeatureRel.java]: ../../relationships/features/BindingSiteFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/CalciumBindingRegionFeatureRel.java]: ../../relationships/features/CalciumBindingRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/ChainFeatureRel.java]: ../../relationships/features/ChainFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/CoiledCoilRegionFeatureRel.java]: ../../relationships/features/CoiledCoilRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/CompositionallyBiasedRegionFeatureRel.java]: ../../relationships/features/CompositionallyBiasedRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/CrossLinkFeatureRel.java]: ../../relationships/features/CrossLinkFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/DisulfideBondFeatureRel.java]: ../../relationships/features/DisulfideBondFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/DnaBindingRegionFeatureRel.java]: ../../relationships/features/DnaBindingRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/DomainFeatureRel.java]: ../../relationships/features/DomainFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/GlycosylationSiteFeatureRel.java]: ../../relationships/features/GlycosylationSiteFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/HelixFeatureRel.java]: ../../relationships/features/HelixFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/InitiatorMethionineFeatureRel.java]: ../../relationships/features/InitiatorMethionineFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/IntramembraneRegionFeatureRel.java]: ../../relationships/features/IntramembraneRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/LipidMoietyBindingRegionFeatureRel.java]: ../../relationships/features/LipidMoietyBindingRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/MetalIonBindingSiteFeatureRel.java]: ../../relationships/features/MetalIonBindingSiteFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/ModifiedResidueFeatureRel.java]: ../../relationships/features/ModifiedResidueFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/MutagenesisSiteFeatureRel.java]: ../../relationships/features/MutagenesisSiteFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/NonConsecutiveResiduesFeatureRel.java]: ../../relationships/features/NonConsecutiveResiduesFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/NonStandardAminoAcidFeatureRel.java]: ../../relationships/features/NonStandardAminoAcidFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/NonTerminalResidueFeatureRel.java]: ../../relationships/features/NonTerminalResidueFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/NucleotidePhosphateBindingRegionFeatureRel.java]: ../../relationships/features/NucleotidePhosphateBindingRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/PeptideFeatureRel.java]: ../../relationships/features/PeptideFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/PropeptideFeatureRel.java]: ../../relationships/features/PropeptideFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/RegionOfInterestFeatureRel.java]: ../../relationships/features/RegionOfInterestFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/RepeatFeatureRel.java]: ../../relationships/features/RepeatFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/SequenceConflictFeatureRel.java]: ../../relationships/features/SequenceConflictFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/SequenceVariantFeatureRel.java]: ../../relationships/features/SequenceVariantFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/ShortSequenceMotifFeatureRel.java]: ../../relationships/features/ShortSequenceMotifFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/SignalPeptideFeatureRel.java]: ../../relationships/features/SignalPeptideFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/SiteFeatureRel.java]: ../../relationships/features/SiteFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/SpliceVariantFeatureRel.java]: ../../relationships/features/SpliceVariantFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/StrandFeatureRel.java]: ../../relationships/features/StrandFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/TopologicalDomainFeatureRel.java]: ../../relationships/features/TopologicalDomainFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/TransitPeptideFeatureRel.java]: ../../relationships/features/TransitPeptideFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/TransmembraneRegionFeatureRel.java]: ../../relationships/features/TransmembraneRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/TurnFeatureRel.java]: ../../relationships/features/TurnFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/UnsureResidueFeatureRel.java]: ../../relationships/features/UnsureResidueFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/features/ZincFingerRegionFeatureRel.java]: ../../relationships/features/ZincFingerRegionFeatureRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/go/HasPartOfGoRel.java]: ../../relationships/go/HasPartOfGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/go/IsAGoRel.java]: ../../relationships/go/IsAGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/go/NegativelyRegulatesGoRel.java]: ../../relationships/go/NegativelyRegulatesGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/go/PartOfGoRel.java]: ../../relationships/go/PartOfGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/go/PositivelyRegulatesGoRel.java]: ../../relationships/go/PositivelyRegulatesGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/go/RegulatesGoRel.java]: ../../relationships/go/RegulatesGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/InstituteCountryRel.java]: ../../relationships/InstituteCountryRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/IsoformEventGeneratorRel.java]: ../../relationships/IsoformEventGeneratorRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/ncbi/NCBITaxonParentRel.java]: ../../relationships/ncbi/NCBITaxonParentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/ncbi/NCBITaxonRel.java]: ../../relationships/ncbi/NCBITaxonRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/BasicProteinSequenceCautionRel.java]: ../../relationships/protein/BasicProteinSequenceCautionRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinDatasetRel.java]: ../../relationships/protein/ProteinDatasetRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinEnzymaticActivityRel.java]: ../../relationships/protein/ProteinEnzymaticActivityRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousGeneModelPredictionRel.java]: ../../relationships/protein/ProteinErroneousGeneModelPredictionRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousInitiationRel.java]: ../../relationships/protein/ProteinErroneousInitiationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousTerminationRel.java]: ../../relationships/protein/ProteinErroneousTerminationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinErroneousTranslationRel.java]: ../../relationships/protein/ProteinErroneousTranslationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinFrameshiftRel.java]: ../../relationships/protein/ProteinFrameshiftRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinGenomeElementRel.java]: ../../relationships/protein/ProteinGenomeElementRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinGoRel.java]: ../../relationships/protein/ProteinGoRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinInterproRel.java]: ../../relationships/protein/ProteinInterproRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinIsoformInteractionRel.java]: ../../relationships/protein/ProteinIsoformInteractionRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinIsoformRel.java]: ../../relationships/protein/ProteinIsoformRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinKeywordRel.java]: ../../relationships/protein/ProteinKeywordRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinMiscellaneousDiscrepancyRel.java]: ../../relationships/protein/ProteinMiscellaneousDiscrepancyRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinOrganismRel.java]: ../../relationships/protein/ProteinOrganismRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinPfamRel.java]: ../../relationships/protein/ProteinPfamRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinProteinInteractionRel.java]: ../../relationships/protein/ProteinProteinInteractionRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinReactomeRel.java]: ../../relationships/protein/ProteinReactomeRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/protein/ProteinSubcellularLocationRel.java]: ../../relationships/protein/ProteinSubcellularLocationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementCDSRel.java]: ../../relationships/refseq/GenomeElementCDSRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementGeneRel.java]: ../../relationships/refseq/GenomeElementGeneRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementMiscRnaRel.java]: ../../relationships/refseq/GenomeElementMiscRnaRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementMRnaRel.java]: ../../relationships/refseq/GenomeElementMRnaRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementNcRnaRel.java]: ../../relationships/refseq/GenomeElementNcRnaRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementRRnaRel.java]: ../../relationships/refseq/GenomeElementRRnaRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementTmRnaRel.java]: ../../relationships/refseq/GenomeElementTmRnaRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/refseq/GenomeElementTRnaRel.java]: ../../relationships/refseq/GenomeElementTRnaRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousGeneModelPredictionRel.java]: ../../relationships/sc/ErroneousGeneModelPredictionRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousInitiationRel.java]: ../../relationships/sc/ErroneousInitiationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousTerminationRel.java]: ../../relationships/sc/ErroneousTerminationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/sc/ErroneousTranslationRel.java]: ../../relationships/sc/ErroneousTranslationRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/sc/FrameshiftRel.java]: ../../relationships/sc/FrameshiftRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/sc/MiscellaneousDiscrepancyRel.java]: ../../relationships/sc/MiscellaneousDiscrepancyRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/SubcellularLocationParentRel.java]: ../../relationships/SubcellularLocationParentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/TaxonParentRel.java]: ../../relationships/TaxonParentRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/uniref/UniRef100MemberRel.java]: ../../relationships/uniref/UniRef100MemberRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/uniref/UniRef50MemberRel.java]: ../../relationships/uniref/UniRef50MemberRel.java.md
[main/java/com/bio4j/blueprints/model/relationships/uniref/UniRef90MemberRel.java]: ../../relationships/uniref/UniRef90MemberRel.java.md
[main/java/com/bio4j/blueprints/model/Vertex.java]: ../../Vertex.java.md
[test/java/com/era7/bio4j-model.java]: ../../../../../../../../test/java/com/era7/bio4j-model.java.md