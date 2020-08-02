package br.com.project.provider.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProviderInfoDTO {

    private Long id;

    private String name;

    private String state;

    private String address;

}
