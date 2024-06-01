//import EjercicioUno.*;

//import EjercicioDos.*;

//import EjercicioTres.Pais.*;
//import EjercicioTres.Calculo.*;
//import EjercicioTres.Impuestos.*;

//import EjercicioCuatro.*;

import EjercicioCinco.*;

//import EjercicioSiete.Codigo.*;
//import EjercicioSiete.Federacion.*;
//import EjercicioSiete.Persona.*;
//import EjercicioSiete.Prueba.*;

//import EjercicioOcho.Persona.*;
//import EjercicioOcho.Acciones.*;
//import EjercicioOcho.Aeropuerto.*;

//import EjercicioNueve.Arte.*;
//import EjercicioNueve.EstadoArte.*;
//import EjercicioNueve.Coleccion.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        /*Triangulo t1 = new Triangulo(3,
                new Lado(1,2,3,4),
                new Lado(4,6,8,10),
                new Lado(5,7,9,11));

        t1.mostrarLados();*/

        //EJERCICIO 2
        /*Continente c1 = new Continente("America");

        c1.tienePais(new Pais("Argentina"));
        c1.tienePais(new Pais("Brazil"));
        c1.tienePais(new Pais("Chile"));

        c1.getPaises().get(0).tieneProvincia(new Provincia("Mendoza"));
        c1.getPaises().get(0).tieneProvincia(new Provincia("Cordoba"));

        Capital cap1 = new Capital(20000.11, "Buenos Aires");

        c1.getPaises().get(0).esCapital(cap1);

        c1.getPaises().get(0).paisLimita(c1.getPaises().get(1));

        c1.getPaises().get(0).getProvincias().get(0).ciudadesTiene(new Ciudad(false, "San Rafael"));
        c1.getPaises().get(0).getProvincias().get(0).ciudadesTiene(new Ciudad(false, "Tunuyan"));

        c1.getPaises().get(0).getProvincias().get(0).paisLimita(c1.getPaises().get(2));

        c1.getPaises().get(0).getProvincias().get(0).provinciaLimita(c1.getPaises().get(0).getProvincias().get(1));*/

        //EJERCICIO 3
        /*ImpuestoUno iuno1 = new ImpuestoUno(1, 1000);
        ImpuestoDos idos1 = new ImpuestoDos(2, 1000);
        ImpuestoTres itres1 = new ImpuestoTres(3, 1000);
        ImpuestoCuatro icuatro1 = new ImpuestoCuatro(4, 1000);
        ImpuestoCinco icinco1 = new ImpuestoCinco(5, 1000);

        Gastos g1 = new Gastos("Detalle 1", 10, 500);
        Gastos g2 = new Gastos("Detalle 2", 11, 1500);
        Gastos g3 = new Gastos("Detalle 3", 12, 900);

        CalculoFiscal cf1 = new CalculoFiscal(g1, iuno1);
        CalculoFiscal cf2 = new CalculoFiscal(g2, idos1);
        CalculoFiscal cf3 = new CalculoFiscal(g3, itres1);

        Pais paisUno = new Pais("Argentina");

        paisUno.provinciasTiene(new Provincia(20, "Mendoza"));
        paisUno.provinciasTiene(new Provincia(21, "Cordoba"));
        paisUno.provinciasTiene(new Provincia(22,"Santa Fe"));

        paisUno.getProvincias().get(0).ciudadesTiene(new Ciudad(1000, 30, "Las Heras"));
        paisUno.getProvincias().get(0).ciudadesTiene(new Ciudad(2000, 31, "San Rafael"));
        paisUno.getProvincias().get(0).ciudadesTiene(new Ciudad(3000, 32, "Godoy Cruz"));

        paisUno.getProvincias().get(0).getCiudades().get(0).setCalculoFiscal(cf1);
        paisUno.getProvincias().get(0).getCiudades().get(1).setCalculoFiscal(cf2);
        paisUno.getProvincias().get(0).getCiudades().get(2).setCalculoFiscal(cf3);

        paisUno.getProvincias().get(0).definirEstado();

        System.out.println(paisUno.getProvincias().get(0).isDeficitEstado());*/

        //EJERCICIO 4
        /*Mineral m1 = new Mineral("Hierro");
        Mineral m2 = new Mineral("Zinc");
        Mineral m3 = new Mineral("Calcio");

        Lote l1 = new Lote(10,true);

        l1.agregarMineral(m2);
        l1.agregarMineral(m3);

        l1.sembrar();
        l1.setTipoLote();

        System.out.println(l1.getCereal());
        System.out.println(l1.getTipoLote());

        Lote l2 = new Lote(15, false);

        l2.agregarMineral(m2);

        l2.setTipoLote();

        l2.sembrar();

        System.out.println(l2.getCereal());
        System.out.println(l2.getTipoLote());*/

        //EJERCICIO 5
        /*Ciudad c1 = new Ciudad("Mendoza");
        Restaurante r1 = new Restaurante(5, "Zito");

        r1.sucursalesTiene(new Sucursal("Cangallo 3011"));
        r1.sucursalesTiene(new Sucursal("Videla Castillo 2214"));

        PlatoComida pc1 = new PlatoComida("Milanesas", 5);
        PlatoComida pc2 = new PlatoComida("Arroz", 3);

        r1.getSucursales().get(0).agregarComida(pc1);
        r1.getSucursales().get(0).agregarComida(pc2);

        Persona p1 = new Persona(43829992, "Pablo Lima");

        p1.comioPlato(pc1);
        p1.comioPlato(pc2);
        p1.sucursalesVisitadas(r1.getSucursales().get(0));
        p1.sucursalesVisitadas(r1.getSucursales().get(1));

        System.out.println(r1.getSucursales().get(0).servir(pc1, p1, 5));*/

        //EJERCICIO 7
        /*Date fechaNacimientoUno = new Date(2001, 3, 4);
        Esquiador esqui1 = new Esquiador(43829992, 22, fechaNacimientoUno, "Pablo Lima", 1);

        Date fechaNacimientoDos = new Date(2005, 10, 20);
        Esquiador esqui2 = new Esquiador(32110492, 20, fechaNacimientoDos, "Andres Vercich", 2);

        Date fechaNacimientoTres = new Date(2000, 8, 10);
        Esquiador esqui3 = new Esquiador(11434920, 25, fechaNacimientoTres, "Santiago Comeglio", 3);

        Date fechaNacimientoCuatro = new Date(1998, 12, 1);
        Esquiador esqui4 = new Esquiador(44482123, 25, fechaNacimientoCuatro, "Ulises Guzman", 4);

        Date fechaNacimientoCinco = new Date(1970, 4, 26);
        Entrenador entr1 = new Entrenador(11032343, 50, fechaNacimientoCuatro, "Federico Cappelo", 30);

        Esquiador[] esquiadores = {esqui2, esqui3, esqui4};

        Equipo equi1 = new Equipo("Boca Juniors", esquiadores);
        equi1.agregarEntrenador(entr1);

        Pista pista1 = new Pista(Dificultad.AMARILLO, 10);
        Pista pista2 = new Pista(Dificultad.ROJO, 20);
        Pista pista3 = new Pista(Dificultad.VERDE, 5);

        Date fechaEventoUno = new Date(2024, 4,4);
        PruebaIndividual pi1 = new PruebaIndividual("Prueba Montañismo",1, TipoPrueba.FONDO, 3, fechaEventoUno,"Pablo Lima");

        Date fechaEventoDos = new Date(2024, 5,4);
        String[] podioEquipos = new String[]{"Boca Juniors", "River Plate", "San Lorenzo"};

        PruebaPorEquipo pu1 = new PruebaPorEquipo("Caida por la montaña", 2, TipoPrueba.SLALOM, 3, fechaEventoDos, podioEquipos);

        CodigoEsquiador ce1 = new CodigoEsquiador(10, esqui1, "Prueba Montañismo", pi1);
        System.out.println(ce1.getPrueba().getNombrePrueba());

        CodigoEquipo cequi1 = new CodigoEquipo(equi1, 10, pu1);
        System.out.println(cequi1.getEquipo().getEntrenador().getNombre());

        Estacion e1 = new Estacion("A1", 1233, 3.5, "Estacion 1", "Maximiliano Fernandez", 155410002);
        e1.agregarPistas(pista1);
        e1.agregarPistas(pista2);

        e1.mostrarPistas();

        Estacion e2 = new Estacion("A2", 4489, 4.9, "Estacion 2", "Santiago Puche", 435668807);
        e2.agregarPistas(pista3);

        Federacion f1 = new Federacion("Federacion de esqui Argentina");
        f1.estacionesControladas(e1);
        f1.estacionesControladas(e2);

        f1.mostrarEstaciones();*/

        //EJERCICIO 8
        /*Piloto p1 = new Piloto(1234, "Pablo Lima", "Osep", 155410002, 43);
        p1.capacitarPiloto(TipoAvion.COMERCIAL);
        p1.capacitarPiloto(TipoAvion.GUERRA);

        p1.mostrarCapacitaciones();

        Date turnoUno = new Date(2001, 3, 4);
        Mecanico m1 = new Mecanico(1642, "Fede Cappelo", "Osde", 6524414, 60000, turnoUno);

        m1.capacitarMecanico(TipoAvion.TRANSPORTE);
        m1.mostrarCapacitaciones();

        Propietario pro1 = new Propietario(7521, "Andres Vercich", "Swiss", 4305519,1000000);

        Avion a1 = new Avion(60,"A1",5000,TipoAvion.COMERCIAL);
        Avion a2 = new Avion(3,"A2",3000,TipoAvion.GUERRA);

        Hangar h1 = new Hangar(10, "HANG1","Aeropuerto de Mendoza");
        h1.meterAvion(a1);
        h1.meterAvion(a2);

        h1.mostrarAviones();

        Date compraUno = new Date(2024, 10, 22);
        FechaAdquisicion fa1 = new FechaAdquisicion(a1, compraUno, pro1);
        System.out.println(fa1.getPropietario().getNombre());

        Date mantenimientoUno = new Date(2012, 2, 4);
        Mantenimiento mant1 = new Mantenimiento(a2,mantenimientoUno,4,m1,"Arreglo de motor");
        System.out.println(mant1.getAvion().getMatricula());*/

        //EJERCICIO 9
        /*Date fechaNacimientoUno = new Date(2001, 4, 23);
        Date fechaDefuncionUno = new Date(2024, 7, 4);
        Artista a1 = new Artista("Gran artista", Epoca.NEOCLASICO, Cultura.EGIPCIO, fechaNacimientoUno, fechaDefuncionUno, "Pablo Lima", "Argentina");

        Date fechaNacimientoDos = new Date(1550, 1, 30);
        Artista a2 = new Artista("Gran artista vivo", Epoca.OTROS, Cultura.ROMANO, fechaNacimientoDos, "Fede Cappelo", "Italia");

        Date añoCreacionUno = new Date(1440, 10,23);
        Pintura p1 = new Pintura(añoCreacionUno, a1, "Pintura Linda", "P1", "Bolivia", "Pintura Inca", "oleo", "papel", "Vanguardista");

        Date añoCreacionDos = new Date(2001, 7,6);
        Escultura e1 = new Escultura(añoCreacionDos, a1, "Escultura Linda", "P2", "Brazil", "Escultura Carioca", 2.5, "Clasico", Material.MADERA, 100.3);

        Date añoCreacioTres = new Date(1990, 15,6);
        Otros o1 = new Otros(añoCreacioTres, a2,"Cosa linda", "P3", "Italia", "Cosa romana");

        Date fechaDevolucionUno = new Date(2003, 3,2);
        Date fechaRecibidaUno = new Date(2000,1,3);
        Prestamo pres1 = new Prestamo(fechaDevolucionUno, fechaRecibidaUno, "Coleccion 1");

        Date fechaAdquisicionUno = new Date(2033, 12,10);
        Permanente per1 = new Permanente(10000, TipoPermanente.ALMACEN, fechaAdquisicionUno);

        Date fechaAdquisicionDos = new Date(2013, 2,14);
        Permanente per2 = new Permanente(12000, TipoPermanente.EXPOSICION, fechaAdquisicionDos);

        p1.esPrestamo(pres1);
        e1.esPermanente(per1);
        o1.esPermanente(per2);

        ArrayList <ObjetoArte> objetosArtes = new ArrayList<>();
        objetosArtes.add(p1);
        objetosArtes.add(e1);
        objetosArtes.add(o1);

        ColeccionObras co1 = new ColeccionObras("Coleccion 1", "Cangallo 1111", TipoMuseo.COLECCION_PRIVDA,"Colecion Guzman", objetosArtes, "Santiago Comeglio",6524414);

        co1.mostrarObjetosArte();

        Date fechaComienzoUno = new Date(2023, 4, 7);
        Exposicion expo1 = new Exposicion(fechaComienzoUno, "Expo Martinez");

        expo1.mostrarColeccion(co1);*/
    }
}