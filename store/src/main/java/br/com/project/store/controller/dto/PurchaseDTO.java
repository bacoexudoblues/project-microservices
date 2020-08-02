package br.com.project.store.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PurchaseDTO {

    @JsonProperty("itens")
    private List<ItensPurchaseDTO> itens;

    @JsonProperty("endereco")
    private AddressDTO address;
}
