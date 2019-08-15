package org.intermine.model.bio;

public interface Expression extends org.intermine.model.InterMineObject
{
    public java.lang.String getExperiment();
    public void setExperiment(final java.lang.String experiment);

    public java.lang.Float getfPKM();
    public void setfPKM(final java.lang.Float FPKM);

    public java.lang.Float gettPM();
    public void settPM(final java.lang.Float TPM);

    public org.intermine.model.bio.ExpressionMetadata getSampleMetadata();
    public void setSampleMetadata(final org.intermine.model.bio.ExpressionMetadata sampleMetadata);
    public void proxySampleMetadata(final org.intermine.objectstore.proxy.ProxyReference sampleMetadata);
    public org.intermine.model.InterMineObject proxGetSampleMetadata();

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public org.intermine.model.bio.Transcript getIsoform();
    public void setIsoform(final org.intermine.model.bio.Transcript isoform);
    public void proxyIsoform(final org.intermine.objectstore.proxy.ProxyReference isoform);
    public org.intermine.model.InterMineObject proxGetIsoform();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
