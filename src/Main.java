import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer soma = null;
        switch (Integer.parseInt(String.valueOf(args.length))){
            case 2:
                soma = Integer.valueOf(args[0]) + Integer.valueOf(args [1]);
                break;
            case 1:
                System.out.println("Digite o outro número da soma: ");
                Integer nextNum = sc.nextInt();
                soma = Integer.valueOf(args[0])+nextNum;
                break;
            case 0:
                System.out.println("Digite a primeira parcela a ser somada: ");
                Integer nextNum1 = sc.nextInt();
                System.out.println("Digite a segunda parcela a ser somada: ");
                Integer nextNum2 = sc.nextInt();
                soma = nextNum1 + nextNum2;
                break;
        }
        if(soma != null) System.out.println("A Soma é: " + soma);
        else System.out.println("A quantidade de parcelas inseridas é inválida.");
    }
}