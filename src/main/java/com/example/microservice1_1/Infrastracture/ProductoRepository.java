package com.example.microservice1_1.Infrastracture;
import com.example.microservice1_1.Domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}