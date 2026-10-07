package tn.esprit.mohamekmalektebbini_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamekmalektebbini_4ssa3.entity.Client;
import tn.esprit.mohamekmalektebbini_4ssa3.entity.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
