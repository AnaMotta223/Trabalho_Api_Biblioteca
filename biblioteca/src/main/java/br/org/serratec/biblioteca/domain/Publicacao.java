package br.org.serratec.biblioteca.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Embeddable
public class Publicacao {
	
	@NotBlank(message = "Preencha o campo autor")
	private String autor;
	
	@NotNull(message = "Preencha o campo dataPublicacao")
	@Past(message = "A data informada não pode estar no futuro")
	private LocalDate dataPublicacao;
	
	@NotBlank(message = "Preencha o campo editora")
	private String editora;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	
}
