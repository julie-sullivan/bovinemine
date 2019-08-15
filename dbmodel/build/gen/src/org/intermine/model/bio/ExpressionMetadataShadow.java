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

public class ExpressionMetadataShadow implements ExpressionMetadata, ShadowClass
{
    public static final Class<ExpressionMetadata> shadowOf = ExpressionMetadata.class;
    // Attr: org.intermine.model.bio.ExpressionMetadata.sampleName
    protected java.lang.String sampleName;
    public java.lang.String getSampleName() { return sampleName; }
    public void setSampleName(final java.lang.String sampleName) { this.sampleName = sampleName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraSubmission
    protected java.lang.String sraSubmission;
    public java.lang.String getSraSubmission() { return sraSubmission; }
    public void setSraSubmission(final java.lang.String sraSubmission) { this.sraSubmission = sraSubmission; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.releaseDate
    protected java.lang.String releaseDate;
    public java.lang.String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(final java.lang.String releaseDate) { this.releaseDate = releaseDate; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.btoTopLevel
    protected java.lang.String btoTopLevel;
    public java.lang.String getBtoTopLevel() { return btoTopLevel; }
    public void setBtoTopLevel(final java.lang.String btoTopLevel) { this.btoTopLevel = btoTopLevel; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.organismName
    protected java.lang.String organismName;
    public java.lang.String getOrganismName() { return organismName; }
    public void setOrganismName(final java.lang.String organismName) { this.organismName = organismName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.organSystem
    protected java.lang.String organSystem;
    public java.lang.String getOrganSystem() { return organSystem; }
    public void setOrganSystem(final java.lang.String organSystem) { this.organSystem = organSystem; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.experiment
    protected java.lang.String experiment;
    public java.lang.String getExperiment() { return experiment; }
    public void setExperiment(final java.lang.String experiment) { this.experiment = experiment; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.lboId
    protected java.lang.String lboId;
    public java.lang.String getLboId() { return lboId; }
    public void setLboId(final java.lang.String lboId) { this.lboId = lboId; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sex
    protected java.lang.String sex;
    public java.lang.String getSex() { return sex; }
    public void setSex(final java.lang.String sex) { this.sex = sex; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.btoId
    protected java.lang.String btoId;
    public java.lang.String getBtoId() { return btoId; }
    public void setBtoId(final java.lang.String btoId) { this.btoId = btoId; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.spotsWithMates
    protected java.lang.String spotsWithMates;
    public java.lang.String getSpotsWithMates() { return spotsWithMates; }
    public void setSpotsWithMates(final java.lang.String spotsWithMates) { this.spotsWithMates = spotsWithMates; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.libraryName
    protected java.lang.String libraryName;
    public java.lang.String getLibraryName() { return libraryName; }
    public void setLibraryName(final java.lang.String libraryName) { this.libraryName = libraryName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.librarySelection
    protected java.lang.String librarySelection;
    public java.lang.String getLibrarySelection() { return librarySelection; }
    public void setLibrarySelection(final java.lang.String librarySelection) { this.librarySelection = librarySelection; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.spots
    protected java.lang.String spots;
    public java.lang.String getSpots() { return spots; }
    public void setSpots(final java.lang.String spots) { this.spots = spots; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.libraryStrategy
    protected java.lang.String libraryStrategy;
    public java.lang.String getLibraryStrategy() { return libraryStrategy; }
    public void setLibraryStrategy(final java.lang.String libraryStrategy) { this.libraryStrategy = libraryStrategy; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.run
    protected java.lang.String run;
    public java.lang.String getRun() { return run; }
    public void setRun(final java.lang.String run) { this.run = run; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.breed
    protected java.lang.String breed;
    public java.lang.String getBreed() { return breed; }
    public void setBreed(final java.lang.String breed) { this.breed = breed; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.libraryLayout
    protected java.lang.String libraryLayout;
    public java.lang.String getLibraryLayout() { return libraryLayout; }
    public void setLibraryLayout(final java.lang.String libraryLayout) { this.libraryLayout = libraryLayout; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.individual
    protected java.lang.String individual;
    public java.lang.String getIndividual() { return individual; }
    public void setIndividual(final java.lang.String individual) { this.individual = individual; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.bases
    protected java.lang.String bases;
    public java.lang.String getBases() { return bases; }
    public void setBases(final java.lang.String bases) { this.bases = bases; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.btoName
    protected java.lang.String btoName;
    public java.lang.String getBtoName() { return btoName; }
    public void setBtoName(final java.lang.String btoName) { this.btoName = btoName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.bioproject
    protected java.lang.String bioproject;
    public java.lang.String getBioproject() { return bioproject; }
    public void setBioproject(final java.lang.String bioproject) { this.bioproject = bioproject; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.tissue
    protected java.lang.String tissue;
    public java.lang.String getTissue() { return tissue; }
    public void setTissue(final java.lang.String tissue) { this.tissue = tissue; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.model
    protected java.lang.String model;
    public java.lang.String getModel() { return model; }
    public void setModel(final java.lang.String model) { this.model = model; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.biosample
    protected java.lang.String biosample;
    public java.lang.String getBiosample() { return biosample; }
    public void setBiosample(final java.lang.String biosample) { this.biosample = biosample; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.age
    protected java.lang.String age;
    public java.lang.String getAge() { return age; }
    public void setAge(final java.lang.String age) { this.age = age; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.averageReadLength
    protected java.lang.String averageReadLength;
    public java.lang.String getAverageReadLength() { return averageReadLength; }
    public void setAverageReadLength(final java.lang.String averageReadLength) { this.averageReadLength = averageReadLength; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.librarySource
    protected java.lang.String librarySource;
    public java.lang.String getLibrarySource() { return librarySource; }
    public void setLibrarySource(final java.lang.String librarySource) { this.librarySource = librarySource; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.platform
    protected java.lang.String platform;
    public java.lang.String getPlatform() { return platform; }
    public void setPlatform(final java.lang.String platform) { this.platform = platform; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.btoAllLevels
    protected java.lang.String btoAllLevels;
    public java.lang.String getBtoAllLevels() { return btoAllLevels; }
    public void setBtoAllLevels(final java.lang.String btoAllLevels) { this.btoAllLevels = btoAllLevels; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraStudy
    protected java.lang.String sraStudy;
    public java.lang.String getSraStudy() { return sraStudy; }
    public void setSraStudy(final java.lang.String sraStudy) { this.sraStudy = sraStudy; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraSample
    protected java.lang.String sraSample;
    public java.lang.String getSraSample() { return sraSample; }
    public void setSraSample(final java.lang.String sraSample) { this.sraSample = sraSample; }

    // Ref: org.intermine.model.bio.ExpressionMetadata.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.ExpressionMetadata.isoforms
    protected java.util.Set<org.intermine.model.bio.Expression> isoforms = new java.util.HashSet<org.intermine.model.bio.Expression>();
    public java.util.Set<org.intermine.model.bio.Expression> getIsoforms() { return isoforms; }
    public void setIsoforms(final java.util.Set<org.intermine.model.bio.Expression> isoforms) { this.isoforms = isoforms; }
    public void addIsoforms(final org.intermine.model.bio.Expression arg) { isoforms.add(arg); }

    // Col: org.intermine.model.bio.ExpressionMetadata.brendaTissueOntology
    protected java.util.Set<org.intermine.model.bio.BRENDATerm> brendaTissueOntology = new java.util.HashSet<org.intermine.model.bio.BRENDATerm>();
    public java.util.Set<org.intermine.model.bio.BRENDATerm> getBrendaTissueOntology() { return brendaTissueOntology; }
    public void setBrendaTissueOntology(final java.util.Set<org.intermine.model.bio.BRENDATerm> brendaTissueOntology) { this.brendaTissueOntology = brendaTissueOntology; }
    public void addBrendaTissueOntology(final org.intermine.model.bio.BRENDATerm arg) { brendaTissueOntology.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionMetadata && id != null) ? id.equals(((ExpressionMetadata)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionMetadata [age=" + (age == null ? "null" : "\"" + age + "\"") + ", averageReadLength=" + (averageReadLength == null ? "null" : "\"" + averageReadLength + "\"") + ", bases=" + (bases == null ? "null" : "\"" + bases + "\"") + ", bioproject=" + (bioproject == null ? "null" : "\"" + bioproject + "\"") + ", biosample=" + (biosample == null ? "null" : "\"" + biosample + "\"") + ", breed=" + (breed == null ? "null" : "\"" + breed + "\"") + ", btoAllLevels=" + (btoAllLevels == null ? "null" : "\"" + btoAllLevels + "\"") + ", btoId=" + (btoId == null ? "null" : "\"" + btoId + "\"") + ", btoName=" + (btoName == null ? "null" : "\"" + btoName + "\"") + ", btoTopLevel=" + (btoTopLevel == null ? "null" : "\"" + btoTopLevel + "\"") + ", experiment=" + (experiment == null ? "null" : "\"" + experiment + "\"") + ", id=" + id + ", individual=" + (individual == null ? "null" : "\"" + individual + "\"") + ", lboId=" + (lboId == null ? "null" : "\"" + lboId + "\"") + ", libraryLayout=" + (libraryLayout == null ? "null" : "\"" + libraryLayout + "\"") + ", libraryName=" + (libraryName == null ? "null" : "\"" + libraryName + "\"") + ", librarySelection=" + (librarySelection == null ? "null" : "\"" + librarySelection + "\"") + ", librarySource=" + (librarySource == null ? "null" : "\"" + librarySource + "\"") + ", libraryStrategy=" + (libraryStrategy == null ? "null" : "\"" + libraryStrategy + "\"") + ", model=" + (model == null ? "null" : "\"" + model + "\"") + ", organSystem=" + (organSystem == null ? "null" : "\"" + organSystem + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", organismName=" + (organismName == null ? "null" : "\"" + organismName + "\"") + ", platform=" + (platform == null ? "null" : "\"" + platform + "\"") + ", releaseDate=" + (releaseDate == null ? "null" : "\"" + releaseDate + "\"") + ", run=" + (run == null ? "null" : "\"" + run + "\"") + ", sampleName=" + (sampleName == null ? "null" : "\"" + sampleName + "\"") + ", sex=" + (sex == null ? "null" : "\"" + sex + "\"") + ", spots=" + (spots == null ? "null" : "\"" + spots + "\"") + ", spotsWithMates=" + (spotsWithMates == null ? "null" : "\"" + spotsWithMates + "\"") + ", sraSample=" + (sraSample == null ? "null" : "\"" + sraSample + "\"") + ", sraStudy=" + (sraStudy == null ? "null" : "\"" + sraStudy + "\"") + ", sraSubmission=" + (sraSubmission == null ? "null" : "\"" + sraSubmission + "\"") + ", tissue=" + (tissue == null ? "null" : "\"" + tissue + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("sampleName".equals(fieldName)) {
            return sampleName;
        }
        if ("sraSubmission".equals(fieldName)) {
            return sraSubmission;
        }
        if ("releaseDate".equals(fieldName)) {
            return releaseDate;
        }
        if ("btoTopLevel".equals(fieldName)) {
            return btoTopLevel;
        }
        if ("organismName".equals(fieldName)) {
            return organismName;
        }
        if ("organSystem".equals(fieldName)) {
            return organSystem;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("lboId".equals(fieldName)) {
            return lboId;
        }
        if ("sex".equals(fieldName)) {
            return sex;
        }
        if ("btoId".equals(fieldName)) {
            return btoId;
        }
        if ("spotsWithMates".equals(fieldName)) {
            return spotsWithMates;
        }
        if ("libraryName".equals(fieldName)) {
            return libraryName;
        }
        if ("librarySelection".equals(fieldName)) {
            return librarySelection;
        }
        if ("spots".equals(fieldName)) {
            return spots;
        }
        if ("libraryStrategy".equals(fieldName)) {
            return libraryStrategy;
        }
        if ("run".equals(fieldName)) {
            return run;
        }
        if ("breed".equals(fieldName)) {
            return breed;
        }
        if ("libraryLayout".equals(fieldName)) {
            return libraryLayout;
        }
        if ("individual".equals(fieldName)) {
            return individual;
        }
        if ("bases".equals(fieldName)) {
            return bases;
        }
        if ("btoName".equals(fieldName)) {
            return btoName;
        }
        if ("bioproject".equals(fieldName)) {
            return bioproject;
        }
        if ("tissue".equals(fieldName)) {
            return tissue;
        }
        if ("model".equals(fieldName)) {
            return model;
        }
        if ("biosample".equals(fieldName)) {
            return biosample;
        }
        if ("age".equals(fieldName)) {
            return age;
        }
        if ("averageReadLength".equals(fieldName)) {
            return averageReadLength;
        }
        if ("librarySource".equals(fieldName)) {
            return librarySource;
        }
        if ("platform".equals(fieldName)) {
            return platform;
        }
        if ("btoAllLevels".equals(fieldName)) {
            return btoAllLevels;
        }
        if ("sraStudy".equals(fieldName)) {
            return sraStudy;
        }
        if ("sraSample".equals(fieldName)) {
            return sraSample;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("isoforms".equals(fieldName)) {
            return isoforms;
        }
        if ("brendaTissueOntology".equals(fieldName)) {
            return brendaTissueOntology;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("sampleName".equals(fieldName)) {
            return sampleName;
        }
        if ("sraSubmission".equals(fieldName)) {
            return sraSubmission;
        }
        if ("releaseDate".equals(fieldName)) {
            return releaseDate;
        }
        if ("btoTopLevel".equals(fieldName)) {
            return btoTopLevel;
        }
        if ("organismName".equals(fieldName)) {
            return organismName;
        }
        if ("organSystem".equals(fieldName)) {
            return organSystem;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("lboId".equals(fieldName)) {
            return lboId;
        }
        if ("sex".equals(fieldName)) {
            return sex;
        }
        if ("btoId".equals(fieldName)) {
            return btoId;
        }
        if ("spotsWithMates".equals(fieldName)) {
            return spotsWithMates;
        }
        if ("libraryName".equals(fieldName)) {
            return libraryName;
        }
        if ("librarySelection".equals(fieldName)) {
            return librarySelection;
        }
        if ("spots".equals(fieldName)) {
            return spots;
        }
        if ("libraryStrategy".equals(fieldName)) {
            return libraryStrategy;
        }
        if ("run".equals(fieldName)) {
            return run;
        }
        if ("breed".equals(fieldName)) {
            return breed;
        }
        if ("libraryLayout".equals(fieldName)) {
            return libraryLayout;
        }
        if ("individual".equals(fieldName)) {
            return individual;
        }
        if ("bases".equals(fieldName)) {
            return bases;
        }
        if ("btoName".equals(fieldName)) {
            return btoName;
        }
        if ("bioproject".equals(fieldName)) {
            return bioproject;
        }
        if ("tissue".equals(fieldName)) {
            return tissue;
        }
        if ("model".equals(fieldName)) {
            return model;
        }
        if ("biosample".equals(fieldName)) {
            return biosample;
        }
        if ("age".equals(fieldName)) {
            return age;
        }
        if ("averageReadLength".equals(fieldName)) {
            return averageReadLength;
        }
        if ("librarySource".equals(fieldName)) {
            return librarySource;
        }
        if ("platform".equals(fieldName)) {
            return platform;
        }
        if ("btoAllLevels".equals(fieldName)) {
            return btoAllLevels;
        }
        if ("sraStudy".equals(fieldName)) {
            return sraStudy;
        }
        if ("sraSample".equals(fieldName)) {
            return sraSample;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("isoforms".equals(fieldName)) {
            return isoforms;
        }
        if ("brendaTissueOntology".equals(fieldName)) {
            return brendaTissueOntology;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("sampleName".equals(fieldName)) {
            sampleName = (java.lang.String) value;
        } else if ("sraSubmission".equals(fieldName)) {
            sraSubmission = (java.lang.String) value;
        } else if ("releaseDate".equals(fieldName)) {
            releaseDate = (java.lang.String) value;
        } else if ("btoTopLevel".equals(fieldName)) {
            btoTopLevel = (java.lang.String) value;
        } else if ("organismName".equals(fieldName)) {
            organismName = (java.lang.String) value;
        } else if ("organSystem".equals(fieldName)) {
            organSystem = (java.lang.String) value;
        } else if ("experiment".equals(fieldName)) {
            experiment = (java.lang.String) value;
        } else if ("lboId".equals(fieldName)) {
            lboId = (java.lang.String) value;
        } else if ("sex".equals(fieldName)) {
            sex = (java.lang.String) value;
        } else if ("btoId".equals(fieldName)) {
            btoId = (java.lang.String) value;
        } else if ("spotsWithMates".equals(fieldName)) {
            spotsWithMates = (java.lang.String) value;
        } else if ("libraryName".equals(fieldName)) {
            libraryName = (java.lang.String) value;
        } else if ("librarySelection".equals(fieldName)) {
            librarySelection = (java.lang.String) value;
        } else if ("spots".equals(fieldName)) {
            spots = (java.lang.String) value;
        } else if ("libraryStrategy".equals(fieldName)) {
            libraryStrategy = (java.lang.String) value;
        } else if ("run".equals(fieldName)) {
            run = (java.lang.String) value;
        } else if ("breed".equals(fieldName)) {
            breed = (java.lang.String) value;
        } else if ("libraryLayout".equals(fieldName)) {
            libraryLayout = (java.lang.String) value;
        } else if ("individual".equals(fieldName)) {
            individual = (java.lang.String) value;
        } else if ("bases".equals(fieldName)) {
            bases = (java.lang.String) value;
        } else if ("btoName".equals(fieldName)) {
            btoName = (java.lang.String) value;
        } else if ("bioproject".equals(fieldName)) {
            bioproject = (java.lang.String) value;
        } else if ("tissue".equals(fieldName)) {
            tissue = (java.lang.String) value;
        } else if ("model".equals(fieldName)) {
            model = (java.lang.String) value;
        } else if ("biosample".equals(fieldName)) {
            biosample = (java.lang.String) value;
        } else if ("age".equals(fieldName)) {
            age = (java.lang.String) value;
        } else if ("averageReadLength".equals(fieldName)) {
            averageReadLength = (java.lang.String) value;
        } else if ("librarySource".equals(fieldName)) {
            librarySource = (java.lang.String) value;
        } else if ("platform".equals(fieldName)) {
            platform = (java.lang.String) value;
        } else if ("btoAllLevels".equals(fieldName)) {
            btoAllLevels = (java.lang.String) value;
        } else if ("sraStudy".equals(fieldName)) {
            sraStudy = (java.lang.String) value;
        } else if ("sraSample".equals(fieldName)) {
            sraSample = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("isoforms".equals(fieldName)) {
            isoforms = (java.util.Set) value;
        } else if ("brendaTissueOntology".equals(fieldName)) {
            brendaTissueOntology = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("sampleName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraSubmission".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("releaseDate".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("btoTopLevel".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organismName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organSystem".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experiment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("lboId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sex".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("btoId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("spotsWithMates".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("libraryName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("librarySelection".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("spots".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("libraryStrategy".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("run".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("breed".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("libraryLayout".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("individual".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bases".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("btoName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bioproject".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("tissue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("model".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("biosample".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("age".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("averageReadLength".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("librarySource".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("platform".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("btoAllLevels".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraStudy".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraSample".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("isoforms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("brendaTissueOntology".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionMetadataShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionMetadata");
        if (sampleName != null) {
            sb.append("$_^asampleName$_^");
            String string = sampleName;
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
        if (sraSubmission != null) {
            sb.append("$_^asraSubmission$_^");
            String string = sraSubmission;
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
        if (releaseDate != null) {
            sb.append("$_^areleaseDate$_^");
            String string = releaseDate;
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
        if (btoTopLevel != null) {
            sb.append("$_^abtoTopLevel$_^");
            String string = btoTopLevel;
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
        if (organismName != null) {
            sb.append("$_^aorganismName$_^");
            String string = organismName;
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
        if (organSystem != null) {
            sb.append("$_^aorganSystem$_^");
            String string = organSystem;
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
        if (lboId != null) {
            sb.append("$_^alboId$_^");
            String string = lboId;
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
        if (sex != null) {
            sb.append("$_^asex$_^");
            String string = sex;
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
        if (btoId != null) {
            sb.append("$_^abtoId$_^");
            String string = btoId;
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
        if (spotsWithMates != null) {
            sb.append("$_^aspotsWithMates$_^");
            String string = spotsWithMates;
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
        if (libraryName != null) {
            sb.append("$_^alibraryName$_^");
            String string = libraryName;
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
        if (librarySelection != null) {
            sb.append("$_^alibrarySelection$_^");
            String string = librarySelection;
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
        if (spots != null) {
            sb.append("$_^aspots$_^");
            String string = spots;
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
        if (libraryStrategy != null) {
            sb.append("$_^alibraryStrategy$_^");
            String string = libraryStrategy;
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
        if (run != null) {
            sb.append("$_^arun$_^");
            String string = run;
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
        if (libraryLayout != null) {
            sb.append("$_^alibraryLayout$_^");
            String string = libraryLayout;
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
        if (individual != null) {
            sb.append("$_^aindividual$_^");
            String string = individual;
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
        if (bases != null) {
            sb.append("$_^abases$_^");
            String string = bases;
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
        if (btoName != null) {
            sb.append("$_^abtoName$_^");
            String string = btoName;
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
        if (bioproject != null) {
            sb.append("$_^abioproject$_^");
            String string = bioproject;
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
        if (tissue != null) {
            sb.append("$_^atissue$_^");
            String string = tissue;
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
        if (biosample != null) {
            sb.append("$_^abiosample$_^");
            String string = biosample;
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
        if (age != null) {
            sb.append("$_^aage$_^");
            String string = age;
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
        if (averageReadLength != null) {
            sb.append("$_^aaverageReadLength$_^");
            String string = averageReadLength;
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
        if (librarySource != null) {
            sb.append("$_^alibrarySource$_^");
            String string = librarySource;
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
        if (platform != null) {
            sb.append("$_^aplatform$_^");
            String string = platform;
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
        if (btoAllLevels != null) {
            sb.append("$_^abtoAllLevels$_^");
            String string = btoAllLevels;
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
        if (sraStudy != null) {
            sb.append("$_^asraStudy$_^");
            String string = sraStudy;
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
        if (sraSample != null) {
            sb.append("$_^asraSample$_^");
            String string = sraSample;
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
        if (!org.intermine.model.bio.ExpressionMetadataShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionMetadata)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asampleName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sampleName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraSubmission".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraSubmission = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areleaseDate".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                releaseDate = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abtoTopLevel".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                btoTopLevel = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aorganismName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                organismName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aorganSystem".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                organSystem = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if ((i < notXml.length) && "alboId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                lboId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asex".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sex = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abtoId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                btoId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aspotsWithMates".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                spotsWithMates = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibraryName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                libraryName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibrarySelection".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                librarySelection = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aspots".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                spots = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibraryStrategy".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                libraryStrategy = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arun".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                run = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "alibraryLayout".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                libraryLayout = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aindividual".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                individual = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abases".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bases = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abtoName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                btoName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abioproject".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bioproject = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atissue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                tissue = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "abiosample".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                biosample = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aage".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                age = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aaverageReadLength".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                averageReadLength = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibrarySource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                librarySource = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aplatform".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                platform = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abtoAllLevels".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                btoAllLevels = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraStudy".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraStudy = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraSample".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraSample = string == null ? notXml[i] : string.toString();
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
        isoforms = new ProxyCollection<org.intermine.model.bio.Expression>(os, this, "isoforms", org.intermine.model.bio.Expression.class);
        brendaTissueOntology = new ProxyCollection<org.intermine.model.bio.BRENDATerm>(os, this, "brendaTissueOntology", org.intermine.model.bio.BRENDATerm.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("isoforms".equals(fieldName)) {
            isoforms.add((org.intermine.model.bio.Expression) element);
        } else if ("brendaTissueOntology".equals(fieldName)) {
            brendaTissueOntology.add((org.intermine.model.bio.BRENDATerm) element);
        } else {
            if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("isoforms".equals(fieldName)) {
            return org.intermine.model.bio.Expression.class;
        }
        if ("brendaTissueOntology".equals(fieldName)) {
            return org.intermine.model.bio.BRENDATerm.class;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
