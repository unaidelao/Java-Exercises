import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CrearXML {
	
	public static void crearXML() throws IOException {
		
		File fichero = new File("prueba.dat");

        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        int id, departamento, posicion;
        double salario;

        char[] apellido = new char[10];

        char aux;
        
        posicion = 0;
        
        // instancia de DocumentBuilderFactory para construir el parser
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try {
        	DocumentBuilder builder = factory.newDocumentBuilder();
        	
        	// creamos documento vacío de nombre "document" con nodo raíz "Empleados" y le asignamos la versión XML
        	DOMImplementation implementation = builder.getDOMImplementation();
        	Document document = implementation.createDocument(null, "Empleados", null);
        	document.setXmlVersion("1.0");
        	
        	/*
        	 * Recorro el fichero .dat y, por cada registro, se crea un nodo "empleado" con
        	 * cuatro nodos hijo (id, apellido, dep, salario).
        	 * 
        	 * Para crear un elemento usamos createElement(String) pasando por parámetro el
        	 * nombre, que va entre etiquetas <>.
        	 * 
        	 * El siguiente código crea y añade el nodo <empleado> al documento xml.
        	 */
        	while (true) {
	        	file.seek(posicion); 
	            id = file.readInt(); // obtendo el id de la persona
	            for (int i = 0; i < apellido.length; i++) {
	                aux = file.readChar(); // se irá recorriendo todos los caracteres del apellido
	                apellido[i] = aux; // y añadiéndolos al array de caracteres apellido
	            }
	            String apellidoMontado = new String(apellido); // convierto a String el array de caracteres
	            departamento = file.readInt(); // obtengo el departamento
	            salario = file.readDouble(); // obtengo el salario
	            
	            if (id > 0) {
	            	// se crea el nodo raíz <empleado>.
	            	Element raiz = document.createElement("empleado");
	            	// se añade a la raíz del documento
	            	document.getDocumentElement().appendChild(raiz);
	            	
	            	// se añaden los nodos hijo (cada empleado en sí) con nuestro propio método crearElemento()
	            	crearElemento("id", Integer.toString(id), raiz, document);
	            	crearElemento("apellido", apellidoMontado.trim(), raiz, document);
	            	crearElemento("departamento", Integer.toString(departamento), raiz, document);
	            	crearElemento("salario", Double.toString(salario), raiz, document);
	            	
	            }
	            posicion += 36; // actualización del valor para posicionarme en el siguiente registro. Cada persona ocupa 36 bytes: 4+20+4+8
	            
	            // si se llega al final del archivo .dat, se sale del bucle infinito
	            if (file.getFilePointer() == file.length()) {
	                break;
	            }
        	}
            
            //se crea la fuente xml a partir del documento
            Source source = new DOMSource(document);
            // se crea el resultado en el fichero Empleados.xml
            Result result = new StreamResult(new File("Empleados.xml"));
            // se obtiene un TransformerFactory
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            // se realiza la transformación del documento a fichero
            transformer.transform(source, result);
            
            
            // se imprime el contenido del fichero xml creado por consola
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        // se cierra el flujo
        file.close();
	}
	
	/*
	 * Método crearElemento()
	 */
	public static void crearElemento(String datoEmpleado, String valor, Element raiz, Document document) {
		// se crea nodo hijo (<id> o <apellido> o <departamento> o <salario>)
		Element elem = document.createElement(datoEmpleado);
		// para añadir su valor o su texto se usa createTextNode(String)
		Text text = document.createTextNode(valor);
		// se añade el nodo hijo a la raíz del documento xml y su texto o valor al nodo hijo
		raiz.appendChild(elem);
		elem.appendChild(text);
	}
}
