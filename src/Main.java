public class Main {

    public static void main(String[] args) {



    }

    static float x0 = 0; //termo independente da função
    static float x1 = 0;
    static float x2 = 0;
    static float x3 = 0;
    static float x4 = 0;
    static float x5 = 0;
    static float epsilon;


    public static void preencherFuncao(float a0, float a1, float a2, float a3, float a4, float a5){
        x0 = a0;
        x1 = a1;
        x2 = a2;
        x3 = a3;
        x4 = a4;
        x5 = a5;
    }

    public static float preencherEpsilon(int n){
        epsilon = 10 ^ n;
        return epsilon;
    }

    public static float resolverFuncao(float x){
        return x * x5 + x * x4 + x * x3 + x * x2 + x * x1 + x0;
    }

    public static float[][] acharIntervalos(){

        for(int i = -99; i <100;i++){

        }
    }

}
