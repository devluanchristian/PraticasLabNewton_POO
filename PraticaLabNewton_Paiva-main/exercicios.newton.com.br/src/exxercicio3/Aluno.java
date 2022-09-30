package exxercicio3;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private int matricula;
	private float notaAV1;
	private float notaAV2;
	private float notaAE;
	private String curso;
	private int periodo;
	
	public Aluno(String nome, int matricula, float notaAV1, float notaAV2, float notaAE, String curso, int periodo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	void alteraNotaAV1(float nota){
		this.notaAV1 = nota;
	}
	void alteraNotaAV2(float nota){
		this.notaAV2 = nota;
	}
	void alteraNotaAVE(float nota){
		this.notaAE = nota;
	}
	
	String avaliarAluno() {
		if((this.notaAV1 + this.notaAV2) > 60) {
			return "Aprovado";
		} else {
			return "Recuperação";
		}
		
	}
	public String avaliarRecuperacao(){
		if((this.notaAV1 + this.notaAV2) + this.notaAE/2>=60){
			return "Aprovado";
		} else {
			return "Reprovado";
			
		}
	}



}
