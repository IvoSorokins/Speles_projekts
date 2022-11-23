import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {//extends Papildina JPanel bibliotēku
    //implement Runnable ļauj impelementot interfaces jeb klasi ar abstraktam metodem




    //Ekrana iestatijumi
    final int originalTitleSize = 16; //1 laukuma lielums 16x16 pixel
    
    //Taka musdienas 1920 x 1080 pixel ekrani tad vajag scalot
    final int scale = 3; 

    final int tileSize = originalTitleSize * scale;//16 reizin ar 3
    
    final int maxScreenRow = 12;//Laukuma Garums
    final int screenHeight = tileSize * maxScreenRow;//576 pixeli

    final int maxScreenCol = 16;//Laukuma Platums
    final int screenWidth = tileSize * maxScreenCol;//768 pixeli

    int FPS = 60; //uzstāda fps spēlei
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;//Atļauj notikt vairākām darbībam vienalaikus

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        getBackground();
        this.setBackground(Color.green);
        this.setDoubleBuffered(true);//viss zīmējums no šī komponenta tiks veikts offscreen krāsojumā, better games rendering performance
        this.addKeyListener(KeyH);
        this.setFocusable(true);

        //cilvēka pamata atrašanās vieta
        int playerX =100;
        int playerY =100;
        int playerSpeed =4;
        


    }

    public void startGameThread(){

        gameThread = new Thread(this);//This palaiz Menu šaja konstruktora
        gameThread.start();//Palaidis run()

    }
  

    public void run() {

        double drawInterval = 1000000000/FPS; //zīmē ekrānu ik pa 0.01 sec iegūstot 60fps
        double nextInterval = System.nanoTime()+ drawInterval;/zīmē tikai kad paiet tā 0.01 sec
        while{gameThread != null} {
            
            update();//visu laiku updatos informāciju pa cilvēka poziciju
            
            repaint();//visu laiku updatos informāciju kartē

            try{
            double remainingTime = nextDrawTime - System.nanoTime();
            remainingTime = remainingTime/1000000;

            if(remainingTime <0){
                remainingTime = 0;
            }

            Thread.sleep((long) remainingTime);

            nextDrawTime += drawInterval;

            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }

    public void update(){
        if(KeyH.upPressed == true){
            playerY = playerY - playerSpeed;
        }
        else if(KeyH.downPressed == true){
            playerY = playerY + playerSpeed;
        }
        else if(KeyH.leftPressed == true){
            playerX = PlayerX - playerSpeed;
        }
        else if(KeyH.rightPressed == true){
            playerX = PlayerX + playerSpeed;
        }
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 =(Graphics2D)g;
        
        g2.setColor(Color.while);
        g2.fillRect(PlayerX,PlayerY,titleSize,titleSize)

        g2.dispose();
    }


}


