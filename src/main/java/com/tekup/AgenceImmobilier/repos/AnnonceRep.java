package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tekup.AgenceImmobilier.model.Annonces;

public interface AnnonceRep extends JpaRepository<Annonces, Long> {

}
