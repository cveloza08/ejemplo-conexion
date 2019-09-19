/**
 * 
 */
package uan.edu.co.conexionjpasql.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author veloz
 *
 */

//entonces, acá empezamos a usar anotaciones para mapear la clase
@Entity
@Table(name="estudiante") //acá le dice que la tabla que cree es de nombre estudiante
public class Student {

	
	//toda tabla tiene una llave primaría, eso lo tiene que indicar aca.
	@Id //le indica a JPA que el PRIMER CAMPo o sea id, será un identificador de tabla
	@GeneratedValue (strategy = GenerationType.IDENTITY)//para este casoi no la usamos auto sino entity
	@Column(name = "id") //indica que es un atributo de tabla que es una columna
	private int id;
	@Column(name = "primerNombre")
	private String firstName; //el primer nombre
	@Column(name = "apellido")
	private String lastName; //el apellido
	@Column(name = "correo") //el name="" indica el nombre del atributo en SQL
	private String email; //un correo
	
	
	//Constructor vacio para que hibernate no ponga problema con el @Entity
	public Student() {
		
	}
	
	//Constructor con un atributo menos (el id) ya que es autogenerado
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
}
