package projeto.produto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import projeto.produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
    @Query("SELECT p FROM Produto p WHERE p.preco < 5")
    List<Produto> getAllProducts5Below();
}
