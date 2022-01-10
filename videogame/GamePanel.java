
/**
 * Author: Noah Bernstein
 * Date: 5/12/2021
 */

/*TO DO LIST

Noah:
don't allow mobs to shoot if difference in y








*/

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener {
    private double playerX;// location of player
    private double playerY;// location of player
    private boolean boolA;// boolean of whether a is being clicked
    private boolean boolD;// boolean of whether d is being clicked
    private double fall;// whether the player is abover the groud
    private Timer time = new Timer(1, this);// timer
    private double slopey; // y slope between the mouse and the player
    private double slopex;// x slope between the mousea and the player
    private double x;// x location of mouse
    private JFrame v;// Jframe
    private double y;// y location of mouse
    public int wave = 1;// the wave that the game is at
    public int score = 0;// score of player
    public int enemies = 5;// number of enemies
    public int lives = 3;// number of lives
    private boolean clicked = false;// boolean that is true when the mouse is clicked
    private Image crosshair = new ImageIcon("crosshair.png").getImage();// crosshair image
    private Image bottomstorm = new ImageIcon("bottomstorm.png").getImage();// gun image
    private Image cover = new ImageIcon("logo_cover.png").getImage();// gun image
    private Image rain = new ImageIcon("rain.gif").getImage();// gun image
    private Image small_fire = new ImageIcon("small_fire.gif").getImage();// gun image
    private Image big_fire = new ImageIcon("big_fire.gif").getImage();// gun image
    private Image top = new ImageIcon("top.png").getImage();// gun image
    private Image gun = new ImageIcon("lgun.png").getImage();// gun image
    private Image gunfire = new ImageIcon("gunfire.png").getImage();// gun image
    private Image gunholder;// image that is assigned to
    private Image block = new ImageIcon("block.png").getImage();// gun image
    private int bottom;// the y value for the player that can't doesn't fall through
    private Image jake = new ImageIcon("ljake.gif").getImage();// gun image
    private Image jjump = new ImageIcon("ljump.png").getImage();// gun image
    private Image IMGholder;// image of player
    private int wavecounter = 0;// timer that delays between waves
    private int cooldowncounter = 1000;// timer that allows gun to cooldown
    private boolean coolboolbaby = true;// boolan determining whether gun is in cooldown
    private double cooldown;// guns heat alwyas decreasing but increases with every shot
    private Boolean newWave = false;// boolean if a new wave is starting
    private Boolean punched = true;// boolean if player is punching
    private JButton r;
    Image backround = new ImageIcon("backround.jpg").getImage();// backround
    ArrayList<bullet> bulletList = new ArrayList<bullet>();// arraylist of bullets that are made in the bullet class
    ArrayList<mob> mobList = new ArrayList<mob>();// arraylist of mobs that are made in the mobs class
    private double health;// player health
    private double playerXIncrease;// value that the x of the player increases by
    private double bulletXAppear = 5;// positions the bullet to shoot from the gun of the player
    private double gunXAppear = 15;// positions the gun to bne next to the player
    private boolean rpunch = false;// boolean that is true when the mouse is clicked
    private boolean lpunch = false;// boolean that is true when the mouse is clicked
    private boolean left = false;// boolean that is true when the mouse is clicked
    private boolean right = false;// boolean that is true when the mouse is clicked
    private boolean gameover = false;// boolean that is true when the mouse is clicked

    public GamePanel() {// method to start the time set up the actionlisteners and set the health
        time.start();
        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);
        setFocusTraversalKeysEnabled(false);
        health = 100;// seting health
        playerX = 1000;// setting player x
        playerY = 715;// setting player y
        IMGholder = jake;// assigning imageholder
        playerXIncrease = 7;// setting speed

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);

        g.drawImage(backround, 0, 200, 2000, 850, null);// backround
        g.drawImage(top, 0, 0, 2000, 600, null);// drawing top of the map
        g.drawImage(rain, 0, 0, 2000, 400, null);// rain
        g.drawImage(rain, 0, 400, 2000, 280, null);// more rain
        g.drawImage(block, 439, 595, 550, 85, null);// covers image problem
        g.drawImage(small_fire, -20, -110, 250, 200, null);// fire
        g.drawImage(small_fire, 25, -110, 200, 200, null);// fire
        g.drawImage(small_fire, 50, -110, 200, 200, null);// fire
        g.drawImage(small_fire, 1570, 540, 100, 100, null);// fire
        g.drawImage(small_fire, 1255, 940, 100, 50, null);// fire

        g.setFont(new Font("ArialBlack", Font.BOLD, 30));
        g.drawString("Health: ", 30, 780);// score
        g.setFont(new Font("ArialBlack", Font.BOLD, 50));

        g.fillRect((int) 30, (int) 800, (int) (health * 4), 40);// health bar
        g.setColor(Color.cyan);
        g.drawString("Score: " + Integer.toString(score), 30, 1000);// score
        g.drawString("Lives: " + Integer.toString(lives), 1700, 50);// lives
        g.drawString("Wave: " + Integer.toString(wave), 1400, 50);// wave
        g.drawString("Enemies remaining : " + Integer.toString(mobList.size() + enemies), 430, 50);// remaining
        if (coolboolbaby) {// changing color of cooldown
            g.setColor(Color.green);
        } else {
            g.setColor(Color.yellow);
        }
        g.setFont(new Font("ArialBlack", Font.BOLD, 30));

        g.drawString("Cooldown: ", 30, 880);// drawing cooldown
        g.drawLine(284, 900, 284, 950);
        g.fillRect(30, 900, (int) cooldown, 50);// cooldown bar
        // g.drawImage(+, x, y, width, height, observer)

        // g.fillRect(0, 850, 9000, 9000);//boundaries
        // g.fillRect(0, 0, 9000, 200);//boundaries

        g.drawImage(IMGholder, (int) playerX, (int) playerY, 65, 65, null);// player
        g.drawImage(gunholder, (int) (playerX + gunXAppear), (int) (playerY + 12), 35, 35, null);// drawing gungun
        Graphics2D g3 = (Graphics2D) g;
        if (fall > 0) {// chaning picture is player is jumping
            IMGholder = jjump;
        } else {
            IMGholder = jake;
        }
        for (mob m : mobList) {// removing mobs that died
            if (m.getHealth() <= 0) {
                mobList.remove(m);
                score += 100 * wave;
            }
            m.paintComponent(g3);
        }

        // hitbox
        // g.drawLine((int)playerX+55, (int)playerY-3, (int)playerX+17,
        // (int)playerY-3);// ---
        // g.drawLine((int)playerX+17, (int)playerY+64, (int)playerX+55,
        // (int)playerY+64);// __
        // g.drawLine((int)playerX+17, (int)playerY-3, (int)playerX+17,
        // (int)playerY+64);// |
        // g.drawLine((int)playerX+55, (int)playerY-3, (int)playerX+55,
        // (int)playerY+64);// |

        for (bullet b : bulletList) {

            b.paintComponent(g3);
            if (b.getx2() < b.getx1()) { // making sure bullet doesn't fly backwards
                b.takestuff();
            } else {
                b.addstuff();
            }
            // change bullet to explosion

            // move bullet to the
            if (b.checkForExplosion()) {// changing to explosion
                if (b.getCounter() < 1) {
                    b.increaseCounter();
                } else {
                    bulletList.remove(b);
                }

            }

            if (b.getBulletx() + 20 > playerX + 17 && b.getBulletx() + 20 < playerX + 55// taking health if player is
                                                                                        // shot
                    && b.getBullety() + 25 > playerY - 3 && b.getBullety() + 25 < playerY + 64 && !b.ifHit()
                    && !b.playerShot && health >= 0) {
                g.setColor(Color.YELLOW);

                health -= 5;
                b.setHit();
                b.changeToExplosion();

            }

            for (mob m : mobList) {// taking health from mobs
                if (b.getBulletx() + 20 > m.getMobX() + 5 && b.getBulletx() + 20 < m.getMobX() + 60
                        && b.getBullety() + 25 > m.getMobY() - 5 && b.getBullety() + 25 < m.getMobY() + 100
                        && !b.ifHit() && b.playerShot && m.health >= 0) {
                    m.hit(10);
                    b.setHit();
                    b.changeToExplosion();
                }
            }

        }

        g.drawImage(crosshair, (int) (x - 25), (int) (y - 25), null);// makes crosshair

    }

    public void actionPerformed(ActionEvent e) {

        

        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        x = (double) b.getX();
        y = (double) b.getY();
        if (playerX < 400) {// assinging bottom for specific areas of map
            bottom = 625;
        } else if (playerX > 400 && playerX < 503) {
            bottom = 580;
        } else if (playerX > 503 && playerX < 740 && playerY < 700) {
            bottom = 535;
        } else if (playerX > 740 && playerX < 960 && playerY < 700) {
            bottom = 580;
        } else if (playerX > 1060 && playerX < 1900 && playerY < 700) {
            bottom = 625;
        } else if (playerX > 951 && playerX < 981) {
            bottom = 870;
        } else if (playerX > 981 && playerX < 1175 && playerY > 793) {
            bottom = 870;
        } else if (playerX > 981 && playerX < 1070 && playerY < 661) {// ladder
            bottom = 660;
        } else if (playerX > 981 && playerX < 1070 && playerY < 715) {// ladder
            bottom = 714;
        } else if (playerX > 981 && playerX < 1070 && playerY < 793) {// ladder
            bottom = 792;
        } else if (playerX > 840 && playerX < 951 && playerY > 700) {
            bottom = 910;
        } else if (playerX > 700 && playerX < 840 && playerY > 700) {
            bottom = 945;
        } else if (playerX > 1175 && playerX < 1232 && playerY > 700) {
            bottom = 910;
        } else if (playerX > 1232 && playerX < 1900 && playerY > 700) {
            bottom = 950;
        }
        if (x > playerX) {
            bulletXAppear = +55;
            gunXAppear = +40;
            left = false;

            right = true;
            jake = new ImageIcon("rjake.gif").getImage();// gun image
            jjump = new ImageIcon("rjump.png").getImage();// gun image
            gunholder = new ImageIcon("rgun.png").getImage();// gun image
            gunfire = new ImageIcon("rgunfire.png").getImage();// gun image
        } else {
            bulletXAppear = -40;
            gunXAppear = -10;

            right = false;
            left = true;

            jake = new ImageIcon("ljake.gif").getImage();// gun image
            jjump = new ImageIcon("ljump.png").getImage();// gun image
            gunholder = new ImageIcon("lgun.png").getImage();// gun image
            gunfire = new ImageIcon("lgunfire.png").getImage();// gun images
        }

        if (boolD && (playerX + 6 <= 1876) && !(playerY > 800 && playerX > 1385)
                && !(playerX + 15 > 1060 && playerX < 1225 && playerY < 800 && playerY > 625)) { // moving right

            playerX += playerXIncrease;// fix 635 1385
        }
        if (boolA && (playerX - 6 >= (-24)) && !(playerY > 800 && playerX < 635)
                && !(playerX > 900 && playerX - 25 < 951 && playerY < 792 && playerY > 594)) { // moving left
            playerX -= playerXIncrease;

        }

        if (playerY - fall >= bottom) { // making sure that gravity doesn't fall through floor
            playerY = bottom;
            fall = 0;

        }
        playerY -= fall; // gravity
        fall--;// fall is 0 if the playery is on the ground if it is above 0 then it is
               // constantly being subtracted from
        if (playerY == bottom) {
            fall = 0;
        }
        slopey = (y + playerY) / 2;
        slopex = (x + playerX) / 2;
        if (!newWave) {// adding mobs
            if (mobList.size() < 8 && enemies > 0) {
                spawn();
                enemies--;
            } else if (mobList.size() == 0) {
                wavecounter = 0;
                newWave = true;
            }
        } else {// making new waves
            wavecounter++;
            if (wavecounter > 350) {
                wave++;
                health += 7;
                enemies = (int) (2 * wave);
                newWave = false;
            }
        }

        cooldowncounter++; // code for the cooldown of the gun and the reset
        if (cooldown > 0 && coolboolbaby) {
            cooldown -= 0.6;

        }

        if (cooldown > 250) {
            cooldowncounter = 0;
            coolboolbaby = false;
        }

        if (cooldown < 0 && !coolboolbaby) {
            coolboolbaby = true;
            cooldown = 0;
        } else if (cooldown > 0 && !coolboolbaby) {
            cooldown -= 1.2;
        }
        if (lives == 0) {
            gameover = true;
            time.stop();

        }
        if (gameover) {
            GameOver();

        }
        if (health <= 0) {
            lives--;
            health = 100;
        }
        if (lpunch || rpunch) {// punching
            if (rpunch) {
                jake = new ImageIcon("rpunch.png").getImage();
                for (mob m : mobList) {

                    if (((Math.abs(playerX - m.getMobX())) < 60) && (Math.abs(playerY - m.getMobY()) < 100)) {// taking
                                                                                                              // damage
                                                                                                              // from
                                                                                                              // mobs
                                                                                                              // from
                                                                                                              // punch
                        m.hit(4.17);

                    }
                    rpunch = false;

                }
            } else {
                jake = new ImageIcon("lpunch.png").getImage();
                for (mob m : mobList) {
                    if (((Math.abs(playerX - m.getMobX())) < 60) && (Math.abs(playerY - m.getMobY()) < 100)) {// taking
                                                                                                              // damage
                                                                                                              // from
                                                                                                              // mobs
                                                                                                              // from
                                                                                                              // punch
                        m.hit(4.17);
                    }
                    lpunch = false;
                }
            }

        }
        repaint();

    }

    // #region keyactions

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        double c = e.getKeyCode();
        if (c == KeyEvent.VK_D) {// moving right
            boolD = true;
        }
        if (c == KeyEvent.VK_A) {// moving left
            boolA = true;
        }
        if (c == KeyEvent.VK_SHIFT && punched) {// punching
            punched = false;
            if (right) {
                rpunch = true;
            } else if (left) {
                lpunch = true;
            }
            gunholder = new ImageIcon("clear.png").getImage();
            ;

        }

        if (c == KeyEvent.VK_SPACE) {// jumping
            if (fall == 0) {
                fall = 12;// fall is the number that is constantly being added to the Y of the player
                          // it is usually 0 but whne space is pressed it become 12
            }
        }
        if (c == KeyEvent.VK_P) {// here
            time.stop();

        }
        if (c == KeyEvent.VK_R) {
            GameOption q = new GameOption();
            q.start();// starts the game when r is pressed
            }
        


    }

    public void keyReleased(KeyEvent e) {
        double c = e.getKeyCode();
        if (c == KeyEvent.VK_D) {
            boolD = false;
        }
        if (c == KeyEvent.VK_A) {
            boolA = false;
        }
        if (c == KeyEvent.VK_SHIFT) {
            punched = true;
            lpunch = false;
            rpunch = false;
            gunholder = gun;

        }

        if (c == KeyEvent.VK_O) {
            // here, pause
            time.start();

        }
        if (c == KeyEvent.VK_K) {
            // here
            System.exit(1);// Exit game

        }

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        if (coolboolbaby) {// if the gun is not on cooldown then a new bullet class will be created from
                           // the cords of the player to the crosshairs
            gunholder = gunfire;
            cooldown += 20;// adding heat to the cooldown
            bulletList.add(new bullet(playerX + bulletXAppear, playerY, x, y, true));
        }

    }

    public void mouseReleased(MouseEvent e) {
        gunholder = gun;

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void spawn() {
        int randomspawn = (int) Math.round((Math.random() * 3 + 1));// adding mobs randomly to all over the map
        switch (randomspawn) {
            case 1:
                mobList.add(new mob(-100, 589));
                break;
            case 2:
                mobList.add(new mob(1900, 589));// change
                break;
            case 3:
                mobList.add(new mob(1300, 905));
                break;
            case 4:
                mobList.add(new mob(750, 900));
                break;
        }

    }

    // #endregion
    class bullet {
        private double increase = 0;// value that the bullet slope is being multiplied by
        Image bulletIMG = new ImageIcon("bullet.png").getImage();// image of the bullet
        double slope;// slope between the bullet and the person
        double ex1, ey1, ex2, ey2;
        double bulletx;// x of the bullet
        double bullety;// y of the bullet
        double shotFixer;// equation that my friend Sander helped me make - this value is multiplied by
                                       // the slope to prevent different speeds at different angles
        int counter = 0;// timer for the bullet to explode
        boolean exploded = false;// boolean determining whether the bullet has exploded
        int size = 50;// size of the bullet
        boolean hit = false;// boolean determining whether the bullet has hit something
        boolean playerShot = false;// boolean determining whether the bullet was shot from a player or a mob
        double bulletbottom;// bottom for the bullet to explode on
        double bullettop; // top for the bullet to explode on

        public bullet(double x1, double y1, double x2, double y2, boolean ifPlayerShot) {
            bulletx = x1;
            bullety = y1;
            ex1 = x1;// x of player
            ey1 = y1;// y of player
            ex2 = x2 - 25;// x of corosshair
            ey2 = y2 - 25;// y of crosshair
            shotFixer = 40 * (Math.abs(ex1 - ex2))
                    / Math.sqrt(((ex1 - ex2) * (ex1 - ex2)) + ((ey1 - ey2) * (ey1 - ey2)));
            slope = (ey1 - ey2) / (ex1 - ex2);
            playerShot = ifPlayerShot;

        }

        public void paintComponent(Graphics2D g2) {
            // top
            if (bulletx < 400) {// 1
                bulletbottom = 675;
            }
            if (bulletx > 400 && bulletx < 503) {// 2
                bulletbottom = 630;
            }
            if (bulletx > 503 && bulletx < 758 && bullety < 700) { // 3
                bulletbottom = 585;
            }
            if (bulletx > 758 && bulletx < 963 && bullety < 700) {// 4
                bulletbottom = 620;
            }
            if (bulletx > 963 && bulletx < 1084) {// 5
                bulletbottom = 915;

            }
            if (bulletx > 1084 && bullety < 700) {// 6
                bulletbottom = 675;

            }
            if (bulletx > 879 && bulletx < 952 && bullety > 700) {// 7
                bulletbottom = 950;

            }
            if (bulletx > 623 && bulletx < 879 && bullety > 700) {// 8
                bulletbottom = 1000;

            }
            if (bulletx > 1084 && bulletx < 1192 && bullety > 700) {// 7
                bulletbottom = 915;

            }

            if (bulletx > 1192 && bulletx < 1252 && bullety > 700) {// 7
                bulletbottom = 950;

            }
            if (bulletx > 1252 && bullety > 700) {// 7
                bulletbottom = 1000;

            }

            if (!exploded) {// bullet increasing
                bulletx = (ex1 + increase);// increase of the bulletx
                bullety = ey1 + increase * slope;// increase of the bullety
            }
            if (bulletx < -20 || bulletx > 1960 || bullety < -20) {
                bulletList.remove(this);// removing bullet if it flies out of bounds
            }

            if (bullety > bulletbottom) {// exploding bullet it it goes below the bottom

                bullety = bulletbottom;
                changeToExplosion();
            }

            g2.drawImage(bulletIMG, (int) (bulletx), (int) (bullety), size, size, null);// drawing bullet

        }

        public void addstuff() {// adding to the bullets x and y
            increase += shotFixer;
        }

        public void takestuff() {
            increase -= shotFixer;// taking from the bullets x and y
        }

        public double getx2() {
            return ex2;
        }

        public double getx1() {
            return ex1;
        }

        public double getBulletx() {
            return bulletx;
        }

        public double getBullety() {
            return bullety;
        }

        public double getSlope() {
            return slope;
        }

        public void changeToExplosion() {// changing the bullet to an explosion
            exploded = true;
            bulletIMG = new ImageIcon("explosion.png").getImage();
            increase = 0;

            size = 30;
        }

        public int getCounter() {
            return counter;
        }

        public void increaseCounter() {
            counter++;
        }

        public boolean checkForExplosion() {
            return exploded;
        }

        public void setHit() {
            hit = true;

        }

        public boolean ifHit() {
            return hit;
        }

        public void setPlayerShot() {
            playerShot = true;
        }

        public boolean ifPlayerShot() {
            return playerShot;
        }
    }

    class mob {
        double mobx;// x of the mob
        double moby;// y of the mob
        Image rmob = new ImageIcon("rmob.gif").getImage();// image of the mob facing right
        Image lmob = new ImageIcon("lmob.gif").getImage();// image of the mob facing left
        Image mobholder;// holder of the current mob image
        double fall;// that value that is being added to the playery. This is positive when the mob
                    // is jumping and negative when falling
        double health = 25;// health of the play
        double speed;// speed of the mob
        int shotcounter;// timer for between bullet shots. controls how fast a bullet is shooting
        int fallcounter;// timer to disable the mob movement while falling down the ladder
        double accuracy;// random double that makes the shots of the mob inconsistent
        int mobbottom = 589;// bottom for the mob
        boolean goupladder = false;// thisn boolean determines whether the mob has to go up the latter
        int jumpCounter = 0;// counter for the amount of jumps the mob has to go up the ladder

        public mob(int incomx, int incomy) {
            mobbottom = incomy;
            mobx = incomx;
            moby = incomy;
            speed = 4;
            shotcounter = 0;
            bottom = 200;
            fallcounter = 20;

        }

        public void paintComponent(Graphics2D g2) {
            // here baby
            fallcounter++;
            for (mob m : mobList) {// oterates through all of the mobs in the moblist
                if ((Math.abs(m.getMobX() - this.getMobX()) < 30) && !(mobx > 951 && mobx < 1175)) {// this is in charge
                                                                                                    // of spreading the
                                                                                                    // mobs out so they
                                                                                                    // can't clump up
                    if (m.getMobX() > this.getMobX()) {
                        m.increaseX(1);
                        this.increaseX(-1);
                    } else {
                        m.increaseX(-1);
                        this.increaseX(1);
                    }
                }

            }
            if (fallcounter > 20 && !goupladder) {
                if (playerX < mobx - 300 && Math.abs(playerY - moby) < 200) {// moving left
                    mobx -= speed;
                    mobholder = lmob;
                } else if (playerX > mobx + 300 && Math.abs(playerY - moby) < 200) {// moving right
                    mobx += speed;
                    mobholder = rmob;

                } else if ((playerY - moby) > 200) {// this determines whether the player is below the mob
                    if (975 < mobx - 5) {// moving to the ladder
                        mobx -= speed;

                    } else if (975 > mobx + 5) {// moving to the ladder
                        mobx += speed;

                    } else {
                        fallcounter = 0;// this line essentially freezes the mob to let it fall

                    }
                } else if ((moby - playerY) > 200) {// this determines if the player is above the mob
                    goupladder = true;
                }
            }

            else if (goupladder) {

                if (1025 < mobx - 5) {// moving to the ladder
                    mobx -= speed;
                } else if (1025 > mobx + 5) {// moving to the ladder
                    mobx += speed;
                } else {
                    if (jumpCounter <= 3) {// jumping three times
                        if (fallcounter > 25) {
                            fall = 10;
                            jumpCounter++;
                            fallcounter = 0;
                        }
                    } else {
                        jumpCounter = 0;
                        goupladder = false;
                    }
                }

            }
            if (mobx < 400) {// boundaries for the mob
                mobbottom = 580;
            } else if (mobx > 400 && mobx < 503) {
                mobbottom = 535;
            } else if (mobx > 503 && mobx < 740 && moby < 800) {
                mobbottom = 490;
            } else if (mobx > 740 && mobx < 960 && moby < 800) {
                mobbottom = 535;
            } else if (mobx > 1060 && mobx < 1900 && moby < 800) {
                mobbottom = 590;
            } else if (mobx > 951 && mobx < 981) {
                mobbottom = 825;
            } else if (mobx > 981 && mobx < 1175 && moby > 793) {
                mobbottom = 825;
            } else if (mobx > 981 && mobx < 1175 && moby < 661) {// ladder
                mobbottom = 615;
            } else if (mobx > 981 && mobx < 1175 && moby < 715) {// ladder
                mobbottom = 669;
            } else if (mobx > 981 && mobx < 1175 && moby < 793) {// ladder
                mobbottom = 747;
            } else if (mobx > 840 && mobx < 951 && moby > 800) {
                mobbottom = 865;
            } else if (mobx > 700 && mobx < 840 && moby > 800) {
                mobbottom = 900;
            } else if (mobx > 1175 && mobx < 1232 && moby > 800) {
                mobbottom = 865;
            } else if (mobx > 1232 && mobx < 1900 && moby > 800) {
                mobbottom = 905;
            }
            if (moby - fall >= mobbottom) { // making sure that gravity doesn't fall through floor
                moby = mobbottom;
                fall = 0;

            }
            moby -= fall; // gravity
            fall--;
            if (moby == mobbottom) {
                fall = 0;
            }

            if (shotcounter < 60) {// every 100 ticks the gun will shoot
                shotcounter++;
            } else if ((Math.abs(playerX - mobx) < 300) && (Math.abs(playerY - moby) < 150)) {
                if (mobx > playerX) {
                    mobholder = new ImageIcon("lmobshoot.gif").getImage();

                } else {
                    mobholder = new ImageIcon("rmobshoot.gif").getImage();

                }
                mobShoot();
                shotcounter = 0;
            }
            // #region mobhitbox

            // g2.drawLine((int)mobx+60, (int)moby-5, (int)mobx+5, (int)moby-5);// ---
            // g2.drawLine((int)mobx+5, (int)moby+100, (int)mobx+60, (int)moby+100);// __
            // g2.drawLine((int)mobx+5, (int)moby-5, (int)mobx+5, (int)moby+100);// |
            // g2.drawLine((int)mobx+60, (int)moby-5, (int)mobx+60, (int)moby+100);// |
            // #endregion
            g2.drawImage(mobholder, (int) mobx, (int) moby, 75, 100, null);

        }

        public void mobShoot() {
            accuracy = (Math.random() * 125 + 1) - 25;// setting the accuracy
            bulletList.add(new bullet(mobx, moby + 15, playerX, playerY + accuracy, false));// adding new bullets
        }

        public void hit(double power) {
            health -= power;
        }

        public double getHealth() {
            return health;
        }

        public double getMobX() {
            return mobx;
        }

        public int getMobBottom() {
            return mobbottom;
        }

        public double getMobY() {
            return moby;
        }

        public void increaseX(double num) {
            mobx += num;
        }

        public void upladder() {

        }

    }

    public void GameOver() {//this is the restart method 

        JLabel s = new JLabel(" GAME OVER");
        s.setBounds(80, 230, 1800, 60);
        s.setFont(new Font("Comic Sans", Font.BOLD, 50));
        s.setForeground(Color.WHITE);
        JLabel a = new JLabel("Score: " + score);
        a.setBounds(80, 300, 1800, 60);
        a.setFont(new Font("Comic Sans", Font.BOLD, 50));
        a.setForeground(Color.WHITE);
        JLabel z = new JLabel("To play again return to game panel and type \"R\"");
        z.setBounds(80, 370, 1800, 60);
        z.setFont(new Font("Comic Sans", Font.BOLD, 50));
        z.setForeground(Color.WHITE);
        v = new JFrame("Game Over");
        v.setSize(new Dimension(1920, 1080));
        v.setLayout(null);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.getContentPane().setBackground(Color.RED);
        v.setVisible(true);
        v.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v.add(s);
        v.add(a);
        v.add(z);
        v.add(r);
    }

}