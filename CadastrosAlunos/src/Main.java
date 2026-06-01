import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        //variaveis
        String[] nomes = new String[10];
        int[] idades = new int[10];
        String[] cursos = new String[10];
        int totalAlunos = 0;
        //inicio do loop
        while (true) {
            IO.println("===== SISTEMA DE CADASTRO DE ALUNOS =====");
            IO.println("1 - Cadastrar aluno");
            IO.println("2 - Listar alunos");
            IO.println("3 - Buscar aluno pelo nome");
            IO.println("4 - Remover aluno");
            IO.println(String.format("5 - Sair %n"));
            IO.println("Escolha uma opção:");
            int opcaos = Integer.parseInt(IO.readln());
            switch (opcaos) {

                case 1: //O sistema deve permitir cadastrar até 10 alunos.
                    break;
                    if(nomes.length>= 10) {

                        for (int i = 0; i >= 10; i++) {
                            //aluno
                            nomes[i] = IO.readln("informe o nome do aluno");
                            //idade
                            idades[i] = Integer.parseInt(IO.readln("informe a idade"));
                            //curso
                            cursos[i] = IO.readln("informe o curso");
                            //para sair

                        }
                    }else{
                        IO.println("numero exarcebado");
                    }
                case 2: //Ao escolher a opção 2, o sistema deve mostrar todos os alunos cadastrados.
                    break;
                for(int i = 0 ; i<= idades.length ; i++ ){
                    IO.println("aluno: " + nomes[i]);
                    IO.println("idade: " + idades[i]);
                    IO.println("curso: " + cursos[i]);
                }
                case 3: //Ao escolher a opção 3, o usuário deve digitar um nome e mostra-lo
                    IO.println("informe o nome do aluno");

                    break;
                case 4: //Ao escolher a opção 4, o usuário deve digitar o nome do aluno que deseja remover.

                    String informe = IO.readln("informe o nome dos alunos");
                    if (Arrays.asList(informe).contains(nomes)){
                        IO.println(nomes);
                    }else{
                        IO.println("nao existe");
                    }


                    break;

                case 5: //Ao escolher a opção 5, o sistema deve encerrar com uma mensagem:
                    IO.println("Sistema encerrado.");
                    return;

            }


        }
    }
}
