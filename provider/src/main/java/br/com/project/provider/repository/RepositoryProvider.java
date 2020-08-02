package br.com.project.provider.repository;

import br.com.project.provider.model.ProviderInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProvider extends CrudRepository<ProviderInfo, Long> {

    ProviderInfo findByState(String state);

}