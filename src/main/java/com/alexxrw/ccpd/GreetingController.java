package com.alexxrw.ccpd;

import com.alexxrw.ccpd.domain.Dimensions;
import com.alexxrw.ccpd.repos.DimensionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private DimensionsRepo dimensionsRepo;

    @GetMapping("/greeting")
    public String greeting(Map<String, Object> model) {
        Iterable<Dimensions> dimensions = dimensionsRepo.findAll();

        model.put("dimensions", dimensions);

        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Dimensions> dimensions = dimensionsRepo.findAll();

        model.put("dimensions", dimensions);

        return "main";
    }

    @PostMapping
    public String confirm(
            @RequestParam Long id,
            @RequestParam(name = "components", required = false, defaultValue = "1") Integer components,
            @RequestParam Integer particles,
            @RequestParam Integer basis,
            @RequestParam Integer solutionPoints,
            @RequestParam Integer diagram,
            Map<String, Object> model
    ) {
        Dimensions dimension = new Dimensions();
        Dimensions.setComponents(components);
        Dimensions.setParticles(particles);
        Dimensions.setSolutionPoints(solutionPoints);
        Dimensions.setBasis(basis);
        Dimensions.setDiagram(diagram);
        dimension.setId(id);

        dimensionsRepo.save(dimension);

        Iterable<Dimensions> dimensions = dimensionsRepo.findAll();
        model.put("dimensions", dimensions);

        return "main";
    }

}
