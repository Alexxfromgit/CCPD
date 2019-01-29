package com.alexxrw.ccpd.domain;

import java.util.HashMap;
import java.util.Map;

public class Iterations {

    private static Map<String, Double> iterationsMap = new HashMap<>();

    private Double functionIteration = 0.0001;
    private Double lnAIteration = 0.000001;
    private Double ionForceIteration = 0.0001;

    {
        iterationsMap.put("functionIteration", 0.0001);
        iterationsMap.put("lnAIteration", 0.000001);
        iterationsMap.put("ionForceIteration", 0.0001);
    }

    public Iterations() {

    }

    public Iterations(Double functionIteration, Double lnAIteration, Double ionForceIteration) {
        this.functionIteration = functionIteration;
        this.lnAIteration = lnAIteration;
        this.ionForceIteration = ionForceIteration;
    }

    public Map<String, Double> getIterationsMap() {
        return iterationsMap;
    }

    public Double getFunctionIteration() {
        return functionIteration;
    }

    public void setFunctionIteration(Double functionIteration) {
        this.functionIteration = functionIteration;
    }

    public Double getLnAIteration() {
        return lnAIteration;
    }

    public void setLnAIteration(Double lnAIteration) {
        this.lnAIteration = lnAIteration;
    }

    public Double getIonForceIteration() {
        return ionForceIteration;
    }

    public void setIonForceIteration(Double ionForceIteration) {
        this.ionForceIteration = ionForceIteration;
    }
}
