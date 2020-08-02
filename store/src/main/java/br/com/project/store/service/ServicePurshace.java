package br.com.project.store.service;

import br.com.project.store.client.ProviderClient;
import br.com.project.store.controller.dto.PurchaseDTO;
import br.com.project.store.model.Purchase;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicePurshace {

    private static final Logger LOG = LoggerFactory.getLogger(ServicePurshace.class);

    private final ProviderClient providerClient;

    public Purchase generatePurchase(PurchaseDTO purchase) {

        final var state = purchase.getAddress().getState();

        LOG.info("Buscando informações do fornecedor de {}", state);
        val infoState = providerClient.getInfoByState(state);

        LOG.info("Realizando um pedido");
        val infoPurchase = providerClient.makePurchase(purchase.getItens());

        System.out.println(infoState.getAddress());

        val savedPurchase = new Purchase();

        savedPurchase.setId(infoPurchase.getId());
        savedPurchase.setTime(infoPurchase.getDemandTime());
        savedPurchase.setDestinationAddress(purchase.getAddress().toString());

        return savedPurchase;

    }
}
