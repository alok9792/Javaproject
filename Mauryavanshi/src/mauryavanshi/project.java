

package mauryavanshi;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHUBHAM
 */public class project extends javax.swing.JFrame {
int row,row1,q=0,i,i1,i2; Statement stm=null; String c,n;int no,Available,maximum;
int p=15000,p1=25000,p2=45000,r;double total; int id=101;
int dinner,fast,lunch;
@SuppressWarnings("static-access")

 public void conn(){
   try{ Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
    stm=con.createStatement();
   }
   catch(Exception e){
   msg.showMessageDialog(null,e,"Error",0);   }
 }
 
 
@SuppressWarnings("static-access")
 public void standard(){
     int i=1;
                       String rm="";
                       try{
                row=stm.executeUpdate("insert into booked values("+id+",'"+n+"','"+c+"','Standard',"+r+",'00')");
                       }
                       catch(Exception e)
                       {
                            msg.showMessageDialog(null,e,"Error",0); 
                       }

     while(i<=r){ 
     
 try{
         ResultSet max=stm.executeQuery("select min(room_no) as room from rooms where status='A'and Room_Type='Standard'");

         while(max.next()){
          maximum=max.getInt("room");
        //maximum=maximum+1;
        rm=rm+maximum+",";
         } }
         catch(Exception e){
msg.showMessageDialog(null,e,"Error",0);
}
   
         try{
                
i++;

 row1=stm.executeUpdate("Update rooms set cust_id="+id+",Status='U' where room_No="+maximum+"");
          
          } 
 
catch(Exception e){
msg.showMessageDialog(null,e,"Error",0);
}}
   
                 try{
                 int s=stm.executeUpdate("Update booked set room_No='"+rm+"' where cust_id="+id+"");
                 if(s!=0)
                 {
                                           
                msg.showMessageDialog(null,"Thanku!,Your room booked"); 
      
                msg.showMessageDialog(null,"Your bill of "+r+" Standard Room is: "+total+" per day and your Reg. No. is: "+id+"\n"+" Your Room Numbers Are: "+rm,"Bill",1); 
              form.setVisible(false);
                 }
                 }
                 catch(Exception e)
                 {
                              msg.showMessageDialog(null,e,"Error",0);
               
                 }
                 
 }
@SuppressWarnings("static-access")
 public void delux(){
     int i=1;
                       String rm="";
                       try{
                row=stm.executeUpdate("insert into booked values("+id+",'"+n+"','"+c+"','Delux',"+r+",'00')");
                       }
                       catch(Exception e)
                       {
msg.showMessageDialog(null,e,"Error",0);
                           
                       }

     while(i<=r){ 
     
 try{
         ResultSet max=stm.executeQuery("select min(room_no) as room from rooms where status='A'and Room_Type='Delux'");
        
         while(max.next()){
          maximum=max.getInt("room");
          if(maximum==0)
          {maximum=15;
          
          }
     //   maximum=maximum+1;
        rm=rm+maximum+",";
         } }
         catch(Exception e){
msg.showMessageDialog(null,e,"Error",0);
}
   
         try{
                
i++;

 row1=stm.executeUpdate("Update rooms set cust_id="+id+",Status='U' where room_No="+maximum+"");
          
          } 
 
catch(Exception e){
msg.showMessageDialog(null,e,"Error",0);
}}
   
                 try{
                 int s=stm.executeUpdate("Update booked set room_No='"+rm+"' where cust_id="+id+" and room_type='Delux'");
                 if(s!=0)
                 {
                                           
                msg.showMessageDialog(null,"Thanku!,Your room booked"); 
      
                msg.showMessageDialog(null,"Your bill of "+r+" Delux Room is: "+total+" per day and your Reg. No. is: "+id+"\n"+" Your Room Numbers Are: "+rm,"Bill",1); 
              form.setVisible(false);
                 }
                 }
                 catch(Exception e)
                 {
                              msg.showMessageDialog(null,e,"Error",0);
               
                 }
  
 }
 
 
@SuppressWarnings("static-access")
 public void superdelux(){
     int i=1;
                       String rm="";
                       try{
                row=stm.executeUpdate("insert into booked values("+id+",'"+n+"','"+c+"','Super Delux',"+r+",'00')");
                       }
                       catch(Exception e)
                       {
msg.showMessageDialog(null,e,"Error",0);
                           
                       }

     while(i<=r){ 
     
 try{
         ResultSet max=stm.executeQuery("select min(Room_No) as room from rooms where status='A'and Room_Type='Super_Delux'");

         while(max.next()){
          maximum=max.getInt("room");
          if(maximum==0)
          {
              maximum=15;
          }
        //maximum=maximum+1;
        rm=rm+maximum+",";
         } }
         catch(Exception e){
msg.showMessageDialog(null,e,"Error",0);
}
   
         try{
                
i++;

 row1=stm.executeUpdate("Update rooms set cust_id="+id+",Status='U' where room_No="+maximum+"");
          
          } 
 
catch(Exception e){
msg.showMessageDialog(null,e,"Error",0);
}}
   
                 try{
                 int s=stm.executeUpdate("Update booked set room_No='"+rm+"' where cust_id="+id+" and room_type='Super Delux'");
                 if(s!=0)
                 {
                                           
                msg.showMessageDialog(null,"Thanku!,Your room booked"); 
      
                msg.showMessageDialog(null,"Your bill of "+r+" Super Delux Room is: "+total+" per day and your Reg. No. is: "+id+"\n"+" Your Room Numbers Are: "+rm,"Bill",1); 
              form.setVisible(false);
                 }
                 }
                 catch(Exception e)
                 {
                              msg.showMessageDialog(null, e,"Error",0);
               
                 }
     
 }
    /**
     * Creates new form project
     */
    public project() {
        initComponents();
    buttonGroup1.add(rb);
    buttonGroup1.add(rb1);
    buttonGroup1.add(rb2);
   buttonGroup2.add(rb3);
    buttonGroup2.add(rb4);
    buttonGroup2.add(rb5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg = new javax.swing.JOptionPane();
        jOptionPane1 = new javax.swing.JOptionPane();
        form = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        rb = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel20 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        BOOK = new javax.swing.JButton();
        roompic = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        check_out = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        OUT = new javax.swing.JButton();
        login = new javax.swing.JFrame();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        LOGIN = new javax.swing.JButton();
        food_processor = new javax.swing.JFrame();
        choose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Break_F = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        item = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        Lunch = new javax.swing.JComboBox();
        item1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        amount1 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        Dinner = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        amount2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        LOGIN1 = new javax.swing.JFrame();
        jLabel36 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        LOGin1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CHECK_IN = new javax.swing.JButton();
        CHECK_OUT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        food = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        form.setTitle("Room_Booking_Proccess");
        form.setAlwaysOnTop(true);
        form.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                WindowActivated(evt);
            }
        });

        jLabel14.setText("Enter Name");

        jLabel15.setText("Duration");

        jLabel27.setText("Reg.No.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        rb3.setText("Cash");

        rb4.setText("Visa");

        rb5.setText("Maestro");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(rb3)
                .addGap(99, 99, 99)
                .addComponent(rb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb5)
                .addGap(52, 52, 52))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb3)
                    .addComponent(rb4)
                    .addComponent(rb5))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(rb3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rb4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rb5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel16.setText("Payment_Mode");

        rb.setText("Standard");
        rb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbItemStateChanged(evt);
            }
        });
        rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActionPerformed(evt);
            }
        });

        rb1.setText("Delux");
        rb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb1ItemStateChanged(evt);
            }
        });
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb2.setText("Super Delux");
        rb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb2ItemStateChanged(evt);
            }
        });
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 204));
        jLabel18.setText("Charge of the room per day:");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 51)));

        lb.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        lb.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 0)));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb1)
                        .addGap(85, 85, 85)
                        .addComponent(rb2)))
                .addGap(41, 41, 41))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb)
                    .addComponent(rb1)
                    .addComponent(rb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane2.setLayer(rb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(rb1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(rb2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel17.setText("Room_Type");

        jLabel20.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 102));
        jLabel20.setText("Enter no.of Room");

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane3.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(tf2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel19.setText("Requirment");

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 102));
        jLabel21.setText("Total Price per day:");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 51)));

        lb1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lb1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 0)));

        BOOK.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BOOK.setText("BooK");
        BOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKActionPerformed(evt);
            }
        });
        BOOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                krel(evt);
            }
        });

        roompic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mauryavanshi/a1.jpg"))); // NOI18N

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form.getContentPane());
        form.getContentPane().setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jDesktopPane1)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel19))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel17))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel16)))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(roompic)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(BOOK)
                        .addGap(193, 193, 193))))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roompic, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BOOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("jLabel13");

        check_out.setTitle("Check_Out");

        lb3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel25.setText("Room_Type");

        lb4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel26.setText("No. of Rooms");

        jLabel28.setText("Duration");

        lb5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(lb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        OUT.setText("Check_out");
        OUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OUTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout check_outLayout = new javax.swing.GroupLayout(check_out.getContentPane());
        check_out.getContentPane().setLayout(check_outLayout);
        check_outLayout.setHorizontalGroup(
            check_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(check_outLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(OUT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        check_outLayout.setVerticalGroup(
            check_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(check_outLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OUT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        login.setTitle("Login");

        jLabel30.setText("Enter your Reg. No.");

        jLabel31.setText("Enter your name");

        LOGIN.setText("Login");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login.getContentPane());
        login.getContentPane().setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(LOGIN)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LOGIN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        food_processor.setTitle("Select  your food");

        choose.setText("Ok");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });

        Break_F.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BREAK_FAST", "Veg_Sandwich\t- 20/-", "Grilled_Sandwich\t- 40/-", "Tea\t\t- 50/-", "Coffee\t\t- 80/-", "Egg_Fry\t\t- 100/-", "Half_Fry\t\t- 120/-", "Omlet \t\t- 150/-", "Tea_&_Biscuits\t- 150/-", "Coffee_&_Snacks\t- 150/-", "Sandwich_&_Tea/Coffee\t- 200/-                            ", " " }));
        Break_F.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Break_FItemStateChanged(evt);
            }
        });
        Break_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Break_FActionPerformed(evt);
            }
        });

        jLabel24.setText("item");

        item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel37.setText("Quantity");

        jLabel38.setText("Total");

        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QTY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(item, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Break_F, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(52, 52, 52))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Break_F, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Lunch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LUNCH", "Rumali Roti\t\t- 10/-", "Naan\t\t- 20/-", "Noodles             \t- 50/-", "Veg_Kabbab   \t- 80/-", "Mutton_Kabbab\t- 100/-", "Fried_Rice\t\t- 150/-", "Manchurian\t\t- 200/-", "Chilly_Paneer\t- 200/-", "Paneer_Tikka\t- 300/-", "Chiken _Masala\t- 350/-", "Butter_Chicken\t- 400/-", " " }));
        Lunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunchActionPerformed(evt);
            }
        });

        item1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel29.setText("item");

        jLabel22.setText("Quantity");

        jLabel35.setText("Total");

        amount1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QTY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Lunch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Lunch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox6)
                    .addComponent(amount1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dinner.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DINNER", "Indian_Food    -  200/-", "South_Indian   - 250/-", "Punjabi             - 280/-", "Chinese             - 280/-", "Chicken_Biryani - 100/-", "Chicken_Lollipops- 150/-", "Veg_Biryani        - 80/- ", "Chicken_Tika      - 180/-                                  ", "Paneer_Tika       - 100/-                   ", "Chilli_Paneer       - 160/-", "Daal_Makhani     - 80/-", "Fried_Rice          -  90/-     ", "Masala_Korma    -  60/-", "Chicken_Korma   - 100/-", "Malaee_Koptaa   - 85/-", " " }));
        Dinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinnerActionPerformed(evt);
            }
        });

        jLabel32.setText("item");

        item2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        amount2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel34.setText("Total");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QTY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel33.setText("Quantity");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Dinner, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(54, 54, 54))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Dinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(amount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout food_processorLayout = new javax.swing.GroupLayout(food_processor.getContentPane());
        food_processor.getContentPane().setLayout(food_processorLayout);
        food_processorLayout.setHorizontalGroup(
            food_processorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(food_processorLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(food_processorLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(choose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        food_processorLayout.setVerticalGroup(
            food_processorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, food_processorLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(food_processorLayout.createSequentialGroup()
                .addGroup(food_processorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choose))
        );

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LOGIN1.setTitle("Login for food");

        jLabel36.setText("Enter your Reg. No.");

        jLabel39.setText("Enter your name");

        LOGin1.setText("Login");
        LOGin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LOGIN1Layout = new javax.swing.GroupLayout(LOGIN1.getContentPane());
        LOGIN1.getContentPane().setLayout(LOGIN1Layout);
        LOGIN1Layout.setHorizontalGroup(
            LOGIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN1Layout.createSequentialGroup()
                .addGroup(LOGIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(LOGIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LOGIN1Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LOGIN1Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LOGIN1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(LOGin1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        LOGIN1Layout.setVerticalGroup(
            LOGIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(LOGIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LOGIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LOGin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        jLabel12.setText("Divyanshi Maurya");

        jLabel11.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel11.setText("Owned by:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Lists of Facilities and Price of Hotel ");

        CHECK_IN.setText("CHECK_IN");
        CHECK_IN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_INActionPerformed(evt);
            }
        });

        CHECK_OUT.setText("CHECK_OUT");
        CHECK_OUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_OUTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel3.setText("Hotel Mauryavanshi");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 0, 20)); // NOI18N
        jLabel4.setText("Facilities of hotel:");

        jLabel5.setText("a).Fully  Air-Conditioner");

        jLabel6.setText("b).Swimming Pool");

        jLabel7.setText("c).Small Restaurant");

        jLabel8.setText("d).A Big Hall");

        jLabel9.setText("e).24-hours Supply Electricity and water ");

        jLabel10.setText("f).Garden for Walking and Sitting");

        jTable1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Standard",  new Integer(15000)},
                {"Delux",  new Integer(25000)},
                {"Super Delux",  new Integer(45000)}
            },
            new String [] {
                "Room_Type", "Charge"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Owned by:");

        jLabel2.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        jLabel2.setText("Divyanshi Maurya");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        food.setText("Food");
        food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(CHECK_IN)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CHECK_OUT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHECK_IN)
                    .addComponent(CHECK_OUT)
                    .addComponent(food))
                .addGap(22, 22, 22)
                .addComponent(exit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHECK_INActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_INActionPerformed
   
       form.setVisible(true);
       form.setBounds(0,0,450,650);// TODO add your handling code here:
       conn();
       try{
           ResultSet rs1=stm.executeQuery("select max(Cust_id)+1 as maxid from booked");
           while(rs1.next()){
           id=rs1.getInt("maxid");
           String s=jLabel23.getText()+id;
           jLabel23.setText(s);
       }}
       catch(SQLException sql)
       {
           msg.showMessageDialog(null,sql.toString());
           id=101;
           String s=jLabel23.getText()+id;
           jLabel23.setText(s);
       
       }
    }//GEN-LAST:event_CHECK_INActionPerformed

    @SuppressWarnings({"static-access", "static-access"})
    private void CHECK_OUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_OUTActionPerformed
login.setVisible(true);
login.setBounds(000,000,325,200);
// TODO add your handling code here:
    }//GEN-LAST:event_CHECK_OUTActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb5ActionPerformed

@SuppressWarnings({"static-access","UseSpecificCatch", "BroadCatchBlock", "TooBroadCatch"})
    private void BOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKActionPerformed
    
      
if(tf.getText().equals("")||tf1.getText().equals("")||tf2.getText().equals("")||lb.getText().equals(""))
        {
  msg.showMessageDialog(null,"Please,fill all fields","Warning",2);    
}
else
{
    n=tf.getText();
    c=tf1.getText();
   conn();

   try
   {
if(rb.isSelected()==true)
       {
        standard();                
       
       }
       else if(rb1.isSelected()==true)
       { 
        delux(); 
       }
       else if(rb2.isSelected()==true)
       {
       superdelux();
      
       }      
   }  
catch(Exception e){
 msg.showMessageDialog(null,e,"Error",0);
}
}

// TODO add your handling code here:
    }//GEN-LAST:event_BOOKActionPerformed

    private void krel(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_krel
/*double price=Double.parseDouble(lb.getText());
r=Integer.parseInt(tf2.getText());
double total=(double)price*r;
lb1.setText(""+total);*/                  // TODO add your handling code here:
    }//GEN-LAST:event_krel

    private void rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_rbActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowActivated
lb.disable();
lb1.disable();

    }//GEN-LAST:event_WindowActivated

@SuppressWarnings("static-access")
    private void tf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyReleased
double price=Double.parseDouble(lb.getText());
r=Integer.parseInt(tf2.getText());
total=(double)price*r;
lb1.setText(""+total);
if(rb.isSelected()==true){// TODO add your handling code here:
conn();
try{
    ResultSet rooms=stm.executeQuery("Select count(*)as Available from rooms where Room_Type='Standard'and Status='A'");
    while(rooms.next()){
         Available=rooms.getInt("Available");
        if(r>Available){
               msg.showMessageDialog(null,"we have only "+Available+" rooms","Warning",2);
               tf2.setText("");
        }
}}
catch(Exception e){
     msg.showMessageDialog(null,e);
}}
if(rb1.isSelected()==true){// TODO add your handling code here:
conn();
try{
    ResultSet rooms=stm.executeQuery("Select count(*)as Available from rooms where Room_Type='Delux'and Status='A'");
    while(rooms.next()){
       Available=rooms.getInt("Available");
        if(r>Available){
               msg.showMessageDialog(null,"we have only "+Available+" rooms","Warning",2);
                    tf2.setText("");

        }
}}
catch(Exception e){
     msg.showMessageDialog(null,e);
}}
if(rb2.isSelected()==true){// TODO add your handling code here:
conn();
try{
    ResultSet rooms=stm.executeQuery("Select count(*)as Available from rooms where Room_Type='Super_Delux'and Status='A'");
    while(rooms.next()){
        Available=rooms.getInt("Available");
        if(r>Available){
               msg.showMessageDialog(null,"we have only "+Available+" rooms","Warning",2);
                    tf2.setText("");

        }
}}
catch(Exception e){
     msg.showMessageDialog(null,e);
}}
    }//GEN-LAST:event_tf2KeyReleased

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        conn();
        try{
            ResultSet rs=stm.executeQuery("Select * from booked where cust_id="+tf4.getText()+" and name='"+tf5.getText()+"'");
            while(rs.next()){
            int roomno=rs.getInt("Room_No");
            if(roomno==0){
                msg.showMessageDialog(null,"You have already check out");
               // check_out.setVisible(false);               
                login.setVisible(false);
            }
            else if(roomno>0){
                check_out.setVisible(true);
                check_out.setBounds(300,300,420,200);
                String type=rs.getString("room_type");
                int required=rs.getInt("room_required");
                String duration=rs.getString("duration");
                lb3.setText(""+type);
                lb4.setText(""+required);
                lb5.setText(""+duration);
                
            }
            else{
                                msg.showMessageDialog(null,"wrong");

            }                                         
            }  
        }
        catch(Exception e){
            jOptionPane1.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_LOGINActionPerformed

    private void OUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OUTActionPerformed
conn();
try{
  int row1=stm.executeUpdate("update booked set room_no=000 where cust_id="+tf4.getText());
    int row2=stm.executeUpdate("Update rooms set cust_id=0,status='A' where cust_id="+tf4.getText());
    if(row2!=0&&row1!=0){
        String str[]={"Yes","NO"};
int choose=JOptionPane.showOptionDialog(rootPane,"Are You Sure?","Confirm",0,JOptionPane.QUESTION_MESSAGE,null,str,"Yes");
 if(choose==0){
     JOptionPane.showMessageDialog(null,"You has successfully checked out");
     check_out.setVisible(false);
      login.setVisible(false);
 }
 else{
      check_out.setVisible(false);
      login.setVisible(false);
 
 }
    }
    
}
catch(Exception e){
         msg.showMessageDialog(null,e);

}
    }//GEN-LAST:event_OUTActionPerformed

    private void DinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinnerActionPerformed
        dinner=Dinner.getSelectedIndex();
        jComboBox7.setSelectedIndex(0);
        switch(dinner)
        {
            case 0:
                item2.setText("");
                amount2.setText("");
                break;
            case 1: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
                case 2: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
       case 3: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
           case 4: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
               case 5: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
                   case 6: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
                       case 7: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
                       case 8: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
                       case 9: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
          case 10: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
          case 11: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
          case 12: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
          case 13: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
          case 14: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
          case 15: item2.setText(Dinner.getSelectedItem().toString());
           amount2.setText("");break;
        }
    }//GEN-LAST:event_DinnerActionPerformed

    private void LunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunchActionPerformed

        lunch=Lunch.getSelectedIndex();
        jComboBox6.setSelectedIndex(0);
        switch(lunch)
        {
            case 0:
                item1.setText("");
                amount1.setText("");
                break;
            case 1: 
                item1.setText(Lunch.getSelectedItem().toString());
           amount1.setText("");
                break;
                case 2:
                    item1.setText(Lunch.getSelectedItem().toString());
           amount1.setText("");
                break;
       case 3: 
           item1.setText(Lunch.getSelectedItem().toString());
           amount1.setText("");
                break;
           case 4:
               item1.setText(Lunch.getSelectedItem().toString());
           amount1.setText("");
                break;
               case 5:
                   item1.setText(Lunch.getSelectedItem().toString());
           amount1.setText("");
                break;
                   case 6:
                       item1.setText(Lunch.getSelectedItem().toString());
              amount1.setText("");
                break;
                       case 7: 
                           item1.setText(Lunch.getSelectedItem().toString());
              amount1.setText("");
                break;
                       case 8:
                           item1.setText(Lunch.getSelectedItem().toString());
              amount1.setText("");
                break;
                       case 9:
                           item1.setText(Lunch.getSelectedItem().toString());
                                             amount1.setText("");
                break;

                       case 10:
                           item1.setText(Lunch.getSelectedItem().toString());
                                    amount1.setText("");

                   }
                            
    }//GEN-LAST:event_LunchActionPerformed

    private void Break_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Break_FActionPerformed

        fast=Break_F.getSelectedIndex();
        jComboBox5.setSelectedIndex(0);
               switch(fast)
        {
               case 0:
                   amount.setText("");
                   item.setText("");
                   break;
                case 1:
                item.setText(Break_F.getSelectedItem().toString());
                                       amount.setText("");
                            
                                       break;    
            case 2:
                    item.setText(Break_F.getSelectedItem().toString());
                                  amount.setText("");
                    break;
         case 3: 
           item.setText(Break_F.getSelectedItem().toString());
                                  amount.setText("");
                break;
    case 4: 
               item.setText(Break_F.getSelectedItem().toString());
                                      amount.setText("");
             break;
           case 5:
                   item.setText(Break_F.getSelectedItem().toString());
                                          amount.setText("");
             break;
               case 6:
                       item.setText(Break_F.getSelectedItem().toString());
                           amount.setText("");
             break;
                   case 7:
                     item.setText(Break_F.getSelectedItem().toString());
                                                      amount.setText("");
             break;
                       case 8:
                           item.setText(Break_F.getSelectedItem().toString());
                                                      amount.setText("");
             break;
                       case 9:
                           item.setText(Break_F.getSelectedItem().toString());
                                                      amount.setText("");
             break;
                       case 10:
                           item.setText(Break_F.getSelectedItem().toString());
                           amount.setText("");
        }
 
    }//GEN-LAST:event_Break_FActionPerformed

    private void rbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbItemStateChanged
      if(rb.isSelected()==true){
tf2.setText("");    
    lb1.setText("");
roompic.setIcon(new ImageIcon("E://Hotel_Management_Project_Java/Standard.jpg"));
            lb.setText(""+p);
            
  }
    }//GEN-LAST:event_rbItemStateChanged

    private void rb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb1ItemStateChanged
if(rb1.isSelected()==true) {
    tf2.setText(""); 
    lb1.setText("");
    roompic.setIcon(new ImageIcon("E://Hotel_Management_Project_Java/Delux.jpg"));
            lb.setText(""+p1);
        } 
    }//GEN-LAST:event_rb1ItemStateChanged

    private void rb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb2ItemStateChanged
      if(rb2.isSelected()==true){
    tf2.setText(""); 
    lb1.setText("");
    roompic.setIcon(new ImageIcon("E://Hotel_Management_Project_Java/Super_Delux.jpg"));
            lb.setText(""+p2);
        }     
    }//GEN-LAST:event_rb2ItemStateChanged

    private void foodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodActionPerformed
LOGIN1.setVisible(true);
LOGIN1.setBounds(000,000,325,200);

 // TODO add your handling code here:
    }//GEN-LAST:event_foodActionPerformed

@SuppressWarnings("static-access")
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
i=jComboBox5.getSelectedIndex();
switch(fast){
    case 0:
        amount.setText("");
        break;
    case 1:
        amount.setText(""+i*20);break;
    case 2:
        amount.setText(""+i*40);break;
    case 3:
        amount.setText(""+i*50);break;
    case 4:
        amount.setText(""+i*80);break;
    case 5:
        amount.setText(""+i*100);break;
    case 6:
        amount.setText(""+i*120);break;
    case 7:
        amount.setText(""+i*150);break;
    case 8:
        amount.setText(""+i*150);break;
    case 9:
        amount.setText(""+i*150);break;
    case 10:
        amount.setText(""+i*200);break;    
}
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
 i1=jComboBox6.getSelectedIndex();
switch(lunch){
    case 0:
        amount1.setText("");
        break;
    case 1:
        amount1.setText(""+i1*10);break;
    case 2:
        amount1.setText(""+i1*20);break;
    case 3:
        amount1.setText(""+i1*50);break;
    case 4:
        amount1.setText(""+i1*80);break;
    case 5:
        amount1.setText(""+i1*100);break;
    case 6:
        amount1.setText(""+i1*150);break;
    case 7:
        amount1.setText(""+i1*200);break;
    case 8:
        amount1.setText(""+i1*200);break;
    case 9:
        amount1.setText(""+i1*300);break;
    case 10:
        amount1.setText(""+i1*350);break;    
    case 11:
        amount1.setText(""+i1*400);break;    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
i2=jComboBox7.getSelectedIndex();
switch(dinner){
    case 0:
        amount2.setText("");
        break;
    case 1:
        amount2.setText(""+i2*200);break;
        
    case 2:
        amount2.setText(""+i2*250);break;
    case 3:
        amount2.setText(""+i2*280);break;
    case 4:
        amount2.setText(""+i2*280);break;
    case 5:
        amount2.setText(""+i2*100);break;
    case 6:
        amount2.setText(""+i2*150);break;
    case 7:
        amount2.setText(""+i2*80);break;
    case 8:
        amount2.setText(""+i2*180);break;
    case 9:
        amount2.setText(""+i2*100);break;
    case 10:
        amount2.setText(""+i2*160);break;    
    case 11:
        amount2.setText(""+i2*80);break;    
    case 12:
        amount2.setText(""+i2*90);break;
    case 13:
        amount2.setText(""+i2*60);break;    
    case 14:
        amount2.setText(""+i2*100);break;
    case 15:
        amount2.setText(""+i2*85);break;    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

@SuppressWarnings("static-access")
    private void LOGin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGin1ActionPerformed
  conn();
        try{
            ResultSet rs=stm.executeQuery("Select * from booked where cust_id="+tf6.getText()+" and name='"+tf7.getText()+"'");
            while(rs.next()){
            int roomno=rs.getInt("Room_No");
            if(roomno==0){
                msg.showMessageDialog(null,"You have check out");
                            
                LOGIN1.setVisible(false);
            }
            else if(roomno>0){
                food_processor.setVisible(true);
food_processor.setBounds(300,300,800,280);
            }
              else{
                                msg.showMessageDialog(null,"wrong");
            }
          
            }}
        catch(Exception e){
msg.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_LOGin1ActionPerformed

@SuppressWarnings({"static-access", "static-access"})
    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
msg.showMessageDialog(null,"Thank U your order booked");
msg.showMessageDialog(null,"Your cost of "+ i +" "+ item.getText()+" is: Rs "+ amount.getText()+'\n'+"Your cost of "+ i1 +" "+ item1.getText()+" is: Rs "+amount1.getText()+'\n'+"Your cost of "+ i2 +" "+ item2.getText()+" is: Rs "+amount2.getText(),"Bill",1);
LOGIN1.setVisible(false);
food_processor.setVisible(false);        
// TODO add your handling code here:
    }//GEN-LAST:event_chooseActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void Break_FItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Break_FItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Break_FItemStateChanged

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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new project().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOK;
    private javax.swing.JComboBox Break_F;
    private javax.swing.JButton CHECK_IN;
    private javax.swing.JButton CHECK_OUT;
    private javax.swing.JComboBox Dinner;
    private javax.swing.JButton LOGIN;
    private javax.swing.JFrame LOGIN1;
    private javax.swing.JButton LOGin1;
    private javax.swing.JComboBox Lunch;
    private javax.swing.JButton OUT;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel amount1;
    private javax.swing.JLabel amount2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFrame check_out;
    private javax.swing.JButton choose;
    private javax.swing.JButton exit;
    private javax.swing.JButton food;
    private javax.swing.JFrame food_processor;
    private javax.swing.JFrame form;
    private javax.swing.JLabel item;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item2;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JFrame login;
    private javax.swing.JOptionPane msg;
    private javax.swing.JRadioButton rb;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JLabel roompic;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
    }
