Para aplicação local, a Identidade Gerenciada não é a solução correta, pois ela só funciona para recursos hospedados no Azure.

Autenticação via Azure CLI é recomendado para desenvolvimento.

```properties
spring.cloud.azure.keyvault.secret.endpoint=https://<keyvault-name>.vault.azure.net
spring.cloud.azure.credential.azure-cli-enabled=true
```

## Pré requisito
Uma instância do Key Vault. Se você não tiver um, consulte Início Rápido: criar um Azure Key Vault usando o portal do Azure. Além disso, anote o URI da instância do Key Vault, pois você precisa dele para o aplicativo de teste deste tutorial.

## Permissões
- Key Vault Secrets User: Para ler Segredos do Key Vault
- Key Vault Secrets Officer: criação, atualização e exclusão de secrets
- Key Vault Contributor: permissão ampla, inclui chaves e certificados

## Key Vault configurado para usar RBAC do Azure
- Acesse o Portal do Azure (https://portal.azure.com).
- Vá para Key Vaults e selecione o seu Key Vault.
- No menu lateral, clique em Controle de Acesso (IAM).
- Clique em Adicionar → Adicionar atribuição de função.
- Em Função, pesquise por "Key Vault Secrets Officer" e selecione.
- Em Atribuir acesso a, escolha "Usuário, grupo ou entidade de serviço".
- Em Selecionar membros, escolha:
    - Seu usuário logado (caso esteja autenticando com az login).

### Executar a Aplicação
Agora, rode a aplicação localmente:
```bash
mvn spring-boot:run
```

## Referência
[Carregar Segredo via Spring](https://learn.microsoft.com/pt-br/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-key-vault)