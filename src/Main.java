import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        preencherEpsilon(-3);
        preencherFuncao(3,-9,0,1,0,0);
        System.out.println(resolverFuncao(-4));

    }

    static float t0 = 0; //termo independente da função
    static float t1 = 0;
    static float t2 = 0;
    static float t3 = 0;
    static float t4 = 0;
    static float t5 = 0;
    static float epsilon;


    public static void preencherFuncao(float a0, float a1, float a2, float a3, float a4, float a5){
        t0 = a0;
        t1 = a1;
        t2 = a2;
        t3 = a3;
        t4 = a4;
        t5 = a5;
    }

    public static float preencherEpsilon(int n){
        epsilon = 10 ^ n;
        return epsilon;
    }

    public static float resolverFuncao(float x){
        System.out.println(Math.pow(x,5) * t5);
        System.out.println(Math.pow(x,4) * t4);
        System.out.println(Math.pow(x,3) * t3);
        System.out.println(Math.pow(x,2) * t2);
        System.out.println(x * t1);
        System.out.println(t0);


        return (float) (Math.pow(x,5) * t5 + Math.pow(x,4) * t4 + Math.pow(x,3) * t3 + Math.pow(x,2) * t2 + x * t1 + t0);
    }

    /**
     * Acha os intervalos dos zeros da função
     *
     * @return intervalos com os inteiros
     */
    public static ArrayList<Integer[]> acharIntervalos(){


        ArrayList<Integer[]> intervalos = new ArrayList<>();
        Integer[] intervalo;

        for(int i = -10; i <10;i++){
            intervalo = new Integer[2];
            //System.out.println(resolverFuncao(i));
            //System.out.println(resolverFuncao(i-1));
            if(resolverFuncao(i)*resolverFuncao(i-1)<0){
                intervalo[0] = i-1;
                intervalo[1] = i;
                intervalos.add(intervalo);
            }
        }
        return intervalos;
    }

    public static Float refinarValores(Integer[] intervalo){

        float a = intervalo[0];
        float b = intervalo[1];

        while(Math.abs(b-a)>epsilon){
            float aux = ((b-a)/2);

            if(resolverFuncao(aux)*resolverFuncao(a)<0){
                b = aux;
            }else {
                a = aux;
            }
        }

        if(Math.abs(b)<Math.abs(a)){
            return b;
        }else {
            return a;
        }


    }

    //|b-a| < epsilon

}
