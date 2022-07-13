package com.devsuperior.meta.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.meta.entities.Sale;

public interface SaleRepository extends  JpaRepository <Sale, Long> {
	
}
