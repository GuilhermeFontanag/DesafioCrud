public class exercicio_5 {
    static void main(String[] args) {
        int soma = 0;
        for( int i = 1; i <=50; i++){
            if (i %2 ==0){
                soma +=i;

            }
        }
        IO.println("os valores sao "+ soma  );
    }

}