package com.senai.manuela.PrjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.manuela.PrjGame.entities.Jogo;
import com.senai.manuela.PrjGame.repositories.JogoRepository;


@Service
public class JogoServices {
	private final JogoRepository jogoRepository;
	
	 @Autowired
	public JogoServices(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public List<Jogo> getAllJogos(){
		return jogoRepository.findAll();
	}
	
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
}
