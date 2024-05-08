public class ResultadoEscolar {
    public static void main(String[] args) {
        
        //BLOCO COMPOSTO
        // int nota = 7;

        // if (nota >= 7)
        //     System.out.println("Aprovado");
        
        // else
        //     System.out.println("Reprovado");
    
    
        //BLOCO ENCADEADO
    //     int nota = 4;

    //     if (nota >=7)
    //     System.out.println("Aprovado");
        
    //     else if (nota >= 5 && nota < 7)
    //     System.out.println("Prova de Recuperação");

    //     else
    //     System.out.println("Reprovado");    
    // 

    //CONDICÇAO TERNARIA
    // int nota = 7;
    // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    // System.out.println(resultado);


    int nota = 4;
    String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" :"Reprovado";
    System.out.println(resultado);

}
}