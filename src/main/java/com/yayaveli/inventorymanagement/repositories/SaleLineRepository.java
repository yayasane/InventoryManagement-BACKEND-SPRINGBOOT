package com.yayaveli.inventorymanagement.repositories;

import com.yayaveli.inventorymanagement.models.SaleLine;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleLineRepository extends JpaRepository<SaleLine, Integer> {

}
