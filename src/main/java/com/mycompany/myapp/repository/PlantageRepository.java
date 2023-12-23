package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Plantage;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Plantage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PlantageRepository extends JpaRepository<Plantage, Long> {}
