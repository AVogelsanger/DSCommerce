package br.com.devsuperior.dscommerce.services;

import br.com.devsuperior.dscommerce.dto.ProductDTO;
import br.com.devsuperior.dscommerce.entities.Product;
import br.com.devsuperior.dscommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
