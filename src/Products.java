
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KC
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
    }
    DefaultTableModel model;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldItem = new javax.swing.JTextField();
        jTextFieldQty = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldnewItem = new javax.swing.JTextField();
        jTextFieldqty = new javax.swing.JTextField();
        jTextFieldprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_Update = new javax.swing.JButton();
        jButton_Display = new javax.swing.JButton();
        jTextField_item = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_Delete = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();
        jScrollPane_1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add.setText("ADD");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price");

        jButton_Clear.setText("CLEAR");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(jTextFieldQty)
                    .addComponent(jTextFieldItem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Clear)))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("New Item Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Add quantity");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Price");

        jButton_Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Update.setText("Save changes");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldprice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldqty, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Update)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton_Update)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        jButton_Display.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Display.setText("Display Products");
        jButton_Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DisplayActionPerformed(evt);
            }
        });

        jTextField_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_itemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Item");

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.setBorder(null);
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Quantity", "Price"
            }
        ));
        jScrollPane_1.setViewportView(jTable);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCT LIST");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jButton_Display)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Back)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane_1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_item, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane_1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Back))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_itemActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        this.toBack();
        setVisible(false);
        new Cashier().toFront();
        new Cashier().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DisplayActionPerformed
               
            try {

            BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

            String[] item = new String[1000];
            String[] temp;
            int num = 100;

            int x = 0;  //read item
            while ((item[x] = rdfile.readLine()) != null) {
                temp = item[x].trim().split("\t"); 
                num += 1;
                model = (DefaultTableModel)jTable.getModel();
                    model.addRow(new Object [] {                            
                        num,
                        temp[0],
                        temp[1],
                        temp[2],                           
                    });
                x++;
            }
            rdfile.close();

            } catch (IOException e) {
        }                    
    }//GEN-LAST:event_jButton_DisplayActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        try {
            if (jTextFieldItem.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "", JOptionPane.ERROR_MESSAGE);
            } else {
                
                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));
                
                model = (DefaultTableModel)jTable.getModel();
                
                String[] line = new String[1000];
                String item = "";
                int quantity = 0;
                double price = 0.0;
                boolean found = false;
                int prodID = model.getRowCount()+100;

                int i = 0;
                while ((line[i] = rdfile.readLine()) != null) {
                    i++;
                }
                rdfile.close();

                if (!(i >= 1000)) {
                    item = jTextFieldItem.getText();

                    for (int j = 0; line[j] != null; j++) {      //check whether item is in the list already
                        String[] temp = line[j].split("\t");
                        if (item.equals(temp[0])) {
                            found = true;
                        }
                    }
                    if (found) {
                        JOptionPane.showMessageDialog(null, "Item already exist!", "", JOptionPane.WARNING_MESSAGE);
                    
                    } else {
                        quantity = Integer.parseInt(jTextFieldQty.getText());
                        price = Double.parseDouble(jTextFieldPrice.getText());
                        
                        prodID += 1;
                        model = (DefaultTableModel)jTable.getModel();
                        model.addRow(new Object [] {                            
                            prodID,
                            item,
                            quantity,
                            price,                           
                        });

                        line[i] = item + "\t" + quantity + "\t" + price;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));

                        for (int j = 0; line[j] != null; j++) {
                            wrfile.println(line[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Succesfully Added!", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventory Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }
            jTextFieldItem.setText("");
            jTextFieldQty.setText("");
            jTextFieldPrice.setText("");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "Warning!", JOptionPane.WARNING_MESSAGE);
            
            jTextFieldItem.setText("");
            jTextFieldQty.setText("");
            jTextFieldPrice.setText("");
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        jTextFieldItem.setText("");
        jTextFieldQty.setText("");
        jTextFieldPrice.setText("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
         try{
            if( jTextFieldID.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please enter an item", "No Input!", JOptionPane.ERROR_MESSAGE);
           
            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("items.txt"));

                String[] line= new String[1000];
                String temp[];
                String item = "", newItem = "", Qty = "", Price = "";
                int id = (Integer.parseInt(jTextFieldID.getText()))-101; // (ID - 101) to determine the row index
                int qty=0, i=0; double price=0.0;
                boolean found = false;

                newItem = jTextFieldnewItem.getText();
                Qty = jTextFieldqty.getText();
                Price = jTextFieldprice.getText();
                if( (!(newItem.equals(""))) || (!(Qty.equals(""))) || (!(Price.equals(""))) ){
                    
                    while(( line[i]= rdfile.readLine()) != null){
                        temp= line[i].trim().split("\t");
                        
                        model = (DefaultTableModel)jTable.getModel();
                        
                        if(id == i)
                        {
                            if(newItem.equals("")){
                                item = temp[0];
                                model.setValueAt(temp[0],id,1);
                            }else {
                                    item = newItem;
                                    model.setValueAt(item,id,1);
                                }
                            if(Qty.equals("")) {
                                qty = Integer.parseInt(temp[1]);
                                model.setValueAt(Integer.parseInt(temp[1]),id,2);
                            }else {
                                    qty = Integer.parseInt(Qty) + Integer.parseInt(temp[1]);
                                    model.setValueAt(Integer.parseInt(Qty) + Integer.parseInt(temp[1]),id,2);
                                }
                            if(Price.equals("")){
                                price= Double.parseDouble(temp[2]);
                                model.setValueAt(Double.parseDouble(temp[2]),id,3);
                            }else{
                                    price= Double.parseDouble(Price);
                                    model.setValueAt(Double.parseDouble(Price),id,3);
                                }
                            
                            line[i]= item + "\t" + qty + "\t" + price;
                            found= true;
                        }
                        i++;
                    }
                    rdfile.close();

                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("items.txt"));

                        for( int j=0; line[j] != null; j++)
                            wrfile.println(line[j]);

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Changes Successfully Saved!");
                    
                    } else
                        JOptionPane.showMessageDialog(null, "Item Not Found!");

                    jTextFieldID.setText("");
                    jTextFieldnewItem.setText("");
                    jTextFieldqty.setText("");
                    jTextFieldprice.setText("");
                    
                } else
                    JOptionPane.showMessageDialog( null, "No Changes Yet!");
            }
                
        }catch(IOException e){} catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid input!");          
                    jTextFieldID.setText("");
                    jTextFieldnewItem.setText("");
                    jTextFieldqty.setText("");
                    jTextFieldprice.setText("");
        }                                    
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        try {
            if (jTextField_item.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please enter an item", "No Input!", JOptionPane.ERROR_MESSAGE);
             else {
                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] line = new String[1000];
                String[] temp;
                String delete = jTextField_item.getText();
                boolean found = false;

                int i = 0;
                while ((line[i] = rdfile.readLine()) != null) {
                    temp = line[i].trim().split("\t");

                    if (delete.equals(temp[0])) {
                        i = i + 0;
                        found = true;
                    } else 
                        i++;
                }
                rdfile.close();

                PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));
                for (int j = 0; line[j] != null; j++) 
                    wrfile.println(line[j]);

                wrfile.close();

                if (!found) 
                    JOptionPane.showMessageDialog(null, "Item is already not in the list!", "", JOptionPane.ERROR_MESSAGE);
                 else 
                    JOptionPane.showMessageDialog(null, "Item Succesfully Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
                
                jTextField_item.setText("");
            }
        } catch (IOException e) {}
    }//GEN-LAST:event_jButton_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Display;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane_1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldItem;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQty;
    private javax.swing.JTextField jTextField_item;
    private javax.swing.JTextField jTextFieldnewItem;
    private javax.swing.JTextField jTextFieldprice;
    private javax.swing.JTextField jTextFieldqty;
    // End of variables declaration//GEN-END:variables
}
