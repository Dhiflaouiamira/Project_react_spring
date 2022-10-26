package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tekup.AgenceImmobilier.model.agent;
public interface agentRep extends JpaRepository<agent, Long> {

}
