package br.com.project.provider.mapper;

import br.com.project.provider.controller.dto.ProviderInfoDTO;
import br.com.project.provider.model.ProviderInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProviderMapper {

    ProviderInfo toModel(ProviderInfoDTO dto);

    ProviderInfoDTO toDTO(ProviderInfo model);

}
