package com.example.aluno_rest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aluno_rest.entities.Aluno;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@GetMapping
	public ResponseEntity<Aluno> findAll() {
		Aluno a = new Aluno(999, "999", "Testador do 9", true);
		return ResponseEntity.ok().body(a);
	}
}
