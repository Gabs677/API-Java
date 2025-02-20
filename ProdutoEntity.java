package projeto.produto.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
        
@Entity
@Table(name="produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String descricao;
    
    private Double preco;
    
    private int quantidade;
    
    private String categoria;
    
    private String marca;
    
    private String fornecedor;
    
    private int dataFabricacao;
    
    private int validade;
}
