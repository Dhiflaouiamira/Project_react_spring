package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.AgenceImmobilier.model.Client;
public interface ClientRep extends JpaRepository<Client, Long> {

}
