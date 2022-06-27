public class Main {
    public static void main(String[] args) {
        int numeroVariavel = 10;
        final int NUMERO_CCONSTANTE = 10;

        System.out.println(numeroVariavel);
        System.out.println(NUMERO_CCONSTANTE);

        byte b1 = 10;

        short s1 = 20000;

        int i1 = 28500;

        long l1 = 1000000000000000000L;

        float f1 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84D;

        char c1 = 'W';
        char c2 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dbg se DADSADAS #$$¨&* 65135135";

        //String dt1 = "09/02/2022";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
}
    public static void main1 (String[]args){
            //Downcasting -> Com perca de informação
            byte b1;
            short s1 = 1000;
            b1 = (byte) s1;

            //Upcasting -> Sobra espaço
            long l1;
            int i1 = 10;
            l1 = i1;

            //Downcasting -> Com perca de informação
            int i2;
            long l2 = 1000000000000000L;
            i2 = (int) l2;

            //Downcasting -> Sem perca de informação
            int i3;
            long l3 = 10000L;
            i3 = (int) l3;

            //Upcasting
            double d1;
            float f1 = 10.5f;
            d1 = f1;

            //Downcasting -> Com perca de informaçã
            float f2;
            float f3;
            double d2 = 10000.50d;
            f2 = (float) d2;
            double d3 = 10000.50000000000000000000000000000000000000000000000000000000000;
            f3 = (float) d3;

            //Truncar - ignora o decimal e pega só o valor inteiro
            int i4;
            float f4 = 11.5497f;
            i4 = (int) f4;

            System.out.println("b1:" + b1);
            System.out.println("l1:" + l1);
            System.out.println("i2:" + i2);
            System.out.println("i3:" + i3);
            System.out.println("d1:" + d1);
            System.out.println("f2:" + f2);
            System.out.println("f3:" + f3);
            System.out.println("f4:" + f4);

            b1 = (byte) d3;
            System.out.println("b1:" + b1);


    }
}
