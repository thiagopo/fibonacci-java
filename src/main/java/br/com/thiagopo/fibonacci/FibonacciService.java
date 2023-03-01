package br.com.thiagopo.fibonacci;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public Long calcular(int posicaoN) {

        if (posicaoN == 1) {
            return 0L;
        } else {
            if (posicaoN <=3) {
                return 1L;
            }
            return calcular(posicaoN -1) + calcular(posicaoN -2);
        }
    }

    public Long calcularFor(int posicaoN) {
        var resultado = 0L;
        var aux = 1L;

        for (long cont = 1; cont < posicaoN; cont++) {
            var aux2 = resultado + aux;
            resultado = aux;
            aux = aux2;
        }

        return resultado;
    }

}
