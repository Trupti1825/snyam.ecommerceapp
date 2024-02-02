package com.ecommerceapplication.dao;

import com.ecommerceapplication.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://locathost:4200")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
