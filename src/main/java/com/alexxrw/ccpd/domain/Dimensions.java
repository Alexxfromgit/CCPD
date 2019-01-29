package com.alexxrw.ccpd.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

public class Dimensions {

    private static Map<String, Integer> dimensionsMap = new HashMap<>();

    private Integer components = 2;
    private Integer particles = 3;
    private Integer basis = 2;
    private Integer solutionPoints = 10;
    private Integer diagram = 1;

    {
        dimensionsMap.put("components", 2);
        dimensionsMap.put("particles", 3);
        dimensionsMap.put("basis", 5);
        dimensionsMap.put("solutionPoints", 10);
        dimensionsMap.put("diagram", 1);
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    public Dimensions() {

    }

    public Dimensions(Integer components, Integer particles, Integer basis, Integer solutionPoints, Integer diagram) {
        this.components = components;
        this.particles = particles;
        this.basis = basis;
        this.solutionPoints = solutionPoints;
        this.diagram = diagram;
        dimensionsMap.put("components", components);
        dimensionsMap.put("particles", particles);
        dimensionsMap.put("basis", basis);
        dimensionsMap.put("solutionPoints", solutionPoints);
        dimensionsMap.put("diagram", diagram);
    }

    public Map<String, Integer> getDimensionsMap() {
        return dimensionsMap;
    }

    public Integer getComponents() {
        return components;
    }

    public void setComponents(Integer components) {
        this.components = components;
    }

    public Integer getParticles() {
        return particles;
    }

    public void setParticles(Integer particles) {
        this.particles = particles;
    }

    public Integer getBasis() {
        return basis;
    }

    public void setBasis(Integer basis) {
        this.basis = basis;
    }

    public Integer getSolutionPoints() {
        return solutionPoints;
    }

    public void setSolutionPoints(Integer solutionPoints) {
        this.solutionPoints = solutionPoints;
    }

    public Integer getDiagram() {
        return diagram;
    }

    public void setDiagram(Integer diagram) {
        this.diagram = diagram;
    }
}
