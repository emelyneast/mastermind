import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class matermind extends JDialog {
    private JPanel contentPane;

    private JButton buttonCancel;
    private JPanel first;
    private JButton couleur1;
    private JButton couleur4;
    private JButton couleur2;
    private JButton couleur3;
    private JButton valider;
    private JPanel deviner;
    private JButton button1;
    private JPanel verif9;
    private JPanel deviner1;
    private JPanel deviner2;
    private JPanel deviner3;
    private JPanel deviner4;
    private JPanel deviner5;
    private JPanel deviner6;
    private JPanel deviner7;
    private JPanel deviner8;
    private JPanel deviner9;
    private JPanel deviner10;
    private JPanel deviner11;
    private JButton bon36;
    private JPanel verif1;
    private JPanel verif2;
    private JPanel verif3;
    private JPanel verif4;
    private JPanel verif5;
    private JPanel verif6;
    private JPanel verif7;
    private JPanel verif8;
    private JPanel verif10;
    private JPanel verif11;
    private JPanel verif12;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button54;
    private JButton button61;
    private JButton button62;
    private JButton button63;
    private JButton button64;
    private JButton button71;
    private JButton button72;
    private JButton button73;
    private JButton button74;
    private JButton button81;
    private JButton button82;
    private JButton button83;
    private JButton button84;
    private JButton button91;
    private JButton button92;
    private JButton button93;
    private JButton button94;
    private JButton button101;
    private JButton button102;
    private JButton button103;
    private JButton button104;
    private JButton button111;
    private JButton button112;
    private JButton button113;
    private JButton button114;
    private JButton OK;
    private JButton bon1;
    private JButton bon2;
    private JButton bon3;
    private JButton bon4;
    private JButton bon5;
    private JButton bon6;
    private JButton bon7;
    private JButton bon8;
    private JButton bon9;
    private JButton bon10;
    private JButton bon11;
    private JButton bon12;
    private JButton bon13;
    private JButton bon14;
    private JButton bon15;
    private JButton bon16;
    private JButton bon17;
    private JButton bon18;
    private JButton bon19;
    private JButton bon20;
    private JButton bon21;
    private JButton bon22;
    private JButton bon23;
    private JButton bon24;
    private JButton bon25;
    private JButton bon26;
    private JButton bon27;
    private JButton bon28;
    private JButton bon29;
    private JButton bon30;
    private JButton bon31;
    private JButton bon32;
    private JButton bon33;
    private JButton bon34;
    private JButton bon35;
    private JButton bon37;
    private JButton bon38;
    private JButton bon39;
    private JButton bon40;
    private JButton bon41;
    private JButton bon42;
    private JButton bon43;
    private JButton bon44;
    private JButton bon45;
    private JButton bon46;
    private JButton bon47;
    private JButton bon48;
    private JTextArea textArea1;
    private JButton rejouerButton;
    private JPanel jeu;
    private ArrayList<JButton> cl;
    private ArrayList<JButton> bons ;
    private ArrayList<JButton> bt;
    private int col ;
    int c;
    int i = 0;
    int b =0;
    int gagner = 3;
    int j = 0;
    int f=0;
    int r = -1;
    int o=3;
    public matermind() {
        setContentPane(contentPane);
        setModal(true);
        jeu.setVisible(false);
        OK.setVisible(false);
        init();



        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        valider.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first.setVisible(false);
                jeu.setVisible(true);
                OK.setVisible(true);

            }
        });

        OK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verifier();
                r=0;
                b=0;
                f=0;
                j=j+4;
                o=o+4;
                r=j-1;
                gagner =gagner+4;
            }
        });

        rejouerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jeu.setVisible(false);
                OK.setVisible(false);
                textArea1.setText("");
                 col=0 ;
                 c=0;
                i = 0;
                b =0;
                gagner = 3;
                j = 0;
                f=0;
                r = -1;
                o=3;
                for (JButton btn : bt) {
                    btn.setBackground(Color.white);
                    btn.setEnabled(true);
                }
                for (JButton unBouton : cl) {
                    unBouton.setBackground(Color.white);
                    unBouton.setEnabled(true);
                }
                first.setVisible(true);
                for (JButton bo : bons) {
                    bo.setBackground(Color.gray);
                    bo.setEnabled(true);
                }
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }


    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
    private void init(){
        initcouleur();
        initappuycl();
        initButton();
        initbtn();
        initbon();
    }
    private void initButton(){
        bt= new ArrayList<>();
        bt.add(button1);
        bt.add(button2);
        bt.add(button3);
        bt.add(button4);
        bt.add(button11);
        bt.add(button12);
        bt.add(button13);
        bt.add(button14);
        bt.add(button21);
        bt.add(button22);
        bt.add(button23);
        bt.add(button24);
        bt.add(button31);
        bt.add(button32);
        bt.add(button33);
        bt.add(button34);
        bt.add(button41);
        bt.add(button42);
        bt.add(button43);
        bt.add(button44);
        bt.add(button51);
        bt.add(button52);
        bt.add(button53);
        bt.add(button54);
        bt.add(button61);
        bt.add(button62);
        bt.add(button63);
        bt.add(button64);
        bt.add(button71);
        bt.add(button72);
        bt.add(button73);
        bt.add(button74);
        bt.add(button81);
        bt.add(button82);
        bt.add(button83);
        bt.add(button84);
        bt.add(button91);
        bt.add(button92);
        bt.add(button93);
        bt.add(button94);
        bt.add(button101);
        bt.add(button102);
        bt.add(button103);
        bt.add(button104);
        bt.add(button111);
        bt.add(button112);
        bt.add(button113);
        bt.add(button114);
        c = 0;
        for (JButton btn : bt) {
            btn.setBackground(Color.white);

        }
    }

    private void verifier(){


        if(j==0){
            if((button1.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button2.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button3.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button4.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==4){
            if((button11.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button12.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button13.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button14.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==8){
            if((button21.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button22.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button23.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button24.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==12){
            if((button31.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button32.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button33.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button34.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==16){
            if((button41.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button42.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button43.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button44.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==20){
            if((button51.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button52.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button53.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button54.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==24){
            if((button61.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button62.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button63.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button64.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==28){
            if((button71.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button72.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button73.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button74.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i =j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==32){
            if((button81.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button82.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button83.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button84.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==36){
            if((button91.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button92.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button93.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button94.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==40){
            if((button101.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button102.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button103.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button104.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        if(j==44){
            if((button111.getBackground()==couleur1.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button112.getBackground()==couleur2.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button113.getBackground()==couleur3.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
            if((button114.getBackground()==couleur4.getBackground())){
                r=r+1;
                for ( i = j; i <= o; i++) {
                    bt.get(i).setEnabled(false);
                }
            }
        }
        for ( i=j; i<=r; i++) {
            bons.get(i).setBackground(Color.red);
        }

        if(r==gagner){
            textArea1.setText("Gagner");
            first.setVisible(true);
        }
        else if (j==44){
            textArea1.setText("perdu");
            first.setVisible(true);
        }

    }

    private void initbtn() {
        for (JButton btn : bt) {
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (c == 0) {
                        btn.setBackground(Color.cyan);
                        c = 1;
                    } else if (c == 1) {
                        btn.setBackground(Color.red);
                        c = 2;
                    } else if (c == 2) {
                        btn.setBackground(Color.magenta);
                        c = 3;
                    } else if (c == 3) {
                        btn.setBackground(Color.yellow);
                        c = 4;
                    } else if (c == 4) {
                        btn.setBackground(Color.white);
                        c = 0;
                    }


                }
            });
        }

    }

    private void initcouleur(){
        cl= new ArrayList<>();
        cl.add(couleur1);
        cl.add(couleur2);
        cl.add(couleur3);
        cl.add(couleur4);
        col = 0;
        for (JButton unBouton : cl) {
            unBouton.setBackground(Color.white);
        }

    }

    private void initbon() {
        bons = new ArrayList<>();
        bons.add(bon1);
        bons.add(bon2);
        bons.add(bon3);
        bons.add(bon4);
        bons.add(bon5);
        bons.add(bon6);
        bons.add(bon7);
        bons.add(bon8);
        bons.add(bon9);
        bons.add(bon10);
        bons.add(bon11);
        bons.add(bon12);
        bons.add(bon13);
        bons.add(bon14);
        bons.add(bon15);
        bons.add(bon16);
        bons.add(bon17);
        bons.add(bon18);
        bons.add(bon19);
        bons.add(bon20);
        bons.add(bon21);
        bons.add(bon22);
        bons.add(bon23);
        bons.add(bon24);
        bons.add(bon25);
        bons.add(bon26);
        bons.add(bon27);
        bons.add(bon28);
        bons.add(bon29);
        bons.add(bon30);
        bons.add(bon31);
        bons.add(bon32);
        bons.add(bon33);
        bons.add(bon34);
        bons.add(bon35);
        bons.add(bon36);
        bons.add(bon37);
        bons.add(bon38);
        bons.add(bon39);
        bons.add(bon40);
        bons.add(bon41);
        bons.add(bon42);
        bons.add(bon43);
        bons.add(bon44);
        bons.add(bon45);
        bons.add(bon46);
        bons.add(bon47);
        bons.add(bon48);

        for (JButton bo : bons) {
            bo.setBackground(Color.gray);
        }
    }

    private void initappuycl() {
        for (JButton unBouton : cl) {
            unBouton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(col==0){
                        unBouton.setBackground(Color.cyan);
                        col=1;
                    }
                    else if(col == 1){
                        unBouton.setBackground(Color.red);
                        col=2;
                    }
                    else if(col == 2){
                        unBouton.setBackground(Color.magenta);
                        col=3;
                    }
                    else if(col == 3){
                        unBouton.setBackground(Color.yellow);
                        col=4;
                    }
                    else if(col == 4){
                        unBouton.setBackground(Color.white);
                        col=0;
                    }
                }
            });
        }
    }


    public static void main(String[] args) {
        matermind dialog = new matermind();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
