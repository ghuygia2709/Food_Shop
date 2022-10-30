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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Order extends javax.swing.JFrame {
    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
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
    public void SelectCust()
{
    try{
      Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
      St = Con.createStatement();
      Rs = St.executeQuery("select * from CUSTOMERTBL");
      CustomerTbl.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e)
    {
        e.printStackTrace();
    }
}
    private void GetToday()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Datelbl.setText(dtf.format(now));
    }
    private void update()
    {
        int newqty = oldqty - Integer.valueOf(Qtytb.getText());
        try{
                   Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
                   String UpdateQuery = "update User1.PRODUCTTBL set PRODQTY="+newqty+" where PRODID ="+productid;
                   Statement Add = Con.createStatement();
                   Add.executeUpdate(UpdateQuery);
//                   JOptionPane.showMessageDialog(this, "Loại sản phẩm đã được cập nhật thành công!");
                   SelectProd();
                } catch(Exception e) {
                    e.printStackTrace();
                }
    }
    
    public void SelectBill()
    {
        try{
          Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
          St = Con.createStatement();
          Rs = St.executeQuery("select * from ORDERTBL");
          CustomerTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        Qtytb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        AddToBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTbl = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CustNamelbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        TotAmttbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddToBtn1 = new javax.swing.JButton();
        TotAmttbl1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        UPrice = new javax.swing.JLabel();
        myJList = new javax.swing.JTextField();

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
        jLabel9.setText("THANH TOÁN");

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\x.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(601, 601, 601)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Đơn hàng:");

        BillId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BillId.setForeground(new java.awt.Color(255, 0, 51));
        BillId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillIdMouseClicked(evt);
            }
        });

        Qtytb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Qtytb.setForeground(new java.awt.Color(255, 0, 51));

        jLabel6.setBackground(new java.awt.Color(0, 0, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Số lượng:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Tên khách hàng:");

        AddBtn.setBackground(new java.awt.Color(204, 0, 51));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Đặt hàng");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(204, 0, 51));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Xóa");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        AddToBtn.setBackground(new java.awt.Color(204, 0, 51));
        AddToBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AddToBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddToBtn.setText("Thêm hàng");
        AddToBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtnMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Trang chủ");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProductTable.setForeground(new java.awt.Color(204, 0, 51));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thứ tự", "Sản phẩm", "Số lượng", "Giá", "Tổng tiền"
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
        if (ProductTable.getColumnModel().getColumnCount() > 0) {
            ProductTable.getColumnModel().getColumn(4).setHeaderValue("Tổng tiền");
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("DANH SÁCH SẢN PHẨM");

        CustomerTbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerTbl.setForeground(new java.awt.Color(204, 0, 51));
        CustomerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID khách hàng", "Tên khách hàng", "Số điện thoại"
            }
        ));
        CustomerTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CustomerTbl.setRowHeight(30);
        CustomerTbl.setSelectionBackground(new java.awt.Color(255, 0, 51));
        CustomerTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTbl);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("DANH SÁCH KHÁCH HÀNG");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Ngày/ Giờ đặt:");

        CustNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustNamelbl.setForeground(new java.awt.Color(204, 0, 51));
        CustNamelbl.setText("Tên khách hàng");

        Datelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Datelbl.setForeground(new java.awt.Color(204, 0, 51));
        Datelbl.setText("Date");

        BillTbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BillTbl.setForeground(new java.awt.Color(204, 0, 51));
        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        BillTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BillTbl.setRowHeight(25);
        BillTbl.setSelectionBackground(new java.awt.Color(255, 0, 51));
        BillTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTbl);

        TotAmttbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        TotAmttbl.setForeground(new java.awt.Color(204, 0, 51));
        TotAmttbl.setText("Số tiền");

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Giá:");

        AddToBtn1.setBackground(new java.awt.Color(204, 0, 51));
        AddToBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddToBtn1.setForeground(new java.awt.Color(255, 255, 255));
        AddToBtn1.setText("In hóa đơn");
        AddToBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtn1MouseClicked(evt);
            }
        });

        TotAmttbl1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        TotAmttbl1.setForeground(new java.awt.Color(204, 0, 51));
        TotAmttbl1.setText("Tổng phải trả:");

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

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Inventoryjava\\img\\pattern.gif")); // NOI18N

        UPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UPrice.setForeground(new java.awt.Color(204, 0, 51));
        UPrice.setText("Giá");

        myJList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myJList.setForeground(new java.awt.Color(204, 0, 51));
        myJList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                myJListKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(myJList))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TotAmttbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TotAmttbl)
                                .addGap(31, 31, 31)
                                .addComponent(AddToBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CustNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AddToBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CustNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddToBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(myJList)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotAmttbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotAmttbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(BillId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Nhập ID hóa đơn!");
        }else{
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
            PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(BillId.getText()));
            add.setString(2, CustNamelbl.getText());
            add.setString(3, Datelbl.getText());
            add.setInt(4, Integer.valueOf(TotAmttbl.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Đặt sản phẩm thành công!");
            Con.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
    if(BillId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Chọn đơn hàng muốn xóa!");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/foodshop","User1","123456"); 
                String Id = BillId.getText();
                String Query = "Delete from User1.ORDERTBL where ORDERID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectBill();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
            }catch(SQLException e)
            {
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked
int i = 1,Uprice, tot=0, total;
String Prodname;
    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
        if(flag == 0 || Qtytb.getText().isEmpty() || UPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm và điền số lượng!");
        }
        else
        {
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();

        Uprice = Integer.valueOf(model.getValueAt(Myindex, 5).toString());
        
        tot = Uprice * Integer.valueOf(Qtytb.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(Prodname);
        v.add(Qtytb.getText());
        v.add(Uprice);
        v.add(tot);
        DefaultTableModel dt = (DefaultTableModel)BillTbl.getModel();
        dt.addRow(v);
        total = total + tot;
        TotAmttbl.setText("" + total + " vnđ");
        update();
        i++; 
        }
    }//GEN-LAST:event_AddToBtnMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked
    int flag = 0, productid,oldqty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        UPrice.setText(model.getValueAt(Myindex, 5).toString());
        productid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        Prodname = model.getValueAt(Myindex, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        
        flag = 1;
    }//GEN-LAST:event_ProductTableMouseClicked

    private void CustomerTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTblMouseClicked
       DefaultTableModel model = (DefaultTableModel)CustomerTbl.getModel();
        int Myindex = CustomerTbl.getSelectedRow();
        CustNamelbl.setText(model.getValueAt(Myindex, 1).toString());
      
    }//GEN-LAST:event_CustomerTblMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BillTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)BillTbl.getModel();
        int Myindex = BillTbl.getSelectedRow();
        BillId.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_BillTblMouseClicked

    private void AddToBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtn1MouseClicked
        try{
        BillTbl.print();
        }catch(Exception exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_AddToBtn1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void BillIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIdMouseClicked

    private void myJListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myJListKeyReleased
        DefaultTableModel table = (DefaultTableModel)ProductTable.getModel();
        String search = myJList.getText().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        ProductTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_myJListKeyReleased

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddToBtn;
    private javax.swing.JButton AddToBtn1;
    private javax.swing.JTextField BillId;
    private javax.swing.JTable BillTbl;
    private javax.swing.JLabel CustNamelbl;
    private javax.swing.JTable CustomerTbl;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Qtytb;
    private javax.swing.JLabel TotAmttbl;
    private javax.swing.JLabel TotAmttbl1;
    private javax.swing.JLabel UPrice;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField myJList;
    // End of variables declaration//GEN-END:variables

}
