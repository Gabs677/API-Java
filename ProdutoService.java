package projeto.produto.service;

import jakarta.persistence.Id;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.produto.entity.Produto;
import projeto.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> getAllProductsService() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }
    
    public Optional<Produto> getProductService(Integer id) {
        return produtoRepository.findById(id);
    }
    
    public Produto addProductService(Produto produto) {
        Produto p = produtoRepository.save(produto);
        return p;
    }
    
    public Produto updateProductService(Produto produto) {
        Produto updatedProduct = produtoRepository.findById(produto.getId()).get();
        updatedProduct = produto;
        return produtoRepository.save(updatedProduct);
    }
    
    public void deleteProductByIdService(Integer id) {
        produtoRepository.deleteById(id);
    }
}
