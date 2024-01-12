package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Plante;
import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Plante entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PlanteRepository extends JpaRepository<Plante, Long> {
    @Query("SELECT p FROM Plante p WHERE p.nom.id = :planteId")
    List<Plante> findPlantesByPlanteTypeId(@Param("planteId") Long planteId);
}
