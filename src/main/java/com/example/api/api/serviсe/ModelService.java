package com.example.api.api.serviсe;

import com.example.api.store.entitis.ModelEntity;
import com.example.api.store.repository.ModelRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public ModelEntity newModel(ModelEntity model){
        return modelRepository.save(model);
    }

    public List<ModelEntity> getModels(){
        return (List<ModelEntity>) modelRepository.findAll();
    }

    public ModelEntity updateId(String id, ModelEntity model){
        ModelEntity modelId = modelRepository.findById(id).orElseThrow();

        modelId.setDescription(model.getDescription());

        return modelId;
    }

    public ModelEntity getId(String id) {
        return modelRepository.findById(id).orElseThrow();
    }

    public String deleteId(String id){
        modelRepository.deleteById(id);
        return "Delete modelId: " + id;
    }
}
