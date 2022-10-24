public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;
        int numeroWhile = 0;
        String estacion = "Invierno";


        if(numeroIf > 0){
            System.out.println("El número es positivo");
        } else if(numeroIf == 0){
            System.out.println("El número es igual a 0");
        } else {
            System.out.println("El numero es negativo");
        }

       while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println("Soy el do While: " +numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "Verano":{
                System.out.println("La estación es verano");
                break;
            }
            case "Invierno":{
                System.out.println("La estación es invierno");
                break;
            }
            case "Otoño":{
                System.out.println("La estación es otoño");
                break;
            }
            case "Primavera":{
                System.out.println("La estación es primavera");
                break;
            }
            default:{
                System.out.println("No es una estación");
                break;
            }

        }



    }
}