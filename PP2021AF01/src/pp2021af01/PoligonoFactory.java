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
public class PoligonoFactory {

    public static IPoligono criarPoligono(int quantidadeLados) {
        if (quantidadeLados == 3) {
            return new Triangulo();
        } else if (quantidadeLados == 4) {
            return new Quadrado();
        } else if (quantidadeLados == 5) {
            return new Pentagono();
        }

        return null;
    }
}
