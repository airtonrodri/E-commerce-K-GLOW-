package modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class instagramm {

    private BufferedImage imagen; // Variable para almacenar la imagen cargada

    // Método para cargar una imagen desde un archivo
    public void cargarImagen(File file) throws Exception {
        this.imagen = ImageIO.read(file); // Carga la imagen en el objeto BufferedImage
    }

    // Getter para obtener la imagen
    public BufferedImage getImagen() {
        return imagen; // Devuelve la imagen cargada
    }

    // Setter para establecer la imagen
    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen; // Asigna una nueva imagen al objeto
    }

    // Método para aplicar filtro de escala de grises
    public BufferedImage aplicarFiltroEscalaDeGrises(BufferedImage imagen) {
        int width = imagen.getWidth(); // Obtiene el ancho de la imagen
        int height = imagen.getHeight(); // Obtiene la altura de la imagen
        BufferedImage gris = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY); // Crea una nueva imagen en escala de grises

        // Itera a través de cada píxel de la imagen
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = imagen.getRGB(x, y); // Obtiene el valor RGB del píxel
                gris.setRGB(x, y, rgb); // Establece el píxel en la imagen gris
            }
        }
        return gris; // Devuelve la imagen en escala de grises
    }

}


