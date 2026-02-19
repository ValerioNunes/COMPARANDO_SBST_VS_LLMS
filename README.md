# Calculadora - Testes com EvoSuite e PITest

## 📋 Sobre
Projetos de teste de software usando geração automática de testes (EvoSuite) e análise de mutantes (PITest).

## 🚀 Comandos Rápidos

### Configurar Java 8 (obrigatório)
```bash
# Verificar versão
java -version  # Deve mostrar 1.8.x

# Se não tiver Java 8, baixe e instale de:
# https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html

# Clonar
git clone https://github.com/seu-usuario/calculadora-evosuite.git
cd calculadora-evosuite

# Compilar
mvn clean compile

# Gerar testes
mvn evosuite:generate -Dcuts=Calculadora
mvn evosuite:export

# Executar testes
mvn test

# Análise de mutantes
mvn test pitest:mutationCoverage

# Ver relatório
# Abrir target/pit-reports/INDEX.html no navegador


# Clonar
git clone https://github.com/seu-usuario/calculadora-llm.git
cd calculadora-llm

# Compilar e testar direto
mvn clean compile test

# Análise de mutantes
mvn test pitest:mutationCoverage


🐞 Bugs Corrigidos
Fatorial negativo e divisão por zero: Adicionado try-catch nos testes do EvoSuite

Overflow em soma e fatorial 13: Ajustes nos testes do LLM

📊 Métricas Rápidas
Projeto	Cobertura	Mutantes Mortos
EvoSuite	~90%	~85%
LLM	~95%	~92%


src/
├── main/java/Calculadora.java
└── test/java/ (testes gerados)
