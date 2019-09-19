/**
 * 
 */
package uan.edu.co.conexionjpasql;

import uan.edu.co.conexionjpasql.entidades.CRUDOperations;

/**
 * @author veloz
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos un objeto de CRUDOperation
		CRUDOperations crud = new CRUDOperations();
		
		
		//llamamos a los métodos, tener encuenta que en los métodos ya hay iniciaciones
		//de la clase estudiante, si desea cambiarse el modo, debe usar los setters y getters
		crud.insertEntity(); //inserta el objeto definido en método
		crud.findEntity(); //busca un objeto de la bd que ya esta definido en este método
		crud.updateEntity(); //actualiza los datos del objeto en la bd
		crud.removeEntity(); //elimina un registro en la bd con los datos del objeto

	}

}
