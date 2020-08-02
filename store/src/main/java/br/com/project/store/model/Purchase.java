package br.com.project.store.model;

import lombok.Data;

@Data
public class Purchase {

    private Long id;

    private Double time;

    private String destinationAddress;
}
