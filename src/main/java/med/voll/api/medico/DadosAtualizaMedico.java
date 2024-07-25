package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.Endereco;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco) {
}
