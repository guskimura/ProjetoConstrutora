// 1 pacote (conjunto de classes)

package devcalc;
// 2 bibliotecas (arquivos prontos para uso, o que já é herdado)

public class Calc {
//3.1 atributos (altura, peso, idade, etc)
//3.2 método / função (realiza alguma ação e na função a ação é realizada e comunicada; retorno)
    public static void main (String [] args){
        System.out.println("Passou pelo método main");
        somarDoisNumeros();
    }
    public static void somarDoisNumeros (){
        System.out.println("Passou pelo método somar dois números");
    }



}
