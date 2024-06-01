package org.example;

import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");
        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();

            Domicilio domicilio1 = new Domicilio("San Juan", 2030);
            Cliente cliente1 = new Cliente("Pablo", "Lima", 43829992);
            cliente1.setDomicilio(domicilio1);
            domicilio1.setCliente(cliente1);

            Domicilio domicilio2 = new Domicilio("San Juan", 2032);
            Cliente cliente2 = new Cliente("Andres", "Bercich", 44503011);
            cliente2.setDomicilio(domicilio2);
            domicilio2.setCliente(cliente2);
            em.persist(cliente1);
            em.persist(cliente2);

            //Domicilio dom1 = em.find(Domicilio.class, 2L);
            //Cliente cli1 = em.find(Cliente.class, 1L);

            //System.out.println(dom1.getCliente().getNombre());
            //System.out.println(cli1.getDomicilio().getNombreCalle());

            Factura factura1 = new Factura("22/11/2001", 10);
            Factura factura2 = new Factura("16/6/2024", 11);

            Categoria categoria1 = new Categoria("Bebidas");
            Categoria categoria2 = new Categoria("Limpieza");

            Articulo articulo1 = new Articulo(10, 50, "Coca cola");

            //UNIDIRECCIONALIDAD
            //articulo1.addCategoria(categoria1);
            //articulo1.addCategoria(categoria2);

            //BIDIRECCIONALIDAD
            categoria1.addArticulo(articulo1);

            DetalleFactura detalleFactura1 = new DetalleFactura(1, 20, factura1, articulo1);
            DetalleFactura detalleFactura2 = new DetalleFactura(10, 2100, factura1, articulo1);

            factura1.setCliente(cliente1);
            factura2.setCliente(cliente2);

            //factura1.addDetalleFactura(detalleFactura1);
            //factura1.addDetalleFactura(detalleFactura2);


            //em.persist(factura1);
            //em.persist(factura2);
            em.persist(detalleFactura1);
            em.persist(detalleFactura2);

            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
        emf.close();
    }
}