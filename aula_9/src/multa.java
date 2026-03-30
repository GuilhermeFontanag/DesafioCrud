public class multa {
    static void main() {
      double velocidade = 0;
      double multa = 0;
      double valor = 0;
      double excendido = 0;
      String exibir = "";
      IO.print("informe a sua velocidade (em km)");
      velocidade = Double.parseDouble(IO.readln());
      if (velocidade >80) {
          IO.println("voce foi multado");
          excendido = (velocidade - 80);
          valor =  (excendido * 50);
      }
    IO.println("limite = 80 " +"valor excendido " + String.format("%.1f", excendido) + "valor da multa é "+ valor);














     }
}
