/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Minh Anh
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        SelectProd();
        GetCat();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        ProdName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ProdDesc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CatCb = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();
        myJList = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DANH SÁCH SẢN PHẨM");

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\x.png")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(179, 179, 179)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(34, 34, 34))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(44, 44, 44))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("ID:");

        ProdId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProdId.setForeground(new java.awt.Color(204, 0, 51));

        ProdName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProdName.setForeground(new java.awt.Color(204, 0, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Tên sản phẩm:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Số lượng:");

        ProdQty.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(204, 0, 51));

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Chi tiết sản phẩm:");

        ProdDesc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProdDesc.setForeground(new java.awt.Color(204, 0, 51));

        jLabel8.setBackground(new java.awt.Color(0, 0, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Thể loại:");

        CatCb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CatCb.setForeground(new java.awt.Color(204, 0, 51));

        AddBtn.setBackground(new java.awt.Color(204, 0, 51));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\+.png")); // NOI18N
        AddBtn.setText("Thêm");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(204, 0, 51));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\update.png")); // NOI18N
        UpdateBtn.setText("Cập nhật");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(204, 0, 51));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\delete.png")); // NOI18N
        DeleteBtn.setText("Xóa");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\home.png")); // NOI18N
        jButton5.setText("Home");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProductTable.setForeground(new java.awt.Color(204, 0, 51));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên sản phẩm", "Số lượng", "Chi tiết sản phẩm", "Thể loại", "Đơn giá"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("TÌM KIẾM:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setText("THÔNG TIN SẢN PHẨM");

        jLabel16.setBackground(new java.awt.Color(0, 0, 51));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 51));
        jLabel16.setText("Đơn giá:");

        ProdPrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(204, 0, 51));

        myJList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myJList.setForeground(new java.awt.Color(204, 0, 51));
        myJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJListMouseClicked(evt);
            }
        });
        myJList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                myJListKeyReleased(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(204, 0, 51));
        Refresh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\refresh.png")); // NOI18N
        Refresh.setText("Làm mới");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(UpdateBtn)
                                .addGap(33, 33, 33)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel16))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProdPrice)
                                    .addComponent(ProdQty, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(ProdDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(CatCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(myJList, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel1)
                    .addComponent(myJList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(Myindex, 0).toString());
        ProdName.setText(model.getValueAt(Myindex, 1).toString());
        ProdQty.setText(model.getValueAt(Myindex, 2).toString());
        ProdDesc.setText(model.getValueAt(Myindex, 3).toString());
        CatCb.setSelectedItem(model.getValueAt(Myindex, 4).toString());
        ProdPrice.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ProdId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm bạn muốn xóa!");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
                String Id = ProdId.getText();
                String Query = "Delete from User1.PRODUCTTBL where PRODID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Sản phẩm đã được xóa thành công!");
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(ProdId.getText().isEmpty()||ProdName.getText().isEmpty()||ProdQty.getText().isEmpty()||ProdDesc.getText().isEmpty()||ProdPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Thông tin sản phẩm lỗi!");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
                String UpdateQuery = "update User1.PRODUCTTBL set PRODNAME='"+ProdName.getText()+"'"+",PRODQTY="+ProdQty.getText()+""+",PRODDESC='"+ProdDesc.getText()+"'"+",PRODCAT='"+CatCb.getSelectedItem().toString()+"'"+",PRODPRICE='"+ProdPrice.getText()+"'"+"where PRODID ="+ProdId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Sản phẩm đã được cập nhật thành công!");
                SelectProd();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
            PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL values(?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(ProdId.getText()));
            add.setString(2, ProdName.getText());
            add.setInt(3, Integer.valueOf(ProdQty.getText()));
            add.setString(4, ProdDesc.getText());
            add.setString(5, CatCb.getSelectedItem().toString());
            add.setInt(6, Integer.valueOf(ProdPrice.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!");
            Con.close();
            SelectProd();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void myJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJListMouseClicked

    private void myJListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myJListKeyReleased
        DefaultTableModel table = (DefaultTableModel)ProductTable.getModel();
        String search = myJList.getText().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        ProductTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_myJListKeyReleased

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        ProdId.setText("");
        ProdName.setText("");
        ProdQty.setText("");
        ProdDesc.setText("");
        ProdPrice.setText("");
    }//GEN-LAST:event_RefreshMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed
public void SelectProd()
{
    try{
      Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
      St = Con.createStatement();
      Rs = St.executeQuery("select * from PRODUCTTBL");
      ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e)
    {
        e.printStackTrace();
    }
}
private void GetCat()
{
    try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
        St = Con.createStatement();
        String query = "select * from User1.CATAGORYTBL";
        Rs = St.executeQuery(query);
        while(Rs.next())
        {
            String MyCat = Rs.getString("CATNAME");
            CatCb.addItem(MyCat);
        }
    }catch(Exception e)
    {
        
    }
}
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField ProdDesc;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField myJList;
    // End of variables declaration//GEN-END:variables
}
