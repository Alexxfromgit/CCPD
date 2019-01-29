package com.alexxrw.ccpd.controller;

import com.alexxrw.ccpd.domain.Dimensions;
import com.alexxrw.ccpd.domain.Iterations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {

//    @Autowired
//    private DimensionsRepo dimensionsRepo;

    @GetMapping
    public String greeting(Map<String, Object> model) {
//        Iterable<Dimensions> dimensions = dimensionsRepo.findAll();
//
//        model.put("dimensions", dimensions);

        return "greeting";
    }

    @GetMapping(path = "/main")
    public String main(Map<String, Object> model) {
        Dimensions dimension = new Dimensions();
        model.put("dimensions", dimension.getDimensionsMap());
        Iterations iterations = new Iterations();
        model.put("iterations", iterations.getIterationsMap());

        return "main";
    }

    @PostMapping(path = "/main")
    public String confirmDimentions(
            @RequestParam(name = "components", required = false, defaultValue = "1") Integer components,
            @RequestParam Integer particles,
            @RequestParam Integer basis,
            @RequestParam Integer solutionPoints,
            @RequestParam Integer diagram,
            Map<String, Object> model
    ) {
        Dimensions dimension = new Dimensions(components, particles, basis, solutionPoints, diagram);
//        dimensionsRepo.save(dimension);
//
//        Iterable<Dimensions> dimensions = dimensionsRepo.findAll();
        model.put("dimensions", dimension.getDimensionsMap());

        return "main";
    }

    @PostMapping(value = "/main")
    public String confirmIterations(
            @RequestParam Double functionIteration,
            @RequestParam Double lnAIteration,
            @RequestParam Double ionForceIteration,
            Map<String, Object> model
    ) {
        Iterations iterations = new Iterations(functionIteration, lnAIteration, ionForceIteration);
        model.put("iterations", iterations.getIterationsMap());

        return "main";
    }

}
