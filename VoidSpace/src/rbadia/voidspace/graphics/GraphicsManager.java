package rbadia.voidspace.graphics;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import rbadia.voidspace.model.Asteroid;
import rbadia.voidspace.model.Bullet;
import rbadia.voidspace.model.Ship;
import rbadia.voidspace.model.EnemyShip;
import rbadia.voidspace.model.FinalBoss;

/**
 * Manages and draws game graphics and images.
 */
public class GraphicsManager {
	private BufferedImage shipImg;
	private BufferedImage bulletImg;
	private BufferedImage asteroidImg;
	private BufferedImage asteroidExplosionImg;
	private BufferedImage shipExplosionImg;
	private BufferedImage enemyShipImg;
	private BufferedImage finalBossImg;
	private BufferedImage bossExplosionImg;
	private BufferedImage bossBulletImg;

	/**
	 * Creates a new graphics manager and loads the game images.
	 */
	public GraphicsManager(){
		// load images
		try {
			this.shipImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/shipX.png"));
			this.asteroidImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/asteroid.png"));
			this.asteroidExplosionImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/asteroidExplosion.png"));
			this.shipExplosionImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/shipExplosion.png"));
			this.bulletImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/bullet.png"));
			this.enemyShipImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/enemyShip.png"));
			this.finalBossImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/finalBossX.png"));
			this.bossExplosionImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/shipExplosion.png"));
			this.bossBulletImg = ImageIO.read(getClass().getResource("/rbadia/voidspace/graphics/fire.png"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "The graphic files are either corrupt or missing.",
					"VoidSpace - Fatal Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			System.exit(-1);
		}
	}

	/**
	 * Draws a ship image to the specified graphics canvas.
	 * @param ship the ship to draw
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawShip(Ship ship, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(shipImg, ship.x, ship.y, observer);
	}

	/**
	 * Draws a bullet image to the specified graphics canvas.
	 * @param bullet the bullet to draw
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawBullet(Bullet bullet, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(bulletImg, bullet.x, bullet.y, observer);
	}

	/**
	 * Draws a bossBullet image to the specified graphics canvas.
	 * @param bossBullet the bullet to draw
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawBossBullet(Bullet bossBullet, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(bossBulletImg, bossBullet.x, bossBullet.y, observer);
	}

	/**
	 * Draws an asteroid image to the specified graphics canvas.
	 * @param asteroid the asteroid to draw
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawAsteroid(Asteroid asteroid, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(asteroidImg, asteroid.x, asteroid.y, observer);
	}

	/**
	 * Draws a enemyShip image to the specified graphics canvas.
	 * @param enemyShip the enemyShip to draw
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawEnemyShip(EnemyShip enemyShip, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(enemyShipImg, enemyShip.x, enemyShip.y, observer);
	}

	public void drawFinalBoss(FinalBoss finalBoss, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(finalBossImg, finalBoss.x, finalBoss.y, observer);
	}

	/**
	 * Draws a ship explosion image to the specified graphics canvas.
	 * @param shipExplosion the bounding rectangle of the explosion
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawShipExplosion(Rectangle shipExplosion, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(shipExplosionImg, shipExplosion.x, shipExplosion.y, observer);
	}

	/**
	 * Draws a boss explosion image to the specified graphics canvas.
	 * @param bossExplosion the bounding rectangle of the explosion
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawBossExplosion(Rectangle bossExplosion, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(bossExplosionImg, bossExplosion.x, bossExplosion.y, observer);
	}

	/**
	 * Draws an asteroid explosion image to the specified graphics canvas.
	 * @param asteroidExplosion the bounding rectangle of the explosion
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawAsteroidExplosion(Rectangle asteroidExplosion, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(asteroidExplosionImg, asteroidExplosion.x, asteroidExplosion.y, observer);
	}

	/**
	 * Draws an enemy ship explosion image to the specified graphics canvas.
	 * @param enemyShipExplosion the bounding rectangle of the explosion
	 * @param g2d the graphics canvas
	 * @param observer object to be notified
	 */
	public void drawEnemyShipExplosion(Rectangle enemyShipExplosion, Graphics2D g2d, ImageObserver observer) {
		g2d.drawImage(shipExplosionImg, enemyShipExplosion.x, enemyShipExplosion.y, observer);
	}
}
