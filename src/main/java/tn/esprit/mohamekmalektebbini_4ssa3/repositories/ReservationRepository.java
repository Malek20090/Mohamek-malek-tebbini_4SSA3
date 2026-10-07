package tn.esprit.mohamekmalektebbini_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamekmalektebbini_4ssa3.entity.Contrat;
import tn.esprit.mohamekmalektebbini_4ssa3.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
