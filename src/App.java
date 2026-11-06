import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        Random number = new Random();


        JFrame tela = new JFrame();
        JPanel painel = new JPanel();
        JPanel quadradin = new JPanel();
        JPanel quadradin2 = new JPanel();
        JPanel boca = new JPanel();
        JPanel boca2 = new JPanel();
        JPanel boca3 = new JPanel();
        JButton GAMBLE = new JButton();
        JLabel dado1 = new JLabel();
        JLabel dado2 = new JLabel();
        JLabel dado3 = new JLabel();
        JPanel fundo1 = new JPanel();
        JPanel fundo2 = new JPanel();
        JPanel fundo3 = new JPanel();
        JButton cheat = new JButton();
        
        
        
        
        
        tela.setLayout(null);
        painel.setLayout(null);
        tela.setBounds(600, 200, 600, 500);

        


        quadradin.setBounds(100, 100, 100, 100);
        quadradin2.setBounds(400, 100, 100, 100);
        boca.setBounds(200, 250, 200, 50);
        boca2.setBounds(200, 225, 40, 40);
        boca3.setBounds(360, 225, 40, 40);
        cheat.setBounds(520, 6, 60, 30);
        cheat.setText("cheat");
        cheat.setFocusPainted(false);

        GAMBLE.setBounds(40, 375, 100, 50);
        GAMBLE.setText("GAMBLE");
        GAMBLE.setFont(new Font("Arial", Font.BOLD, 15));
        GAMBLE.setFocusPainted(false);

        dado1.setBounds(175, 350, 80, 50);
        dado2.setBounds(275, 350, 80, 50);
        dado3.setBounds(375, 350, 80, 50);

        fundo1.setBounds(165, 358, 80, 40);
        fundo2.setBounds(265, 358, 80, 40);
        fundo3.setBounds(365, 358, 80, 40);

        dado1.setFont(new Font("Arial", Font.BOLD, 15));
        dado2.setFont(new Font("Arial", Font.BOLD, 15));
        dado3.setFont(new Font("Arial", Font.BOLD, 15));
        cheat.setFont(new Font("Arial", Font.BOLD, 9));

        dado1.setText("...");
        dado2.setText("...");
        dado3.setText("...");
        
        tela.setContentPane(painel);
        tela.add(quadradin);
        tela.add(quadradin2);
        tela.add(boca);
        tela.add(boca2);
        tela.add(boca3);
        tela.add(GAMBLE);
        tela.add(dado1);
        tela.add(dado2);
        tela.add(dado3);

        
        tela.add(fundo1);
        tela.add(fundo2);
        tela.add(fundo3);
        
        tela.setResizable(false); 
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

        ColoridoWorking(painel, 0, 0, 0);
        ColoridoWorking(quadradin, 100, 100, 100);
        ColoridoWorking(quadradin2, 100, 100, 100);
        ColoridoWorking(boca, 100, 100, 100);
        ColoridoWorking(boca2, 100, 100, 100);
        ColoridoWorking(boca3, 100, 100, 100);


        //Code GAMBLING MODE AHHEUARHFAEIRFHJAO

        JOptionPane.showMessageDialog(null, "I BET youre not able to hit 3 numbers in a sequence and win against me lmaoo");

        GAMBLE.addActionListener(e ->{

            dado1.setText("...");
            dado2.setText("...");
            dado3.setText("...");

            boca2.setVisible(false);
            boca3.setVisible(false);

                int[] contador = {0};
                int[] contador2 = {0};
                int[] contador3 = {0};

             new javax.swing.Timer(80, evento -> {

                int primeirodado = 0;
                String intermediario = null;
                primeirodado = number.nextInt(9) + 1;
                intermediario = Integer.toString(primeirodado);

                dado1.setText(intermediario);


                System.out.println(contador[0]);
                contador[0]++;
                if(contador[0] > 35){


                    ((javax.swing.Timer) evento.getSource()).stop();

                    new javax.swing.Timer(80, event -> {
                     int segundodado = 0;
                String intermediario2 = null;
                segundodado = number.nextInt(9) + 1;
                intermediario2 = Integer.toString(segundodado);

                dado2.setText(intermediario2);


                System.out.println(contador2[0]);
                contador2[0]++;
                     if(contador2[0] > 35){
                    ((javax.swing.Timer) event.getSource()).stop();
                        new javax.swing.Timer(80, evento1 -> {
                     int terceirodado = 0;
                String intermediario3 = null;
                terceirodado = number.nextInt(9) + 1;
                intermediario3 = Integer.toString(terceirodado);

                dado3.setText(intermediario3);


                System.out.println(contador3[0]);
                contador3[0]++;
                     if(contador3[0] > 35){
                    ((javax.swing.Timer) evento1.getSource()).stop();
                    if(!(dado1 == dado2) && !(dado2 == dado3)){

                        boca2.setVisible(true);
                        boca3.setVisible(true);
                        JOptionPane.showMessageDialog(null, "HAHA, i KNEW you were NOT gonna be able to win");
                        tela.add(cheat);
                    }else{
                        JOptionPane.showMessageDialog(null, "Oh.. you won.. im giving your prize...");
                        boca2.setVisible(true);
                        boca3.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Deleting system 32 folder in 3 seconds...");
                        
                    }
                    
                    }  
                    }).start(); 
                    }  
                    }).start();     
      
                }

                }).start();

        }); // button finishes here

 
         cheat.addActionListener(e ->{    
            boca2.setVisible(false);
            boca3.setVisible(false);
            JOptionPane.showMessageDialog(null, "BROOOOOOOOO YOU CAN NOT CHEAT WHILE GAMBLINGGG");
            JOptionPane.showMessageDialog(null, "IM GUNA PUNISH YOU FOR THIS");
            boca2.setVisible(true);
            boca3.setVisible(true);
            JOptionPane.showMessageDialog(null, "Deleting System 32 in 5 seconds...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            System.exit(0); 
            
         });   
    }
    
    
    public static void Coloridolol(JPanel panel, int i, int b, int a) throws InterruptedException{ 

    while(true){
            while(i <= 254){
                panel.setBackground(new Color(i, a, b));
                i++;
                if(b > 10){
                    b--;
                }

                Thread.sleep(10);
            }

            while(a <= 254){
                panel.setBackground(new Color(i, a, b));
                a++;
                i--;

                Thread.sleep(10);
            }
            while(b <= 254){
                panel.setBackground(new Color(i, a, b));
                b++;
                a--;

                Thread.sleep(10);
            }
        }
    }  
    
    public static void ColoridoWorking(JPanel painel, int i, int b, int a) {

    new Thread(() -> {
                try {
                    Coloridolol(painel, i, b, a);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }).start();
    }   
}
