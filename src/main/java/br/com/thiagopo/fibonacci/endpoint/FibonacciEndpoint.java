package br.com.thiagopo.fibonacci.endpoint;

import br.com.thiagopo.fibonacci.FibonacciService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
@AllArgsConstructor
public class FibonacciEndpoint {

    private FibonacciService service;

    @GetMapping("{posicao}")
    public ResponseDTO calular(@PathVariable Integer posicao) {
        return ResponseDTO.builder()
                .valor(service.calcularFor(posicao))
                .build();
    }

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    private static class ResponseDTO {
        private Long valor;
    }
}
