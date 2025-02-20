package frontend.produtofrontend;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Produtofrontend {

    public static void main(String[] args) throws MalformedURLException, IOException {
        int idproduct = 3;
        URL url = new URL ("http://localhost:8080/produto/list/" + idproduct);
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));        
        String descricao = "";        
        StringBuilder jsonProd = new StringBuilder();        
            while ((descricao = br.readLine()) != null){
                jsonProd.append(descricao);
            }
            
        Produto prod = new Gson().fromJson(jsonProd.toString(), Produto.class);
        
        System.out.println("Id:                 " + prod.getId());
        System.out.println("Descricao:          " + prod.getDescricao());
        System.out.println("Preco:              " + prod.getPreco());
        System.out.println("Quantidade:         " + prod.getQuantidade());
        System.out.println("Categoria:          " + prod.getCategoria());
        System.out.println("Marca:              " + prod.getMarca());
        System.out.println("Fornecedor:         " + prod.getFornecedor());
        System.out.println("Data de fabricacao: " + prod.getDataFabricacao());
        System.out.println("Validade:           " + prod.getValidade());
    }
}