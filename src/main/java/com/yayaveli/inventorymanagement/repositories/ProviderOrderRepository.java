package com.yayaveli.inventorymanagement.repositories;

import java.util.Optional;

import com.yayaveli.inventorymanagement.models.ProviderOrder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderOrderRepository extends JpaRepository<ProviderOrder, Integer> {
    Optional<ProviderOrder> findByOrderCode(String orderCode);
}
