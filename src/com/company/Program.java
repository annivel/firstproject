
package com.company;

import java.util.Scanner;

public class Program {
    private static final int MAX_PRODUCTS = 1;
    private static final int MAX_DEAL = 1;
    private Deal[] deals;

    public static void main(String[] args) {
        new Program().allActions();
    }

    void allActions() {
        input();
        System.out.println("================================");
        output();
    }


 /*   private void input() {
        deals = new Deal[MAX_DEAL];
        for (int i = 0; i < deals.length ; i++) {
            System.out.println((i+1) + " of" + deals.length + ":" );
            deals [i]= inputDeal();
    }
    }

    private void output(){
        for (Deal d: deals);
        System.out.println("Deal "+ inputDeal().getDate());
        System.out.println(" "+ inputDeal().getBuyer());
        System.out.println( " buys from " + inputDeal().getSeller().getName());

        Product[] products;
        Deal deal = new Deal(products, );
        for (Product product : deal.getProducts()){

    }
    }

    private Deal inputDeal() {
        System.out.println("Input deal --> ");
        System.out.println(" Seller ");
        Party seller = inputParty();

        System.out.println(" Buyer ");
        Party buyer = inputParty();
        Product[] products = new Product[MAX_PRODUCTS];
        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct();

        }
        Deal deal = new Deal(products, buyer, seller);
        return deal;
    }


    private Party inputParty() {
        String partyName = keyboard("Party name");
        Party party = new Party();
        party.setName(partyName);
        return party;
    }
    private Product inputProduct(){
        System.out.println("Input Product --> ");
        String title = keyboard(" title");
        String prise = keyboard(" prise");
        String quantity = keyboard(" quantity");

        Product product = new Product();
        product.setTitle(title);
        product.setPrice(String.valueOf(prise));
        product.setQuantity(String.valueOf(quantity));

        return product;


    }
    private String keyboard(String massage) {
        System.out.println(massage + ": ");
        Scanner scanner = new Scanner(System.in);

        return massage;
    }

}

*/
    private void output() {
        for (Deal deal : deals) {
            System.out.println("Deal " + deal.getDate());
            System.out.println("    " + deal.getBuyer().getName()
                    + " buys from " + deal.getSeller().getName());

            for (Product product : deal.getProducts()) {
                System.out.println("        " + product.getTitle() + " "
                        + product.getQuantity() + " x " + product.getPrice()
                        + " = " + product.getCost());
            }

            System.out.println("Sum: " + deal.getSum());
            System.out.println("----------------------------");
        }
    }

    private void input() {
        deals = new Deal[MAX_DEAL];

        for (int i = 0; i < deals.length; i++) {
            System.out.print((i + 1) + " of " + deals.length + ": ");
            deals[i] = inputDeal();
        }
    }

    private Deal inputDeal() {
        System.out.println("Input deal ->");

        System.out.print("  Seller -> ");
        Party seller = inputParty();

        System.out.print("  Buyer -> ");
        Party buyer = inputParty();

        Product[] products = new Product[MAX_PRODUCTS];
        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct();
        }

        Deal deal = new Deal(buyer, seller, products);
        return deal;
    }

    private Product inputProduct() {
        System.out.println("  Input product ->");
        String title = keyboard("    Name");
        String price = keyboard("    Price");
        String quan = keyboard("    Quantity");

        Product product = new Product();
        product.setTitle(title);
        product.setPrice(Double.valueOf(price));
        product.setQuantity(Integer.valueOf(quan));

        return product;
    }

    private Party inputParty() {
        String partyName = keyboard("Party name");
        Party party = new Party();
        party.setName(partyName);
        return party;
    }

    private String keyboard(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    }


