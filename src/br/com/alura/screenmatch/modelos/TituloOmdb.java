package br.com.alura.screenmatch.modelos;

//classe simples que só serve para armazenar dados imutáveis
//por baixo dos panos já tem getter, setter, construtor, etc

public record TituloOmdb(String title, String year, String runtime) {
}
