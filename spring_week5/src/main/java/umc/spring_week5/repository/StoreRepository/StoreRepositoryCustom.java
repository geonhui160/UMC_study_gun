package umc.spring_week5.repository.StoreRepository;

import umc.spring_week5.domain.Store;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Store> dynamicQueryWithBooleanBuilder(String name, Float score);
}