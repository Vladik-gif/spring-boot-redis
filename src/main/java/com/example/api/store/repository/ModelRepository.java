package com.example.api.store.repository;

import com.example.api.store.entitis.ModelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<ModelEntity, String> {


}
