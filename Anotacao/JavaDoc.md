# Documentação

Uma das principais características da linguagem Java é a documentação detalhada disponível para seus recursos. Para se tornar um desenvolvedor avançado, é essencial saber compreender a documentação oficial da linguagem e dos frameworks utilizados.

A documentação oficial de uma classe, como a classe `String`, pode ser consultada no [link](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html):

## Tags

A documentação em Java utiliza várias tags para descrever classes, métodos e atributos. As principais tags incluem:

| Tag      | Descrição                                              |
| -------- | ------------------------------------------------------ |
| @author  | Autor / Criador                                        |
| @version | Versão do recurso disponibilizado                      |
| @since   | Versão / Data de início da disponibilização do recurso |
| @param   | Descrição dos parâmetros dos métodos                   |
| @return  | Tipo de retorno de um método                           |
| @throws  | Exceções lançadas pelo método                          |

Exemplo de documentação utilizando tags:

```java
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe
* para utilizar os recursos oferecidos pelo autor.
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método soma dois números inteiros
   * @param numeroUm o primeiro parâmetro
   * @param numeroDois o segundo parâmetro
   * @return int a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
```

### Tipos de Comentários

Os comentários em Java podem ser de três tipos:

### One Line
```java
// Olá, eu sou um comentário em uma única linha
```
### Multi Line
```java
/* Olá,
 * Eu sou um comentário
 * que pode ser mais detalhado
 * quando necessário
 */
```
### Documentation
```java
/** 
 * Estas duas estrelinhas acima
 * indicam que você está escrevendo
 * um comentário a nível de documentação.
 * Que incrível !!!
 */
```

> [!NOTE]
> Comentários não devem ser usados para corrigir algoritmos mal estruturados. A documentação deve refletir a clareza do código.

Exemplo de código mal documentado:

```java
/*
 * Este método foi elaborado às pressas
 * por isso eu abrevei o nome das variáveis
 * mas tem a finalidade de somar ou multiplicar
 * dois números
 */
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m.equals("M")){ // M= multiplicação
        r = n * x;
    } else {
        // Se não, soma mesmo
        r = n + x;
    }
    return r;
}
```

## Javadoc

**Javadoc** é uma ferramenta para gerar documentação em HTML a partir do código-fonte Java. Ele utiliza comentários específicos para descrever classes, métodos e atributos. Muitas IDEs geram Javadoc automaticamente.

Para criar a documentação HTML, execute o comando:

```sh
javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
```

> https://pt.wikipedia.org/wiki/Javadoc
