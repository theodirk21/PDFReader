package com.Theo.VCXSolutions.LeitorPDF;

/**
 * 
 * @author Theo Dirk
 * 
 * Nessa classe são definidos o conteudo de cada metodo para uma impressão mais rapida e que não precise procurar em cada linha do projeto ja que ja esta informado
 */

public class DadosPDF {
	
	

	public String imprimirIdentificacaoNoExtrato(String[] linhas) {
	    PDFLinhasEncontrador encontradorDeLinhas = new PDFLinhasEncontrador(2, 2, linhas);
	    return encontradorDeLinhas.toString();
	}
	
	public String imprimirDadosDaContaDebitada(String[] linhas) {
		PDFLinhasEncontrador encontradorDeLinhas = new PDFLinhasEncontrador(4, 6, linhas);
	    return encontradorDeLinhas.toString(); 
	    }	
	
	public String imprimirDadosDoPagamento(String[] linhas) {
		PDFLinhasEncontrador encontradorDeLinhas = new PDFLinhasEncontrador(7, 11, linhas);
	    return encontradorDeLinhas.toString();	}
	
	public String imprimirDataDaOperacaoEfetuada(String[] linhas) {
		PDFLinhasEncontrador encontradorDeLinhas = new PDFLinhasEncontrador(12, 12, linhas);
	    return encontradorDeLinhas.toString();	}
	
	public String imprimirTodosOsDados(String[] linhas) {
		PDFLinhasEncontrador encontradorDeLinhas = new PDFLinhasEncontrador(2, 12, linhas);
	    return encontradorDeLinhas.toString();	}

	
	
}
