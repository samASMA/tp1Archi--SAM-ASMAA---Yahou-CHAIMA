package package1;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class LancerApp1 {

	public static void main(String[] args) throws IOException {
		
		BufferedImage imgVador= ImageIO.read(new File("images/person2.png"));
		BufferedImage imgLeila= ImageIO.read(new File("images/person1.png"));
		BufferedImage imgChat= ImageIO.read(new File("images/ok.png"));

		
		// création de la fenêtre de l'application
		JFrame laFenetre= new JFrame("Animation Train, etc.");
		laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		laFenetre.setSize(512, 512);
		
		// création de la zône de dessin dans la fenêtre
		Dessin d = new Dessin();
		laFenetre.getContentPane().add(d);
		
		// affiche la fenêtre
		laFenetre.setVisible(true);
		
		// les trains de cercles avec image et en couleur
		TrainCercle[] lesTrains= new TrainCercle[10];
		lesTrains[0] = new TrainCercleImage(d, 10, imgVador); d.ajouterObjet(lesTrains[0]);
		lesTrains[1] = new TrainCercleImage(d, 10, imgLeila); d.ajouterObjet(lesTrains[1]);
		lesTrains[2] = new TrainCercleImage(d, 10, imgChat); d.ajouterObjet(lesTrains[2]);
		for (int i = 2; i < 10; i++) {
			lesTrains[i] = new TrainCercleCouleur(new Color((float) Math.random(), (float) Math.random(),
		(float) Math.random()), d, 10, 10);
		d.ajouterObjet(lesTrains[i]);
		}
		
		Visage v = new Visage(d);
		d.ajouterObjet(v);
		
		Etoile etoile1=new Etoile(400,200,20,Float.parseFloat("3.3"),Color.green,Color.green);
		  d.ajouterObjet(etoile1);
		  PolygoneRegulier pol1=new PolygoneRegulier(400,400,100,20,Float.parseFloat("4.3"),Color.black,Color.black);
				d.ajouterObjet(pol1);
				
		MvtCirculaire m = new MvtCirculaire(50, 60, 30, 20.8, 50.5);
		MvtCirculaire m2 = new MvtCirculaire(100, 70, 30, 27.8, 80.5);	
		Etoile etoile2=new Etoile(10,10,10,Float.parseFloat("5.3"),Color.YELLOW,Color.YELLOW);
		 d.ajouterObjet(etoile2);
		 PolygoneRegulier pol2=new PolygoneRegulier(300,150,200,20,Float.parseFloat("1.3"),Color.GRAY,Color.GRAY
				 );
				d.ajouterObjet(pol2);
		while(true) {
		// la zone de dessin se réaffiche
		d.repaint();
		// un temps de pause pour avoir le temps de voir le nouveau dessin
		d.pause(50);
		//réaliser à tous les trains un déplacement élémentaire
		d.animer();
		m.deplacer(etoile2);
		m2.deplacer(pol2);
		}

	}

}
