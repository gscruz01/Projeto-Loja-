import java.util.Scanner;

public class Loja {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(Menu.ExibirMenu);
            System.out.println("");
            System.out.println(Menu.ExibirPromocao);
            System.out.println("");
            System.out.println(Menu.OqueDeseja);
            System.out.println("");
            System.out.println(Menu.Vestidos);
            System.out.println(Menu.Croopeds);
            System.out.println(Menu.Shorts);
            Variaveis.escolha = sc.nextInt();

            // Vestidos

            switch (Variaveis.escolha) {

                case 1:
                    System.out.println(Itens.PromoçaoVestidos);
                    System.out.println("");
                    System.out.println(Itens.QuantosVestidos);
                    Variaveis.quantidade = sc.nextInt();

                    // Compra sem desconto
                    if (Variaveis.quantidade < 15) {
                        Variaveis.semdesconto = Variaveis.quantidade * Variaveis.preço_vestido;
                        Variaveis.compra4 = Variaveis.semdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra4);

                        // Compra com desconto
                    } else if (Variaveis.quantidade >= 15) {
                        Variaveis.comdesconto = Variaveis.quantidade * Variaveis.VESTIDO_COMDESCONTO;
                        System.out.println(Itens.Promoçao);
                        System.out.println("");
                        Variaveis.compra1 = Variaveis.comdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra1);
                    }

                    break;

                // Crooped

                case 2:
                    System.out.println(Itens.PromoçaoCroopeds);
                    System.out.println("");
                    System.out.println(Itens.QuantosCroopeds);
                    Variaveis.quantidade = sc.nextInt();

                    // Compra sem desconto
                    if (Variaveis.quantidade < 15) {
                        Variaveis.semdesconto = Variaveis.quantidade * Variaveis.preço_shorts;
                        Variaveis.compra4 = Variaveis.semdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra4);

                        // Compra com desconto
                    } else if (Variaveis.quantidade >= 15) {
                        Variaveis.comdesconto = Variaveis.quantidade * Variaveis.SHORT_COMDESCONTO;
                        System.out.println(Itens.Promoçao);
                        System.out.println("");
                        Variaveis.compra1 = Variaveis.comdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra1);
                    }

                    break;

                // Shots

                case 3:
                    System.out.println(Itens.PromoçaoShorts);
                    System.out.println("");
                    System.out.println(Itens.QuantosShorts);
                    Variaveis.quantidade = sc.nextInt();

                    // Compra sem desconto
                    if (Variaveis.quantidade < 15) {
                        Variaveis.semdesconto = Variaveis.quantidade * Variaveis.preço_cropped;
                        Variaveis.compra4 = Variaveis.semdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra4);

                        // Compra com desconto
                    } else if (Variaveis.quantidade >= 15) {
                        Variaveis.comdesconto = Variaveis.quantidade * Variaveis.CROPPED_COMDESCONTO;
                        System.out.println(Itens.Promoçao);
                        System.out.println("");
                        Variaveis.compra1 = Variaveis.comdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra1);

                    }
                    break;

                default:
                    System.out.println(Itens.Erro);
                    continue;

            }

            // Carrinho

            System.out.println(Menu.Carrinho);
            System.out.println(Menu.Sim);
            System.out.println(Menu.Não);
            Variaveis.carrinho = sc.nextInt();

            if (Variaveis.carrinho == 1) {
                System.out.println(Menu.OqueDeseja);
                System.out.println("");
                System.out.println(Menu.Vestidos);
                System.out.println(Menu.Croopeds);
                System.out.println(Menu.Shorts);
                Variaveis.escolha = sc.nextInt();

                // Vestidos 2
                if (Variaveis.escolha == 1) {
                    System.out.println(Itens.QuantosVestidos);
                    Variaveis.quantidade = sc.nextInt();

                    // Compra sem desconto 2
                    if (Variaveis.quantidade < 15) {
                        Variaveis.semdesconto = Variaveis.quantidade * 40;
                        Variaveis.compra5 = Variaveis.semdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra5);

                        // Compra com desconto 2
                    } else if (Variaveis.quantidade >= 15) {
                        Variaveis.comdesconto = Variaveis.quantidade * 32.50;
                        System.out.println(Itens.Promoçao);
                        System.out.println("");
                        Variaveis.compra2 = Variaveis.comdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra2);
                    }
                }

                // Crooped 2
                if (Variaveis.escolha == 2) {

                    System.out.println(Itens.QuantosCroopeds);
                    Variaveis.quantidade = sc.nextInt();

                    // Compra sem desconto 2
                    if (Variaveis.quantidade < 15) {
                        Variaveis.semdesconto = Variaveis.quantidade * 25;
                        Variaveis.compra5 = Variaveis.semdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra5);

                        // Compra com desconto 2
                    } else if (Variaveis.quantidade >= 15) {
                        Variaveis.comdesconto = Variaveis.quantidade * 17.50;
                        System.out.println(Itens.Promoçao);
                        System.out.println("");
                        Variaveis.compra2 = Variaveis.comdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra2);
                        System.out.println("");
                    }
                }
                // Shots 2
                if (Variaveis.escolha == 3) {

                    System.out.println(Itens.QuantosShorts);
                    Variaveis.quantidade = sc.nextInt();

                    // Compra sem desconto 2
                    if (Variaveis.quantidade < 15) {
                        Variaveis.semdesconto = Variaveis.quantidade * 30;
                        Variaveis.compra5 = Variaveis.semdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra5);

                        // Compra com desconto 2
                    } else if (Variaveis.quantidade >= 15) {
                        Variaveis.comdesconto = Variaveis.quantidade * 22.5;

                        System.out.println(Itens.ValorCompra);
                        System.out.println("");
                        Variaveis.compra2 = Variaveis.comdesconto;
                        System.out.println(Itens.ValorCompra + Variaveis.compra2);
                        System.out.println("");
                    }

                }

                // Não quer add nada no carrinho
                if (Variaveis.carrinho == 2) {

                    System.out.println("Ok");
                }

                // Carrinho 2
                System.out.println(Menu.Carrinho);
                System.out.println(Menu.Sim);
                System.out.println(Menu.Não);
                Variaveis.carrinho = sc.nextInt();

                if (Variaveis.carrinho == 1) {
                    System.out.println(Menu.OqueDeseja);
                    System.out.println("");
                    System.out.println(Menu.Vestidos);
                    System.out.println(Menu.Croopeds);
                    System.out.println(Menu.Shorts);
                    Variaveis.escolha = sc.nextInt();

                    // Vestidos 2
                    if (Variaveis.escolha == 1) {
                        System.out.println(Itens.QuantosVestidos);
                        Variaveis.quantidade = sc.nextInt();

                        // Compra sem desconto 2
                        if (Variaveis.quantidade < 15) {
                            Variaveis.semdesconto = Variaveis.quantidade * 40;
                            Variaveis.compra5 = Variaveis.semdesconto;
                            System.out.println(Itens.ValorCompra + Variaveis.compra5);

                            // Compra com desconto 2
                        } else if (Variaveis.quantidade >= 15) {
                            Variaveis.comdesconto = Variaveis.quantidade * 32.50;
                            System.out.println(Itens.Promoçao);
                            System.out.println("");
                            Variaveis.compra2 = Variaveis.comdesconto;
                            System.out.println(Itens.ValorCompra + Variaveis.compra2);
                        }
                    }

                    // Crooped 2
                    if (Variaveis.escolha == 2) {

                        System.out.println(Itens.QuantosCroopeds);
                        Variaveis.quantidade = sc.nextInt();

                        // Compra sem desconto 2
                        if (Variaveis.quantidade < 15) {
                            Variaveis.semdesconto = Variaveis.quantidade * 25;
                            Variaveis.compra5 = Variaveis.semdesconto;
                            System.out.println(Itens.ValorCompra + Variaveis.compra5);

                            // Compra com desconto 2
                        } else if (Variaveis.quantidade >= 15) {
                            Variaveis.comdesconto = Variaveis.quantidade * 17.50;
                            System.out.println(Itens.Promoçao);
                            System.out.println("");
                            Variaveis.compra2 = Variaveis.comdesconto;
                            System.out.println(Itens.ValorCompra + Variaveis.compra2);
                            System.out.println("");
                        }
                    }
                    // Shots 2
                    if (Variaveis.escolha == 3) {

                        System.out.println(Itens.QuantosShorts);
                        Variaveis.quantidade = sc.nextInt();

                        // Compra sem desconto 2
                        if (Variaveis.quantidade < 15) {
                            Variaveis.semdesconto = Variaveis.quantidade * 30;
                            Variaveis.compra5 = Variaveis.semdesconto;
                            System.out.println(Itens.ValorCompra + Variaveis.compra5);

                            // Compra com desconto 2
                        } else if (Variaveis.quantidade >= 15) {
                            Variaveis.comdesconto = Variaveis.quantidade * 22.5;

                            System.out.println(Itens.ValorCompra);
                            System.out.println("");
                            Variaveis.compra2 = Variaveis.comdesconto;
                            System.out.println(Itens.ValorCompra + Variaveis.compra2);
                            System.out.println("");
                        }

                    }

                    // Não quer add nada no carrinho
                    if (Variaveis.carrinho == 2) {

                        System.out.println("Ok");
                    }
                }

                // Não quer add nada no carrinho 2
                if (Variaveis.carrinho == 2) {
                    System.out.println("Ok");
                }
            }
            // Soma dos dois itens sem desconto
            if (Variaveis.carrinho == 2) {
                if (Variaveis.quantidade < 15) {
                    Variaveis.doisitens = Variaveis.compra4 + Variaveis.compra5;
                    System.out.println(Itens.ValorItens + Variaveis.doisitens);
                }

                // Soma dos dois itens com desconto
                else if (Variaveis.quantidade >= 15) {
                    Variaveis.doisitens = Variaveis.compra1 + Variaveis.compra2;
                    System.out.println(Itens.ValorItens + Variaveis.doisitens);
                }
            }
            // Soma dos tres itens sem desconto
            if (Variaveis.carrinho == 1) {

                if (Variaveis.quantidade < 15) {
                    Variaveis.tresitens = Variaveis.compra4 + Variaveis.compra5 + Variaveis.compra6;
                    System.out.println(Itens.ValorItens + Variaveis.tresitens);
                }
            }
            // Soma dos tres itens com desconto
            if (Variaveis.carrinho == 1) {

                if (Variaveis.quantidade >= 15) {
                    Variaveis.tresitens = Variaveis.compra1 + Variaveis.compra2 + Variaveis.compra3;
                    System.out.println(Itens.ValorItens + Variaveis.tresitens);
                }
            }

            // Pagamento
            while (true) {

                System.out.println(Pag.Tipo);
                System.out.println("");
                System.out.println(Pag.Forma);
                System.out.println("");
                System.out.println(Pag.Pix);
                System.out.println(Pag.Debito);
                System.out.println(Pag.Credito);
                System.out.println(Pag.Boleto);
                Variaveis.pagamento = sc.nextInt();

                // Pagamento no pix
                switch (Variaveis.pagamento) {

                    case 1:

                        System.out.println(Pag.Chave);
                        System.out.println("");
                        System.out.println(Pag.Numero);
                        System.out.println("");
                        System.out.println(Pag.Nome);
                        System.out.println("");
                        System.out.println(Pag.Comprovente);
                        System.out.println("");
                        System.out.println(Pag.Conferencia);
                        System.out.println("");
                        System.out.println(Pag.Agradecimento);

                        break;

                    // Pagamento no debito
                    case 2:
                        System.out.println(Pag.Na_Entrega);
                        System.out.println("");
                        System.out.println(Pag.Agradecimento);
                        break;

                    // Pagamento no Crebito
                    case 3:

                        System.out.println(Pag.Preencha);
                        System.out.println("");
                        System.out.println(Pag.Nome_no_Cartão);
                        System.out.println("");
                        Pag.cartao = sc.nextLine().trim();
                        Pag.cartao = sc.nextLine().trim();
                        System.out.println("");
                        System.out.println(Pag.Numero_do_Cartão);
                        System.out.println("");
                        Pag.cartao = sc.nextLine().trim();
                        System.out.println("");
                        System.out.println(Pag.Data_do_Cartão);
                        System.out.println("");
                        Pag.cartao = sc.nextLine().trim();
                        System.out.println("");
                        System.out.println(Pag.Cvv_do_Cartão);
                        System.out.println("");
                        Pag.cartao = sc.nextLine().trim();
                        System.out.println("");
                        System.out.println(Pag.Cpf_do_titular);
                        System.out.println("");
                        Pag.cartao = sc.nextLine().trim();
                        System.out.println("");
                        System.out.println(Pag.Pedido_Realizado);
                        System.out.println("");

                        break;

                    // Pagamento no boleto
                    case 4:

                        System.out.println(Pag.Email);
                        System.out.println("");
                        Pag.email = sc.nextLine().trim();
                        System.out.println(Pag.Em_Boleto);
                        System.out.println("");
                        System.out.println(Pag.Realizar);
                        System.out.println("");
                        System.out.println(Pag.Agradecimento);

                        break;

                    default:
                        System.out.println(Itens.Erro);
                        continue;
                }

                break;

            }
            sc.close();
        }

    }

}
