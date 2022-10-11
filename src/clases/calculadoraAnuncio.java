    
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class calculadoraAnuncio extends javax.swing.JFrame {
    
    //instanciando las clases
    Anuncio anuncio = new Anuncio();
    AnuncioTradicional tradicional = new AnuncioTradicional();
    AnuncioImagen conImagen = new AnuncioImagen();
    AnuncioClienteFrecuente  frecuente = new AnuncioClienteFrecuente();
    DatosCliente DatosCliente = new DatosCliente();
    DatosAnuncio DatosAnuncios = new DatosAnuncio();
    
    //archivos
    File archivoClientes; //datos del cliente

    File archivoAnuncios; //datos de los anuncios vendidos + id del cliente al que pertence cad anuncio

    File auxUpdate; //archivo auxiliar para actualizar datos

    File auxDelete; //archivo auxiliar para borrar 
   
    
    //darle formato a los resultados de costo
    DecimalFormat format = new DecimalFormat(".00");
    DecimalFormat format2 = new DecimalFormat();

  
   
   //iconos
    Icon incorrecto = new javax.swing.ImageIcon(getClass().getResource("/images/incorrecto.png"));  
    Icon correcto = new javax.swing.ImageIcon(getClass().getResource("/images/correcto.png"));
    Icon alerta = new javax.swing.ImageIcon(getClass().getResource("/images/alerta.png"));
    Icon venta = new javax.swing.ImageIcon(getClass().getResource("/images/venta.png"));
    
   
    List<DatosCliente> listaCliente =  new ArrayList<>();

    public calculadoraAnuncio() {
        
        initComponents();
        
        //inicializando los archivos a usar
        archivoClientes  =  new File("clientes.dat");
        archivoAnuncios  =  new File("anuncios.dat");
        auxUpdate = new File("auxUpdate.dat");
        auxDelete = new File("auxDelete.dat");
   
        
        
        //extras de diseño
        txtvalor.setVisible(false);
        labelNuevosDatos.setVisible(false);
        labelSimbolo.setVisible(false);
        logofijado.setVisible(false); 
        txtTitulo.setBorder(null);
        txtTitulo.setBackground(new Color(0,0,0,0));
        txtDescripcion.setBorder(null);
        txtDescripcion.setBackground(new Color(0,0,0,0));
        txtvalor.setBackground(new Color(0,0,0,50));     
        btnActualizar.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/images/thumbnail.png")).getImage()); //thumbnail
     
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesTipoAnuncio = new javax.swing.ButtonGroup();
        botonesBarra = new javax.swing.ButtonGroup();
        botonesActualizar = new javax.swing.ButtonGroup();
        barraLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCotizaR = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        actualizarDatos = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnVer = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        logofijado = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        tabs2 = new javax.swing.JTabbedPane();
        panelInicial = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelTipoAnuncio = new javax.swing.JPanel();
        btnAvanzar = new javax.swing.JButton();
        btnTradicional = new javax.swing.JToggleButton();
        btnFrecuente = new javax.swing.JToggleButton();
        btnImagen = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        labelSimbolo = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        labelFecha = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelNuevosDatos = new javax.swing.JLabel();
        labelSeccion = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        labelDescripcion = new javax.swing.JLabel();
        ComboSecciones = new javax.swing.JComboBox<>();
        validacion = new javax.swing.JLabel();
        flecha = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelResultados = new javax.swing.JPanel();
        SeccionResultado = new javax.swing.JLabel();
        fechaResultado = new javax.swing.JLabel();
        datoExtra = new javax.swing.JLabel();
        descripcionResultado = new javax.swing.JLabel();
        costoResultado = new javax.swing.JLabel();
        costoIvaResultado = new javax.swing.JLabel();
        tituloResultado = new javax.swing.JLabel();
        aceptarPrecio = new javax.swing.JButton();
        rechazarPrecio = new javax.swing.JButton();
        flecha1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelActualizar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtBusqueda2 = new javax.swing.JTextField();
        barraBsqueda2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaActualizar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        edad2 = new javax.swing.JComboBox<>();
        descripcionlabel = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        barraBsqueda3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        barraBsqueda4 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        barraBsqueda5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelVerAnuncios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVerDatos = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        barraBsqueda = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarAnuncios = new javax.swing.JButton();
        panelBorrar = new javax.swing.JPanel();
        txtIdABorrar = new javax.swing.JTextField();
        barraBsqueda1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buscarParaBorrar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        panelAgregarCliente = new javax.swing.JPanel();
        guardarCliente = new javax.swing.JButton();
        edad1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtId1 = new javax.swing.JTextField();
        barraBsqueda6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        barraBsqueda7 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        barraBsqueda8 = new javax.swing.JLabel();
        txtSegundoApellido1 = new javax.swing.JTextField();
        barraBsqueda9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(39, 44, 74));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraLateral.setBackground(new java.awt.Color(30, 36, 69));
        barraLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraLateralMouseClicked(evt);
            }
        });
        barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-property-50 (2).png"))); // NOI18N
        jLabel1.setText("  Cotizar Anuncio");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        barraLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 41));

        botonesBarra.add(btnCotizaR);
        btnCotizaR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecc.png"))); // NOI18N
        btnCotizaR.setBorderPainted(false);
        btnCotizaR.setContentAreaFilled(false);
        btnCotizaR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCotizaR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccH.png"))); // NOI18N
        btnCotizaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCotizaRMouseClicked(evt);
            }
        });
        barraLateral.add(btnCotizaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 65));

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-file-50.png"))); // NOI18N
        jLabel2.setText("   Actualizar datos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        barraLateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 41));

        botonesBarra.add(actualizarDatos);
        actualizarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecc.png"))); // NOI18N
        actualizarDatos.setBorderPainted(false);
        actualizarDatos.setContentAreaFilled(false);
        actualizarDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccH.png"))); // NOI18N
        actualizarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarDatosMouseClicked(evt);
            }
        });
        barraLateral.add(actualizarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 65));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-view-schedule-50.png"))); // NOI18N
        jLabel3.setText("   Ver anuncios vendidos");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        barraLateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 200, 41));

        botonesBarra.add(btnVer);
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecc.png"))); // NOI18N
        btnVer.setBorderPainted(false);
        btnVer.setContentAreaFilled(false);
        btnVer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccH.png"))); // NOI18N
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });
        barraLateral.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 65));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 94, 79));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-view-50 (1).png"))); // NOI18N
        jLabel4.setText("  Borrar cliente");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        barraLateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, 41));

        botonesBarra.add(btnBorrar);
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecc.png"))); // NOI18N
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccH.png"))); // NOI18N
        btnBorrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrarH.png"))); // NOI18N
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        barraLateral.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 270, 65));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 113, 170));
        jLabel14.setText("Secciones");
        barraLateral.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 68, 80, -1));

        jLabel19.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel19.setText("Agregar Cliente");
        barraLateral.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 41));

        botonesBarra.add(btnAgregar);
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecc.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccH.png"))); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        barraLateral.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 65));

        getContentPane().add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 660));

        jPanel1.setBackground(new java.awt.Color(27, 32, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logofijado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoWhite2.png"))); // NOI18N
        jPanel1.add(logofijado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 40));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minh.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 3, 20, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeh.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 3, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 630, 50));

        panelInicial.setBackground(new java.awt.Color(27, 32, 61));
        panelInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoWhite.png"))); // NOI18N
        panelInicial.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 370, 80));

        tabs2.addTab("tab5", panelInicial);

        panelTipoAnuncio.setBackground(new java.awt.Color(27, 32, 61));
        panelTipoAnuncio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAvanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avanzar.png"))); // NOI18N
        btnAvanzar.setBorderPainted(false);
        btnAvanzar.setContentAreaFilled(false);
        btnAvanzar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avanzarH.png"))); // NOI18N
        btnAvanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAvanzarMouseClicked(evt);
            }
        });
        panelTipoAnuncio.add(btnAvanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 80, 70));

        botonesTipoAnuncio.add(btnTradicional);
        btnTradicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradicional.png"))); // NOI18N
        btnTradicional.setBorderPainted(false);
        btnTradicional.setContentAreaFilled(false);
        btnTradicional.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradicional.png"))); // NOI18N
        btnTradicional.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradicionalH.png"))); // NOI18N
        panelTipoAnuncio.add(btnTradicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 270, 70));

        botonesTipoAnuncio.add(btnFrecuente);
        btnFrecuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuente.png"))); // NOI18N
        btnFrecuente.setBorderPainted(false);
        btnFrecuente.setContentAreaFilled(false);
        btnFrecuente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuente.png"))); // NOI18N
        btnFrecuente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuenteH.png"))); // NOI18N
        panelTipoAnuncio.add(btnFrecuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 270, 70));

        botonesTipoAnuncio.add(btnImagen);
        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/conImagen.png"))); // NOI18N
        btnImagen.setBorderPainted(false);
        btnImagen.setContentAreaFilled(false);
        btnImagen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/conImagen.png"))); // NOI18N
        btnImagen.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/conImagenH.png"))); // NOI18N
        panelTipoAnuncio.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 270, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-property-50 (2).png"))); // NOI18N
        jLabel11.setText("  Cotizar Anuncio");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelTipoAnuncio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 41));

        tabs2.addTab("tab1", panelTipoAnuncio);

        panelDatos.setBackground(new java.awt.Color(27, 32, 61));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSimbolo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelSimbolo.setForeground(new java.awt.Color(174, 184, 247));
        labelSimbolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSimbolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelSimbolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelDatos.add(labelSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 30, 30));

        txtvalor.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txtvalor.setForeground(new java.awt.Color(204, 204, 204));
        txtvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvalor.setBorder(null);
        txtvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvalorKeyPressed(evt);
            }
        });
        panelDatos.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 70, 30));

        jDate.setBackground(new java.awt.Color(27, 32, 61));
        jDate.setForeground(new java.awt.Color(0, 204, 255));
        jDate.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        panelDatos.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 140, 20));

        labelFecha.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(174, 184, 247));
        labelFecha.setText("Fecha de publicación");
        panelDatos.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        btnCotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cotizar.png"))); // NOI18N
        btnCotizar.setBorder(null);
        btnCotizar.setContentAreaFilled(false);
        btnCotizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCotizarh.png"))); // NOI18N
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        panelDatos.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 220, 50));

        labelTitulo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(174, 184, 247));
        labelTitulo.setText("Titulo");
        panelDatos.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 20));

        labelNuevosDatos.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelNuevosDatos.setForeground(new java.awt.Color(174, 184, 247));
        labelNuevosDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNuevosDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelDatos.add(labelNuevosDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 200, 30));

        labelSeccion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelSeccion.setForeground(new java.awt.Color(174, 184, 247));
        labelSeccion.setText("Sección");
        panelDatos.add(labelSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(204, 204, 204));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setBorder(null);
        txtTitulo.setOpaque(false);
        panelDatos.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 167, 318, 30));

        txtDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);
        panelDatos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 460, 50));

        labelDescripcion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(174, 184, 247));
        labelDescripcion.setText("Descripcion");
        panelDatos.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 350, -1, -1));

        ComboSecciones.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        ComboSecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionales", "Internacionales", "Deportes", "Culturales", "Económicos" }));
        ComboSecciones.setOpaque(false);
        panelDatos.add(ComboSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 20));

        validacion.setForeground(new java.awt.Color(255, 51, 51));
        validacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelDatos.add(validacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 536, 130, 20));

        flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        flecha.setBorderPainted(false);
        flecha.setContentAreaFilled(false);
        flecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaHover.png"))); // NOI18N
        flecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaMouseClicked(evt);
            }
        });
        panelDatos.add(flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titul_1.png"))); // NOI18N
        panelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 340, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/descr.png"))); // NOI18N
        panelDatos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 490, 70));

        tabs2.addTab("tab6", panelDatos);

        panelResultados.setBackground(new java.awt.Color(27, 32, 61));
        panelResultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeccionResultado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        SeccionResultado.setForeground(new java.awt.Color(204, 204, 204));
        SeccionResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeccionResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(SeccionResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 220, 36));

        fechaResultado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        fechaResultado.setForeground(new java.awt.Color(204, 204, 204));
        fechaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(fechaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 220, 34));

        datoExtra.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        datoExtra.setForeground(new java.awt.Color(204, 204, 204));
        datoExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datoExtra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(datoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 300, 35));

        descripcionResultado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        descripcionResultado.setForeground(new java.awt.Color(204, 204, 204));
        descripcionResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(descripcionResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 520, 52));

        costoResultado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        costoResultado.setForeground(new java.awt.Color(0, 153, 255));
        costoResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        costoResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(costoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 495, 250, 33));

        costoIvaResultado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        costoIvaResultado.setForeground(new java.awt.Color(0, 153, 255));
        costoIvaResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        costoIvaResultado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelResultados.add(costoIvaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 495, 250, 33));

        tituloResultado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        tituloResultado.setForeground(new java.awt.Color(204, 204, 204));
        tituloResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(tituloResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 220, 35));

        aceptarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptar.png"))); // NOI18N
        aceptarPrecio.setBorderPainted(false);
        aceptarPrecio.setContentAreaFilled(false);
        aceptarPrecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptarh.png"))); // NOI18N
        aceptarPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarPrecioMouseClicked(evt);
            }
        });
        panelResultados.add(aceptarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 230, 60));

        rechazarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rechazar.png"))); // NOI18N
        rechazarPrecio.setBorderPainted(false);
        rechazarPrecio.setContentAreaFilled(false);
        rechazarPrecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rechazarh.png"))); // NOI18N
        rechazarPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechazarPrecioMouseClicked(evt);
            }
        });
        panelResultados.add(rechazarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 230, 60));

        flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        flecha1.setBorderPainted(false);
        flecha1.setContentAreaFilled(false);
        flecha1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaHover.png"))); // NOI18N
        flecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flecha1MouseClicked(evt);
            }
        });
        panelResultados.add(flecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 255));
        jLabel27.setText("Costo");
        panelResultados.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 503, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 255));
        jLabel28.setText("Costo Iva");
        panelResultados.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultados.png"))); // NOI18N
        panelResultados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 580, 490));

        tabs2.addTab("tab7", panelResultados);

        panelActualizar.setBackground(new java.awt.Color(27, 32, 61));
        panelActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-file-50.png"))); // NOI18N
        jLabel12.setText("   Actualizar datos");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelActualizar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 41));

        txtBusqueda2.setBackground(new java.awt.Color(52, 58, 94));
        txtBusqueda2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtBusqueda2.setForeground(new java.awt.Color(204, 204, 204));
        txtBusqueda2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda2.setBorder(null);
        panelActualizar.add(txtBusqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 186, 260, 21));

        barraBsqueda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelActualizar.add(barraBsqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 280, 30));

        tablaActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Primer Apellido", "Segundo Apellido", "Edad"
            }
        ));
        tablaActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaActualizarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaActualizar);

        panelActualizar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 580, 70));

        btnBuscar.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusPainted(false);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        panelActualizar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 100, 20));

        btnActualizar.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        panelActualizar.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 310, -1));

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(122, 132, 191));
        jLabel23.setText("ID de la persona a actualizar");
        panelActualizar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        edad2.setBackground(new java.awt.Color(162, 161, 161));
        edad2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        edad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38 ", "39 ", "40 ", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        edad2.setFocusable(false);
        panelActualizar.add(edad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 537, -1, -1));

        descripcionlabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        descripcionlabel.setForeground(new java.awt.Color(200, 207, 246));
        descripcionlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionlabel.setText("Edad");
        descripcionlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelActualizar.add(descripcionlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 537, 50, 20));

        txtNombre.setBackground(new java.awt.Color(52, 58, 94));
        txtNombre.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        panelActualizar.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 334, 260, 21));

        barraBsqueda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelActualizar.add(barraBsqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 330, 280, 30));

        txtApellido.setBackground(new java.awt.Color(52, 58, 94));
        txtApellido.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setBorder(null);
        panelActualizar.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 395, 260, 21));

        barraBsqueda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelActualizar.add(barraBsqueda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 390, 280, 30));

        txtSegundoApellido.setBackground(new java.awt.Color(52, 58, 94));
        txtSegundoApellido.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSegundoApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtSegundoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSegundoApellido.setBorder(null);
        panelActualizar.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 474, 260, 21));

        barraBsqueda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelActualizar.add(barraBsqueda5, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 470, 280, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 207, 246));
        jLabel7.setText("Segundo Apellido");
        panelActualizar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 477, 100, -1));

        jLabel8.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(200, 207, 246));
        jLabel8.setText("Primer apellido");
        panelActualizar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 397, 90, -1));

        jLabel18.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(200, 207, 246));
        jLabel18.setText("Nombre");
        panelActualizar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 338, -1, -1));

        tabs2.addTab("tab2", panelActualizar);

        panelVerAnuncios.setBackground(new java.awt.Color(27, 32, 61));
        panelVerAnuncios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de Anuncio", "Sección", "Fecha", "Descripción", "Dato descriptivo", "Costo", "Costo IVA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVerDatos.setEnabled(false);
        jScrollPane1.setViewportView(tablaVerDatos);

        panelVerAnuncios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 780, 200));

        txtBusqueda.setBackground(new java.awt.Color(52, 58, 94));
        txtBusqueda.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(204, 204, 204));
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.setBorder(null);
        panelVerAnuncios.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 174, 260, 21));

        barraBsqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelVerAnuncios.add(barraBsqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 280, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-view-schedule-50.png"))); // NOI18N
        jLabel13.setText("   Anuncios vendidos");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelVerAnuncios.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 41));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(122, 132, 191));
        jLabel5.setText("Busqueda por ID");
        panelVerAnuncios.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, -1));

        btnBuscarAnuncios.setText("Buscar");
        btnBuscarAnuncios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarAnunciosMouseClicked(evt);
            }
        });
        panelVerAnuncios.add(btnBuscarAnuncios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 140, -1));

        tabs2.addTab("tab3", panelVerAnuncios);

        panelBorrar.setBackground(new java.awt.Color(27, 32, 61));
        panelBorrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdABorrar.setBackground(new java.awt.Color(52, 58, 94));
        txtIdABorrar.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtIdABorrar.setForeground(new java.awt.Color(204, 204, 204));
        txtIdABorrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdABorrar.setBorder(null);
        panelBorrar.add(txtIdABorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 186, 260, 21));

        barraBsqueda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelBorrar.add(barraBsqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 280, 30));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(122, 132, 191));
        jLabel15.setText("ID de la persona que desea eliminar");
        panelBorrar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        buscarParaBorrar.setText("Buscar");
        buscarParaBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarParaBorrarMouseClicked(evt);
            }
        });
        panelBorrar.add(buscarParaBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 90, -1));

        jLabel26.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(238, 94, 79));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-view-50 (1).png"))); // NOI18N
        jLabel26.setText("  Borrar cliente");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelBorrar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 41));

        tabs2.addTab("tab4", panelBorrar);

        panelAgregarCliente.setBackground(new java.awt.Color(27, 32, 61));
        panelAgregarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        guardarCliente.setBorderPainted(false);
        guardarCliente.setContentAreaFilled(false);
        guardarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarh.png"))); // NOI18N
        guardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarClienteMouseClicked(evt);
            }
        });
        panelAgregarCliente.add(guardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 220, 50));

        edad1.setBackground(new java.awt.Color(162, 161, 161));
        edad1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        edad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38 ", "39 ", "40 ", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        edad1.setFocusable(false);
        panelAgregarCliente.add(edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel17.setText("   Agregar cliente");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelAgregarCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 40));

        jLabel20.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(146, 155, 204));
        jLabel20.setText("Nombre");
        panelAgregarCliente.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel21.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(146, 155, 204));
        jLabel21.setText("Primer apellido");
        panelAgregarCliente.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 365, -1, -1));

        jLabel22.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(146, 155, 204));
        jLabel22.setText("Segundo apellido");
        panelAgregarCliente.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 435, -1, -1));

        jLabel24.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(146, 155, 204));
        jLabel24.setText("ID");
        panelAgregarCliente.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 225, -1, -1));

        jLabel25.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(146, 155, 204));
        jLabel25.setText("Edad");
        panelAgregarCliente.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        txtId1.setBackground(new java.awt.Color(52, 58, 94));
        txtId1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtId1.setForeground(new java.awt.Color(204, 204, 204));
        txtId1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId1.setBorder(null);
        panelAgregarCliente.add(txtId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 225, 260, 21));

        barraBsqueda6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelAgregarCliente.add(barraBsqueda6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 280, 30));

        txtNombre1.setBackground(new java.awt.Color(52, 58, 94));
        txtNombre1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre1.setBorder(null);
        panelAgregarCliente.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 295, 260, 21));

        barraBsqueda7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelAgregarCliente.add(barraBsqueda7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 280, 30));

        txtApellido1.setBackground(new java.awt.Color(52, 58, 94));
        txtApellido1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido1.setBorder(null);
        panelAgregarCliente.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 365, 260, 21));

        barraBsqueda8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelAgregarCliente.add(barraBsqueda8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 280, 30));

        txtSegundoApellido1.setBackground(new java.awt.Color(52, 58, 94));
        txtSegundoApellido1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSegundoApellido1.setForeground(new java.awt.Color(204, 204, 204));
        txtSegundoApellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSegundoApellido1.setBorder(null);
        panelAgregarCliente.add(txtSegundoApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 435, 260, 21));

        barraBsqueda9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        panelAgregarCliente.add(barraBsqueda9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 280, 30));

        tabs2.addTab("tab2", panelAgregarCliente);

        getContentPane().add(tabs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -30, 800, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    //1.agregar cliente
    //------------------------
    
    //validacion datos 
    private boolean agregarCliente(){
        
        
        try {
            archivoClientes.createNewFile();//creamos el archivo de clientes
       
        } catch (IOException ex) {
            Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
        BufferedWriter archClienteW = null;//declaramos variable con la que vamos a escribir en el archivo
        boolean guardar = true;
        
        if(archivoClientes.exists()){//si se creo, solicitamos datos
            
            
            try{
                
                archClienteW =  new BufferedWriter(new FileWriter(archivoClientes,true)); //inicializamos variable indicandole en cual archivo escribiremos
       
                //seteamos atributos del cliente
                DatosCliente.setEdad(Integer.parseInt(edad1.getSelectedItem().toString())); //guarda cada atributo
                DatosCliente.setId(Integer.parseInt(txtId1.getText()));
                DatosCliente.setNombre(txtNombre1.getText());
                DatosCliente.setPrimerApellido(txtApellido1.getText());
                DatosCliente.setSegundoApellido(txtSegundoApellido1.getText());
               
                listaCliente.add(DatosCliente);
      
                //posibles excepciones
                if(edad1.getSelectedIndex()==0){
                        throw new NullPointerException();
                }

                if(txtNombre1.getText().trim().equals("")){
                        throw new NullPointerException();
                }
                    if(txtApellido1.getText().trim().equals("")){
                        throw new NullPointerException();

                }if(txtSegundoApellido1.getText().trim().equals("")){
                        throw new NullPointerException();
                }
                     
                String idCliente = Integer.toString(DatosCliente.getId());
            
                if(idExiste(idCliente, archivoClientes)){ //si el cliente ya existe mandamos un mensaje
                    
                    guardar = false;
                    limpiarCampos();
                    
                    JOptionPane.showMessageDialog(null,"Este cliente ya está registrado, intentelo nuevamente!", "Atención!",0, incorrecto);
                    
                }else{
            
                    archClienteW.write(DatosCliente.toString()); // si no está repetido, guardamos los datos en el archivo
                
                }
 
            }catch(NullPointerException  | NumberFormatException r){
               
                JOptionPane.showMessageDialog(null,"Datos incompletos o incorrectos", "Atención!",0, incorrecto);

                guardar = false;

            } catch (IOException ex) {
                guardar = false;
            
            Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
            try {
                    
                archClienteW.close();
                
            } catch (IOException ex) {
                    Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    
        }
      
        return guardar;
    }
   
   
   //retorna si el id ya exista en el archivo especificado
    public boolean idExiste(String id, File archivo){
        
    
        BufferedReader archClienteR = null; //variable con la que se leera el archivo de clientes
        boolean existe = false;

        if(archivo.exists()){
                
            try {
                
                archClienteR = new BufferedReader(new FileReader(archivo));//se leera el archivo de clientes a tarves de archClienteR

                
                String linea;
                while((linea = archClienteR.readLine()) != null){ //se itera sobre el archivo hasta que sea null

                    StringTokenizer tokens = new StringTokenizer(linea,"-"); //separamos cada dato de archivo por un guion y cada dato antes de ese guion va a ser un token

                    int idUser = Integer.parseInt(tokens.nextToken());//idUser toma cada valor del archivo para poder compararlo con el argumento recibido
    
                    if (String.valueOf(idUser).equals(id)){//si ambos son iguales es un registro ya existente 
                         
                        existe = true;
       
                    }


                }
                
                
            } catch (IOException ex) {
                
                Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
          
            } finally{
            
                if(archClienteR != null){
                   
                    try {
                        archClienteR.close();//cerramos el archivo
                        //ir a linea 1003

                    } catch (IOException ex) {
                        Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            
            
            }
  
        }
   
        return existe;
    }
   
    
    //2.cotizar Anuncio
    //------------------------
    
    private void tipoDeAnuncio(){
       
        boolean avanzar = true;

        try{
            botonesTipoAnuncio.getSelection();
            
            if(botonesTipoAnuncio.getSelection() == null){
                
                avanzar = false;
                throw new NullPointerException();
            }
      
        }catch(NullPointerException e){
        
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de anuncio");
        }

        //avanzar significa que ya se ha elegido un tipo de anuncio
         if(avanzar){
             
             tabs2.setSelectedIndex(2);
    
            if(btnFrecuente.isSelected()){
                
                activarComponentes("Digite el descuento deseado","%");


            }else if(btnImagen.isSelected()){
                
                activarComponentes("Milimetros de la imagen", "mm");
                

            }else if(btnTradicional.isSelected()){
                
                txtvalor.setVisible(false);
                labelNuevosDatos.setVisible(false);
                labelSimbolo.setVisible(false);
                
             
            }
 
         }

    }
   
    //2.1 valida que cada dato de anuncio esté correcto
    private boolean datosValidosAnuncio(){
        
        boolean enviar = true;
        

        try{
            
            // guardamos datos  de anuncio
            anuncio.setTitulo(txtTitulo.getText());
            anuncio.setDescripcion(txtDescripcion.getText());
            SimpleDateFormat fechaFormat = new SimpleDateFormat("dd-MMMM-yyyy");//formato de fecha
            anuncio.setFecha(fechaFormat.format(jDate.getDate()));
            anuncio.setSeccion(ComboSecciones.getSelectedItem().toString());
           //sacamos costos de una vez
            anuncio.setCosto(anuncio.costo(ComboSecciones));
            anuncio.setCostoIva(anuncio.costoIva(ComboSecciones));
      
            if(btnFrecuente.isSelected() || btnImagen.isSelected()){ // si el anuncio es de cli. frecuente o conimagen
                                                                        //muestra diferentes labels y guarda en diferentes varibales
                                                                        //el valor de cada uno                              
                try{

                    if(btnFrecuente.isSelected()){
                          frecuente.setDescuentoUsuario(Double.parseDouble(txtvalor.getText())); //descuento

                    }else if(btnImagen.isSelected()){
                          conImagen.setMilimetros(Double.parseDouble(txtvalor.getText())); //milimetros

                    }

                        validacion.setText("");

                }catch(NumberFormatException e){
                        enviar = false;
                        validacion.setText("Número inválido");  
                }
            }
       
            if(txtTitulo.getText().length() > 15 ){ //este error se muestra hasta que todos los demás datos se hayan introducido

                JOptionPane.showMessageDialog(null,"El titulo no debe contener mas de 15 caracteres", "Titulo invalido",0,null); 
                enviar = false;   
            }

            if(txtTitulo.getText().trim().equals("") || txtDescripcion.getText().trim().equals("")){
                throw new NullPointerException();
            }
        
        }catch(NullPointerException ex){
            enviar = false;
            JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos", "Datos incompletos",0, null);
        
        }
       
        return enviar;  
    }
    
  
    //2.2 guardar datos de anuncio (en caso de id existente)

    private void guardarAnuncio(){

   
      try {
            archivoAnuncios.createNewFile();//creamos archivo
            
        } catch (IOException ex) {
            Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        BufferedWriter archivoAnunciosW = null;
        
        
        if(archivoAnuncios.exists()){
           
             try{
                archivoAnunciosW =  new BufferedWriter(new FileWriter(archivoAnuncios,true));
                 
               
                 //los archivos se pueden cotizar pero solo se guardan si la cedula esta registrada, por eso se solicita
                String id = JOptionPane.showInputDialog(this, "Ingrese su cedula para registrar la venta.", "Último paso.", WIDTH);

                if(idExiste(id,archivoClientes)){
                    
                  
                    archivoAnunciosW.write(anuncio.toString(Integer.parseInt(id), datoExtra.getText(), costoResultado.getText(), costoIvaResultado.getText()));

                    JOptionPane.showMessageDialog(this,"Su anuncio ha sido registrado con éxito!", "Venta completada!",0, venta);

                }else{

                    //si el cliente no existe, no se puede guardar anuncio
                    JOptionPane.showMessageDialog(this,"Cliente no registrado, registrese para guardar anuncios", "Atención!",0, alerta);

                }

             }catch(IOException e){
                 
                  JOptionPane.showMessageDialog(this,"error", "Atención!",0, null);
               
             }finally{
             
                try {

                    archivoAnunciosW.close();//cerramos archivo

                } catch (IOException ex) {
                    Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                }
             
             }
           
        }
    }
   
    //3.Actualizar datos del cliente
    //------------------------------
    
    private void actualizarDatos(){
  
  
        BufferedReader archClienteR = null; //lectura archivo de clientes
        BufferedWriter auxW = null; //escritura en archivo auxiliar
     
        if(archivoClientes.exists()){
            
          
            try {
                auxUpdate.createNewFile(); //creamos archivo auxiliar


                archClienteR = new BufferedReader(new FileReader(archivoClientes));//lectura de archivo original
                auxW =  new BufferedWriter(new FileWriter(auxUpdate,true));//escritura archivo auxiliar

                String linea;  
                while((linea = archClienteR.readLine()) != null){//se itera sobre el archivo


                    StringTokenizer tokens = new StringTokenizer(linea,"-");

                    int idCliente = Integer.parseInt(tokens.nextToken()); //cada variables guarda cada dato dentro del archivo
                    String nombre = tokens.nextToken();
                    String ape = tokens.nextToken();
                    String ape2 = tokens.nextToken();
                    int edad = Integer.parseInt(tokens.nextToken());


                    //se instancia la clase de datos del cliente
                    DatosCliente cl =  new DatosCliente(idCliente, nombre, ape, ape2, edad);

                    
                    
                    //cuando se seleccione el registro a modificar de la tabla esos valores se mostraran en los textfields
                    
                    //estos campos guardan los nuevos 
                    String Nuevonombre =  txtNombre.getText();
                    String Nuevoape = txtApellido.getText();
                    String Nuevoape2 = txtSegundoApellido.getText();
                    int Nuevaedad = Integer.parseInt(edad2.getSelectedItem().toString());



                    DatosCliente cl2 =  new DatosCliente(idCliente, Nuevonombre, Nuevoape, Nuevoape2, Nuevaedad);

                    //si el id existente es igual al recibido, se guardan los datos que ya existian (objeto cl)
                    //sino, se guardan datos nuevos (cl2)
                    if(idExiste(txtBusqueda2.getText(), archivoClientes)){
 
                        auxW.write(cl2.toString());

                    }else{

                        auxW.write(cl.toString());
                    }
                }

                JOptionPane.showMessageDialog(this, "registro actualizado con éxito!");

                String [] titulos = {"ID", "Nombre", "Primer Apellido", "Segundo Apellido", "Edad"};//titulos que tiene la tabla donde se muestrn datos

                DefaultTableModel model =  new DefaultTableModel(titulos,0);

                tablaActualizar.setModel(model);//limpia la tabla

                txtBusqueda2.setText("");//limpiamos campos 
                txtNombre.setText("");
                txtApellido.setText("");
                txtSegundoApellido.setText("");


                //cerramos ambos archivos
                auxW.close();
                archClienteR.close();

                archivoClientes.delete();//se borra el original
                File auxiliar =  new File("clientes.dat");
                auxUpdate.renameTo(auxiliar); //renombramos el auxiliar con el nombre del original

            } catch (IOException ex) {
                Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
       
    }
 
    
    //4.Ver anuncios vendidos
    //------------------------
    
    private void verAnuncios(){
               
        String [] titulos = {"ID", "Titulo", "Descripción", "Sección", "Fecha","Dato descriptivo", "Costo", "CostoIva"};
        DefaultTableModel model =  new DefaultTableModel(titulos,0);
        
        BufferedReader archAnuncioR = null;
      
        if(archivoAnuncios.exists()){
                
                
            if(idExiste(txtBusqueda.getText(), archivoAnuncios)){
                
                try {

                    archAnuncioR = new BufferedReader(new FileReader(archivoAnuncios));



                    String linea;
                    while((linea = archAnuncioR.readLine()) != null){//iteramos

                        StringTokenizer tokens = new StringTokenizer(linea,"-");
                        
                        Object[] datos = new Object[8];//creamos array de objetos
                        
                        int cont = 0; // para guardar datos en array segun index
                        
                        
                        while(tokens.hasMoreTokens()){

                            //guardamos cada dato en el array segun su posicion
                            switch(cont){
                                
                                case 0: datos[0] = tokens.nextToken(); //ID
                                break;

                                case 1:datos[1] = tokens.nextToken(); //NOMBRE
                                break;

                                case 2:datos[2] = tokens.nextToken();//DESCRIPCION.
                                break;

                                case 3:datos[3] = tokens.nextToken() ;//SECCIÓN
                                break;

                                case 4:datos[4] = tokens.nextToken() + "-" + tokens.nextToken() + "-" + tokens.nextToken();  //FECHA
                                break;

                                case 5:datos[5] = tokens.nextToken();// DATO DESCRPT.
                                break;

                                case 6:datos[6] = tokens.nextToken() ;//COSTO
                                break;

                                case 7:datos[7] = tokens.nextToken();//COSTO IVA
                                break;

                            }
                            
                            cont++;

                        }

                        
                        model.addRow(datos);
                        
                        tablaVerDatos.setModel(model);


                    }




                } catch (FileNotFoundException ex) {
                        Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                }catch (IOException ex) {
                    Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);

                }finally{
            
                    try {

                        archAnuncioR.close();

                    } catch (IOException ex) {
                        Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }else{ // si no existe el id
            
                tablaVerDatos.setModel(model); //limpiar la tabla
                JOptionPane.showMessageDialog(this, "El id ingresado no cuenta con ningún anuncio vendido.");
                txtBusqueda.setText("");

                
            
            }


        }else{ // si no existe arch de anuncios
            
            JOptionPane.showMessageDialog(this, "Aún no se han registrado ningún anuncio");
            txtBusqueda.setText("");
            
        }                             
    }
     
    //5.borrar cliente
    //------------------------------

    private void borrar(String id){
    
    
        try {
            
            archivoAnuncios.createNewFile();
            
        } catch (IOException ex) {
            Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        BufferedReader archClienteR = null; //lectura archivo de clientes
        BufferedWriter auxW = null; //escritura en archivo auxiliar
       
        if(archivoClientes.exists()){ //si existe el archivo de cliente
 
            if(idExiste(id,archivoClientes) && !idExiste(id,archivoAnuncios)){  //verificamos si el id existe o no 
                
                
                int seleccion = JOptionPane.showConfirmDialog(this, "está seguro que desea borrar sus datos?", "Atencion!",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
                if(seleccion == 0){
                   
       
                    try {
                        
                        archClienteR = new BufferedReader(new FileReader(archivoClientes));//lectura en archivo de clientes
                        auxW =  new BufferedWriter(new FileWriter(auxDelete));//escritura archivo anuncios


                        String linea;  
                        while((linea = archClienteR.readLine()) != null){ //iteramos sobre el archivo


                            StringTokenizer tokens = new StringTokenizer(linea,"-");

                            int idCliente = Integer.parseInt(tokens.nextToken()); //guardamos los datos en variables
                            String nombre = tokens.nextToken();
                            String ape = tokens.nextToken();
                            String ape2 = tokens.nextToken();
                            int edad = Integer.parseInt(tokens.nextToken());


                            DatosCliente cl =  new DatosCliente(idCliente, nombre, ape, ape2, edad);//instanciamos la clase de datos

                            if(!String.valueOf(cl.getId()).equals(id)){ //si el id dentro del archivo es diferente al recibido, se guarda info

                                auxW.write(cl.toString()); //o sea, se excluye cada dato que se encuentre en la misma linea en donde estaba el id

                            }


                        }

                        JOptionPane.showMessageDialog(this, "Cuenta borrada con éxito!", "Atención!", 0, correcto);

                        txtIdABorrar.setText("");


                        //cerramos archivo
                        auxW.close();
                        archClienteR.close();


                        archivoClientes.delete();//borramos arch original
                        File auxiliar =  new File("clientes.dat");
                        auxDelete.renameTo(auxiliar);//renombramos el auxiliar con el nombre del original


                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }else{ //si se selecciona cancelar
                    JOptionPane.showMessageDialog(this, "operación cancelada.");
                    txtIdABorrar.setText("");

                }

            // si el archivo de anuncio existe y hay anuncios guardamos relacionada con el id introducido, no se puede borrar
            }else if(idExiste(id, archivoAnuncios)){
            
                JOptionPane.showMessageDialog(this, "Sus datos no pueden borrarse ya que tiene anuncios registrados!", "ATENCION!!!", 0, alerta);
                txtIdABorrar.setText("");

            }else if(!idExiste(id,archivoClientes)){
            
                JOptionPane.showMessageDialog(this, "ID no registrado");
            }
        
           
        }else{  // si no existe el archivo de clientes
        
                JOptionPane.showMessageDialog(this, "Aún no existe ningun registro");
        }        
}  

//------------------------------------------------------------------------------------------------------ 

    
    //extras
    //busca que cliente exista y muestra datos en una tabla
    private void limpiarCampos(){
    
        txtId1.setText("");
        txtApellido1.setText("");
        txtNombre1.setText("");
        txtSegundoApellido1.setText("");
        edad1.setSelectedItem(0);
    }
  
    private void btnAvanzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvanzarMouseClicked
        
        tipoDeAnuncio();
    }//GEN-LAST:event_btnAvanzarMouseClicked


    private void btnCotizaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCotizaRMouseClicked
   
            tabs2.setSelectedIndex(1);
            logofijado.setVisible(true);
            Icon iconCotizar = new javax.swing.ImageIcon(getClass().getResource("/images/cotizarH.png"));

            btnCotizaR.setSelectedIcon(iconCotizar);
            limpiarTabla();

    
    }//GEN-LAST:event_btnCotizaRMouseClicked

    private void actualizarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarDatosMouseClicked
      
        tabs2.setSelectedIndex(4);
        Icon iconActualizar = new javax.swing.ImageIcon(getClass().getResource("/images/actualizarH.png"));

        actualizarDatos.setSelectedIcon(iconActualizar);
        logofijado.setVisible(true);
        botonesTipoAnuncio.clearSelection();
        txtTitulo.setText("");
        txtDescripcion.setText("");

    }//GEN-LAST:event_actualizarDatosMouseClicked

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
    
        tabs2.setSelectedIndex(5);
        Icon iconVer = new javax.swing.ImageIcon(getClass().getResource("/images/verH.png"));

        btnVer.setSelectedIcon(iconVer);
        botonesTipoAnuncio.clearSelection();
        txtTitulo.setText("");
        txtDescripcion.setText("");
        logofijado.setVisible(true);
        limpiarTabla();

    }//GEN-LAST:event_btnVerMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        setState(calculadoraAnuncio.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
     
             System.exit(0);        
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtvalorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorKeyPressed

        //muestra mensaje de error en caso de que el valor de los milimetros o del descuento no es un numero
        char input = evt.getKeyChar();

        try{ 

            if(btnFrecuente.isSelected()){
                frecuente.setDescuentoUsuario(Double.parseDouble(txtvalor.getText()+input));

            }else if(btnImagen.isSelected()){
                conImagen.setMilimetros(Double.parseDouble(txtvalor.getText()+input));

            }

            validacion.setText("");

        }catch(NumberFormatException e){

            validacion.setText("Numero invalido");

        }
    }//GEN-LAST:event_txtvalorKeyPressed

    private void DatosAnuncioTradicional(){
        
      
       if(anuncio.descripcion.length() <15){//sin descuento
                        
           //toma los valores de costo y les da un formato
            String costoFormat = format.format(anuncio.getCosto());
            String costoIvaFormat = format.format(anuncio.getCostoIva());
 
            //los escribe en los labels
            costoResultado.setText(String.valueOf(costoFormat));
            costoIvaResultado.setText(String.valueOf(costoIvaFormat));
            datoExtra.setText(String.valueOf("Descripción de "+ anuncio.descripcion.length()) + " caracteres (sin descuento)");

            
            
        }else if(anuncio.descripcion.length() >=15){//con descuento
           
   
            tradicional.setCosto(tradicional.costo(anuncio.costo, anuncio.descripcion));
            tradicional.setCostoIva(tradicional.costoIva());
            
            
            String costoFormatDescuento = format.format(tradicional.getCosto());
            String costoIvaFormatDescuento = format.format(tradicional.getCostoIva());
            
            
          //  le damos valores para mostrar a los fields de resultados
            costoResultado.setText(String.valueOf(costoFormatDescuento));
            costoIvaResultado.setText(String.valueOf(costoIvaFormatDescuento));
            datoExtra.setText("Descripción de "+ String.valueOf(anuncio.descripcion.length()) + " caracteres (descuento aplicable)");
     
        }
    
        mostrarDatos();

    }
    
    private void DatosAnuncioFrecuente(){
        
        frecuente.setCosto(frecuente.costo(anuncio.costo, frecuente.getDescuentoUsuario())); //seteamos valores
        frecuente.setCostoIva(frecuente.costoIva(anuncio.costo, frecuente.getCosto()));     
        
        String valorDescuento = format2.format(frecuente.getDescuentoUsuario());//le damos formato con 2 decimales a los result.
        String costoFormat = format.format(frecuente.getCosto());
        String costoIvaFormat = format.format(frecuente.getCostoIva());
 
        datoExtra.setText("Descuento de:  " + valorDescuento + "%"); //mostramos datos descriptivos
        
        costoResultado.setText(String.valueOf(costoFormat));
        costoIvaResultado.setText(String.valueOf(costoIvaFormat));
        mostrarDatos();
    
    }
   
    private void DatosAnuncioImagen(){
    
    
        conImagen.costo(anuncio.costo, conImagen.getMilimetros());
        conImagen.costoIva(conImagen.getCosto(), conImagen.getMilimetros());

        String costoFormat = format.format(conImagen.getCosto());
        String costoIvaFormat = format.format(conImagen.getCostoIva());

        costoResultado.setText(String.valueOf(costoFormat));
        costoIvaResultado.setText(String.valueOf(costoIvaFormat));

        String milimetros = format2.format(conImagen.getMilimetros());
        String costoxmilimetro = format2.format(conImagen.getMilimetros()* 25);

        datoExtra.setText( milimetros + " milimetros   (₡" + costoxmilimetro + " extra)");

        mostrarDatos();
   
    }
   
    private void mostrarDatos(){
    
        tituloResultado.setText("Titulo:    " + anuncio.titulo.toUpperCase());
        SeccionResultado.setText("Sección:    " + anuncio.seccion.toUpperCase());
        fechaResultado.setText("Fecha:    " +anuncio.fecha.toUpperCase());
        descripcionResultado.setText("Descripción:   " +anuncio.descripcion.toUpperCase());
   
    }
 
     private  void muestraClientesEnTabla(){
         
        String [] titulo = {"ID", "Nombre", "Primer apellido", "Segundo apellido","Edad"};    
        DefaultTableModel model =  new DefaultTableModel(titulo,0);
        
        BufferedReader archClienteR = null;
                
                
                
        if(archivoClientes.exists()){//verificamos que exista archivo de clientes
            
            try {

                archClienteR = new BufferedReader(new FileReader(archivoClientes));//lectura


                String linea ;

                if(idExiste(txtBusqueda2.getText(), archivoClientes)){

                        btnActualizar.setVisible(true); //si hay datos. se pueden actualizar

                    
                    while((linea = archClienteR.readLine()) != null){//iteramos sobre archivo


                        StringTokenizer tokens = new StringTokenizer(linea,"-");
                        int id = Integer.parseInt(tokens.nextToken());


                        if(id == Integer.parseInt(txtBusqueda2.getText())){//si el id existe en archivo

                            Object[] datos = new Object[5];//creamos array de objetos (lo vi en un tutoria)
                            
                            int cont = 0;

                            while(tokens.hasMoreTokens()){ //mientras el archivo tenga datos

                                //guardamos cada dato en el array segun su posicion
                                switch(cont){
                                    
                                    case 0: datos[0] =  id; //el id no se mostraba asi que lo guardé de manera directa
                                    break;

                                    case 1:datos[1] = tokens.nextToken();//nomb
                                    break;

                                    case 2:datos[2] = tokens.nextToken();//ape
                                    break;

                                    case 3:datos[3] = tokens.nextToken() ;//ape2
                                    break;

                                    case 4:datos[4] = tokens.nextToken() ;//edad

                                }
                                
                                cont++;

                            }
                               
                            model.addRow(datos);

                            tablaActualizar.setModel(model);
                        }

                    }      

                }else{

                    //si no existe el id limpiamos la tabla y mostramos mensaje
                    
                    btnActualizar.setVisible(false);
                    txtBusqueda2.setText("");
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtSegundoApellido.setText("");
                    tablaActualizar.setModel(model);
                    JOptionPane.showMessageDialog(this, "El id ingresado no está registrado.");
                } 


            } catch (FileNotFoundException ex) {
                    Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }
                catch (IOException ex) {
                Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);

            }finally{
                
                try {

                    archClienteR.close();

                } catch (IOException ex) {
                    Logger.getLogger(calculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
   
        }else{//si no aun no hay clientes registrados
            tablaActualizar.setModel(model);//limpia tabla
            JOptionPane.showMessageDialog(this, "Aún no se han registrado ninguna persona");
       }
    
    }

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed

        if(datosValidosAnuncio()){ 

            tabs2.setSelectedIndex(3);

            if(btnTradicional.isSelected()){

                DatosAnuncioTradicional();

            }else if(btnFrecuente.isSelected()){

                DatosAnuncioFrecuente();

            }else if(btnImagen.isSelected()){

                DatosAnuncioImagen();

            }

            mostrarDatos();

        }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void flechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseClicked
        tabs2.setSelectedIndex(1);// TODO add your handling code here:
    }//GEN-LAST:event_flechaMouseClicked

    private void flecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flecha1MouseClicked
        tabs2.setSelectedIndex(2);// TODO add your handling code here:
    }//GEN-LAST:event_flecha1MouseClicked

    private void rechazarPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechazarPrecioMouseClicked
        
        tabs2.setSelectedIndex(0);
        botonesTipoAnuncio.clearSelection();
        botonesBarra.clearSelection();
        logofijado.setVisible(false);
        txtTitulo.setText("");
        txtTitulo.setText("");
        txtDescripcion.setText("");
        txtDescripcion.setText("");
        txtvalor.setText("");

    }//GEN-LAST:event_rechazarPrecioMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
    
        tabs2.setSelectedIndex(6);
        logofijado.setVisible(true);
        limpiarTabla();
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void aceptarPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarPrecioMouseClicked
 
        guardarAnuncio();
  
    }//GEN-LAST:event_aceptarPrecioMouseClicked

    private void guardarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarClienteMouseClicked
       
        if(agregarCliente() ){
            
            JOptionPane.showMessageDialog(this, "Cliente agregado!", "Felicidades!", 0, correcto);
            limpiarCampos();
        }
    }//GEN-LAST:event_guardarClienteMouseClicked

    //extras
   
    private void limpiarTabla(){
     
        String [] titulos = {"ID", "Nombre", "Primer Apellido", "Segundo Apellido", "Edad"};//titulos que tiene la tabla donde se muestrn datos
                        
        DefaultTableModel model =  new DefaultTableModel(titulos,0);
        
        tablaActualizar.setModel(model);//limpia la tabla

            
        txtBusqueda2.setText("");//limpiamos campos 
        txtNombre.setText("");
        txtApellido.setText("");
        txtSegundoApellido.setText("");

     }
  
    private void barraLateralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraLateralMouseClicked

        tabs2.setSelectedIndex(0);
        botonesBarra.clearSelection();
        botonesTipoAnuncio.clearSelection();
        txtTitulo.setText("");
        txtDescripcion.setText("");
        logofijado.setVisible(false);
        limpiarTabla();

    }//GEN-LAST:event_barraLateralMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        tabs2.setSelectedIndex(7);
        logofijado.setVisible(true);

         Icon iconAgregar = new javax.swing.ImageIcon(getClass().getResource("/images/agregarH.png"));

        btnAgregar.setSelectedIcon(iconAgregar);

            limpiarTabla();

      
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        muestraClientesEnTabla();  
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarAnunciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAnunciosMouseClicked
        verAnuncios();

    }//GEN-LAST:event_btnBuscarAnunciosMouseClicked

    //cuando se selecciona un registro de la tabla, los valores dentro de ella se muestra en textfields para editar y actualizar el registro
    private void tablaActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActualizarMouseClicked
      DefaultTableModel model = (DefaultTableModel)tablaActualizar.getModel();

        int seleccion = tablaActualizar.getSelectedRow(); 
        
        //guardamos cada dato segun su posicion
        txtNombre.setText(model.getValueAt(seleccion, 1).toString());
        txtApellido.setText(model.getValueAt(seleccion, 2).toString());
        txtSegundoApellido.setText(model.getValueAt(seleccion, 3).toString());
        
        //al presionar el registro el combobox toma el valor que se habia guardado en el archivo
        String comboEdad2 =  model.getValueAt(seleccion, 4).toString(); 
        for (int i=0; i < edad2.getItemCount();i++){
        
            if(edad2.getItemAt(i).equalsIgnoreCase(comboEdad2)){
            
                edad2.setSelectedIndex(i);
                
            }
      
        }
    }//GEN-LAST:event_tablaActualizarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
    
            actualizarDatos();
    
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void buscarParaBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarParaBorrarMouseClicked
    
        
        
            borrar(txtIdABorrar.getText());
    }//GEN-LAST:event_buscarParaBorrarMouseClicked

   private void activarComponentes(String nuevosDatos, String simbolo){ //activa ciertos componentes dependiendo del panel visible
        
            labelNuevosDatos.setVisible(true);
            txtvalor.setVisible(true);
            labelSimbolo.setVisible(true);
            labelNuevosDatos.setText(nuevosDatos);
            labelSimbolo.setText(simbolo);
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraAnuncio().setVisible(true);
            }
        });
  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JComboBox<String> ComboSecciones;
    protected javax.swing.JLabel SeccionResultado;
    private javax.swing.JButton aceptarPrecio;
    private javax.swing.JToggleButton actualizarDatos;
    private javax.swing.JLabel barraBsqueda;
    private javax.swing.JLabel barraBsqueda1;
    private javax.swing.JLabel barraBsqueda2;
    private javax.swing.JLabel barraBsqueda3;
    private javax.swing.JLabel barraBsqueda4;
    private javax.swing.JLabel barraBsqueda5;
    private javax.swing.JLabel barraBsqueda6;
    private javax.swing.JLabel barraBsqueda7;
    private javax.swing.JLabel barraBsqueda8;
    private javax.swing.JLabel barraBsqueda9;
    private javax.swing.JPanel barraLateral;
    private javax.swing.ButtonGroup botonesActualizar;
    private javax.swing.ButtonGroup botonesBarra;
    private javax.swing.ButtonGroup botonesTipoAnuncio;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JToggleButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarAnuncios;
    private javax.swing.JToggleButton btnCotizaR;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JToggleButton btnFrecuente;
    private javax.swing.JToggleButton btnImagen;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnTradicional;
    private javax.swing.JToggleButton btnVer;
    private javax.swing.JButton buscarParaBorrar;
    protected javax.swing.JLabel costoIvaResultado;
    protected javax.swing.JLabel costoResultado;
    protected javax.swing.JLabel datoExtra;
    protected javax.swing.JLabel descripcionResultado;
    private javax.swing.JLabel descripcionlabel;
    public javax.swing.JComboBox<String> edad1;
    public javax.swing.JComboBox<String> edad2;
    protected javax.swing.JLabel fechaResultado;
    private javax.swing.JButton flecha;
    private javax.swing.JButton flecha1;
    private javax.swing.JButton guardarCliente;
    protected com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelFecha;
    protected javax.swing.JLabel labelNuevosDatos;
    private javax.swing.JLabel labelSeccion;
    protected javax.swing.JLabel labelSimbolo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel logofijado;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JPanel panelAgregarCliente;
    private javax.swing.JPanel panelBorrar;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JPanel panelTipoAnuncio;
    private javax.swing.JPanel panelVerAnuncios;
    private javax.swing.JButton rechazarPrecio;
    private javax.swing.JTable tablaActualizar;
    private javax.swing.JTable tablaVerDatos;
    private javax.swing.JTabbedPane tabs2;
    protected javax.swing.JLabel tituloResultado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtBusqueda2;
    protected javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtIdABorrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoApellido1;
    protected javax.swing.JTextField txtTitulo;
    protected javax.swing.JTextField txtvalor;
    protected javax.swing.JLabel validacion;
    // End of variables declaration//GEN-END:variables
}