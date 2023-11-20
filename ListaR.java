/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarcondesBernardo;

/**
 *
 * @author cesar
 */
public class ListaR {

    private Node inicio;

    // construtor
    public ListaR() {

    }
    //////////// recebe valor/////////////////////////

    public void add(int valor) {
        if (inicio != null) {
            inicio.add(valor);

        } else {
            inicio = new Node(valor);
        }
    }
    // mostrar valores

    public void show() {
        if (inicio != null) {
            inicio.show();
        }
    }

    public void show_invertido() {
        if (inicio != null) {
            inicio.show_invertido();
        }
    }

    public void show_pares() {
        if (inicio != null) {
            inicio.show_pares(1);
        }
    }

    public int size() {

        if (inicio != null) {
            return inicio.size();

        } else {

            return 0;
        }
    }

    public int soma() {

        if (inicio != null) {
            return inicio.soma();

        } else {

            return 0;
        }
    }

    public int maior() {
        if (inicio != null) {
            return inicio.maior();

        } else {

            return -99999;
        }
    }

    public int quantidade_valor(int valor) {
        if (inicio != null) {
            return inicio.quantidade_valor(valor);

        } else {

            return 0;
        }

    }

    // 03 acima
    // imprimi intermediario
    public void imprimiPosicao(int a, int b, int aux) {
        if (inicio != null) {
            inicio.imprimiPosicao(a, b, aux);

        }
    }

    // deaafio 01
    // imprmir crscente
    public boolean crescente() {
        if (inicio != null) {
            return inicio.crescente();
        } else {
            return true;

        }
    }

    // desafio 02
    // imprimi reverso
    public void imprimiReverso() {
        if (inicio != null) {
            inicio = inicio.imprimiReverso();
        }

    }

    // desafio 03
    // soamr de pares
    public int somaPar() {
        if (inicio != null) {
            return inicio.somaPar();

        }
        return 0;
    }

    /// deasfio 04
    /// imprimir o mairmenor
    public int menormaior(int valor) {
        if (inicio != null) {
            return inicio.menorMaior(valor);
        } else {
            return +9999;
        }
    }

}
