package br.com.project.provider.service;

import br.com.project.provider.model.ProviderInfo;
import br.com.project.provider.repository.RepositoryProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final RepositoryProvider repositoryProvider;

    public ProviderInfo getInfoByState(String state) {

        return repositoryProvider.findByState(state);

    }
}
