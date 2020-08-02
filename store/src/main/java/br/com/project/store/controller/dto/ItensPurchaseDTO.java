package br.com.project.store.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItensPurchaseDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("quantidade")
    private Long quantity;
}
