import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "MARCA", length = 50, nullable = false)
    private String marca;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(String marca, String nome, BigDecimal valor) {
        this.marca = marca;
        this.nome = nome;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor( BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }


}
