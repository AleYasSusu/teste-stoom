package br.com.stoom.store.controller.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface IBrandController {

    ResponseEntity<Void> activateProduct(@PathVariable Long categoryId);

    ResponseEntity<Void> deactivateProduct(@PathVariable Long categoryId);
}
