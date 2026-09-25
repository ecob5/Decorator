package padroesestruturais.decorator;

public class AtividadesComplementares extends CursoDecorator {
    public AtividadesComplementares(Curso curso) { super(curso); }
    protected int horasAdicionais() { return 80; }
    protected String nomeEtapa() { return "Atividades complementares"; }
}
