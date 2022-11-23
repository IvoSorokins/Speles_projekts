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

    Thread gameThread;//Atļauj notikt vairākām darbībam vienalaikus

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        getBackground();
        this.setBackground(Color.green);
        this.setDoubleBuffered(true);//viss zīmējums no šī komponenta tiks veikts offscreen krāsojumā, better games rendering performance 
        


    }

    public void startGameThread(){

        gameThread = new Thread(this);//This palaiz Menu šaja konstruktora
        gameThread.start();//Palaidis run()

    }





    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }


}


