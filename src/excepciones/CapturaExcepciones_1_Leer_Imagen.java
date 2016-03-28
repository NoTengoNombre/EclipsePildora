package excepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * https://www.youtube.com/watch?v=dD-ntlW5Tlc&index=143&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * 
 * Curso Java. Excepciones II. throws try catch. Vídeo 143
 * 
 * @author PORTATIL
 *
 */
public class CapturaExcepciones_1_Leer_Imagen {

	public static void main(String[] args) {

		// Instanciar marco
		MarcoImagen mimarco = new MarcoImagen();
		// Hacemos visible el marco
		mimarco.setVisible(true);
		// Se cierra al pulsar la X
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoImagen extends JFrame/* Marco */ { // clase hereda de marco
	/**
	 * Constructor le damos tamanio y posicion
	 */
	public MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen miLamina = new LaminaConImagen();
		// Le añadimos una lamina al marco
		add(miLamina);
	}
}

// Lamina es donde dibujamos la imagen
class LaminaConImagen extends JPanel /* Clase de la Lamina donde dibujamos */ {

	public LaminaConImagen() {

		try {
			// ERROR COMPROBADO = NO PODEMOS ARREGARLO PORQUE ES CAUSA DEL
			// SISTEMA "LA FOTO FUE BORRADA"
			imagen = ImageIO.read(new File("C:\\Users\\PORTATIL\\Pictures\\Saved Pictures\\Iconos\\heart-icon.png"));
		} catch (IOException e) { // Excepcion comprobada
			System.out.println("La imagen no se encuentra : " + e.getMessage());
		}

	}

	// metodo de la lamina
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Se encarga de pintar la imagen la veces que dice el bucle
		if (imagen == null) { // EXCEPCION NO COMPROBADA "RuntimeException"
								// TENEMOS QUE ARREGLARLO NOSOTROS
			// YA QUE ES CULPA DE NO HABERLO PROGRAMADO CORRECTAMENTE
			g.drawString(" ♦ NO SE CARGA LA IMAGEN", 10/* coordenada x */,
					10/* coordenada y */);
		} else {
			int anchuraImagen = imagen.getWidth(this);
			int alturaImagen = imagen.getHeight(this);

			g.drawImage(imagen, 0, 0, null);

			for (int i = 0; i < 300; i++) {
				for (int j = 0; j < 200; j++) {
					if (i + j > 0) {
						g.copyArea(0, 0, anchuraImagen, alturaImagen, alturaImagen * i, alturaImagen * j);
					}
				}
			}
		}
	}

	private Image imagen = null;

}
