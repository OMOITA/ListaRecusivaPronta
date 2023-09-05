/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarcondesBernardo;

/**
 *
 * @author cesar
 */
public class Principal {

    public static void main(String args[]) {
        ListaR l = new ListaR();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(5);
        l.add(6);
        l.add(10);
        l.add(58);

        //  l.show_pares();
        l.show();
        System.out.println("\nA lista e ");  
        //System.out.println("\nO tamanho da lista e " + l.size());
        //  System.out.println("\nA lista e ");
        //  l.show();
        System.out.println("\nAs posiçoes dos numeros entre o primeiro e o ultimo");
        l.imprimiPosicao(2,10,1);
        System.out.println("\nO valor o "+l.menormaior(58));
        System.out.print("\n ele e crescente? " + l.crescente());
        System.out.print("\n A soma dos elementos pares e " + l.somaPar());
        //  System.out.println("\nO maior numero e " + l.maior());
        System.out.println("\n A lista invertida e  ");
        l.imprimiReverso();
        l.show();
       
        
                
     //   System.out.println("\nA soma dos elementos e " + l.soma());
     
    //    System.out.println("\nA quantidade de valores 3" + l.quantidade_valor(1));

    }
}
