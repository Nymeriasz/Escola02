package Escola02;

public class Main {
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        v1.setNome("Pamella");
        v1.setIdade(19);
        v1.setSexo("F");
        v1.fazerAniversario();
        System.out.println(v1.toString());
        a1.setNome("Maria");
        a1.setIdade(20);
        a1.setSexo("F");
        a1.PagarMensalidade();
        System.out.println(a1.toString());
        b1.setNome("Maia");
        b1.setIdade(21);
        b1.setSexo("F");
        b1.PagarMensalidade();
        System.out.println(b1.toString());
    }
}
