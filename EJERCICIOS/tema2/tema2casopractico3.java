public class tema2casopractico3 {
    public static void main(String[] args) {
       int miEntero1;
       int miEntero2;
       boolean escorrecto;
       int resultadosuma;
       int resultadoresta;
       int resultadodivision;
       int resultadomultiplicacion;

       miEntero1 = 1;
       miEntero2 = 2;
       escorrecto = false;
       resultadosuma = miEntero1 + miEntero2;
       resultadoresta = miEntero1 - miEntero2;
    resultadodivision = miEntero1 / miEntero2;
    resultadomultiplicacion = miEntero1 * miEntero2;

     escorrecto = (resultadosuma > resultadoresta);

       System.out.println("---mientero1: " + miEntero1);
       System.out.println("---mientero2: " + miEntero2);
       System.out.println("---resultadosuma: " + resultadosuma);
       System.out.println("---resultadoresta: " + resultadoresta);
       System.out.println("---resultadodivision: " + resultadodivision);
       System.out.println("---resultadomultiplicacion: " + resultadomultiplicacion);
       System.out.println("---escorrecto: " + escorrecto);

    }
}
