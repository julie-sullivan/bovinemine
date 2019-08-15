package org.intermine.model.bio;

public interface BRENDATerm extends org.intermine.model.bio.OntologyTerm
{
    public java.util.Set<org.intermine.model.bio.ExpressionMetadata> getSamples();
    public void setSamples(final java.util.Set<org.intermine.model.bio.ExpressionMetadata> samples);
    public void addSamples(final org.intermine.model.bio.ExpressionMetadata arg);

}
