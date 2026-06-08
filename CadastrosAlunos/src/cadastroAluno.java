public class cadastroAluno {

    public static void main(String[] args) {

        String[] nomes = new String[10];
        int[] idades = new int[10];
        String[] cursos = new String[10];
        int totalAlunos = 0;

        while (true) {

            IO.println("===== SISTEMA DE CADASTRO DE ALUNOS =====");
            IO.println("1 - Cadastrar aluno");
            IO.println("2 - Listar alunos");
            IO.println("3 - Buscar aluno pelo nome");
            IO.println("4 - Remover aluno");
            IO.println("5 - Sair");
            IO.println("Escolha uma opção:");

            int opcao = Integer.parseInt(IO.readln());

            switch (opcao) {

                case 1:

                    if (totalAlunos < 10) {

                        nomes[totalAlunos] = IO.readln("Informe o nome do aluno:");
                        idades[totalAlunos] = Integer.parseInt(IO.readln("Informe a idade:"));
                        cursos[totalAlunos] = IO.readln("Informe o curso:");
                        totalAlunos++;
                        IO.println("Aluno cadastrado com sucesso!");
                    } else {
                        IO.println("Limite de 10 alunos atingido.");
                    }
                    break;
                case 2:

                    if (totalAlunos == 0) {
                        IO.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            IO.println("Aluno: " + nomes[i]);
                            IO.println("Idade: " + idades[i]);
                            IO.println("Curso: " + cursos[i]);
                            IO.println("---------------------");
                        }
                    }
                    break;
                case 3:
                    if (totalAlunos == 0) {
                        IO.println("Nenhum aluno cadastrado.");
                        break;
                    }
                    String procura = IO.readln("Informe o nome do aluno:");
                    boolean encontrado = false;
                    for (int i = 0; i < totalAlunos; i++) {

                        if (nomes[i].equalsIgnoreCase(procura)) {
                            IO.println("Aluno encontrado:");
                            IO.println("Nome: " + nomes[i]);
                            IO.println("Idade: " + idades[i]);
                            IO.println("Curso: " + cursos[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        IO.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    if (totalAlunos == 0) {
                        IO.println("Nenhum aluno cadastrado.");
                        break;
                    }
                    String nomeRemover = IO.readln("Informe o nome do aluno:");
                    boolean removido = false;

                    for (int i = 0; i < totalAlunos; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            for (int z = 0; z < totalAlunos - 1; z++) {
                                nomes[z] = nomes[z + 1];
                                idades[z] = idades[z + 1];
                                cursos[z] = cursos[z + 1];
                            }
                            nomes[totalAlunos - 1] = null;
                            cursos[totalAlunos - 1] = null;
                            idades[totalAlunos - 1] = 0;
                            totalAlunos--;
                            removido = true;

                            IO.println("Aluno removido com sucesso.");
                            break;
                        }
                    }
                    if (!removido) {
                        IO.println("Aluno não encontrado.");
                    }
                    break;

                case 5:
                    IO.println("Sistema encerrado.");
                    return;

                default:
                    IO.println("Opção inválida.");
            }
        }
    }
}
