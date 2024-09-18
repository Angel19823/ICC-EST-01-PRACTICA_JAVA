
public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Hola Mundo";
        System.out.println(cadena);
        System.out.println("Tamano cadena: ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[1]);
        int edad = 10;

        for(int i=0;i<cadena.length();i++)
        if(i==cadena.length()-1){
            System.out.print(cadena.charAt(i));
        }else{
            System.out.print(cadena.charAt(i)+"-");
        }

        //Contar Palabras
         int palabra = cadena.split(" ").length;
         System.out.println("\nPalabras"+palabra);


         //Contar las a
         int contador = 0;
         for(int j=0;j<cadena.length();j++){
            char letras = cadena.charAt(j);
            if(letras=='a'){
                contador++;
            }
         }
         System.out.println("Letras a: "+contador);
    }
}
