package org.intermine.model.bio;

public interface QTL extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getTraitId();
    public void setTraitId(final java.lang.String traitId);

    public java.lang.String getSignificance();
    public void setSignificance(final java.lang.String significance);

    public java.lang.String getFlankMarkers();
    public void setFlankMarkers(final java.lang.String flankMarkers);

    public java.lang.String getLikelihoodRatio();
    public void setLikelihoodRatio(final java.lang.String likelihoodRatio);

    public java.lang.String getAdditiveEffect();
    public void setAdditiveEffect(final java.lang.String additiveEffect);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getTestBase();
    public void setTestBase(final java.lang.String testBase);

    public java.lang.String getGeneIdentifier();
    public void setGeneIdentifier(final java.lang.String geneIdentifier);

    public java.lang.String getPValue();
    public void setPValue(final java.lang.String pValue);

    public java.lang.String getBayesValue();
    public void setBayesValue(final java.lang.String bayesValue);

    public java.lang.String getLsMeans();
    public void setLsMeans(final java.lang.String lsMeans);

    public java.lang.String getLodScore();
    public void setLodScore(final java.lang.String lodScore);

    public java.lang.String getQtlId();
    public void setQtlId(final java.lang.String qtlId);

    public java.lang.String getDominanceEffect();
    public void setDominanceEffect(final java.lang.String dominanceEffect);

    public java.lang.String getAbbreviation();
    public void setAbbreviation(final java.lang.String abbreviation);

    public java.lang.String getModel();
    public void setModel(final java.lang.String model);

    public java.lang.String getFStat();
    public void setFStat(final java.lang.String fStat);

    public java.lang.String getTrait();
    public void setTrait(final java.lang.String trait);

    public java.lang.String getMapType();
    public void setMapType(final java.lang.String mapType);

    public java.lang.String getPeakCentimorgan();
    public void setPeakCentimorgan(final java.lang.String peakCentimorgan);

    public java.lang.String getBreed();
    public void setBreed(final java.lang.String breed);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public org.intermine.model.bio.CMOTerm getCmoName();
    public void setCmoName(final org.intermine.model.bio.CMOTerm cmoName);
    public void proxyCmoName(final org.intermine.objectstore.proxy.ProxyReference cmoName);
    public org.intermine.model.InterMineObject proxGetCmoName();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.LPTTerm getPtoName();
    public void setPtoName(final org.intermine.model.bio.LPTTerm ptoName);
    public void proxyPtoName(final org.intermine.objectstore.proxy.ProxyReference ptoName);
    public org.intermine.model.InterMineObject proxGetPtoName();

    public org.intermine.model.bio.VTTerm getVtoName();
    public void setVtoName(final org.intermine.model.bio.VTTerm vtoName);
    public void proxyVtoName(final org.intermine.objectstore.proxy.ProxyReference vtoName);
    public org.intermine.model.InterMineObject proxGetVtoName();

    public java.util.Set<org.intermine.model.bio.SequenceAlteration> getSnpAsFlankMarkers();
    public void setSnpAsFlankMarkers(final java.util.Set<org.intermine.model.bio.SequenceAlteration> snpAsFlankMarkers);
    public void addSnpAsFlankMarkers(final org.intermine.model.bio.SequenceAlteration arg);

}
