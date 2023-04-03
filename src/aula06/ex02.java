package aula06;
import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation;

        do {
            System.out.println("Contact operations");
            System.out.println("1 - insert new contact");
            System.out.println("2 - change contact");
            System.out.println("3 - delete contact");
            System.out.println("4 - search contact");
            System.out.println("5 - contact list");
            System.out.println("0 - exit");

            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Insert the name: ");
                    String nome = sc.next();

                    System.out.println("Insert the email: ");
                    String email = sc.next();

                    System.out.println("Insert the phone number: ");
                    int ntelemovel = sc.nextInt();

                    Contactos contact = new Contactos(nome, email, ntelemovel);
                    Contactos.contactList.add(contact);

                    break;
                    
                case 2:
                    System.out.print("Insert the name of contact you want to change: ");
                    nome = sc.next();

                    for (int i = 0; i < Contactos.contactList.size(); i++) {

                        if (Contactos.contactList.get(i).getPessoa().equals(nome)) {
                            System.out.println("Insert the new name: ");
                            nome = sc.next();

                            System.out.println("Insert the new email: ");
                            email = sc.next();

                            System.out.println("Insert the new phone number: ");
                            ntelemovel = sc.nextInt();

                            Contactos.contactList.get(i).setPessoa(nome);
                            Contactos.contactList.get(i).setEmail(email);
                            Contactos.contactList.get(i).setNtelemovel(ntelemovel);
                        }
                    }

                    break;
                case 3:
                    System.out.print("Insert the name of contact you want to delete: ");
                    nome = sc.next();

                    for (int i = 0; i < Contactos.contactList.size(); i++) {

                        if (Contactos.contactList.get(i).getPessoa().equals(nome)) {
                            Contactos.contactList.remove(i);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Insert the name of contact you want to search: ");
                    nome = sc.next();

                    for (int i = 0; i < Contactos.contactList.size(); i++) {

                        if (Contactos.contactList.get(i).getPessoa().equals(nome)) {
                            System.out.println(Contactos.contactList.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Contact list: ");
                    for (int i = 0; i < Contactos.contactList.size(); i++) {
                        System.out.println(Contactos.contactList.get(i));
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println();

        } while (operation != 0);

        sc.close();

    }        
}

