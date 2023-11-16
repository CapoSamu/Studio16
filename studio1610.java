
import java.util.Scanner;

public class studio1610 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Qual è il tuo nome?");
        String nome = scanner.nextLine();
        System.out.println("benvenuto "+ nome);

        System.out.println("ora, avrei bisogno del tuo cognome?");
        String cognome = scanner.nextLine();
        System.out.println("il tuo cognome è "+ cognome);

        System.out.println("Qual è la tua età?");
        int eta= scanner.nextInt();
        scanner.nextLine();
        System.out.println("la tua età "+ eta);


        System.out.println("Dove vivi?");
        String vivi = scanner.nextLine();
        System.out.println("vivi a "+ vivi);

        System.out.println("ora, avrei bisogno del tuo codicefiscale?");
        String codicefiscale = scanner.nextLine();
        System.out.println("il tuo codice fiscale è "+ codicefiscale);
        
       
        System.out.println("Sei fidanzato? (vero/falso)");
        String risposta = scanner.nextLine();

        boolean variabileBooleana;
        
        
        if (risposta.equals("si")||risposta.equals("yes")||risposta.equals("vero")) {
            
            variabileBooleana = true; } 

        else {variabileBooleana = false;} 
        System.out.println(variabileBooleana);

        if (variabileBooleana) 
            {System.out.println("peccato eri cosi carino/a");}
        
        else {System.out.println("ti vuoi mettere con me?");
             }
        
        scanner.nextLine();


        System.out.println(risposta2("Andiamo a cena fuori?",scanner)?"andiamo al McDonald!" : "ok :(");

        
            
        }

    
    public static boolean risposta2(String domanda,Scanner scan){
        System.out.println(domanda);
        String r = scan.nextLine();
            
    
        if ( r.equals("Yes") || r.equals("si")) {return true;}
        else if (r.equals("no")) { return false;}
        else {return risposta2(domanda, scan);}

            
    }
        
        
}
       
    
