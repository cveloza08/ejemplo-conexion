/**
 * 
 */
package uan.edu.co.conexionjpasql.entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author veloz
 *
 */
public class CRUDOperations {

	//este método me inserta un dato
	public void insertEntity() {
		//es una interfaz declarada = 
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

	//este metodo lo busca /consulta
    public void findEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    //este método actualiza un dato en la BD
    public void updateEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        // The entity object is physically updated in the database when the transaction
        // is committed
        student.setFirstName("Ram");
        student.setLastName("jadhav");
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    //este método elimina un dato de la DB
    public void removeEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());
        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
	
	
}
