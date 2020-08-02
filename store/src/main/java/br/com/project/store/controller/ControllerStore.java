package br.com.project.store.controller;


import br.com.project.store.controller.dto.PurchaseDTO;
import br.com.project.store.service.ServicePurshace;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/compra")
@RequiredArgsConstructor
public class ControllerStore {

    private final ServicePurshace servicePurshace;


    @PostMapping
    public void makePurchase(@RequestBody PurchaseDTO purchaseDTO) {

        servicePurshace.generatePurchase(purchaseDTO);

    }
}
