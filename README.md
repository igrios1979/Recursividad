
***Una clase recursiva en Java es una clase que se llama a sí misma*** dentro de sus propios métodos. Esto se utiliza comúnmente en algoritmos que necesitan repetir una tarea varias veces, pero con diferentes parámetros en cada iteración.

Aquí te muestro un ejemplo de una clase recursiva en Java que calcula el factorial de un número:


        public  class  Factorial 
        { public  static  void  main(String[] args) 
        { int  num  =  5;
         int  resultado  = factorial(num); 
         System.out.println("El factorial de " + num + " es " + resultado); 
    } 
    
    public  static  int  factorial(int n) {
     if (n == 1) { return  1;
      } else { return n * factorial(n - 1);
       } } }
