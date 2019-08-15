package org.intermine.model.bio;

public interface SequenceAlteration extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getValidationStatus();
    public void setValidationStatus(final java.lang.String validationStatus);

    public java.lang.String getReferenceAllele();
    public void setReferenceAllele(final java.lang.String referenceAllele);

    public java.lang.Float getHeterozygosity();
    public void setHeterozygosity(final java.lang.Float heterozygosity);

    public java.lang.String getAlternateAllele();
    public void setAlternateAllele(final java.lang.String alternateAllele);

    public java.lang.String getVariationType();
    public void setVariationType(final java.lang.String variationType);

    public java.lang.String getOrientation();
    public void setOrientation(final java.lang.String orientation);

    public java.util.Set<org.intermine.model.bio.Consequence> getConsequences();
    public void setConsequences(final java.util.Set<org.intermine.model.bio.Consequence> consequences);
    public void addConsequences(final org.intermine.model.bio.Consequence arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}
