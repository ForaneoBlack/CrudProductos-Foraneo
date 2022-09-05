package com.foraneo.CrudProductos.repository;

import com.foraneo.CrudProductos.modelo.ProductoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductoDTO, String> {
}
