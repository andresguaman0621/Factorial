public class Factorial {
    public int factorialIterativo(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {

            factorial *=i;
        }
        return factorial;
    }

    public int factorialRecursivo(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorialRecursivo(n-1);
        }
    }

    public int sumaNumeros(int limite){
        int resultado = 0;
        for(int i=0;i<=limite;i++){

            resultado = resultado + (limite-i);
        }
        return resultado;
    }

    public int sumasRecursividad(int limite){
        int resultado = 0;
        if(limite == 1){
            return 1;
        }else{
            return limite + sumasRecursividad(limite-1);
        }

    }

    public int sumasImpares(int limite){
        int resultado = 0;
        for(int i=0;i<=limite;i++){
            if(resultado%2 !=0){
                resultado = resultado + (limite-i);
            }

            else{
                resultado = resultado;
            }
        }
        return resultado;
    }
}
