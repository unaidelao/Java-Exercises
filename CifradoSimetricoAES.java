import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CifradoSimetricoAES {

	public static void main(String[] args) {
		try {
			System.out.println("Obteniendo generador de claves con cifrado AES.");
			// Asignamos el algoritmo de cifrado.
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			
			System.out.println("Generando clave privada/secreta.");
			// Generamos la clave privada/secreta.
			SecretKey key = keygen.generateKey();
			
			System.out.println("Obteniendo objeto Cipher con cifrado AES.");
			// Crea un objeto de la clase Cipher con el algoritmo recibido por parámetro (AES).
			Cipher aesCipher = Cipher.getInstance("AES");
			
			System.out.println("Configurando Cipher para encriptar.");
			// Inicializa el objeto aesCipher para encriptar con la clave secreta recibida.
			aesCipher.init(Cipher.ENCRYPT_MODE, key);
			
			System.out.println("Preparando mensaje.");
			String mensaje = "Este mensaje se va a cifrar con el algoritmo AES.";
			System.out.println("Mensaje original: " + mensaje);
			
			System.out.println("Cifrando mensaje.");
			// Realizamos el encriptado.
			String mensajeCifrado = new String(aesCipher.doFinal(mensaje.getBytes()));
			
			System.out.println("Mensaje cifrado: " + mensajeCifrado);
			
			// AHORA, SE PROCEDE A DESENCRIPTAR
			System.out.println("Configurando Cipher para desencriptar.");
			// Desencriptamos el mensaje CON LA MISMA KEY, ya que AES es un algoritmo
			// de cifrado simétrico.
			aesCipher.init(Cipher.DECRYPT_MODE, key);
			
			System.out.println("Desencriptando el mensaje.");
			// Realizamos la desencriptación.
			String mensajeDesencriptado = new String(aesCipher.doFinal(mensajeCifrado.getBytes()));
			
			System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}