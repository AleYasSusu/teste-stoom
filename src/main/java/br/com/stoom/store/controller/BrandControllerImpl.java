package br.com.stoom.store.controller;

import br.com.stoom.store.business.interfaces.IBrandBO;
import br.com.stoom.store.business.interfaces.ICategoryBO;
import br.com.stoom.store.controller.interfaces.ICategoryController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brands")
public class BrandControllerImpl implements ICategoryController {

    @Autowired
    private IBrandBO brandService;

    @Override
    @PatchMapping("/activate/{brandId}")
    public ResponseEntity<Void> activateCategory(@PathVariable Long brandId) {
        brandService.activateBrand(brandId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    @PatchMapping("/deactivate/{brandId}")
    public ResponseEntity<Void> deactivateCategory(@PathVariable Long brandId) {
        brandService.deactivateBrand(brandId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
