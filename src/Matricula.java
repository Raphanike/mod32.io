import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="matri_seq")
    @SequenceGenerator(name="matri_seq", sequenceName="sq_matricula", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private Long codigo;

    @Column(name = "DATA_MATRICULA", nullable = false)
    private Instant dataMatricula;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "STATUS", nullable = false)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

