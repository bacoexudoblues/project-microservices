package br.com.project.store.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressDTO {

    @JsonProperty("rua")
    private String street;

    @JsonProperty("numero")
    private String numberAddress;

    @JsonProperty("estado")
    private String state;
}
