package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class QTLShadow implements QTL, ShadowClass
{
    public static final Class<QTL> shadowOf = QTL.class;
    // Attr: org.intermine.model.bio.QTL.traitId
    protected java.lang.String traitId;
    public java.lang.String getTraitId() { return traitId; }
    public void setTraitId(final java.lang.String traitId) { this.traitId = traitId; }

    // Attr: org.intermine.model.bio.QTL.significance
    protected java.lang.String significance;
    public java.lang.String getSignificance() { return significance; }
    public void setSignificance(final java.lang.String significance) { this.significance = significance; }

    // Attr: org.intermine.model.bio.QTL.flankMarkers
    protected java.lang.String flankMarkers;
    public java.lang.String getFlankMarkers() { return flankMarkers; }
    public void setFlankMarkers(final java.lang.String flankMarkers) { this.flankMarkers = flankMarkers; }

    // Attr: org.intermine.model.bio.QTL.likelihoodRatio
    protected java.lang.String likelihoodRatio;
    public java.lang.String getLikelihoodRatio() { return likelihoodRatio; }
    public void setLikelihoodRatio(final java.lang.String likelihoodRatio) { this.likelihoodRatio = likelihoodRatio; }

    // Attr: org.intermine.model.bio.QTL.additiveEffect
    protected java.lang.String additiveEffect;
    public java.lang.String getAdditiveEffect() { return additiveEffect; }
    public void setAdditiveEffect(final java.lang.String additiveEffect) { this.additiveEffect = additiveEffect; }

    // Attr: org.intermine.model.bio.QTL.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.QTL.testBase
    protected java.lang.String testBase;
    public java.lang.String getTestBase() { return testBase; }
    public void setTestBase(final java.lang.String testBase) { this.testBase = testBase; }

    // Attr: org.intermine.model.bio.QTL.geneIdentifier
    protected java.lang.String geneIdentifier;
    public java.lang.String getGeneIdentifier() { return geneIdentifier; }
    public void setGeneIdentifier(final java.lang.String geneIdentifier) { this.geneIdentifier = geneIdentifier; }

    // Attr: org.intermine.model.bio.QTL.pValue
    protected java.lang.String pValue;
    public java.lang.String getPValue() { return pValue; }
    public void setPValue(final java.lang.String pValue) { this.pValue = pValue; }

    // Attr: org.intermine.model.bio.QTL.bayesValue
    protected java.lang.String bayesValue;
    public java.lang.String getBayesValue() { return bayesValue; }
    public void setBayesValue(final java.lang.String bayesValue) { this.bayesValue = bayesValue; }

    // Attr: org.intermine.model.bio.QTL.lsMeans
    protected java.lang.String lsMeans;
    public java.lang.String getLsMeans() { return lsMeans; }
    public void setLsMeans(final java.lang.String lsMeans) { this.lsMeans = lsMeans; }

    // Attr: org.intermine.model.bio.QTL.lodScore
    protected java.lang.String lodScore;
    public java.lang.String getLodScore() { return lodScore; }
    public void setLodScore(final java.lang.String lodScore) { this.lodScore = lodScore; }

    // Attr: org.intermine.model.bio.QTL.qtlId
    protected java.lang.String qtlId;
    public java.lang.String getQtlId() { return qtlId; }
    public void setQtlId(final java.lang.String qtlId) { this.qtlId = qtlId; }

    // Attr: org.intermine.model.bio.QTL.dominanceEffect
    protected java.lang.String dominanceEffect;
    public java.lang.String getDominanceEffect() { return dominanceEffect; }
    public void setDominanceEffect(final java.lang.String dominanceEffect) { this.dominanceEffect = dominanceEffect; }

    // Attr: org.intermine.model.bio.QTL.abbreviation
    protected java.lang.String abbreviation;
    public java.lang.String getAbbreviation() { return abbreviation; }
    public void setAbbreviation(final java.lang.String abbreviation) { this.abbreviation = abbreviation; }

    // Attr: org.intermine.model.bio.QTL.model
    protected java.lang.String model;
    public java.lang.String getModel() { return model; }
    public void setModel(final java.lang.String model) { this.model = model; }

    // Attr: org.intermine.model.bio.QTL.fStat
    protected java.lang.String fStat;
    public java.lang.String getFStat() { return fStat; }
    public void setFStat(final java.lang.String fStat) { this.fStat = fStat; }

    // Attr: org.intermine.model.bio.QTL.trait
    protected java.lang.String trait;
    public java.lang.String getTrait() { return trait; }
    public void setTrait(final java.lang.String trait) { this.trait = trait; }

    // Attr: org.intermine.model.bio.QTL.mapType
    protected java.lang.String mapType;
    public java.lang.String getMapType() { return mapType; }
    public void setMapType(final java.lang.String mapType) { this.mapType = mapType; }

    // Attr: org.intermine.model.bio.QTL.peakCentimorgan
    protected java.lang.String peakCentimorgan;
    public java.lang.String getPeakCentimorgan() { return peakCentimorgan; }
    public void setPeakCentimorgan(final java.lang.String peakCentimorgan) { this.peakCentimorgan = peakCentimorgan; }

    // Attr: org.intermine.model.bio.QTL.breed
    protected java.lang.String breed;
    public java.lang.String getBreed() { return breed; }
    public void setBreed(final java.lang.String breed) { this.breed = breed; }

    // Ref: org.intermine.model.bio.QTL.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Ref: org.intermine.model.bio.QTL.cmoName
    protected org.intermine.model.InterMineObject cmoName;
    public org.intermine.model.bio.CMOTerm getCmoName() { if (cmoName instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.CMOTerm) ((org.intermine.objectstore.proxy.ProxyReference) cmoName).getObject()); }; return (org.intermine.model.bio.CMOTerm) cmoName; }
    public void setCmoName(final org.intermine.model.bio.CMOTerm cmoName) { this.cmoName = cmoName; }
    public void proxyCmoName(final org.intermine.objectstore.proxy.ProxyReference cmoName) { this.cmoName = cmoName; }
    public org.intermine.model.InterMineObject proxGetCmoName() { return cmoName; }

    // Ref: org.intermine.model.bio.QTL.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Ref: org.intermine.model.bio.QTL.ptoName
    protected org.intermine.model.InterMineObject ptoName;
    public org.intermine.model.bio.LPTTerm getPtoName() { if (ptoName instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.LPTTerm) ((org.intermine.objectstore.proxy.ProxyReference) ptoName).getObject()); }; return (org.intermine.model.bio.LPTTerm) ptoName; }
    public void setPtoName(final org.intermine.model.bio.LPTTerm ptoName) { this.ptoName = ptoName; }
    public void proxyPtoName(final org.intermine.objectstore.proxy.ProxyReference ptoName) { this.ptoName = ptoName; }
    public org.intermine.model.InterMineObject proxGetPtoName() { return ptoName; }

    // Ref: org.intermine.model.bio.QTL.vtoName
    protected org.intermine.model.InterMineObject vtoName;
    public org.intermine.model.bio.VTTerm getVtoName() { if (vtoName instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.VTTerm) ((org.intermine.objectstore.proxy.ProxyReference) vtoName).getObject()); }; return (org.intermine.model.bio.VTTerm) vtoName; }
    public void setVtoName(final org.intermine.model.bio.VTTerm vtoName) { this.vtoName = vtoName; }
    public void proxyVtoName(final org.intermine.objectstore.proxy.ProxyReference vtoName) { this.vtoName = vtoName; }
    public org.intermine.model.InterMineObject proxGetVtoName() { return vtoName; }

    // Col: org.intermine.model.bio.QTL.snpAsFlankMarkers
    protected java.util.Set<org.intermine.model.bio.SequenceAlteration> snpAsFlankMarkers = new java.util.HashSet<org.intermine.model.bio.SequenceAlteration>();
    public java.util.Set<org.intermine.model.bio.SequenceAlteration> getSnpAsFlankMarkers() { return snpAsFlankMarkers; }
    public void setSnpAsFlankMarkers(final java.util.Set<org.intermine.model.bio.SequenceAlteration> snpAsFlankMarkers) { this.snpAsFlankMarkers = snpAsFlankMarkers; }
    public void addSnpAsFlankMarkers(final org.intermine.model.bio.SequenceAlteration arg) { snpAsFlankMarkers.add(arg); }

    // Attr: org.intermine.model.bio.SequenceFeature.source
    protected java.lang.String source;
    public java.lang.String getSource() { return source; }
    public void setSource(final java.lang.String source) { this.source = source; }

    // Attr: org.intermine.model.bio.SequenceFeature.score
    protected java.lang.Double score;
    public java.lang.Double getScore() { return score; }
    public void setScore(final java.lang.Double score) { this.score = score; }

    // Attr: org.intermine.model.bio.SequenceFeature.scoreType
    protected java.lang.String scoreType;
    public java.lang.String getScoreType() { return scoreType; }
    public void setScoreType(final java.lang.String scoreType) { this.scoreType = scoreType; }

    // Attr: org.intermine.model.bio.SequenceFeature.status
    protected java.lang.String status;
    public java.lang.String getStatus() { return status; }
    public void setStatus(final java.lang.String status) { this.status = status; }

    // Attr: org.intermine.model.bio.SequenceFeature.length
    protected java.lang.Integer length;
    public java.lang.Integer getLength() { return length; }
    public void setLength(final java.lang.Integer length) { this.length = length; }

    // Ref: org.intermine.model.bio.SequenceFeature.sequenceOntologyTerm
    protected org.intermine.model.InterMineObject sequenceOntologyTerm;
    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm() { if (sequenceOntologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SOTerm) ((org.intermine.objectstore.proxy.ProxyReference) sequenceOntologyTerm).getObject()); }; return (org.intermine.model.bio.SOTerm) sequenceOntologyTerm; }
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm() { return sequenceOntologyTerm; }

    // Ref: org.intermine.model.bio.SequenceFeature.chromosomeLocation
    protected org.intermine.model.InterMineObject chromosomeLocation;
    public org.intermine.model.bio.Location getChromosomeLocation() { if (chromosomeLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) chromosomeLocation).getObject()); }; return (org.intermine.model.bio.Location) chromosomeLocation; }
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public org.intermine.model.InterMineObject proxGetChromosomeLocation() { return chromosomeLocation; }

    // Ref: org.intermine.model.bio.SequenceFeature.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Ref: org.intermine.model.bio.SequenceFeature.chromosome
    protected org.intermine.model.InterMineObject chromosome;
    public org.intermine.model.bio.Chromosome getChromosome() { if (chromosome instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Chromosome) ((org.intermine.objectstore.proxy.ProxyReference) chromosome).getObject()); }; return (org.intermine.model.bio.Chromosome) chromosome; }
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome) { this.chromosome = chromosome; }
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome) { this.chromosome = chromosome; }
    public org.intermine.model.InterMineObject proxGetChromosome() { return chromosome; }

    // Col: org.intermine.model.bio.SequenceFeature.overlappingFeatures
    protected java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures = new java.util.HashSet<org.intermine.model.bio.SequenceFeature>();
    public java.util.Set<org.intermine.model.bio.SequenceFeature> getOverlappingFeatures() { return overlappingFeatures; }
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures) { this.overlappingFeatures = overlappingFeatures; }
    public void addOverlappingFeatures(final org.intermine.model.bio.SequenceFeature arg) { overlappingFeatures.add(arg); }

    // Col: org.intermine.model.bio.SequenceFeature.childFeatures
    protected java.util.Set<org.intermine.model.bio.SequenceFeature> childFeatures = new java.util.HashSet<org.intermine.model.bio.SequenceFeature>();
    public java.util.Set<org.intermine.model.bio.SequenceFeature> getChildFeatures() { return childFeatures; }
    public void setChildFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> childFeatures) { this.childFeatures = childFeatures; }
    public void addChildFeatures(final org.intermine.model.bio.SequenceFeature arg) { childFeatures.add(arg); }

    // Col: org.intermine.model.bio.SequenceFeature.dbCrossReferences
    protected java.util.Set<org.intermine.model.bio.xRef> dbCrossReferences = new java.util.HashSet<org.intermine.model.bio.xRef>();
    public java.util.Set<org.intermine.model.bio.xRef> getDbCrossReferences() { return dbCrossReferences; }
    public void setDbCrossReferences(final java.util.Set<org.intermine.model.bio.xRef> dbCrossReferences) { this.dbCrossReferences = dbCrossReferences; }
    public void addDbCrossReferences(final org.intermine.model.bio.xRef arg) { dbCrossReferences.add(arg); }

    // Col: org.intermine.model.bio.SequenceFeature.aliases
    protected java.util.Set<org.intermine.model.bio.AliasName> aliases = new java.util.HashSet<org.intermine.model.bio.AliasName>();
    public java.util.Set<org.intermine.model.bio.AliasName> getAliases() { return aliases; }
    public void setAliases(final java.util.Set<org.intermine.model.bio.AliasName> aliases) { this.aliases = aliases; }
    public void addAliases(final org.intermine.model.bio.AliasName arg) { aliases.add(arg); }

    // Attr: org.intermine.model.bio.BioEntity.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.BioEntity.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.BioEntity.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.BioEntity.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Ref: org.intermine.model.bio.BioEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.BioEntity.interactions
    protected java.util.Set<org.intermine.model.bio.Interaction> interactions = new java.util.HashSet<org.intermine.model.bio.Interaction>();
    public java.util.Set<org.intermine.model.bio.Interaction> getInteractions() { return interactions; }
    public void setInteractions(final java.util.Set<org.intermine.model.bio.Interaction> interactions) { this.interactions = interactions; }
    public void addInteractions(final org.intermine.model.bio.Interaction arg) { interactions.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locations
    protected java.util.Set<org.intermine.model.bio.Location> locations = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocations() { return locations; }
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations) { this.locations = locations; }
    public void addLocations(final org.intermine.model.bio.Location arg) { locations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotation>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.synonyms
    protected java.util.Set<org.intermine.model.bio.Synonym> synonyms = new java.util.HashSet<org.intermine.model.bio.Synonym>();
    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.Synonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.crossReferences
    protected java.util.Set<org.intermine.model.bio.CrossReference> crossReferences = new java.util.HashSet<org.intermine.model.bio.CrossReference>();
    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences() { return crossReferences; }
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences) { this.crossReferences = crossReferences; }
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg) { crossReferences.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locatedFeatures
    protected java.util.Set<org.intermine.model.bio.Location> locatedFeatures = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocatedFeatures() { return locatedFeatures; }
    public void setLocatedFeatures(final java.util.Set<org.intermine.model.bio.Location> locatedFeatures) { this.locatedFeatures = locatedFeatures; }
    public void addLocatedFeatures(final org.intermine.model.bio.Location arg) { locatedFeatures.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof QTL && id != null) ? id.equals(((QTL)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "QTL [abbreviation=" + (abbreviation == null ? "null" : "\"" + abbreviation + "\"") + ", additiveEffect=" + (additiveEffect == null ? "null" : "\"" + additiveEffect + "\"") + ", bayesValue=" + (bayesValue == null ? "null" : "\"" + bayesValue + "\"") + ", breed=" + (breed == null ? "null" : "\"" + breed + "\"") + ", chromosome=" + (chromosome == null ? "null" : (chromosome.getId() == null ? "no id" : chromosome.getId().toString())) + ", chromosomeLocation=" + (chromosomeLocation == null ? "null" : (chromosomeLocation.getId() == null ? "no id" : chromosomeLocation.getId().toString())) + ", cmoName=" + (cmoName == null ? "null" : (cmoName.getId() == null ? "no id" : cmoName.getId().toString())) + ", dominanceEffect=" + (dominanceEffect == null ? "null" : "\"" + dominanceEffect + "\"") + ", fStat=" + (fStat == null ? "null" : "\"" + fStat + "\"") + ", flankMarkers=" + (flankMarkers == null ? "null" : "\"" + flankMarkers + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", geneIdentifier=" + (geneIdentifier == null ? "null" : "\"" + geneIdentifier + "\"") + ", id=" + id + ", length=" + length + ", likelihoodRatio=" + (likelihoodRatio == null ? "null" : "\"" + likelihoodRatio + "\"") + ", lodScore=" + (lodScore == null ? "null" : "\"" + lodScore + "\"") + ", lsMeans=" + (lsMeans == null ? "null" : "\"" + lsMeans + "\"") + ", mapType=" + (mapType == null ? "null" : "\"" + mapType + "\"") + ", model=" + (model == null ? "null" : "\"" + model + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", pValue=" + (pValue == null ? "null" : "\"" + pValue + "\"") + ", peakCentimorgan=" + (peakCentimorgan == null ? "null" : "\"" + peakCentimorgan + "\"") + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", ptoName=" + (ptoName == null ? "null" : (ptoName.getId() == null ? "no id" : ptoName.getId().toString())) + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", qtlId=" + (qtlId == null ? "null" : "\"" + qtlId + "\"") + ", score=" + score + ", scoreType=" + (scoreType == null ? "null" : "\"" + scoreType + "\"") + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + ", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", sequenceOntologyTerm=" + (sequenceOntologyTerm == null ? "null" : (sequenceOntologyTerm.getId() == null ? "no id" : sequenceOntologyTerm.getId().toString())) + ", significance=" + (significance == null ? "null" : "\"" + significance + "\"") + ", source=" + (source == null ? "null" : "\"" + source + "\"") + ", status=" + (status == null ? "null" : "\"" + status + "\"") + ", symbol=" + (symbol == null ? "null" : "\"" + symbol + "\"") + ", testBase=" + (testBase == null ? "null" : "\"" + testBase + "\"") + ", trait=" + (trait == null ? "null" : "\"" + trait + "\"") + ", traitId=" + (traitId == null ? "null" : "\"" + traitId + "\"") + ", type=" + (type == null ? "null" : "\"" + type + "\"") + ", vtoName=" + (vtoName == null ? "null" : (vtoName.getId() == null ? "no id" : vtoName.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("traitId".equals(fieldName)) {
            return traitId;
        }
        if ("significance".equals(fieldName)) {
            return significance;
        }
        if ("flankMarkers".equals(fieldName)) {
            return flankMarkers;
        }
        if ("likelihoodRatio".equals(fieldName)) {
            return likelihoodRatio;
        }
        if ("additiveEffect".equals(fieldName)) {
            return additiveEffect;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("testBase".equals(fieldName)) {
            return testBase;
        }
        if ("geneIdentifier".equals(fieldName)) {
            return geneIdentifier;
        }
        if ("pValue".equals(fieldName)) {
            return pValue;
        }
        if ("bayesValue".equals(fieldName)) {
            return bayesValue;
        }
        if ("lsMeans".equals(fieldName)) {
            return lsMeans;
        }
        if ("lodScore".equals(fieldName)) {
            return lodScore;
        }
        if ("qtlId".equals(fieldName)) {
            return qtlId;
        }
        if ("dominanceEffect".equals(fieldName)) {
            return dominanceEffect;
        }
        if ("abbreviation".equals(fieldName)) {
            return abbreviation;
        }
        if ("model".equals(fieldName)) {
            return model;
        }
        if ("fStat".equals(fieldName)) {
            return fStat;
        }
        if ("trait".equals(fieldName)) {
            return trait;
        }
        if ("mapType".equals(fieldName)) {
            return mapType;
        }
        if ("peakCentimorgan".equals(fieldName)) {
            return peakCentimorgan;
        }
        if ("breed".equals(fieldName)) {
            return breed;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("cmoName".equals(fieldName)) {
            if (cmoName instanceof ProxyReference) {
                return ((ProxyReference) cmoName).getObject();
            } else {
                return cmoName;
            }
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("ptoName".equals(fieldName)) {
            if (ptoName instanceof ProxyReference) {
                return ((ProxyReference) ptoName).getObject();
            } else {
                return ptoName;
            }
        }
        if ("vtoName".equals(fieldName)) {
            if (vtoName instanceof ProxyReference) {
                return ((ProxyReference) vtoName).getObject();
            } else {
                return vtoName;
            }
        }
        if ("snpAsFlankMarkers".equals(fieldName)) {
            return snpAsFlankMarkers;
        }
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            if (sequenceOntologyTerm instanceof ProxyReference) {
                return ((ProxyReference) sequenceOntologyTerm).getObject();
            } else {
                return sequenceOntologyTerm;
            }
        }
        if ("chromosomeLocation".equals(fieldName)) {
            if (chromosomeLocation instanceof ProxyReference) {
                return ((ProxyReference) chromosomeLocation).getObject();
            } else {
                return chromosomeLocation;
            }
        }
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("chromosome".equals(fieldName)) {
            if (chromosome instanceof ProxyReference) {
                return ((ProxyReference) chromosome).getObject();
            } else {
                return chromosome;
            }
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
        }
        if ("childFeatures".equals(fieldName)) {
            return childFeatures;
        }
        if ("dbCrossReferences".equals(fieldName)) {
            return dbCrossReferences;
        }
        if ("aliases".equals(fieldName)) {
            return aliases;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("traitId".equals(fieldName)) {
            return traitId;
        }
        if ("significance".equals(fieldName)) {
            return significance;
        }
        if ("flankMarkers".equals(fieldName)) {
            return flankMarkers;
        }
        if ("likelihoodRatio".equals(fieldName)) {
            return likelihoodRatio;
        }
        if ("additiveEffect".equals(fieldName)) {
            return additiveEffect;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("testBase".equals(fieldName)) {
            return testBase;
        }
        if ("geneIdentifier".equals(fieldName)) {
            return geneIdentifier;
        }
        if ("pValue".equals(fieldName)) {
            return pValue;
        }
        if ("bayesValue".equals(fieldName)) {
            return bayesValue;
        }
        if ("lsMeans".equals(fieldName)) {
            return lsMeans;
        }
        if ("lodScore".equals(fieldName)) {
            return lodScore;
        }
        if ("qtlId".equals(fieldName)) {
            return qtlId;
        }
        if ("dominanceEffect".equals(fieldName)) {
            return dominanceEffect;
        }
        if ("abbreviation".equals(fieldName)) {
            return abbreviation;
        }
        if ("model".equals(fieldName)) {
            return model;
        }
        if ("fStat".equals(fieldName)) {
            return fStat;
        }
        if ("trait".equals(fieldName)) {
            return trait;
        }
        if ("mapType".equals(fieldName)) {
            return mapType;
        }
        if ("peakCentimorgan".equals(fieldName)) {
            return peakCentimorgan;
        }
        if ("breed".equals(fieldName)) {
            return breed;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("cmoName".equals(fieldName)) {
            return cmoName;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("ptoName".equals(fieldName)) {
            return ptoName;
        }
        if ("vtoName".equals(fieldName)) {
            return vtoName;
        }
        if ("snpAsFlankMarkers".equals(fieldName)) {
            return snpAsFlankMarkers;
        }
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return sequenceOntologyTerm;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return chromosomeLocation;
        }
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("chromosome".equals(fieldName)) {
            return chromosome;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
        }
        if ("childFeatures".equals(fieldName)) {
            return childFeatures;
        }
        if ("dbCrossReferences".equals(fieldName)) {
            return dbCrossReferences;
        }
        if ("aliases".equals(fieldName)) {
            return aliases;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("traitId".equals(fieldName)) {
            traitId = (java.lang.String) value;
        } else if ("significance".equals(fieldName)) {
            significance = (java.lang.String) value;
        } else if ("flankMarkers".equals(fieldName)) {
            flankMarkers = (java.lang.String) value;
        } else if ("likelihoodRatio".equals(fieldName)) {
            likelihoodRatio = (java.lang.String) value;
        } else if ("additiveEffect".equals(fieldName)) {
            additiveEffect = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("testBase".equals(fieldName)) {
            testBase = (java.lang.String) value;
        } else if ("geneIdentifier".equals(fieldName)) {
            geneIdentifier = (java.lang.String) value;
        } else if ("pValue".equals(fieldName)) {
            pValue = (java.lang.String) value;
        } else if ("bayesValue".equals(fieldName)) {
            bayesValue = (java.lang.String) value;
        } else if ("lsMeans".equals(fieldName)) {
            lsMeans = (java.lang.String) value;
        } else if ("lodScore".equals(fieldName)) {
            lodScore = (java.lang.String) value;
        } else if ("qtlId".equals(fieldName)) {
            qtlId = (java.lang.String) value;
        } else if ("dominanceEffect".equals(fieldName)) {
            dominanceEffect = (java.lang.String) value;
        } else if ("abbreviation".equals(fieldName)) {
            abbreviation = (java.lang.String) value;
        } else if ("model".equals(fieldName)) {
            model = (java.lang.String) value;
        } else if ("fStat".equals(fieldName)) {
            fStat = (java.lang.String) value;
        } else if ("trait".equals(fieldName)) {
            trait = (java.lang.String) value;
        } else if ("mapType".equals(fieldName)) {
            mapType = (java.lang.String) value;
        } else if ("peakCentimorgan".equals(fieldName)) {
            peakCentimorgan = (java.lang.String) value;
        } else if ("breed".equals(fieldName)) {
            breed = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("cmoName".equals(fieldName)) {
            cmoName = (org.intermine.model.InterMineObject) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("ptoName".equals(fieldName)) {
            ptoName = (org.intermine.model.InterMineObject) value;
        } else if ("vtoName".equals(fieldName)) {
            vtoName = (org.intermine.model.InterMineObject) value;
        } else if ("snpAsFlankMarkers".equals(fieldName)) {
            snpAsFlankMarkers = (java.util.Set) value;
        } else if ("source".equals(fieldName)) {
            source = (java.lang.String) value;
        } else if ("score".equals(fieldName)) {
            score = (java.lang.Double) value;
        } else if ("scoreType".equals(fieldName)) {
            scoreType = (java.lang.String) value;
        } else if ("status".equals(fieldName)) {
            status = (java.lang.String) value;
        } else if ("length".equals(fieldName)) {
            length = (java.lang.Integer) value;
        } else if ("sequenceOntologyTerm".equals(fieldName)) {
            sequenceOntologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("chromosomeLocation".equals(fieldName)) {
            chromosomeLocation = (org.intermine.model.InterMineObject) value;
        } else if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("chromosome".equals(fieldName)) {
            chromosome = (org.intermine.model.InterMineObject) value;
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures = (java.util.Set) value;
        } else if ("childFeatures".equals(fieldName)) {
            childFeatures = (java.util.Set) value;
        } else if ("dbCrossReferences".equals(fieldName)) {
            dbCrossReferences = (java.util.Set) value;
        } else if ("aliases".equals(fieldName)) {
            aliases = (java.util.Set) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("interactions".equals(fieldName)) {
            interactions = (java.util.Set) value;
        } else if ("locations".equals(fieldName)) {
            locations = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("traitId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("significance".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("flankMarkers".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("likelihoodRatio".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("additiveEffect".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("testBase".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("geneIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pValue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bayesValue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("lsMeans".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("lodScore".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("qtlId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("dominanceEffect".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("abbreviation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("model".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("fStat".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("trait".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("mapType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("peakCentimorgan".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("breed".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("cmoName".equals(fieldName)) {
            return org.intermine.model.bio.CMOTerm.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("ptoName".equals(fieldName)) {
            return org.intermine.model.bio.LPTTerm.class;
        }
        if ("vtoName".equals(fieldName)) {
            return org.intermine.model.bio.VTTerm.class;
        }
        if ("snpAsFlankMarkers".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("source".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("score".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("scoreType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("status".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("length".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.SOTerm.class;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("chromosome".equals(fieldName)) {
            return org.intermine.model.bio.Chromosome.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("childFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dbCrossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("aliases".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("interactions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.QTL.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.QTLShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.QTL");
        if (traitId != null) {
            sb.append("$_^atraitId$_^");
            String string = traitId;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (significance != null) {
            sb.append("$_^asignificance$_^");
            String string = significance;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (flankMarkers != null) {
            sb.append("$_^aflankMarkers$_^");
            String string = flankMarkers;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (likelihoodRatio != null) {
            sb.append("$_^alikelihoodRatio$_^");
            String string = likelihoodRatio;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (additiveEffect != null) {
            sb.append("$_^aadditiveEffect$_^");
            String string = additiveEffect;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (testBase != null) {
            sb.append("$_^atestBase$_^");
            String string = testBase;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (geneIdentifier != null) {
            sb.append("$_^ageneIdentifier$_^");
            String string = geneIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (pValue != null) {
            sb.append("$_^apValue$_^");
            String string = pValue;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (bayesValue != null) {
            sb.append("$_^abayesValue$_^");
            String string = bayesValue;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (lsMeans != null) {
            sb.append("$_^alsMeans$_^");
            String string = lsMeans;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (lodScore != null) {
            sb.append("$_^alodScore$_^");
            String string = lodScore;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (qtlId != null) {
            sb.append("$_^aqtlId$_^");
            String string = qtlId;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (dominanceEffect != null) {
            sb.append("$_^adominanceEffect$_^");
            String string = dominanceEffect;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (abbreviation != null) {
            sb.append("$_^aabbreviation$_^");
            String string = abbreviation;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (model != null) {
            sb.append("$_^amodel$_^");
            String string = model;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (fStat != null) {
            sb.append("$_^afStat$_^");
            String string = fStat;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (trait != null) {
            sb.append("$_^atrait$_^");
            String string = trait;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (mapType != null) {
            sb.append("$_^amapType$_^");
            String string = mapType;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (peakCentimorgan != null) {
            sb.append("$_^apeakCentimorgan$_^");
            String string = peakCentimorgan;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (breed != null) {
            sb.append("$_^abreed$_^");
            String string = breed;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
        }
        if (cmoName != null) {
            sb.append("$_^rcmoName$_^").append(cmoName.getId());
        }
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
        }
        if (ptoName != null) {
            sb.append("$_^rptoName$_^").append(ptoName.getId());
        }
        if (vtoName != null) {
            sb.append("$_^rvtoName$_^").append(vtoName.getId());
        }
        if (source != null) {
            sb.append("$_^asource$_^");
            String string = source;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (score != null) {
            sb.append("$_^ascore$_^").append(score);
        }
        if (scoreType != null) {
            sb.append("$_^ascoreType$_^");
            String string = scoreType;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (status != null) {
            sb.append("$_^astatus$_^");
            String string = status;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (sequenceOntologyTerm != null) {
            sb.append("$_^rsequenceOntologyTerm$_^").append(sequenceOntologyTerm.getId());
        }
        if (chromosomeLocation != null) {
            sb.append("$_^rchromosomeLocation$_^").append(chromosomeLocation.getId());
        }
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (chromosome != null) {
            sb.append("$_^rchromosome$_^").append(chromosome.getId());
        }
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (secondaryIdentifier != null) {
            sb.append("$_^asecondaryIdentifier$_^");
            String string = secondaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.QTLShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.QTL)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atraitId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                traitId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asignificance".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                significance = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aflankMarkers".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                flankMarkers = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alikelihoodRatio".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                likelihoodRatio = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aadditiveEffect".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                additiveEffect = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atestBase".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                testBase = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ageneIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                geneIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apValue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pValue = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abayesValue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bayesValue = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alsMeans".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                lsMeans = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alodScore".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                lodScore = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aqtlId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                qtlId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adominanceEffect".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                dominanceEffect = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aabbreviation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                abbreviation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amodel".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                model = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afStat".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                fStat = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atrait".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                trait = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amapType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                mapType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apeakCentimorgan".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                peakCentimorgan = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abreed".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                breed = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
                i++;
            };
            if ((i < notXml.length) &&"rcmoName".equals(notXml[i])) {
                i++;
                cmoName = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.CMOTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rptoName".equals(notXml[i])) {
                i++;
                ptoName = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.LPTTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rvtoName".equals(notXml[i])) {
                i++;
                vtoName = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.VTTerm.class);
                i++;
            };
            if ((i < notXml.length) && "asource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                source = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascore".equals(notXml[i])) {
                i++;
                score = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ascoreType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scoreType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astatus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                status = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rsequenceOntologyTerm".equals(notXml[i])) {
                i++;
                sequenceOntologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SOTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosomeLocation".equals(notXml[i])) {
                i++;
                chromosomeLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosome".equals(notXml[i])) {
                i++;
                chromosome = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Chromosome.class);
                i++;
            };
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asecondaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                secondaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        snpAsFlankMarkers = new ProxyCollection<org.intermine.model.bio.SequenceAlteration>(os, this, "snpAsFlankMarkers", org.intermine.model.bio.SequenceAlteration.class);
        overlappingFeatures = new ProxyCollection<org.intermine.model.bio.SequenceFeature>(os, this, "overlappingFeatures", org.intermine.model.bio.SequenceFeature.class);
        childFeatures = new ProxyCollection<org.intermine.model.bio.SequenceFeature>(os, this, "childFeatures", org.intermine.model.bio.SequenceFeature.class);
        dbCrossReferences = new ProxyCollection<org.intermine.model.bio.xRef>(os, this, "dbCrossReferences", org.intermine.model.bio.xRef.class);
        aliases = new ProxyCollection<org.intermine.model.bio.AliasName>(os, this, "aliases", org.intermine.model.bio.AliasName.class);
        interactions = new ProxyCollection<org.intermine.model.bio.Interaction>(os, this, "interactions", org.intermine.model.bio.Interaction.class);
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.Synonym>(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.CrossReference>(os, this, "crossReferences", org.intermine.model.bio.CrossReference.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        locatedFeatures = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locatedFeatures", org.intermine.model.bio.Location.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("snpAsFlankMarkers".equals(fieldName)) {
            snpAsFlankMarkers.add((org.intermine.model.bio.SequenceAlteration) element);
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures.add((org.intermine.model.bio.SequenceFeature) element);
        } else if ("childFeatures".equals(fieldName)) {
            childFeatures.add((org.intermine.model.bio.SequenceFeature) element);
        } else if ("dbCrossReferences".equals(fieldName)) {
            dbCrossReferences.add((org.intermine.model.bio.xRef) element);
        } else if ("aliases".equals(fieldName)) {
            aliases.add((org.intermine.model.bio.AliasName) element);
        } else if ("interactions".equals(fieldName)) {
            interactions.add((org.intermine.model.bio.Interaction) element);
        } else if ("locations".equals(fieldName)) {
            locations.add((org.intermine.model.bio.Location) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.Synonym) element);
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences.add((org.intermine.model.bio.CrossReference) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures.add((org.intermine.model.bio.Location) element);
        } else {
            if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("snpAsFlankMarkers".equals(fieldName)) {
            return org.intermine.model.bio.SequenceAlteration.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return org.intermine.model.bio.SequenceFeature.class;
        }
        if ("childFeatures".equals(fieldName)) {
            return org.intermine.model.bio.SequenceFeature.class;
        }
        if ("dbCrossReferences".equals(fieldName)) {
            return org.intermine.model.bio.xRef.class;
        }
        if ("aliases".equals(fieldName)) {
            return org.intermine.model.bio.AliasName.class;
        }
        if ("interactions".equals(fieldName)) {
            return org.intermine.model.bio.Interaction.class;
        }
        if ("locations".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.Synonym.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return org.intermine.model.bio.CrossReference.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.QTL.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
