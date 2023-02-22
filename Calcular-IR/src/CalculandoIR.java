import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CalculandoIR {

    double salarioBruto;
    int dependentes;
    int aliquotaIR;
    double valorDeducao;

    double valorIR;
    final double valorDeducaoDependente = 189.59;

    public static void main(String[] args){
        Scanner entradaSalario = new Scanner(System.in);
        System.out.println("Informe o seu salário bruto");
        double salarioBruto = entradaSalario.nextDouble();
        System.out.println(salarioBruto);

        Scanner entradaDependentes = new Scanner(System.in);
        System.out.println("Qual a quantidade de filhos? (caso não tenha digite 0)");
        int dependentes = entradaDependentes.nextInt();
        System.out.println(dependentes);
    }

    public double calculoIrTabela(){
        if(salarioBruto > 1903.98){
                valorIR = 0;
        } else if (salarioBruto > 1903.99) {
            valorIR = salarioBruto * aliquotaIR;
        } else if (salarioBruto > 2826.66) {
            valorIR = salarioBruto * aliquotaIR;
        }
        return valorIR;
    }

    public void valorIRCalculado() {
        System.out.println(valorIR);
    }
}