package padroesestruturais.decorator;

public class CursoGraduacao implements Curso {
    private final int cargaHoraria;

    public CursoGraduacao(int cargaHoraria) {
        if (cargaHoraria <= 0) throw new IllegalArgumentException("Carga horária inválida");
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() { return cargaHoraria; }
    public String getDescricao() { return "Graduação"; }
}
