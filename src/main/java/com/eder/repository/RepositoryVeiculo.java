package com.eder.repository;

import com.eder.modulos.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVeiculo extends JpaRepository<Veiculo, Long> {

}
