package com.festa.repository;

import com.festa.model.FestaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestaRepository extends JpaRepository<FestaModel,Long> {

}
