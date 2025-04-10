import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriclulaDao matriculaDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
    }



    @Test
    public void cadastrar() {
        Matricula mat = new Matricula();
        mat.setCodigo(2L);
        mat.setDataMatricula(Instant.now());
        mat.setValor(2000.0);
        mat.setStatus("ATIVA");
        matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());


    }

}
