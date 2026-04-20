public class lerInt {
    static void main(String[] args) {
        int i= 0;
        int valor = 0, soma = 0,media = 0, quant = 0, min = 0, max =0;
        //entrada dos valores
        IO.println("inicio dos loops");
      while ( i !=-1){
         valor = Integer.parseInt(IO.readln());
         if (valor == -1)
             break;
         if(valor != 0) quant++;


        max = Math.min(valor,min);
        min = Math.max(valor, max);
         soma += valor;
          media= valor /quant;
          }
        IO.println("soma é " + soma);
        IO.println("media é " + media);
        IO.println("menor numero é " + min);
        IO.println("maior numero é " + max);

        }
    }

