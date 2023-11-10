package exercice2;

public class testemag {
    public static void main(String[] args) {
        produit p1=new produit(1021,"Lait","Delice",800);
        produit p2=new produit(2510,"Yaourt","Vitalait",500);
        Produit p3=new produit(3250,"Tomate","Sicam",1.200);
        magasin MG1=new magasin(5000,"Bouzid",9);
        MG1.ajouter(p1);
        MG1.ajouter(p2);
        MG1.ajouter(p3);
        MG1.affmagasin();
        System.out.println("le nombredu magasin est"+MG1.num);

    }
}


