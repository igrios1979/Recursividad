package org.ignacio.rios.rios.ejemplo;

import org.ignacio.rios.rios.ejemplo.models.Componente;

public class EjemploRecursividad {

    public static void main(String[] args) {

          Componente  bano = new Componente("Bano");
          Componente  cocina = new Componente("Cocina");
          Componente  living = new Componente("living");
          Componente  lavadero = new Componente("lavadero");
          /*--------------------------------------------------------*/
        Componente inodoro = new Componente("inodoro");

          Componente botoninodoro = new Componente("boton valvula");
          Componente flotante = new Componente("flotante");

        inodoro.addComponente(botoninodoro);
        inodoro.addComponente(flotante);

          Componente videt = new Componente("videt");
          Componente lavatorio = new Componente("lavatorio");
          Componente ducha = new Componente("ducha");
          /*--------------------------------------------------------*/
        Componente anafe = new Componente("Anafe");
        Componente Alacena = new Componente("Alacena");
        Componente heladera = new Componente("heladera");
        /*-------------------------------------------------------------------*/
        Componente TV = new Componente("tv");
        Componente ratona = new Componente("Mesa ratona");
        Componente Alfombra = new Componente("Alfombra");
        Componente Sillon = new Componente("Sillon");
        /*----------------------------------------------------------------*/
        Componente pileta = new Componente("pileta");
        Componente Lavadora = new Componente("Lavadora");
        Componente Secadora = new Componente("secadora");

        bano.addComponente(inodoro).addComponente(videt).addComponente(lavatorio).addComponente(ducha);
        cocina.addComponente(anafe).addComponente(Alacena).addComponente(heladera);
        living.addComponente(TV).addComponente(ratona).addComponente(Alfombra).addComponente(Sillon);
        lavadero.addComponente(pileta).addComponente(Lavadora).addComponente(Secadora);

        Componente Casa = new Componente("Principal Casa");
        Casa.addComponente(new Componente("cesped"));

        Casa.addComponente(bano)
                .addComponente(cocina)
                .addComponente(living)
                .addComponente(lavadero);

        recursivo(Casa,0);

            }

   /* public static void recursivo(Componente c, String prefijo) {
        System.out.println(prefijo + c.getNombre());
        if (c.tieneHijos()) {
            int numHijos = c.getHijos().size();
            for (int i = 0; i < numHijos - 1; i++) {
                Componente hs = c.getHijos().get(i);
                recursivo(hs, prefijo + "|-");
            }
            Componente ultimoHijo = c.getHijos().get(numHijos - 1);
            recursivo(ultimoHijo, prefijo + "-");
        }
    }*/

    public static void recursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if(c.tieneHijos()){
            for(Componente hijo: c.getHijos()){
                 recursivo(hijo,nivel+1);
                      }
               }

    }


}
