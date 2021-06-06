/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021af01;

/**
 *
 * @author eduar
 */
class Main {

    public static void main(String[] args) {

        IPoligono primeiroPoligono = PoligonoFactory.criarPoligono(3);
        System.out.println(String.format("Um polígono de %s lados é um %s!", 3, primeiroPoligono.getDescricao()));

        IPoligono segundoPoligono = PoligonoFactory.criarPoligono(4);
        System.out.println(String.format("Um polígono de %s lados é um %s!", 4, segundoPoligono.getDescricao()));

        IPoligono terceiroPoligono = PoligonoFactory.criarPoligono(5);
        System.out.println(String.format("Um polígono de %s lados é um %s!", 5, terceiroPoligono.getDescricao()));

    }
}
