package br.com.stoom.store.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrandDto {
    private Long id;
    private String name;
    private boolean active;
}
