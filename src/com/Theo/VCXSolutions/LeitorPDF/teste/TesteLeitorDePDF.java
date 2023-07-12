package com.Theo.VCXSolutions.LeitorPDF.teste;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.Theo.VCXSolutions.LeitorPDF.DadosPDF;
/**
* 
* @author Theo Dirk
* 
* Este testes coinsistem em ver se palavras chaves se encontam na impressão desejada no concole 
*/
public class TesteLeitorDePDF {
	private final static ByteArrayOutputStream saida = new ByteArrayOutputStream();
/**
* 
* @author Theo Dirk
* 
* Esta primeira classe prepara o console e torna possivel a manipulação dos arquivos contidos nele 
*/
	@BeforeClass
		public static void setUp() throws IOException {
			PrintStream impressaoConsole = new PrintStream(saida, true, "UTF-8");
			System.setOut(impressaoConsole); 
		}
/**
* 
* @author Theo Dirk
* 
* limpa o console para um novo teste
*/
	@AfterClass
		public static void reset() {
		System.out.println(saida.toString());
		saida.reset();
		}
/**
* 
* @author Theo Dirk
* 
* Os testes unitários a partir desse ponto tem como objetivo pegar uma string e verificar se está contida no conteudo impresso no console 
*/
	@Test
		public void testeDeConferenciaDeDadosIdendificacaoExtrato() throws IOException {
			PDDocument pdfParaLeitura = Loader.loadPDF(new File("src/files/documentoTestDev.pdf"));
			PDFTextStripper extratorDeTexto = new PDFTextStripper();
			String conteudoDoPDF = extratorDeTexto.getText(pdfParaLeitura);
			String[] linhas = conteudoDoPDF.split("\\r?\\n");
			String palavraComparacao = "Identificação";
			DadosPDF indentificacaoNoExtrato = new DadosPDF();
			indentificacaoNoExtrato.imprimirIdentificacaoNoExtrato(linhas);
			assertTrue(saida.toString().contains(palavraComparacao));
			pdfParaLeitura.close();
		}
}
