package padroesestruturais.decorator;

public class Estagio extends CursoDecorator {
    public Estagio(Curso curso) { super(curso); }
    protected int horasAdicionais() { return 120; }
    protected String nomeEtapa() { return "Estágio"; }
}
