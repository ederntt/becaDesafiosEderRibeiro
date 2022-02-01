package com.eder.Repository;

import com.eder.Modulos.Estac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstac extends JpaRepository<Estac,Long>  {


}
