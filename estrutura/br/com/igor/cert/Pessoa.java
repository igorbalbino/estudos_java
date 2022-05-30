package br.com.igor.cert; //nome do package aqui deve estar de acordo com a estrutura de pastas

import java.util.Date; //os imports devem sempre vir depois do package ali
import java.io.*;
import java.io.BufferedReader;//esses imports são prapoder pegar dados da tela digitados pelo usuario num terminal
import java.io.IOException;
import java.io.InputStreamReader;

//depois de pacotes e imports podemos fazer o resto das coisa
public class Pessoa {
	Date data = new Date();
	public static Date dtCadastro;
	private static String nome;
	private static String sobrenome;
	private static long id;
	
	Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		System.out.println("Ola " + nome + "! Seu cadastro está sendo realizado.");
		dtCadastro = data;
		geraNmrUnico();
		System.out.println("Seu ID e: " + this.id + ".");
		System.out.println("Data de cadastro: " + this.dtCadastro + ".");
		
	}
	
	private static void geraNmrUnico() {
		id = 1;
	}
	
	public static void main (String[] args) throws IOException/*pra usar o esquema dos imports pra ler dados do console precisa dessa linha aq throws */ {//toda classe tem q ter esse camarada aqui
		
		
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String nome = reader.readLine();
		System.out.println(nome);
		System.out.println(" ");
		String sobrenome = reader.readLine();
		System.out.println(sobrenome);
		System.out.println("\n");
		Pessoa pessoa1 = new Pessoa(nome, sobrenome);
	}
}