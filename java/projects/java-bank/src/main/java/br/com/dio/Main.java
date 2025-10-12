package br.com.dio;

import br.com.dio.exception.AccountNotFoundException;
import br.com.dio.exception.NoFundsEnoughException;
import br.com.dio.repository.AccountRepository;
import br.com.dio.repository.InvestmentRepository;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private final static AccountRepository accountRepository = new AccountRepository();
    private final static InvestmentRepository investmentRepository = new InvestmentRepository();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, seja bem vindo ao Ben's Bank!");
        while (true) {
            System.out.println("Selecione a operacao desejada: ");
            System.out.println("1. Criar conta");
            System.out.println("2. Criar investimento");
            System.out.println("3. Iniciar investimento");
            System.out.println("4. Depositar na conta");
            System.out.println("5. Sacar da conta");
            System.out.println("6. Transferir entre contas");
            System.out.println("7. Depositar em investimento");
            System.out.println("8. Sacar de investimento");
            System.out.println("9. Listar contas");
            System.out.println("10. Listar investimentos");
            System.out.println("11. Listar carteiras de investimento");
            System.out.println("12. Atualizar investimentos");
            System.out.println("13. Historico de conta");
            System.out.println("14. Sair\n");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    createInvestment(scanner);
                    break;
                case 3:
                    initInvestment(scanner);
                    break;
                case 4:
                    deposit(scanner);
                    break;
                case 5:
                    withdraw(scanner);
                    break;
                case 6:
                    transferAccount(scanner);
                    break;
                case 7:
                    depositInvestment(scanner);
                    break;
                case 8:
                    withdrawInvestment(scanner);
                    break;
                case 9:
                    var accounts = accountRepository.list();
                    if (accounts.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada.");
                    } else {
                        int idx = 1;
                        for (var account : accounts) {
                            System.out.println("Conta #" + idx);
                            System.out.println("Pix: " + String.join(", ", account.getPix()));
                            System.out.println("Tipo de servico: " + account.getService());
                            System.out.println("Saldo atual: " + account.getFunds());
                            System.out.println("--------------------------");
                            idx++;
                        }
                    }
                    break;
                case 10:
                    investmentRepository.list().forEach(System.out::println);
                    break;
                case 11:
                    investmentRepository.listWallets().forEach(System.out::println);
                    break;
                case 12: {
                    long totalInterest = investmentRepository.updateAmount();
                    System.out.println("Investimento atualizado com sucesso!");
                    System.out.println("Total de juros gerados: " + totalInterest);
                    break;
                }
                case 13:
                    showAccountHistory(scanner);
                    break;
                case 14:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente selecionando um numero entre 1 e 14.");
            }
        }
    }

    private static void createAccount(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite as chaves Pix separadas por ponto e virgula (;): ");
                scanner.nextLine();
                var pixInput = scanner.nextLine();
                var pix = Arrays.stream(pixInput.split(";"))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty() && s.matches("\\d+"))
                        .toList();
                if (pix.isEmpty() || Arrays.stream(pixInput.split(";")).anyMatch(s -> !s.trim().matches("\\d+") && !s.trim().isEmpty())) {
                    System.out.println("Todas as chaves Pix devem conter apenas numeros. Tente novamente.");
                    continue;
                }
                System.out.println("Informe o valor inicial de deposito: ");
                String amountInput = scanner.nextLine();
                long amount = Long.parseLong(amountInput);
                if (amount <= 0) {
                    System.out.println("O valor do deposito deve ser maior que zero. Tente novamente.");
                    continue;
                }
                var wallet = accountRepository.create(pix, amount);
                System.out.println("Conta criada com sucesso!");
                System.out.println("Chaves Registradas: " + String.join(", ", wallet.getPix()));
                System.out.println("Saldo inicial: " + wallet.getFunds());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Valor de deposito invalido. Digite um numero valido.");
            } catch (Exception ex) {
                System.out.println("Erro inesperado: " + ex.getMessage());
            }
        }
    }

    private static void createInvestment(Scanner scanner) {
        System.out.println("Informe a taxa do investimento: ");
        scanner.nextLine();
        var tax = Integer.parseInt(scanner.nextLine());
        System.out.println("Informe o valor inicial de investimento: ");
        var initialFunds = Long.parseLong(scanner.nextLine());
        var investment = investmentRepository.create(tax, initialFunds);
        System.out.println("Investimento criado com sucesso!");
        System.out.println("Investimento: " + investment);
    }

    private static void initInvestment(Scanner scanner) {
        System.out.println("Informe a chave pix da conta: ");
        scanner.nextLine();
        var pix = scanner.nextLine();
        System.out.println("Informe o identificador do investimento: ");
        var id = Long.parseLong(scanner.nextLine());
        try {
            var investmentWallet = investmentRepository.initInvestment(accountRepository.findByPix(pix), id);
            System.out.println("Conta de investimento criada com sucesso: " + investmentWallet);
        } catch (AccountNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.println("Informe a chave pix: ");
        scanner.nextLine();
        var pix = scanner.nextLine();
        System.out.println("Informe o valor a ser depositado: ");
        try {
            var amount = Long.parseLong(scanner.nextLine());
            accountRepository.deposit(pix, amount);
            System.out.println("Deposito de " + amount + " na conta " + pix + " realizado com sucesso!");
            System.out.println("Saldo atual: " + accountRepository.findByPix(pix).getFunds());
        } catch (AccountNotFoundException ex) {
            System.out.println("Pix nao encontrado: " + pix);
        } catch (NumberFormatException ex) {
            System.out.println("Valor invalido. Digite um numero valido.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.println("Informe a chave pix: ");
        scanner.nextLine();
        var pix = scanner.nextLine();
        System.out.println("Informe o valor a ser sacado: ");
        try {
            var amount = Long.parseLong(scanner.nextLine());
            var withdrawnMoney = accountRepository.withdraw(pix, amount);
            System.out.println("Saque de " + amount + " realizado com sucesso na conta " + pix + "!");
            System.out.println("Detalhes do dinheiro sacado:");
            withdrawnMoney.forEach(System.out::println);
        } catch (NoFundsEnoughException | AccountNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Valor invalido. Digite um numero valido.");
        }
    }

    private static void transferAccount(Scanner scanner) {
        System.out.println("Informe a chave pix de origem: ");
        scanner.nextLine();
        var source = scanner.nextLine();
        System.out.println("Informe a chave pix de destino: ");
        var target = scanner.nextLine();
        System.out.println("Informe o valor a ser transferido: ");
        try {
            var amount = Long.parseLong(scanner.nextLine());
            accountRepository.transferMoney(source, target, amount);
            System.out.println("Transferencia realizada com sucesso!");
        } catch (NoFundsEnoughException | AccountNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Valor invalido. Digite um numero valido.");
        }
    }

    private static void depositInvestment(Scanner scanner) {
        System.out.println("Informe a chave pix: ");
        scanner.nextLine();
        var pix = scanner.nextLine();
        System.out.println("Informe o valor a ser depositado no investimento: ");
        try {
            var amount = Long.parseLong(scanner.nextLine());
            var wallet = investmentRepository.deposit(pix, amount);
            System.out.println("Deposito de " + amount + " realizado com sucesso!");
            System.out.println("Saldo atual do investimento: " + wallet.getFunds());
        } catch (NoFundsEnoughException | AccountNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Valor invalido. Digite um numero valido.");
        }
    }

    private static void withdrawInvestment(Scanner scanner) {
        System.out.println("Informe a chave pix: ");
        scanner.nextLine();
        var pix = scanner.nextLine();
        System.out.println("Informe o valor a ser sacado do investimento: ");
        try {
            var amount = Long.parseLong(scanner.nextLine());
            var wallet = investmentRepository.withdraw(pix, amount);
            System.out.println("Saque de " + amount + " realizado com sucesso!");
            System.out.println("Saldo atual do investimento: " + wallet.getFunds());
            if (!wallet.isActive()) {
                System.out.println("Investimento encerrado (saldo zerado).");
            }
        } catch (NoFundsEnoughException | AccountNotFoundException ex) {
            if (ex instanceof NoFundsEnoughException) {
                System.out.println("Nao ha fundos suficientes para sacar do investimento.");
            } else {
                System.out.println(ex.getMessage());
            }
        } catch (NumberFormatException ex) {
            System.out.println("Valor invalido. Digite um numero valido.");
        }
    }

    private static void showAccountHistory(Scanner scanner) {
        System.out.println("Informe a chave pix da conta: ");
        scanner.nextLine();
        var pix = scanner.nextLine();
        try {
            var account = accountRepository.findByPix(pix);
            var transactions = account.getFinancialTransactions();
            System.out.println("=== Historico da Conta ===");
            System.out.println("Pix: " + String.join(", ", account.getPix()));
            System.out.println("Tipo de servico: " + account.getService());
            System.out.println("Saldo atual: " + account.getFunds());
            System.out.println("Total de transacoes: " + transactions.size());
            System.out.println("\nTransacoes:");
            transactions.stream()
                    .collect(java.util.stream.Collectors.groupingBy(t -> t.createdAt().toLocalDateTime().toLocalDate()))
                    .forEach((date, transList) -> {
                        System.out.println("Data: " + date);
                        transList.forEach(t ->
                                System.out.println("- " + t.description() + " | Servico: " + t.targetService() + " | Hora: " + t.createdAt().toLocalTime())
                        );
                    });
        } catch (AccountNotFoundException ex) {
            System.out.println("Pix nao encontrado: " + pix);
        }

        java.util.UUID transactionId = java.util.UUID.randomUUID();
        long funds = 3;
        String description = "Deposito inicial";
        java.util.List<br.com.dio.model.Money> moneyList = br.com.dio.repository.CommonsRepository.generateMoney(transactionId, funds, description);
    }
}
