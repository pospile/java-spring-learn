package cz.underholding.burgerovac.repository;

import cz.underholding.burgerovac.model.Fitness;
import cz.underholding.burgerovac.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessRepository extends JpaRepository<Fitness, Long> {

}