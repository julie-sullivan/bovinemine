package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionShadow implements Expression, ShadowClass
{
    public static final Class<Expression> shadowOf = Expression.class;
    // Attr: org.intermine.model.bio.Expression.experiment
    protected java.lang.String experiment;
    public java.lang.String getExperiment() { return experiment; }
    public void setExperiment(final java.lang.String experiment) { this.experiment = experiment; }

    // Attr: org.intermine.model.bio.Expression.FPKM
    protected java.lang.Float FPKM;
    public java.lang.Float getfPKM() { return FPKM; }
    public void setfPKM(final java.lang.Float FPKM) { this.FPKM = FPKM; }

    // Attr: org.intermine.model.bio.Expression.TPM
    protected java.lang.Float TPM;
    public java.lang.Float gettPM() { return TPM; }
    public void settPM(final java.lang.Float TPM) { this.TPM = TPM; }

    // Ref: org.intermine.model.bio.Expression.sampleMetadata
    protected org.intermine.model.InterMineObject sampleMetadata;
    public org.intermine.model.bio.ExpressionMetadata getSampleMetadata() { if (sampleMetadata instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ExpressionMetadata) ((org.intermine.objectstore.proxy.ProxyReference) sampleMetadata).getObject()); }; return (org.intermine.model.bio.ExpressionMetadata) sampleMetadata; }
    public void setSampleMetadata(final org.intermine.model.bio.ExpressionMetadata sampleMetadata) { this.sampleMetadata = sampleMetadata; }
    public void proxySampleMetadata(final org.intermine.objectstore.proxy.ProxyReference sampleMetadata) { this.sampleMetadata = sampleMetadata; }
    public org.intermine.model.InterMineObject proxGetSampleMetadata() { return sampleMetadata; }

    // Ref: org.intermine.model.bio.Expression.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Ref: org.intermine.model.bio.Expression.isoform
    protected org.intermine.model.InterMineObject isoform;
    public org.intermine.model.bio.Transcript getIsoform() { if (isoform instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Transcript) ((org.intermine.objectstore.proxy.ProxyReference) isoform).getObject()); }; return (org.intermine.model.bio.Transcript) isoform; }
    public void setIsoform(final org.intermine.model.bio.Transcript isoform) { this.isoform = isoform; }
    public void proxyIsoform(final org.intermine.objectstore.proxy.ProxyReference isoform) { this.isoform = isoform; }
    public org.intermine.model.InterMineObject proxGetIsoform() { return isoform; }

    // Ref: org.intermine.model.bio.Expression.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Expression && id != null) ? id.equals(((Expression)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Expression [FPKM=" + FPKM + ", TPM=" + TPM + ", experiment=" + (experiment == null ? "null" : "\"" + experiment + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + ", isoform=" + (isoform == null ? "null" : (isoform.getId() == null ? "no id" : isoform.getId().toString())) + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", sampleMetadata=" + (sampleMetadata == null ? "null" : (sampleMetadata.getId() == null ? "no id" : sampleMetadata.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("FPKM".equals(fieldName)) {
            return FPKM;
        }
        if ("TPM".equals(fieldName)) {
            return TPM;
        }
        if ("sampleMetadata".equals(fieldName)) {
            if (sampleMetadata instanceof ProxyReference) {
                return ((ProxyReference) sampleMetadata).getObject();
            } else {
                return sampleMetadata;
            }
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("isoform".equals(fieldName)) {
            if (isoform instanceof ProxyReference) {
                return ((ProxyReference) isoform).getObject();
            } else {
                return isoform;
            }
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("FPKM".equals(fieldName)) {
            return FPKM;
        }
        if ("TPM".equals(fieldName)) {
            return TPM;
        }
        if ("sampleMetadata".equals(fieldName)) {
            return sampleMetadata;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("isoform".equals(fieldName)) {
            return isoform;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("experiment".equals(fieldName)) {
            experiment = (java.lang.String) value;
        } else if ("FPKM".equals(fieldName)) {
            FPKM = (java.lang.Float) value;
        } else if ("TPM".equals(fieldName)) {
            TPM = (java.lang.Float) value;
        } else if ("sampleMetadata".equals(fieldName)) {
            sampleMetadata = (org.intermine.model.InterMineObject) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("isoform".equals(fieldName)) {
            isoform = (org.intermine.model.InterMineObject) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("experiment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("FPKM".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("TPM".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("sampleMetadata".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionMetadata.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("isoform".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Expression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Expression");
        if (experiment != null) {
            sb.append("$_^aexperiment$_^");
            String string = experiment;
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
        if (FPKM != null) {
            sb.append("$_^aFPKM$_^").append(FPKM);
        }
        if (TPM != null) {
            sb.append("$_^aTPM$_^").append(TPM);
        }
        if (sampleMetadata != null) {
            sb.append("$_^rsampleMetadata$_^").append(sampleMetadata.getId());
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (isoform != null) {
            sb.append("$_^risoform$_^").append(isoform.getId());
        }
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
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
        if (!org.intermine.model.bio.ExpressionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Expression)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aexperiment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                experiment = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aFPKM".equals(notXml[i])) {
                i++;
                FPKM = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aTPM".equals(notXml[i])) {
                i++;
                TPM = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rsampleMetadata".equals(notXml[i])) {
                i++;
                sampleMetadata = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ExpressionMetadata.class);
                i++;
            };
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) &&"risoform".equals(notXml[i])) {
                i++;
                isoform = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Transcript.class);
                i++;
            };
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Expression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
