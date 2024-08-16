# 🚀 Microserviço com Spring Boot
  - Este projeto foi desenvolvido como parte de um desafio técnico proposto pela Magalu 💼. O objetivo foi aprimorar meus conhecimentos em Spring Boot, Spring Scheduler, Spring Data JPA, Docker, e muito mais. Abaixo estão os detalhes sobre a implementação e como você pode executar o projeto.

## 🛠️ Tecnologias Utilizadas
  - Spring Boot: Framework principal para criação do microserviço.
  - Spring Scheduler: Para criação de tarefas agendadas ⏰.
  - Spring Data JPA: Para a implementação de queries customizadas e gerenciamento de relacionamentos ManyToOne 🔗.
  - MySQL: Banco de dados relacional, rodando em um contêiner Docker 🐳.
  - Docker: Para isolar o banco de dados em um ambiente controlado.
  - SLF4J: Para gerenciamento de logs e monitoramento 📝.

##⚙️ Funcionalidades
  - Tarefas agendadas: Tasks configuradas para executar a cada minuto ⏰.
  - Nota: As tasks estão preparadas para enviar notificações, mas a lógica de envio foi apenas pre-preparada e não é executada por enquanto 📤.
  - Consultas Customizadas: Uso de Spring Data JPA para executar queries específicas no banco de dados MySQL 💻.
  - Relacionamentos: Implementação de relacionamento ManyToOne com a anotação @JoinColumn 🔗.
  - Logs: Integração com SLF4J para criação de logs detalhados do sistema 📝.

## 🚀 Como Executar o Projeto
  - Clone o repositório:
      - git clone https://github.com/rkweber05/challenge-magalu.git
      - cd challenge-magalu
  - Suba o container Docker do MySQL:
      - Certifique-se de que você tenha o Docker instalado e rodando.
      - docker-compose up -d
  - Configure o application.properties:
      - Ajuste as propriedades de conexão com o banco de dados no arquivo src/main/resources/application.properties conforme necessário.

  - Execute o microserviço:
      - ./mvnw spring-boot:run
  - Verifique as tasks agendadas:
  - Monitore os logs para confirmar que as tasks estão sendo executadas a cada minuto.

## 📝 Contribuições
  - Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## 📧 Contato
  - Se você tiver alguma dúvida ou sugestão, não hesite em me contatar via LinkedIn ou email.
