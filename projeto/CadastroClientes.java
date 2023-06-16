package com.associacao.projetocliente.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroClientes {
	public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        while (!nome.equalsIgnoreCase("sair")) {
            System.out.println("===== Cadastro de Clientes =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Editar cliente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome do cliente: ");
                    nome = scanner.nextLine();
                    if (!nome.equalsIgnoreCase("sair")) {
                        System.out.print("CPF do cliente: ");
                        String cpf = scanner.nextLine();
                        
                        System.out.print("Senha gov.br do cliente: ");
                        String senhaGov = scanner.nextLine();

                        Cliente cliente = new Cliente(nome, cpf, senhaGov);
                        clientes.add(cliente);

                        System.out.println("Cliente cadastrado com sucesso!\n");
                    }
                    break;
                case "2":
                    System.out.println("===== Clientes Cadastrados =====");
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cliente = clientes.get(i);
                        System.out.println((i + 1) + " - " + cliente.getNome());
                    }
                    System.out.print("Digite o número do cliente a ser editado (ou 0 para voltar): ");
                    int clienteIndex = Integer.parseInt(scanner.nextLine()) - 1;

                    if (clienteIndex >= 0 && clienteIndex < clientes.size()) {
                        Cliente clienteSelecionado = clientes.get(clienteIndex);

                        System.out.print("Novo nome do cliente: ");
                        clienteSelecionado.setNome(scanner.nextLine());
                        System.out.print("Novo CPF do cliente: ");
                        clienteSelecionado.setCpf(scanner.nextLine());
                        System.out.print("Nova Senha gov.br do cliente: ");
                        clienteSelecionado.setSenhaGov(scanner.nextLine());
                        
                        System.out.println("Cliente editado com sucesso!\n");
                    } else if (clienteIndex != -1) {
                        System.out.println("Número de cliente inválido.\n");
                    }
                    break;
                case "3":
                    nome = "sair";
                    break;
                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }
        }
        scanner.close();
        System.out.println("\n===== Clientes Cadastrados =====");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Senha do Gov: " + cliente.getSenhaGov());
            System.out.println();
        }
	}
}