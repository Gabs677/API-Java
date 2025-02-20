package projeto.produto.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.produto.entity.Produto;
import projeto.produto.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    //injeção de dependência usando framework
    @Autowired
    ProdutoService produtoService;
    
    //end-point para consultar todos
    @GetMapping("/listall")
    public List<Produto> getAllProducts() {
        List<Produto> produtos = produtoService.getAllProductsService();
        return (List<Produto>) ResponseEntity.ok(produtos);
    }
    
    //end-point para consultar (por ID)
    @GetMapping("/list/{id}")
    public ResponseEntity<Produto> getProduct(@PathVariable Integer id) {
    
        Optional<Produto> product = produtoService.getProductService(id);
    
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(product.get());
    }
    
    //end-point para adicionar
    @PostMapping("/add")
    public ResponseEntity<Produto> addProduct(@RequestBody Produto produto) {
        Produto newProduct = produtoService.addProductService(produto);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
    
    //end-point para atualizar
    @PutMapping("/update")
    public ResponseEntity<Produto> updateProduct(@RequestBody Produto produto) {
        Produto updatedProduct = produtoService.updateProductService(produto);
        return ResponseEntity.ok(updatedProduct);
    }
    
    //end-point para deletar (por ID)
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        produtoService.deleteProductByIdService(id);
        return ResponseEntity.noContent().build();
    }
}
