package com.alexxrw.ccpd.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dimensions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private static Integer components = 2;
    private static Integer particles = 3;
    private static Integer basis = 2;
    private static Integer solutionPoints = 10;
    private static Integer diagram = 1;

//    public Dimensions() {
//
//    }
//
//    public Dimensions(Integer components, Integer particles, Integer basis, Integer solutionPoints, Integer diagram) {
//        this.components = components;
//        this.particles = particles;
//        this.basis = basis;
//        this.solutionPoints = solutionPoints;
//        this.diagram = diagram;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Integer getComponents() {
        return components;
    }

    public static void setComponents(Integer components) {
        Dimensions.components = components;
    }

    public static Integer getParticles() {
        return particles;
    }

    public static void setParticles(Integer particles) {
        Dimensions.particles = particles;
    }

    public static Integer getBasis() {
        return basis;
    }

    public static void setBasis(Integer basis) {
        Dimensions.basis = basis;
    }

    public static Integer getSolutionPoints() {
        return solutionPoints;
    }

    public static void setSolutionPoints(Integer solutionPoints) {
        Dimensions.solutionPoints = solutionPoints;
    }

    public static Integer getDiagram() {
        return diagram;
    }

    public static void setDiagram(Integer diagram) {
        Dimensions.diagram = diagram;
    }
}
