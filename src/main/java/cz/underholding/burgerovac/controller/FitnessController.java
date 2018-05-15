package cz.underholding.burgerovac.controller;

import cz.underholding.burgerovac.model.Fitness;
import cz.underholding.burgerovac.model.Note;
import cz.underholding.burgerovac.repository.FitnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FitnessController {

    @Autowired
    FitnessRepository fitnessRepository;


    // Get All Notes
    @GetMapping("/fitness/today")
    public Fitness createTodayFitnessIfNotFullfilled() {
        Fitness fitness = new Fitness();
        fitness.setWeight(0);
        fitness.setDescription("Tento den nebyl vyplněn.");
        return fitnessRepository.save(fitness);
    }

    // Get All Notes
    @GetMapping("/fitness")
    public List<Fitness> getAllNotes() {
        return fitnessRepository.findAll();
    }

    // Create a new Note
    @PostMapping("/fitness")
    public Fitness createNote(@Valid @RequestBody Fitness fitness) {
        return fitnessRepository.save(fitness);
    }
}