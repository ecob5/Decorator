package padroesestruturais.decorator;

public class TrabalhoConclusaoCurso extends CursoDecorator {
    public TrabalhoConclusaoCurso(Curso curso) { super(curso); }
    protected int horasAdicionais() { return 60; }
    protected String nomeEtapa() { return "TCC"; }
}
