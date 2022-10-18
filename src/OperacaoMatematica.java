import java.util.Scanner;

public class OperacaoMatematica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a operação desejada(/, *, -, +)?");
        String operacao = sc.nextLine();
        System.out.println("Digite o primeiro número da operação desejada: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número da operação desejada: ");
        double num2 = sc.nextDouble();
        Double resultado;
        switch(operacao) {
            case "/":
                resultado = num1/num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            default:
                throw new IllegalStateException("Operação não permitida: " + operacao);
        }
        System.out.printf("O Resultado da operação %s é %.2f", operacao, resultado);
    }
}
