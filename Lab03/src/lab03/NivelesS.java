/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab03;

import javax.swing.ImageIcon;

/**
 *
 * @author WILME
 */
public class NivelesS extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public NivelesS() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Pregunta");
        this.setIconImage(new ImageIcon(getClass().getResource("Imagenes/LogoDM.png")).getImage());
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
        NumeroDeNivel = new javax.swing.JLabel();
        TiempoLbl = new javax.swing.JLabel();
        MarcadoresBtn = new javax.swing.JButton();
        BarraDeTiempo = new javax.swing.JProgressBar();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PreguntaLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(730, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 173, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NumeroDeNivel.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        NumeroDeNivel.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeNivel.setText("00");
        jPanel1.add(NumeroDeNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 120, 90));

        TiempoLbl.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        TiempoLbl.setText("00:00");
        jPanel1.add(TiempoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        MarcadoresBtn.setBackground(new java.awt.Color(1, 173, 240));
        MarcadoresBtn.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        MarcadoresBtn.setForeground(new java.awt.Color(255, 255, 255));
        MarcadoresBtn.setText("Comprobar");
        MarcadoresBtn.setBorderPainted(false);
        MarcadoresBtn.setDefaultCapable(false);
        jPanel1.add(MarcadoresBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        BarraDeTiempo.setBackground(new java.awt.Color(255, 255, 255));
        BarraDeTiempo.setForeground(new java.awt.Color(1, 173, 240));
        BarraDeTiempo.setMaximum(90);
        jPanel1.add(BarraDeTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        Titulo.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Pregunta #");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PreguntaLbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PreguntaLbl.setForeground(new java.awt.Color(1, 173, 240));
        PreguntaLbl.setText("x=3+45-5");
        jPanel2.add(PreguntaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 420, 130));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X=");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jTextArea1.setRows(1);
        jTextArea1.setTabSize(1);
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new NivelesS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraDeTiempo;
    private javax.swing.JButton MarcadoresBtn;
    private javax.swing.JLabel NumeroDeNivel;
    private javax.swing.JLabel PreguntaLbl;
    private javax.swing.JLabel TiempoLbl;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
