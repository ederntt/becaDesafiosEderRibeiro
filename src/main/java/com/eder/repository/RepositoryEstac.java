package com.eder.repository;

import com.eder.modulos.Estac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstac extends JpaRepository<Estac,Long> {

}
