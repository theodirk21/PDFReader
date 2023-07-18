
# Leitor de PDF - Theo Dirk

Este projeto é um leitor de arquivos PDF que extrai as algumas informações contidas em um "extrato" e retorna para o console, alem de aplicar testes unitários.





## Funcionalidades

O Projeto possui duas classes principais a `PDFLinhasEncontrador` e a `DadosPDF`.

- `PDFLinhasEncontrador` = é responsável por imprimir um intervalo específico de linhas de um array de strings. Ela possui um construtor que recebe os parâmetros `linhaInicial`, `linhaFinal` e `linhas`. O construtor verifica se o intervalo de linhas é válido e imprime as linhas correspondentes no console. Foi criado de forma genérica para poder ser utilizado em todos os métodos que necessitassem. 

- `DadosPDF` = utiliza a classe `PDFLinhasEncontrador` para imprimir informações específicas de um arquivo PDF. Ela possui métodos como `imprimirIdentificacaoNoExtrato`, `imprimirDadosDaContaDebitada`, `imprimirDadosDoPagamento`, `imprimirDataDaOperacaoEfetuada` e `imprimirTodosOsDados`. Esses métodos recebem um array de strings com as linhas do PDF e utilizam o `PDFLinhasEncontrador` para imprimir as informações desejadas no console.




## Uso/Exemplos

Para utilizar o projeto, siga as instruções abaixo:

1. Compile e execute a classe `LeitorPDF`.
2. O programa irá extrair as informações do PDF e imprimir no console os dados desejados.
`Certifique-se de ajustar o caminho do arquivo PDF no código, caso esteja em uma localização diferente.`

Cada um dos println abaixo imprime uma informação desejada e o ultimo imprime todos os dados solicitados.

```java
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
```

## Testes

Teste aplicado com jUnit para verificar se alguma palavra chave é encontrada na impressão do console.

## Stack utilizada

Java +  biblioteca [Apache PDFBox](https://pdfbox.apache.org/) + Junit

