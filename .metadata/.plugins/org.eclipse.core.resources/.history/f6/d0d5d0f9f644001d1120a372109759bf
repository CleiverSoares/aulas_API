package br.org.serratec.exercicio01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.exercicio01.Veiculo;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	private static List<Veiculo> veiculos = new ArrayList<>();

	static {
		veiculos.add(new Veiculo(123l, "fiat", "Uno"));
		veiculos.add(new Veiculo(456l, "vw", "gol"));
		veiculos.add(new Veiculo(789l, "honda", "civic"));
		veiculos.add(new Veiculo(987l, "mercedes", "benz"));

	}

	@GetMapping
	public List<Veiculo> listaVeiculos() {
		return veiculos;
	}

	@GetMapping("/{id}")
	public Veiculo buscarVeiculos(@PathVariable long id) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo veiculo = veiculos.get(i);
			if (veiculo.getId().equals(id)) {
				return veiculo;
			}
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public void deletarVeiculos(@PathVariable long id) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo veiculo = veiculos.get(i);
			if (veiculo.getId().equals(id)) {
				veiculos.remove(i);
				return;
			}
		}
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo inserir(@RequestBody Veiculo veiculo) {
		veiculos.add(veiculo);
		return veiculo;
	}

	@PutMapping("/{id}")
	public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo veiculoLista = veiculos.get(i);
			if (veiculoLista.getId().equals(id)) {
				veiculoLista.setId(veiculo.getId());
				veiculoLista.setMarca(veiculo.getMarca());
				veiculoLista.setModelo(veiculo.getModelo());
				veiculos.set(i, veiculoLista);
				return veiculoLista;

			}
		}
		return null;
	}
}
