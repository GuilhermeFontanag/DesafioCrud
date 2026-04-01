public class multa {
    static void main() {
      double velocidade = 0;
      double valor = 0;
      double excendido = 0;
      IO.print("informe a sua velocidade (em km)");
      velocidade = Double.parseDouble(IO.readln());
      if (velocidade >80) {
          IO.println("voce foi multado");
          excendido = (velocidade - 80);
          valor =  (excendido * 50);
      }
    IO.println("limite = 80 "+ String.format("%n") +"valor excendido " + String.format("%.0f %n", excendido) + "valor da multa é "+String.format("%.2f %n", valor));














     }
}
