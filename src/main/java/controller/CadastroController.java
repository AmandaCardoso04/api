package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cadastro;
import repository.cadastroRepository;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private cadastroRepository cadRepository;

    @GetMapping
	public List<CadastroDto> lista(String nomeCurso) {
             List<Cadastro> cadastro = cadRepository.findAll();
			return CadastroDto.converter(cadastro);
		}
	@PostMapping
	public Cadastro cadastrar(@RequestBody Cadastro cadastro) {

		return cadRepository.save(cadastro);
		
		//return ResponseEntity.created(uri).body(new CadastroDto(cadastro));
	}

}
