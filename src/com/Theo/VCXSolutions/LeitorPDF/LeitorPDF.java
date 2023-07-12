package com.Theo.VCXSolutions.LeitorPDF;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 * 
 * @author Theo Dirk
 * 
 * Impressão dos dados, pensando em clean arquiteture e em POO para manter tudo bem separado e com suas funções
 */
public class LeitorPDF {

	
	public static void main(String[] args) {
		
		
		try {
			PDDocument pdfParaLeitura = Loader.loadPDF(new File("src/files/documentoTestDev.pdf"));
			PDFTextStripper extratorDeTexto = new PDFTextStripper();
			String conteudoDoPDF = extratorDeTexto.getText(pdfParaLeitura);
		
			String[] linhas = conteudoDoPDF.split("\\r?\\n");
			
		
		
		DadosPDF indentificacaoNoExtrato = new DadosPDF();
		System.out.println(indentificacaoNoExtrato.imprimirIdentificacaoNoExtrato(linhas));
		
		DadosPDF dadosDaContaDebitada = new DadosPDF();
		System.out.println(dadosDaContaDebitada.imprimirDadosDaContaDebitada(linhas));
		
		DadosPDF dadosDoPagamento = new DadosPDF();
		System.out.println(dadosDoPagamento.imprimirDadosDoPagamento(linhas));
		
		DadosPDF dataDaOperacaoEfetuada = new DadosPDF();
		System.out.println(dataDaOperacaoEfetuada.imprimirDataDaOperacaoEfetuada(linhas));
		
		DadosPDF todosOsDados = new DadosPDF();
		System.out.println(todosOsDados.imprimirTodosOsDados(linhas));
	
		pdfParaLeitura.close();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}			
	}
}

