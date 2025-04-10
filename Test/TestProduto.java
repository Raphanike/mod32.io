import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

public class TestProduto {

    @Test
    public void rastrear() {
        IProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto();
        produto.setMarca("Sony");
        produto.setNome("PlayStation 5");
        produto.setValor(new BigDecimal("4999.99"));
        produto = ((ProdutoDao) produtoDao).rastrear(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
