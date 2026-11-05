# Padrões de Projeto — Trabalho

| Questão | Pacote | Padrão |
|---|---|---|
| 1 — Monitor de Estoque | `questao1` | Observer |
| 2 — Tarifa de Estacionamento | `questao2` | Strategy |
| 3 — Pedido de Café | `questao3` | Decorator |

## Como executar

A partir da raiz do repositório:

```
javac -d out src/questao1/*.java src/questao2/*.java src/questao3/*.java
java -cp out questao1.Main
java -cp out questao2.Main
java -cp out questao3.Main
```

## Valores da Questão 2

- Rotativo: R$ 8,00 por hora iniciada (`Rotativo.VALOR_HORA`)
- Mensalista: R$ 15,00 fixo (`Mensalista.VALOR_FIXO`)
- Conveniado: 30 min grátis (`MINUTOS_GRATUITOS`), depois R$ 8,00 por hora iniciada com 25% de desconto (`VALOR_HORA`, `PERCENTUAL_DESCONTO`)
