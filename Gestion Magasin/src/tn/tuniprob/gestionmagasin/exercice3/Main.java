package tn.tuniprob.gestionmagasin.exercice3;
import tn.tuniprob.gestionmagasin.Exercice1.Produit;
import tn.tuniprob.gestionmagasin.exercice2.Magasin;
public class Main {
    public static void main(String[] args) {

        Magasin carrefour=new Magasin(100,"Centre-ville","Carrefour");
        Magasin monoprix=new Magasin(101,"haynour","Monoprix");

        Caissier caissier1=new Caissier(10,5,"hachem","Sidi bouzid",2);
        Caissier caissier2=new Caissier(11,6,"tarek","Sidi bouzid",3);
        Responsable responsable=new Responsable(12,3,"ahmed","Centre -ville",15);


        carrefour.ajoutEmployes(caissier1);
        carrefour.ajoutEmployes(caissier2);
        carrefour.ajoutEmployes(responsable);

        Caissier caissier3=new Caissier(10,5,"Hachem","Sousse",2);
        Caissier caissier4=new Caissier(12,6,"Said","Zaghouan",3);
        Caissier caissier5=new Caissier(13,6,"Ali","Sfax",3);
        Vendeur vendeur=new Vendeur(15,8,"Noureddin","Feriana",50);
        Responsable responsable1=new Responsable(16,3,"Saadiya","Sidi Bouzid",15);
        monoprix.ajoutEmployes(caissier3);
        monoprix.ajoutEmployes(caissier4);
        monoprix.ajoutEmployes(caissier5);
        monoprix.ajoutEmployes(vendeur);
        System.out.println("********** les donneés des employes de magasin carrefour ********** ");
        for (int i = 0; i < carrefour.nombreDeEmployes; i++) {
            carrefour.t_emp[i].afficher();
        }
        System.out.println("------------------------------------------");
        System.out.println("********** les donneés des employes de magasin monoprix ********** ");
        for (int i = 0; i < monoprix.nombreDeEmployes; i++) {
            monoprix.t_emp[i].afficher();
        }
        Produit p2=new Produit(1021,"Lait","delice");
        Produit p3=new Produit(2510,"Yaiurt","Vitalait");
        Produit p4=new Produit(3250,"Tomate","sucam",1.2);

        carrefour.ajoutProduit(p2);
        carrefour.ajoutProduit(p3);
        carrefour.ajoutProduit(p4);

        monoprix.ajoutProduit(p2);
        monoprix.ajoutProduit(p3);
        monoprix.ajoutProduit(p4);
        System.out.println("------------------------------------------");
        System.out.println("********** les données de magasin carrefour sont ********** " );
        carrefour.afficher();

        System.out.println("********** les données de magasin monoprix sont ********** " );
        monoprix.afficher();

        System.out.println("********** les différents salaires des employés de magasin carrefour **********");
        for (int i = 0; i < carrefour.nombreDeEmployes; i++) {
            System.out.println(carrefour.t_emp[i].nom+" "+carrefour.t_emp[i].type+" "+carrefour.t_emp[i].calculerSalary()+"D");
        }
        System.out.println("------------------------------------------");
        System.out.println("********** les différents salaires des employés de magasin monoprix **********");
        for (int i = 0; i < monoprix.nombreDeEmployes; i++) {
            System.out.println(monoprix.t_emp[i].nom+" "+monoprix.t_emp[i].type+" "+monoprix.t_emp[i].calculerSalary()+"D");
        }
    }
}

