import java.util.Arrays;

public class CadastroAluno {
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
                    if(totalAlunos<=10) {

                        for (int i = 0; i >= 10; i++) {
                            //aluno
                            nomes[i] = IO.readln("informe o nome do aluno");
                            //idade
                            idades[i] = Integer.parseInt(IO.readln("informe a idade"));
                            //curso
                            cursos[i] = IO.readln("informe o curso");

                            totalAlunos++;
                        }
                    }else{
                        IO.println("numero exarcebado");
                    }
                case 2: //Ao escolher a opção 2, o sistema deve mostrar todos os alunos cadastrados.

                for(int i = 0 ; i<= totalAlunos ; i++ ){
                    IO.println("aluno: " + nomes[i]);
                    IO.println("idade: " + idades[i]);
                    IO.println("curso: " + cursos[i]);
                }
                    break;
                case 3: //Ao escolher a opção 3, o usuário deve digitar um nome e mostra-lo
                    IO.println("informe o nome do aluno");
                    String procura = IO.readln();
                    for (int i = 0; i<= totalAlunos; i++){
                        if (nomes[i].equalsIgnoreCase(procura)){
                            IO.println("nome encontrado: " + nomes[i]);
                        }else{
                            IO.println("nome nao escrito");
                        }
                    }
                    break;
                case 4: //Ao escolher a opção 4, o usuário deve digitar o nome do aluno que deseja remover.
                    String informe = IO.readln("informe o nome dos alunos");
                    for (int i = 0; i<= totalAlunos; i++){
                        if (nomes[i].equalsIgnoreCase(informe)){
                            IO.println("nome removido: " + nomes[i]);
                            Arrays.asList(nomes[i],idades[i],cursos[i]).remove(i);
                        }else{
                            IO.println("nome nao encontrado");
                        }
                    }

                    break;
                case 5: //Ao escolher a opção 5, o sistema deve encerrar com uma mensagem:
                    IO.println("Sistema encerrado.");
                    return;

            }


        }
    }
}
