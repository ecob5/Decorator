package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test void cursoBase() {
        Curso curso = new CursoGraduacao(1000);
        assertEquals(1000, curso.getCargaHoraria());
        assertEquals("Graduação", curso.getDescricao());
    }
    @Test void adicionaEtapasEmQualquerOrdem() {
        Curso curso = new TrabalhoConclusaoCurso(new Estagio(new AtividadesComplementares(new CursoGraduacao(1000))));
        assertEquals(1260, curso.getCargaHoraria());
        assertEquals("Graduação / Atividades complementares / Estágio / TCC", curso.getDescricao());
    }
    @Test void rejeitaCursoNulo() {
        assertThrows(IllegalArgumentException.class, () -> new Estagio(null));
    }
}
