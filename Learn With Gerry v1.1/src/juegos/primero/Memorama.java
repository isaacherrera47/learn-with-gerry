package juegos.primero;

import bd.ConexionBD;
import clases.PerfilCarga;
import util.Jugable;
import util.Memorizable;
import static util.Memorizable.seleccionados;
import static util.Memorizable.todos;
import static util.Memorizable.todos2;
import extras.PanelCarta;
import extras.PopupLogro;
import util.Temporizador;
import util.UtilVentana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import util.ColorFondo;
import util.UtilBD;
import util.UtilLogro;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class Memorama extends javax.swing.JFrame implements Memorizable, Jugable {

    public Memorama(String tipo) {
        initComponents();
        extras = new UtilVentana(this);
        tm = new Temporizador(pbTiempo, 2, 1, 10);
        agregarPaneles(tipo);
        tm.iniciarCronometro();
        hilosFondo();
        serviciosAlFondo();
        extras.maximizarPantalla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notif = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        pbTiempo = new javax.swing.JProgressBar();

        notif.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        notif.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);

        pnlFondo.setBackground(new java.awt.Color(255, 102, 102));
        pnlFondo.setLayout(new java.awt.BorderLayout());

        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new java.awt.GridLayout(4, 5, 5, 5));
        pnlFondo.add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pbTiempo.setForeground(new java.awt.Color(255, 102, 102));
        pbTiempo.setBorderPainted(false);
        pbTiempo.setString(" ");
        pbTiempo.setStringPainted(true);
        pnlFondo.add(pbTiempo, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Memorama(new String()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel notif;
    private javax.swing.JProgressBar pbTiempo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public final void verificar() {
        switch (estadoMemorama()) {
            case -1:
                break;
            case 1:
                break;
        }
    }

    @Override
    public final void ocultar() {
        for (int i = 0; i < todos2.size(); i++) {
            todos2.get(i).sw = false;
            todos2.get(i).repaint();
            pnlPrincipal.repaint();
        }
    }

    @Override
    public final void agregarPaneles(String tipo) {
        todos.clear();
        todos2.clear();
        seleccionados.clear();
        for (int i = 0; i < pares; i++) {
            ImageIcon img = new ImageIcon(getClass().getResource("/recursos/juegos/" + (i + 1) + ".png"));
            ImageIcon bocaArriba = new ImageIcon(getClass().getResource("/recursos/juegos/LWG.png"));
            PanelCarta pc = new PanelCarta(img.getImage(), this, i + 1, bocaArriba.getImage());
            PanelCarta pc2 = new PanelCarta(img.getImage(), this, i + 1, bocaArriba.getImage());
            todos.add(pc);
            todos.add(pc2);
            todos2.add(pc);
            todos2.add(pc2);
        }
        while (!todos.isEmpty()) {
            Random r = new Random();
            int x = (int) (r.nextDouble() * todos.size());
            pnlPrincipal.add(todos.get(x));
            todos.remove(x);
        }
        pnlPrincipal.repaint();
        pnlPrincipal.updateUI();
    }

    @Override
    public int estadoMemorama() {
        if (seleccionados.size() == 3) {
            if (seleccionados.get(0).clave == seleccionados.get(1).clave) {
                añadeAciertoSeguido();
                desatarBonoPenalizacion();
                seleccionados.get(0).bloqueado = true;
                seleccionados.get(1).bloqueado = true;
                seleccionados.clear();
                contadorGanador++;
                ocultar();
                return 0;
            } else {
                quitaAciertoSeguido();
                desatarBonoPenalizacion();
                seleccionados.clear();
                contadorPerdedor++;
                ocultar();
                if (contadorPerdedor == LIMITE) {
                    return -1;
                }
                return 0;
            }
        } else {
            if (contadorGanador == pares - 1 && seleccionados.size() == 2) {
                añadeAciertoSeguido();
                desatarBonoPenalizacion();
                realizado = true;
                return 1;
            }
            return 0;
        }
    }

    @Override
    public final void hilosFondo() {
        t1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estadoTemporizador();
            }
        });
        t1.start();
    }

    @Override
    public void estadoTemporizador() {
        if (!tm.isCronometroActivo()) {
            if (realizado) {
                registrarPrueba(1);
                ConexionBD.abrirConexion();
                UtilBD.aumentarNivel(PerfilCarga.getNick(), 10);
                ConexionBD.cerrarConexion();
            } else {
                registrarPrueba(0);
            }
            servicioLogro.detenerServicio();
            detenerServicios();
        } else {
            if (realizado) {
                registrarPrueba(1);
                ConexionBD.abrirConexion();
                UtilBD.aumentarNivel(PerfilCarga.getNick(), 10);
                ConexionBD.cerrarConexion();
                servicioLogro.detenerServicio();
                detenerServicios();
            }
        }
    }

    @Override
    public void detenerServicios() {
        t1.stop();
        this.dispose();
    }

    private void añadeAciertoSeguido() {
        paresSeguidos++;
        errores = 0;
        if (paresSeguidos == 2) {
            bonSeguidas++;
            paresSeguidos = 0;
        }
    }

    private void quitaAciertoSeguido() {
        errores++;
        paresSeguidos = 0;
        bonSeguidas = 0;
    }

    private void desatarBonoPenalizacion() {
        if (bonSeguidas >= 1 && paresSeguidos == 0) {
            paresSeguidos = 0;
            tm.agregarBonificacion(3);
            notif.setText("¡BONUUUUUUUUUUUS! +3");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_BIEN, pbTiempo, notif);
        }
        if (errores == 4) {
            errores = 0;
            tm.agregarPenalizacion(3);
            notif.setText("¡UUUUUUH! -3");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_BIEN, pbTiempo, notif);
        }
    }

    @Override
    public final void serviciosAlFondo() {
        servicioLogro = new UtilLogro(PerfilCarga.getGrado(), PerfilCarga.getNick()) {
            @Override
            public void desatarLogro() {

                if (bonSeguidas == 3) {
                    if (!servicioLogro.listaDesbloqueados.contains(17)) {
                        UtilBD.desatarLogroID(17, PerfilCarga.getNick(), 7);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala",
                                servicioLogro.listaLogros.get(17).getNombre(), servicioLogro.listaLogros.get(17).getDescripcion()));
                        servicioLogro.listaDesbloqueados.add(17);
                    }
                }
                if (tm.getTipoTemp() == 2 && tm.getSegundos() <= 6 && realizado) {
                    if (!servicioLogro.listaDesbloqueados.contains(16)) {
                        UtilBD.desatarLogroID(16, PerfilCarga.getNick(), 7);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(16).getNombre(),
                                servicioLogro.listaLogros.get(16).getDescripcion()));
                        servicioLogro.listaDesbloqueados.add(16);
                    }
                }
                if (!tm.isCronometroActivo() && contadorGanador == (pares - 1)) {
                    if (!servicioLogro.listaDesbloqueados.contains(18)) {
                        UtilBD.desatarLogroID(18, PerfilCarga.getNick(), 7);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(18).getNombre(),
                                servicioLogro.listaLogros.get(18).getDescripcion()));
                        servicioLogro.listaDesbloqueados.add(18);
                    }
                }
                if (tm.getTipoTemp() == 1 && (tm.getSegundos() <= 59 && tm.getMinutos() == 0)) {
                    if (!servicioLogro.listaDesbloqueados.contains(19)) {
                        UtilBD.desatarLogroID(19, PerfilCarga.getNick(), 7);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(19).getNombre(),
                                servicioLogro.listaLogros.get(19).getDescripcion()));
                        servicioLogro.listaDesbloqueados.add(19);
                    }
                }
                if (tm.getPenalizaciones() == 0 && !tm.isCronometroActivo()) {
                    if (!servicioLogro.listaDesbloqueados.contains(21)) {
                        UtilBD.desatarLogroID(21, PerfilCarga.getNick(), 7);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(21).getNombre(),
                                servicioLogro.listaLogros.get(21).getDescripcion()));
                        servicioLogro.listaDesbloqueados.add(21);
                    }
                }
            }
        };
        servicioLogro.iniciarServicio();
    }

    private void registrarPrueba(int estado) {
        try {
            ConexionBD.abrirConexion();
            String sql = "INSERT INTO pruebausuario(idprueba,iduser,tipotiempo,tiempo,estado) values(?,?,'regresivo','00:00:00',?)";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, PerfilCarga.getNick());
            ps.setInt(3, estado);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Memorama.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }

    UtilVentana extras;
    Timer t1;
    UtilLogro servicioLogro;
    private boolean realizado = false;
    private int paresSeguidos = 0;
    private int bonSeguidas = 0;
    private int errores = 0;
    private final int LIMITE = 5; // Numero máximo de intentos
    private final int pares = 10; // Pares del Memorama
    int contadorGanador = 0;
    int contadorPerdedor = 0;
    Temporizador tm;

}
