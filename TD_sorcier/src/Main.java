/*java.io
 java.lang
"implements" quand une classe où il y a du code ramène une autre classe sans code comme les interfaces
"extends" quand une classe où il y a du code ramène une autre classe avec du code OU
          quand une classe où il n'y a pas du code ramène une autre classe où il n'y a pas du code

Quand on déclare variable toujours type le plus global
Exemple: si on définit une variable List on peut changer par la suite si c'est une ArrayList ou une autre classe qui découle de l'interface List

interface, classe (abstraite) sont des types.


Une interface n’implémente aucune méthode.
Une classe, ou une classe abstraite peut implémenter plusieurs interfaces, mais n’a qu’une super classe, alors qu’une interface peut dériver de plusieurs autres interfaces.
Des classes non liées hiérarchiquement peuvent implémenter la même interface


COMMENTER CODE AVEC protected, abstract POUR S'EN SOUVENIR
 */
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        /*Personnage p=new Personnage(100, "Cédric");
        p.affiche();
        p.GetNom();
        p.Mort();
        p.GetVie();
        p.AddVie(3);
        p.affiche();*/

        Monstre a= new Monstre(100,"Cédric");
        NainJardin b= new NainJardin(100);
        Sorcier c= new Sorcier(100,"Sam");
        GnomeJardin d=new GnomeJardin(100);

        System.out.println( a.name +" avec "+a.PDV+" points de vie ATTAQUE le nain qui a "+ b.solide+" solidite\n");
        a.attaque(b);
        System.out.println( a.name +" avec "+a.PDV+" points de vie A ATTAQUE le nain qui a "+ b.solide+" solidite\n\n");

        System.out.println( c.name +" avec "+c.PDV+" points de vie ATTAQUE le nain qui a "+ b.solide+" solidite\n");
        c.attaque(b);
        System.out.println( c.name +" avec "+c.PDV+" points de vie A ATTAQUE le nain qui a "+ b.solide+" solidite\n\n");

        System.out.println( a.name +" avec "+a.PDV+" points de vie ATTAQUE le gnome qui a "+ d.solide+" solidite\n");
        a.attaque(d);
        System.out.println( a.name +" avec "+a.PDV+" points de vie A ATTAQUE le gnome qui a "+ d.solide+" solidite\n\n");

        System.out.println( c.name +" avec "+c.PDV+" points de vie ATTAQUE le gnome qui a "+ d.solide+" solidite\n");
        c.attaque(d);
        System.out.println( c.name +" avec "+c.PDV+" points de vie A ATTAQUE le gnome qui a "+ d.solide+" solidite\n\n");


        /*Personnage[] bigCrush= new Personnage[10];
        String[] noms= new String[10];
        noms[0]="Gandalf";
        noms[1]="Sauron";
        noms[2]="HarryPotter";
        noms[3]="C3PO";
        noms[4]="Bilbo";
        noms[5]="Aragorn";
        noms[6]="Hagrid";
        noms[7]="Anakin";
        noms[8]="LordVoldemort";
        noms[9]="Palpatine";
        for(int i=0;i<5;i++){
            if (noms[i]=="Gandalf"){bigCrush[i]=new Magicien(400*(float)Math.random(),noms[i]);}
            else{bigCrush[i]= new Monstre(200*(float)Math.random(),noms[i]);}
        }
        for(int i=5;i<10;i++){
            bigCrush[i]= new Sorcier(100*(float)Math.random(),noms[i]);
        }
        /*for(int i=0;i<10;i++){
            bigCrush[i].affiche();
        }//////////////////////////////////////////////////////
        int nb_mort=0;
        while(nb_mort<9){
            int joueur_1=(int)(10*Math.random());
            while(!bigCrush[joueur_1].mort()){
                joueur_1=(int)(10*Math.random());
            }
            int joueur_2=(int)(10*Math.random());
            while(joueur_1==joueur_2 || !bigCrush[joueur_2].mort()){
                joueur_2=(int)(10*Math.random());
            }
            if (nb_mort>=6){
            System.out.println( bigCrush[joueur_1].name +" avec "+bigCrush[joueur_1].PDV+" points de vie ATTAQUE "+ bigCrush[joueur_2].name +" avec "+bigCrush[joueur_2].PDV+" points de vie");}
            bigCrush[joueur_1].attaque(bigCrush[joueur_2]);
            if (nb_mort>=6){
                System.out.println(bigCrush[joueur_1].name +" avec "+bigCrush[joueur_1].PDV+" points de vie A ATTAQUE "+ bigCrush[joueur_2].name +" avec "+bigCrush[joueur_2].PDV+" points de vie");
                System.out.println("\n\n");
            }

            if (!bigCrush[joueur_1].mort()){
                nb_mort+=1;
                bigCrush[joueur_1].affiche();
            }
            if (!bigCrush[joueur_2].mort()){
                nb_mort+=1;
                bigCrush[joueur_2].affiche();
            }
            if(nb_mort==9){
                if (bigCrush[joueur_1].mort()) {
                    System.out.println(bigCrush[joueur_1]);
                    System.out.print("après avoir tué tout le monde hahahah");
                }
                else {//(bigCrush[joueur_2] est vivant
                    System.out.println(bigCrush[joueur_2]);
                    System.out.print("après avoir tué tout le monde hahahah");
                }
            }

        }
    */}

}
