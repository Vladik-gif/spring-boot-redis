package com.example.api.api.controlers;

import com.example.api.api.serviсe.ModelService;
import com.example.api.store.entitis.ModelEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ModelController {

    private final ModelService modelService;
    private static final String NEW = "/model/new";
    private static final String GETS = "/models";
    private static final String UPDATE_ID = "/update/{id}";
    private static final String GET_ID = "/model/{id}";
    private static final String DELETE_ID = "/model/delete/{id}";

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @PostMapping(NEW)
    public ModelEntity createModel(@RequestBody ModelEntity model) {
        return modelService.newModel(model);
    }
    @GetMapping(GETS)
    public List<ModelEntity> getModel() {
        return modelService.getModels();
    }

    @PutMapping(UPDATE_ID)
    public ModelEntity updateId(
            @PathVariable(name = "id") String id,
            @RequestBody ModelEntity model){
        return modelService.updateId(id, model);
    }

    @GetMapping(GET_ID)
    public ModelEntity updateId(@PathVariable(name = "id") String id){
        return modelService.getId(id);
    }

    @DeleteMapping(DELETE_ID)
    public String deleteModel(@PathVariable(name = "id") String id) {
        return modelService.deleteId(id);
    }
}
