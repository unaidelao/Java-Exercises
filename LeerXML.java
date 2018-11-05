import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeerXML {
	
	public static void leerXML() {
		
		// instancia de DocumentBuilderFactory para construir el parser
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try {
        	DocumentBuilder builder = factory.newDocumentBuilder();
        	Document document = builder.parse(new File("Empleados.xml"));
        	document.getDocumentElement().normalize();
        	
        	System.out.println("Elemento raíz: " + document.getDocumentElement().getNodeName());
        	
        	// lista de todos los nodos <empleado>
        	NodeList empleados = document.getElementsByTagName("empleado");
        	
        	// recorremos la lista de nodos
        	for (int i = 0; i < empleados.getLength(); i++) {
        		Node emple = empleados.item(i); // obtenemos un nodo
        		if(emple.getNodeType() == Node.ELEMENT_NODE) { // tipo de nodo
        			Element elemento = (Element) emple; // obtenemos los elementos del nodo
        			System.out.println("ID: " + getNodo("id", elemento));
        			System.out.println("Apellido: " + getNodo("apellido", elemento));
        			System.out.println("Departamento: " + getNodo("departamento", elemento));
        			System.out.println("Salario: " + getNodo("salario", elemento));
        		}
        	}
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	/*
	 * Método para obtener la información de un nodo
	 */
	private static String getNodo(String etiqueta, Element elem) {
		NodeList nodo = elem.getElementsByTagName(etiqueta).item(0).getChildNodes();
		Node valorNodo = (Node) nodo.item(0);
		return valorNodo.getNodeValue();
	}
}
