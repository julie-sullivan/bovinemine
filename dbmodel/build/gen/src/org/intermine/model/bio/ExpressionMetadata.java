package org.intermine.model.bio;

public interface ExpressionMetadata extends org.intermine.model.InterMineObject
{
    public java.lang.String getSampleName();
    public void setSampleName(final java.lang.String sampleName);

    public java.lang.String getSraSubmission();
    public void setSraSubmission(final java.lang.String sraSubmission);

    public java.lang.String getReleaseDate();
    public void setReleaseDate(final java.lang.String releaseDate);

    public java.lang.String getBtoTopLevel();
    public void setBtoTopLevel(final java.lang.String btoTopLevel);

    public java.lang.String getOrganismName();
    public void setOrganismName(final java.lang.String organismName);

    public java.lang.String getOrganSystem();
    public void setOrganSystem(final java.lang.String organSystem);

    public java.lang.String getExperiment();
    public void setExperiment(final java.lang.String experiment);

    public java.lang.String getLboId();
    public void setLboId(final java.lang.String lboId);

    public java.lang.String getSex();
    public void setSex(final java.lang.String sex);

    public java.lang.String getBtoId();
    public void setBtoId(final java.lang.String btoId);

    public java.lang.String getSpotsWithMates();
    public void setSpotsWithMates(final java.lang.String spotsWithMates);

    public java.lang.String getLibraryName();
    public void setLibraryName(final java.lang.String libraryName);

    public java.lang.String getLibrarySelection();
    public void setLibrarySelection(final java.lang.String librarySelection);

    public java.lang.String getSpots();
    public void setSpots(final java.lang.String spots);

    public java.lang.String getLibraryStrategy();
    public void setLibraryStrategy(final java.lang.String libraryStrategy);

    public java.lang.String getRun();
    public void setRun(final java.lang.String run);

    public java.lang.String getBreed();
    public void setBreed(final java.lang.String breed);

    public java.lang.String getLibraryLayout();
    public void setLibraryLayout(final java.lang.String libraryLayout);

    public java.lang.String getIndividual();
    public void setIndividual(final java.lang.String individual);

    public java.lang.String getBases();
    public void setBases(final java.lang.String bases);

    public java.lang.String getBtoName();
    public void setBtoName(final java.lang.String btoName);

    public java.lang.String getBioproject();
    public void setBioproject(final java.lang.String bioproject);

    public java.lang.String getTissue();
    public void setTissue(final java.lang.String tissue);

    public java.lang.String getModel();
    public void setModel(final java.lang.String model);

    public java.lang.String getBiosample();
    public void setBiosample(final java.lang.String biosample);

    public java.lang.String getAge();
    public void setAge(final java.lang.String age);

    public java.lang.String getAverageReadLength();
    public void setAverageReadLength(final java.lang.String averageReadLength);

    public java.lang.String getLibrarySource();
    public void setLibrarySource(final java.lang.String librarySource);

    public java.lang.String getPlatform();
    public void setPlatform(final java.lang.String platform);

    public java.lang.String getBtoAllLevels();
    public void setBtoAllLevels(final java.lang.String btoAllLevels);

    public java.lang.String getSraStudy();
    public void setSraStudy(final java.lang.String sraStudy);

    public java.lang.String getSraSample();
    public void setSraSample(final java.lang.String sraSample);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Expression> getIsoforms();
    public void setIsoforms(final java.util.Set<org.intermine.model.bio.Expression> isoforms);
    public void addIsoforms(final org.intermine.model.bio.Expression arg);

    public java.util.Set<org.intermine.model.bio.BRENDATerm> getBrendaTissueOntology();
    public void setBrendaTissueOntology(final java.util.Set<org.intermine.model.bio.BRENDATerm> brendaTissueOntology);
    public void addBrendaTissueOntology(final org.intermine.model.bio.BRENDATerm arg);

}
