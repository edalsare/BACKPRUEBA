package com.gtc.futuro_del_saber.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtc.futuro_del_saber.Model.estudiante;

@Repository
public interface estuRepository extends JpaRepository<estudiante, Integer>{

}
