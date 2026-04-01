void main() {
    double num1,num2,num3 = 0;
    IO.println("informe o primeiro numero");
    num1 = Double.parseDouble(IO.readln());
    IO.println("informe o primeiro numero");
    num2 = Double.parseDouble(IO.readln());
    IO.println("informe o primeiro numero");
    num3 = Double.parseDouble(IO.readln());
    double Maior = Math.max(num1, Math.max(num2,num3));
double menor = Math.min(num1, Math.min(num2,num3));
double soma = num1 + num2 + num3;
double media = (num1 + num2 + num3)/3;
 IO.println(String.format("maior "+Maior+ "%n Menor="+menor+ "%n soma="+soma+"%n média="+m
}