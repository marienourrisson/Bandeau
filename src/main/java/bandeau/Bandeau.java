package bandeau;

import javax.swing.*;
import java.awt.*;
import java.awt.RenderingHints;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.geom.AffineTransform;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.FontMetrics;

public class Bandeau {

   

	static class BannerPanel extends JPanel {

		private static final AffineTransform INDENTITYTRANSFORM = new AffineTransform();
		private static final RenderingHints ANTIALIASING = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		private String myMessage = "Hello World !";
		private double myRotation = 0D;

		public BannerPanel() {
			super();
			setForeground(Color.black);
			setBackground(Color.white);
			setFont(new Font(null, Font.BOLD, 25));
		}

		public void setMessage(String message) {
			myMessage = message;
			repaint();
		}

		public String getMessage() {
			return myMessage;
		}

		public void setFont(Font f) {
			super.setFont(f);
			repaint();
		}

		public void setRotation(double theta) {
			myRotation = theta;
			repaint();
		}

		public double getRotation() {
			return myRotation;
		}

		public void setForeground(Color c) {
			super.setForeground(c);
			repaint();
		}

		public void setBackground(Color c) {
			super.setBackground(c);
			repaint();
		}

		public void sleep(int millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException ex) {
			}
		}

		public void paint(Graphics g) {
			super.paint(g);
			Rectangle r = getBounds();
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHints(ANTIALIASING);
			g2.setTransform(INDENTITYTRANSFORM);
			g2.setColor(getBackground());
			g2.fillRect(r.x, r.y, r.width, r.height);
			g2.rotate(myRotation, r.getCenterX(), r.getCenterY());
			g2.setColor(getForeground());
			setFont(getFont());
			FontMetrics m = getFontMetrics(getFont());
			Rectangle rect = m.getStringBounds(myMessage, g).getBounds();
			int x = (r.width - rect.width) / 2;
			int y = (r.height - rect.height) / 2;
			g2.drawString(myMessage, x, y + rect.height / 2);
		}
	}

	private final BannerPanel myPanel;

	public Bandeau() {
		myPanel = new BannerPanel();
		javax.swing.SwingUtilities.invokeLater(
			new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Publicite");
				frame.getContentPane().setLayout(new BorderLayout());
				frame.getContentPane().add(myPanel, BorderLayout.CENTER);
				frame.setSize(new Dimension(400, 300));
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Connaitre le message affiche dans le bandeau
	 *
	 * @return String le message courant
	 */
	public String getMessage() {
		return myPanel.getMessage();
	}

	/**
	 * Definit le message affiche dans le bandeau
	 *
	 * @param message String Le message qui sera affiche (centre dans le bandeau)
	 */
	public void setMessage(String message) {
		myPanel.setMessage(message);
	}

	/**
	 * Connaître l'angle de rotation du texte
	 *
	 * @return double l'angle courant en radians
	 */
	public double getRotation() {
		return myPanel.getRotation();
	}

	/**
	 * Definir l'angle de rotation du texte dans le bandeau<br>
	 * exemple: <br><code>setRotation(Math.PI / 2); // 45 °</code>
	 *
	 * @param theta double l'angle en radians
	 */
	public void setRotation(double theta) {
		myPanel.setRotation(theta);
	}

	/**
	 * Connaître la couleur de fond
	 *
	 * @return Color la couleur de fond
	 */
	public Color getBackground() {
		return myPanel.getBackground();
	}

	/**
	 * Definir la couleur de fond a utiliser<br>
	 * exemple: <br><code>setBackground(Color.blue);</code>
	 *
	 * @param c Color la nouvelle couleur
	 */
	public void setBackground(Color c) {
		myPanel.setBackground(c);
	}

	/**
	 * Connaître la police de caracteres utilisee
	 *
	 * @return Font la police de caracteres utilisee
	 */
	public Font getFont() {
		return myPanel.getFont();
	}

	/**
	 * Definir la police de caractere utilisee<br>
	 * exemple: <br><code>setFont(new Font("Monospaced", Font.BOLD, 20));</code>
	 *
	 * @param f Font La police a utiliser
	 */
	public void setFont(Font f) {
		myPanel.setFont(f);
	}

	/**
	 * Connaître la couleur d'affichage des caracteres
	 *
	 * @return Color la couleur d'affichage
	 */
	public Color getForeground() {
		return myPanel.getForeground();
	}

	/**
	 * Definir la couleur du texte a utiliser<br>
	 * exemple: <br><code>setForeground(Color.blue);</code>
	 *
	 * @param c Color la nouvelle couleur
	 */
	public void setForeground(Color c) {
		myPanel.setForeground(c);
	}

	/**
	 * Faire une pause dans l'affichage<br>
	 * exemple:<br><code>sleep(1000); // Pause d'une seconde</code>
	 *
	 * @param millis int le delai de pause en millisecondes
	 */
	public void sleep(int millis) {
		myPanel.sleep(millis);
	}

}
