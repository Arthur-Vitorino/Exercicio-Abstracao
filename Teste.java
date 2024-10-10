public class Teste {
    public static void main(String[] args) {

        ProvaUCB alunoUCB = new ProvaUCB(8, 7);
        ProvaFafifo alunoFafifo = new ProvaFafifo(5.5f, 6.5f);


        if (alunoUCB.aprovado()) {
            System.out.println("Aluno da UCB aprovado!");
        } else {
            System.out.println("Aluno da UCB reprovado.");
        }


        if (alunoFafifo.aprovado()) {
            System.out.println("Aluno da Fafifo aprovado!");
        } else {
            System.out.println("Aluno da Fafifo reprovado.");
        }
    }
}
