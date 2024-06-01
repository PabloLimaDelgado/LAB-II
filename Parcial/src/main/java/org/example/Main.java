package org.example;

import org.example.entities.articles.ArticleManufactured;
import org.example.entities.articles.ArticleManufacturedDetail;
import org.example.entities.articles.InputArticle;
import org.example.entities.articles.MeasuringUnit;
import org.example.entities.enums.*;
import org.example.entities.persons.Client;
import org.example.entities.persons.Employee;
import org.example.entities.Image;
import org.example.entities.persons.User;
import org.example.entities.places.*;
import org.example.entities.promotions.DetailPromotion;
import org.example.entities.promotions.Promotion;
import org.example.entities.purchases.DetailRequest;
import org.example.entities.purchases.Category;
import org.example.entities.purchases.Request;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            //CREO UN EMPLEADO CON SU USUARIO E IMAGEN
            Employee employee1 = new Employee("Pablo", "Lima", "2616524414", "limapablomdz@gmail.com", "2001-11-22", Role.COCINERO);
            Image image1 = new Image("pabloLima.png");
            User user1 = new User("Pablo2616524414", "PabloLima22");

            employee1.setImagePerson(image1);
            employee1.setUser(user1);

            em.persist(employee1);
            em.persist(image1);
            em.persist(user1);

            //CREO UN CLIENTE CON SU USUARIO E IMAGEN
            Client client1 = new Client("Federico", "Cappelo", "2616049935", "cappe@gmail.com", "20-04-22", Role.CLIENTE);
            Image image2 = new Image("cappelo.png");
            User user2 = new User("Cape2616049935", "antito123");

            client1.setImagePerson(image2);
            client1.setUser(user2);
            em.persist(client1);
            em.persist(image2);
            em.persist(user2);

            //CREO UNA SUCURSAL
            Branch branch1 = new Branch("Central Branch", LocalTime.of(9, 0), LocalTime.of(17, 0),true);

            branch1.addEmployee(employee1);
            employee1.setBranch(branch1);

            em.persist(branch1);

            //CREO PEDIDOS
            Request request1 = new Request(LocalTime.of(20, 10, 12), 200.1, State.ENTREGADO, ShipmentType.DELIVERY, PaymentForm.HAPPYHOUR, LocalDate.of(2024, 5, 22));
            Request request2 = new Request(LocalTime.of(10, 30, 00), 1006.40, State.CANCELADO, ShipmentType.TAKEAWAY, PaymentForm.HAPPYHOUR, LocalDate.of(2024, 5, 20));
            Request request3 = new Request(LocalTime.of(15, 45, 06), 770.0, State.PENDIENTE, ShipmentType.DELIVERY, PaymentForm.PROMOCION1, LocalDate.of(2024, 5, 10));

            branch1.addRequest(request1);
            branch1.addRequest(request2);
            branch1.addRequest(request3);

            request1.setBranch(branch1);
            request2.setBranch(branch1);
            request3.setBranch(branch1);

            //AÑADO LOS PEDIDOS AL CLIENTE
            client1.addRequest(request1);
            client1.addRequest(request2);
            client1.addRequest(request3);
            request1.setClient(client1);
            request2.setClient(client1);
            request3.setClient(client1);

            em.persist(request1);
            em.persist(request2);
            em.persist(request3);

            //CREO PAISES, PROVINCIAS, LOCALIDADES Y DOMICILIOS
            Country country1 = new Country("Argentina");
            Province province1 = new Province("Mendoza");
            Locality locality1 = new Locality("Unimev");
            Locality locality2 = new Locality("Ciudad");
            Adress adress1 = new Adress("Cangallo", 3011, 5501);
            Adress adress2 = new Adress("Pedro Molina", 83, 5500);
            Adress adress3 = new Adress("San Martin", 3033, 5500);

            //RELACION PROVINCIA - PAIS
            country1.addProvince(province1);
            province1.setCountry(country1);

            //RELACION LOCALIDAD - PROVNCIA
            province1.addLocality(locality1);
            province1.addLocality(locality2);
            locality1.setProvince(province1);
            locality2.setProvince(province1);

            //RELACION DIRECCIONES - LOCALIDAD
            locality1.addAdress(adress1);
            locality1.addAdress(adress2);
            locality2.addAdress(adress3);
            adress1.setLocality(locality1);
            adress2.setLocality(locality1);
            adress3.setLocality(locality2);

            //RELACION SUCURSAL - DIRECCIONES
            branch1.setAdress(adress3);

            //RELACION PEDIDO - DIRECCIONES
            adress1.addRequest(request1);
            adress1.addRequest(request2);
            adress2.addRequest(request3);
            request1.setAdress(adress1);
            request2.setAdress(adress1);
            request3.setAdress(adress2);

            em.persist(province1);
            em.persist(locality1);
            em.persist(adress1);
            em.persist(adress2);
            em.persist(adress3);

            //CREO LA COMPAÑIA Y RELACION EMPRESA - SUCURSAL
            Company company1 = new Company("Maccdonals", "Sociedad Anonima", 2001013);
            company1.addBranch(branch1);
            branch1.setCompany(company1);

            em.persist(company1);

            //DETALLE PEDIDO Y RELACION CON PEDIDO
            DetailRequest detailRequest1 = new DetailRequest(10, 100.5);
            DetailRequest detailRequest2 = new DetailRequest(1, 150.1);

            detailRequest1.setRequest(request1);
            detailRequest2.setRequest(request1);

            request1.setTotalCost(detailRequest1.getSubtotal() + detailRequest2.getSubtotal());
            request1.addDetailRequest(detailRequest1);
            request1.addDetailRequest(detailRequest2);

            em.persist(detailRequest1);
            em.persist(detailRequest2);

            //CRACION CATEGORIA
            Category category1 = new Category("Bebidas");
            Category category2 = new Category("Coca colas");
            Category category3 = new Category("Jugos");
            Category category4 = new Category("Comidas");

            category1.addCategory(category2);
            category2.addCategory(category3);

            category2.setCategoryDad(category1);
            category3.setCategoryDad(category1);

            em.persist(category1);
            em.persist(category2);
            em.persist(category3);
            em.persist(category4);

            //RELACION CATEGORIAS SUCURSALES
            category1.addBranches(branch1);
            category4.addBranches(branch1);

            //CREACION ARTICULO MANUFACTURADO
            ArticleManufactured articleManufactured1 = new ArticleManufactured("Pizza", 200.4, "Comida para perro", 30, "Cocinar 30 en fuego lento");
            Image image3 = new Image("pizza.png");
            articleManufactured1.addImage(image3);
            articleManufactured1.setCategory(category4);

            em.persist(articleManufactured1);
            em.persist(image3);

            //CREACION ARTICULO INSUMO
            InputArticle inputArticle1 = new InputArticle("lomo",300.3, 400.0,15,20,false);
            Image image4 = new Image("lomo.png");

            inputArticle1.addImage(image4);
            articleManufactured1.setCategory(category4);

            em.persist(inputArticle1);
            em.persist(image4);

            //CREACION ARTICULO MANUFACTURADO DETALLE
            ArticleManufacturedDetail articleManufacturedDetail1 = new ArticleManufacturedDetail(10);
            ArticleManufacturedDetail articleManufacturedDetail2 = new ArticleManufacturedDetail(20);
            ArticleManufacturedDetail articleManufacturedDetail3 = new ArticleManufacturedDetail(35);

            articleManufacturedDetail1.setInputArticle(inputArticle1);

            articleManufactured1.addArticleManufacturedDetail(articleManufacturedDetail2);
            articleManufactured1.addArticleManufacturedDetail(articleManufacturedDetail3);

            articleManufacturedDetail2.setArticleManufactured(articleManufactured1);
            articleManufacturedDetail3.setArticleManufactured(articleManufactured1);

            em.persist(articleManufacturedDetail1);
            em.persist(articleManufacturedDetail2);
            em.persist(articleManufacturedDetail3);

            //CREACION UNIDAD MEDIDA
            MeasuringUnit measuringUnit1 = new MeasuringUnit("kilos");

            articleManufactured1.setMeasuringUnit(measuringUnit1);
            inputArticle1.setMeasuringUnit(measuringUnit1);

            em.persist(measuringUnit1);

            //CREACION PROMOCION
            Promotion promotion1 = new Promotion("Summer Sale", LocalDate.of(2024, 6, 1),LocalDate.of(2024, 6, 30), LocalTime.of(9, 0), LocalTime.of(21, 0),"20% off on all items",49.99, PromotionType.EFECTIVO);
            Image image5 = new Image("promo1.png");

            promotion1.addImages(image5);
            promotion1.addBranches(branch1);

            em.persist(promotion1);
            em.persist(image5);

            //CREACION DETALLES PROMOCION
            DetailPromotion detailPromotion1 = new DetailPromotion(10);
            DetailPromotion detailPromotion2 = new DetailPromotion(20);

            detailPromotion1.setPromotion(promotion1);
            detailPromotion2.setPromotion(promotion1);

            detailPromotion1.setArticle(inputArticle1);
            detailPromotion2.setArticle(articleManufactured1);

            inputArticle1.addDetailPromotion(detailPromotion1);
            articleManufactured1.addDetailPromotion(detailPromotion2);

            em.persist(detailPromotion1);
            em.persist(detailPromotion2);

            em.getTransaction().commit();
            //em.flush();
        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println("Error al cargar");
            System.out.println(e.getMessage());
        }
        em.close();
        emf.close();
    }
}