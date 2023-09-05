/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarcondesBernardo;

/**
 *
 * @author cesar
 */
public class Node {

    // variaveis

    private int x;
    private Node proximo;

    // construtor
    public Node(int valor) {
        x = valor;
        proximo = null;

    }
    // adicionar

    public void add(int valor) {
        if (proximo != null) {
            proximo.add(valor);
        } else {
            proximo = new Node(valor);
        }
    }
    // mostra os valores da lista

    public void show() {
        System.out.print(x);
        if (proximo != null) {
            proximo.show();
        }
    }

    public void show_invertido() {

        if (proximo != null) {
            proximo.show_invertido();
        }
        System.out.print(x);
    }

    public void show_pares(int pos) {
        if (pos % 2 == 0) {
            System.out.print(x);
        }
        if (proximo != null) {

        }

        System.out.print(x);
    }
    // tamnho

    public int size() {

        if (proximo != null) {
            return proximo.size() + 1;
        } else {
            return 1;
        }

    }

    // soma dos valores
    public int soma() {

        if (proximo != null) {
            return proximo.soma() + x;
        } else {
            return x;
        }

    }
    // retornar o maior valor

    public int maior() {

        if (proximo != null) {
            int m = proximo.maior();
            if (x > m) {
                return x;
            } else {
                return m;
            }

        }
        return x;
    }

    // quantidade indicada
    public int quantidade_valor(int valor) {

        if (proximo != null) {
            int quantidade = proximo.quantidade_valor(valor);
            if (x == valor) {
                return quantidade + 1;

            } else {
                return quantidade;
            }
            // penúltimo nó . retorna 1 ou zero

        } else {
            if (x == valor) {
                return 1;

            } else {
                return 0;
            }
        }

    }

    // 03 acima
    // imprimi intermediario
    public void imprimiPosicao(int a, int b, int aux) {

        if (proximo != null) {
            if (x > a && x < b) {
                System.out.println(aux);
                proximo.imprimiPosicao(a, b, aux + 1);
            } else {
                proximo.imprimiPosicao(a, b, aux + 1);
            }

        }

    }

    // desafio 01
    // imprmir crscente
    public boolean crescente() {
        // se lista um unico elemento , retorno verdadeiro
        if (proximo == null) {
            return true;
        } else {
            // verifica se o primeiro e menor que o segundo ,se sim chama para proxima parte
            if (x <= proximo.x) {
                return proximo.crescente();
            } else {
                return false;

            }
        }
    }
    ////// desafio 02
    ////// impressão inverso com alteração

    public Node imprimiReverso() {
        // se lista com um único elemento , retorna ele mesmo
        if (proximo == null) {
            return this;

        } else {

            Node anterior = proximo.imprimiReverso();
            proximo.proximo = this;
            proximo = null;

            return anterior;
        }
    }

    ////// desafio 03
    ////// soma par
    public int somaPar() {

        if (proximo != null) {
            if (x % 2 == 0) {
                return proximo.somaPar() + x;
            } else {
                return proximo.somaPar();
            }
        } else {
            if (x % 2 == 0) {
                return x;

            } else {
                return 0;
            }
        }

    }

    //// desafio 04
    ///// encontrando maior valor com referencia externa
    public int menorMaior(int valor) {
        if (proximo != null) {
            int numeromaior = proximo.menorMaior(valor);
            if (x > valor) {
                if (x < numeromaior) {
                    return x;
                } else {
                    return numeromaior;
                }
            } else {
                return numeromaior;
            }
        } else {

            {
                if (x > valor) {
                    return x;
                } else {
                    return -999;
                }
            }
        }
    }
}
