package padroesestruturais.decorator;

public abstract class CursoDecorator implements Curso {
    private final Curso curso;

    protected CursoDecorator(Curso curso) {
        if (curso == null) throw new IllegalArgumentException("Curso obrigatório");
        this.curso = curso;
    }

    protected Curso getCurso() { return curso; }
    protected abstract int horasAdicionais();
    protected abstract String nomeEtapa();

    public int getCargaHoraria() { return curso.getCargaHoraria() + horasAdicionais(); }
    public String getDescricao() { return curso.getDescricao() + " / " + nomeEtapa(); }
}
