package br.com.project.store.client;

import br.com.project.store.controller.dto.InfoDemandItensDTO;
import br.com.project.store.controller.dto.InfoProviderDTO;
import br.com.project.store.controller.dto.ItensPurchaseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("fornecedor")
public interface ProviderClient {

    @RequestMapping("/info/{state}")
    InfoProviderDTO getInfoByState(@PathVariable String state);

    @PostMapping("/itens")
    InfoDemandItensDTO makePurchase(List<ItensPurchaseDTO> itens);
}
