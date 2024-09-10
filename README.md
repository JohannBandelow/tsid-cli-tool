# TSID-CLI-TOOL 
TSID CLI Tool é uma ferramenta para gerar TSIDs e converter TSIDs do formato Long para String(Crockford Base 32) e vice-versa.

## Dependências
- Makefile
- Java 17

## Build
Para buildar só rodar o comando:
```bash
    make
```

## Rodar
Para rodar é necessário utilizar o comando:
```bash
 java -jar TsidTool.jar
```
O comando acima ira gerar um TSID (Timestamp atual) e irá imprimir no terminal seu valor em formato long e string.

Caso queira converter um TSID existente, use o comando:
```bash
 java -jar TsidTool.jar {id}
```
O comando acima irá converter o id fornecido, o valor de id pode ser a string (Base 32) ou o long.
