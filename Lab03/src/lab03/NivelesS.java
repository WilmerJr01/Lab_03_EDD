package lab03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import lab03.Logica;

public class NivelesS extends javax.swing.JFrame {

    private Timer timer;
    public int progress;
    public String PreguntaFormulada;
    public int RespuestaCorrecta;
    public int NumPregunta;
    public MultiList<Boolean> multiList;
    public LinkedList<Integer> RespuestasTurno;
    public int progressNew;

    public NivelesS(int time, String PreguntaFormulada, int RespuestaCorrecta, int NumPregunta, MultiList multiList, LinkedList RespuestasTurno) {
        this.multiList = multiList;
        this.RespuestasTurno = RespuestasTurno;
        initComponents();
        this.progress = time;
        this.PreguntaFormulada = PreguntaFormulada;
        this.RespuestaCorrecta = RespuestaCorrecta;
        this.NumPregunta = NumPregunta;
        PreguntaLbl.setText(PreguntaFormulada);
        NumeroDeNivel.setText(String.valueOf(NumPregunta));
        Correcto.setVisible(false);
        Error.setVisible(false);
        TituloRespuesta.setVisible(false);
        RespuestaLbl.setVisible(false);

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Pregunta " + String.valueOf(NumPregunta));
        this.setIconImage(new ImageIcon(getClass().getResource("Imagenes/LogoDM.png")).getImage());
        BarraDeTiempo.setValue(progress);
        String MostrarTiempo;
        MostrarTiempo = String.valueOf(progress);
        TiempoLbl.setText(MostrarTiempo);
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (progress >= 40) {
                    timer.stop();
                    new PantallaFinal().setVisible(true);
                    dispose();
                } else {
                    progress++;
                    BarraDeTiempo.setValue(progress);
                    String MostrarTiempo;
                    MostrarTiempo = String.valueOf(progress);
                    TiempoLbl.setText(MostrarTiempo);
                }
            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Error = new javax.swing.JLabel();
        Correcto = new javax.swing.JLabel();
        TiempoLbl1 = new javax.swing.JLabel();
        NumeroDeNivel = new javax.swing.JLabel();
        TiempoLbl = new javax.swing.JLabel();
        ComprobarBtn = new javax.swing.JButton();
        BarraDeTiempo = new javax.swing.JProgressBar();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PreguntaLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RespuestaDada = new javax.swing.JTextArea();
        TituloRespuesta = new javax.swing.JLabel();
        RespuestaLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(730, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 173, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab03/Imagenes/Error.png"))); // NOI18N
        jPanel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        Correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab03/Imagenes/Correcto.png"))); // NOI18N
        jPanel1.add(Correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        TiempoLbl1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        TiempoLbl1.setForeground(new java.awt.Color(255, 255, 255));
        TiempoLbl1.setText("Tiempo:");
        jPanel1.add(TiempoLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        NumeroDeNivel.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        NumeroDeNivel.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeNivel.setText("00");
        jPanel1.add(NumeroDeNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 120, 90));

        TiempoLbl.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        TiempoLbl.setForeground(new java.awt.Color(255, 255, 255));
        TiempoLbl.setText("0");
        jPanel1.add(TiempoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        ComprobarBtn.setBackground(new java.awt.Color(1, 173, 240));
        ComprobarBtn.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        ComprobarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ComprobarBtn.setText("Comprobar");
        ComprobarBtn.setBorderPainted(false);
        ComprobarBtn.setDefaultCapable(false);
        ComprobarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ComprobarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        BarraDeTiempo.setBackground(new java.awt.Color(255, 255, 255));
        BarraDeTiempo.setForeground(new java.awt.Color(1, 173, 240));
        BarraDeTiempo.setMaximum(40);
        jPanel1.add(BarraDeTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        Titulo.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Pregunta #");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PreguntaLbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PreguntaLbl.setForeground(new java.awt.Color(1, 173, 240));
        PreguntaLbl.setText("x=3+45-5");
        jPanel2.add(PreguntaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 420, 130));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X=");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        RespuestaDada.setColumns(1);
        RespuestaDada.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        RespuestaDada.setRows(1);
        RespuestaDada.setTabSize(1);
        RespuestaDada.setToolTipText("");
        jScrollPane1.setViewportView(RespuestaDada);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 230, 40));

        TituloRespuesta.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        TituloRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        TituloRespuesta.setText("Respuesta:");
        jPanel1.add(TituloRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        RespuestaLbl.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        RespuestaLbl.setForeground(new java.awt.Color(255, 255, 255));
        RespuestaLbl.setText("00");
        jPanel1.add(RespuestaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprobarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarBtnActionPerformed

        ComprobarBtn.setEnabled(false);
        ComprobarBtn.setVisible(false);
        RespuestasTurno.add(RespuestaCorrecta);
        int RD;
        try {
            RD = Integer.parseInt(RespuestaDada.getText());
        } catch (NumberFormatException e) {
            RD = 0;
        }
        if (RespuestaCorrecta == RD) {
            Correcto.setVisible(true);
            multiList.addElementToSublist(0, true);
            progressNew = progress - 5;
            if (progressNew < 0) {
                progressNew = 0;
            }
        } else {
            Error.setVisible(true);
            TituloRespuesta.setVisible(true);
            RespuestaLbl.setText(String.valueOf(RespuestaCorrecta));
            RespuestaLbl.setVisible(true);
            multiList.addElementToSublist(0, false);
            progressNew = progress + 5;
            if (progressNew > 40) {
                progressNew = 40;
            }
        }
        multiList.printMultiList();
        for (int element : RespuestasTurno) {
            System.out.println(element);
        }

        // Detener el timer inicial
        timer.stop();

        // Agregar temporizador de 5 segundos antes de cambiar de JFrame
        Timer delayTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logica logica = new Logica();
                String[] vector = new String[2], vector1 = new String[2];

                if (NumPregunta + 1 <= 10) {
                    vector = logica.operacioneslvl1(NumPregunta + 1);
                }

                if (NumPregunta + 1 >= 11 && NumPregunta + 1 <= 20) {
                    vector1 = logica.operacioneslvl2(NumPregunta + 1);
                }
                if (NumPregunta + 1 < 20) {
                    new NivelesS(progressNew, vector[0], Integer.parseInt(vector[1]), NumPregunta + 1, multiList, RespuestasTurno).setVisible(true);
                    dispose();
                } else {
                    new NivelesR(progressNew, vector1[0], Double.parseDouble(vector1[1]), NumPregunta + 1, multiList, RespuestasTurno).setVisible(true);
                    dispose();
                }
            }
        });
        delayTimer.setRepeats(false);
        delayTimer.start();
    }//GEN-LAST:event_ComprobarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NivelesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String Pregunta = "Ingrese Pregunta";
                int Respuesta = 2;
                MultiList<Boolean> multiList = new MultiList<>();
                List<Boolean> sublist1 = new ArrayList<>();
                multiList.addSublist(sublist1);
                LinkedList linkedL = new LinkedList<>();

                new NivelesS(0, Pregunta, Respuesta, 0, multiList, linkedL).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraDeTiempo;
    private javax.swing.JButton ComprobarBtn;
    private javax.swing.JLabel Correcto;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel NumeroDeNivel;
    private javax.swing.JLabel PreguntaLbl;
    private javax.swing.JTextArea RespuestaDada;
    private javax.swing.JLabel RespuestaLbl;
    private javax.swing.JLabel TiempoLbl;
    private javax.swing.JLabel TiempoLbl1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloRespuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
