package com.ostoshotta.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ostoshotta.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    

}
