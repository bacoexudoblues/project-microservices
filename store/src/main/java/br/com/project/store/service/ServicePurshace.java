package br.com.project.store.service;

import br.com.project.store.controller.dto.InfoProviderDTO;
import br.com.project.store.controller.dto.PurchaseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ServicePurshace {

    private final RestTemplate restTemplate;

    public void generatePurchase(PurchaseDTO purchase) {


        ResponseEntity<InfoProviderDTO> response = restTemplate.exchange("http://provider/8081/info/" + purchase.getAddress().getState(),
                HttpMethod.GET, null, InfoProviderDTO.class);

        System.out.println(response);


    }
}
