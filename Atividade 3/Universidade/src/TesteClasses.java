public class TesteClasses {
    public static void main(String[] args) throws Exception{
        Aluno aluno1=new Aluno();
        aluno1.nome="Emanuel Vinícius Sacoman";
        aluno1.curso="Engenharia de Software";

        Universidade uni1=new Universidade();
        uni1.nome="Guairacá";
        uni1.cidade="Guarapuava";
        uni1.estado="Paraná";

        aluno1.exibeDados();
        uni1.exibeDados();
    }
}