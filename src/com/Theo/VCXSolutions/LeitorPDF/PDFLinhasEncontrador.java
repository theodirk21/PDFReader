package com.Theo.VCXSolutions.LeitorPDF;

/**
 * 
 * @author Theo Dirk
 * 
 * Leitor de cada linha, e também defindo a forma como conseguir o trecho nessessário que cada metodo na outra classe irá utilizar
 */
public class PDFLinhasEncontrador  {
	
	private int linhaInicial;
	private int linhaFinal;
	private String[] linhas;

	
	
	public PDFLinhasEncontrador(int linhaInicial, int linhaFinal, String[] linhas) {
		if (linhaInicial >= 0 && linhaFinal < linhas.length && linhaInicial <= linhaFinal) {
		    for (int i = linhaInicial; i <= linhaFinal; i++) {
		        System.out.println(linhas[i]);
		    }
		} else {
		   System.out.println("Intervalo de linhas inválido.");
		}
	}
	
	public void imprimirLinhas() {
        for (String linha : linhas) {
            System.out.println(linha);
        }
    }
	
	@Override
	public String toString() {
		return "";
	}
}
