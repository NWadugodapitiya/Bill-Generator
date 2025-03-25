import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main_page extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;
    JTextField t3;
    JTable table;

    Main_page(){
        setLayout(null);


        Font Exit = new Font ("calibri",Font.BOLD,18);
        Font labf = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        Font fullprice = new Font ("Segoe UI",Font.BOLD,21);
        Font footerFont = new Font("HANGING_BASELINE",Font.BOLD,8);
//------------------------------------------------------------------------------------------------------------------------------

        JLabel date = new JLabel();

        LocalDate myDateObj = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Date: " + formattedDate);

        date.setText(formattedDate);


//------------------------------------------------------------------------------------------------------------------------------
        JTextField tt1 = new JTextField();
        tt1.setBounds (37,390,323,40);
        tt1.setForeground(Color.BLACK);
        tt1.setBackground(new Color(101, 52, 216, 0));
        tt1.setBorder(null);
        tt1.setEditable(true);
        tt1.setOpaque(false);
        add(tt1);
        tt1.setFont(Atel3);

        JLabel lt1 = new JLabel ("Item");
        lt1.setForeground(new Color(58, 58, 58, 255));
        lt1.setBounds(0,9,300,20);
        tt1.add(lt1);
        lt1.setFont(Atel3);

        DocumentListener documentListenertt1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tt1.getText().isEmpty()){
                    lt1.setBounds(0,9,300,20);
                } else{
                    lt1.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tt1.getText().isEmpty()){
                    lt1.setBounds(0,9,300,20);
                } else{
                    lt1.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tt1.getText().isEmpty()){
                    lt1.setBounds(0,9,300,20);
                } else{
                    lt1.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
            }
        };
        tt1.getDocument().addDocumentListener(documentListenertt1);
//---------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (439,389,148,43);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        t1.setFont(Atel3);



        JLabel lt11 = new JLabel ("Price");
        lt11.setForeground(new Color(58, 58, 58, 255));
        lt11.setBounds(0,9,300,20);
        t1.add(lt11);
        lt11.setFont(Atel3);

        DocumentListener documentListenert1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    lt11.setBounds(0,9,300,20);
                } else{
                    lt11.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    lt11.setBounds(0,9,300,20);
                } else{
                    lt11.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    lt11.setBounds(0,9,300,20);
                } else{
                    lt11.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
            }
        };
        t1.getDocument().addDocumentListener(documentListenert1);
//---------------------------------------------------------------------------------------------
        JTextField t2 = new JTextField();
        t2.setBounds (640,389,148,43);
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(101, 52, 216, 0));
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        t2.setFont(Atel3);

        JLabel l1 = new JLabel ("Quantity");
        l1.setForeground(new Color(58, 58, 58, 255));
        l1.setBounds(0,9,125,20);
        t2.add(l1);
        l1.setFont(Atel3);

        DocumentListener documentListenert2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l1.setBounds(0,9,125,20);
                } else{
                    l1.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l1.setBounds(0,9,125,20);
                } else{
                    l1.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l1.setBounds(0,9,125,20);
                } else{
                    l1.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
            }
        };
        t2.getDocument().addDocumentListener(documentListenert2);
//---------------------------------------------------------------------------------------------
        JTextField t3 = new JTextField();
        t3.setBounds (37,458,323,40);
        t3.setForeground(Color.BLACK);
        t3.setBackground(new Color(101, 52, 216, 0));
        t3.setBorder(null);
        t3.setEditable(true);
        t3.setOpaque(false);
        add(t3);
        t3.setFont(Atel3);

        JLabel l2 = new JLabel ("Customer Name or Company name");
        l2.setForeground(new Color(58, 58, 58, 255));
        l2.setBounds(0,9,300,20);
        t3.add(l2);
        l2.setFont(Atel3);

        DocumentListener documentListenert3 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l2.setBounds(0,9,300,20);
                } else{
                    l2.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l2.setBounds(0,9,300,20);
                } else{
                    l2.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l2.setBounds(0,9,300,20);
                } else{
                    l2.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
            }
        };
        t3.getDocument().addDocumentListener(documentListenert3);
//---------------------------------------------------------------------------------------------
        JTextField t4 = new JTextField();
        t4.setBounds (37,520,323,40);
        t4.setForeground(Color.BLACK);
        t4.setBackground(new Color(101, 52, 216, 0));
        t4.setBorder(null);
        t4.setEditable(true);
        t4.setOpaque(false);
        add(t4);
        t4.setFont(Atel3);

        JLabel l3 = new JLabel ("location");
        l3.setForeground(new Color(58, 58, 58, 255));
        l3.setBounds(0,9,300,20);
        t4.add(l3);
        l3.setFont(Atel3);

        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l3.setBounds(0,9,300,20);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l3.setBounds(0,9,300,20);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l3.setBounds(0,9,300,20);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
            }
        };
        t4.getDocument().addDocumentListener(documentListenert4);
//---------------------------------------------------------------------------------------------
        JTextField t5 = new JTextField();
        t5.setBounds (439,494,148,43);
        t5.setForeground(Color.BLACK);
        t5.setBackground(new Color(101, 52, 216, 0));
        t5.setBorder(null);
        t5.setEditable(true);
        t5.setOpaque(false);
        add(t5);
        t5.setFont(Atel3);

        JLabel l4 = new JLabel ("Discount");
        l4.setForeground(new Color(58, 58, 58, 255));
        l4.setBounds(0,11,125,20);
        t5.add(l4);
        l4.setFont(Atel3);

        DocumentListener documentListenert5 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t5.getText().isEmpty()){
                    l4.setBounds(0,11,125,20);
                } else{
                    l4.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t5.getText().isEmpty()){
                    l4.setBounds(0,11,125,20);
                } else{
                    l4.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t5.getText().isEmpty()){
                    l4.setBounds(0,11,125,20);
                } else{
                    l4.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
            }
        };
        t5.getDocument().addDocumentListener(documentListenert5);
//----------------------------------------------------------------------------------------------------------------------------------

        JLabel price = new JLabel ("");
        price.setBounds(822,397,149,35);
        price.setForeground(new Color(255, 255, 255, 255));
        add(price);
        price.setFont(fullprice);


        JLabel mycontact = new JLabel("Software by @Color Studio - 0703620555");
        mycontact.setFont(footerFont);

//------------------------------------------------------------------------------------------------------------------------------
        JLabel butt = new JLabel ("Print Now");
        butt.setBounds(822,480,124,35);
        butt.setForeground(new Color(0, 0, 0, 255));
        add(butt);
        butt.setFont(fullprice);

        JPanel butp = new JPanel();
        butp.setBounds(781,475,195,47);
        butp.setBackground(new Color(255,255,255,0));
        add(butp);

        JLabel but = new JLabel();
        but.setIcon(new ImageIcon(getClass().getResource("img/but.png")));
        add(but);
//------------------------------------------------------------------------------------------------------------------------------
        butp.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                but.setBounds(781,475,195,47);
                butp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        butt.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                but.setBounds(781,475,195,47);
                butt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        butp.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                but.setBounds(0,0,0,0);
            }
        });
        butt.addMouseListener(new MouseAdapter() {public void mouseExited(MouseEvent e) {
                but.setBounds(0,0,0,0);
            }});
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"ITEM & SERVICES ","PRICE","QTY","TOTAL"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.white);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(27, 28, 949, 321);
        frame.setLayout(null);
        add(pane);




//------------------------------------------------------------------------------------------------------------------------------
        tt1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){
                    t1.requestFocus(true);
                }
            }
        });
        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){
                    t2.requestFocus(true);
                }
            }
        });
        t2.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke) {
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER) {
                    tt1.requestFocus(true);

                    if(t1.getText().isEmpty() && t2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, " Type Price  ","Type",JOptionPane.WARNING_MESSAGE);
                    } else {
                        Object[] row = new Object[4];

                        try {
                            int v11 = Integer.parseInt(t1.getText());
                            int v21 = Integer.parseInt(t2.getText());

                            int tot = v11 * v21;

                            row[0] = tt1.getText();
                            row[1] = t1.getText();
                            row[2] = t2.getText();
                            row[3] = String.valueOf(tot);

                            // add row to the model
                            model.addRow(row);

                            int total = 0;
                            for (int i = 0; i < table.getRowCount(); i++) {
                                int amount = Integer.parseInt((String) table.getValueAt(i, 3));
                                total += amount;
                            }
                            price.setText(String.valueOf("Rs: "+total));
                        } catch (NumberFormatException e) {
                            // Handle the case where parsing fails
                            e.printStackTrace();
                        }

                    }


                    tt1.setText("");
                    t1.setText("");
                    t2.setText("");
                }
            }
        });

        t2.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_TAB){
                    t3.requestFocus(true);
                }
            }
        });
        t3.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){
                    t4.requestFocus(true);
                }
            }
        });
        t4.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){
                    t5.requestFocus(true);
                }
            }
        });
//==================================================================================================

//        butp.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//
//                com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4);
//
//                try {
//                    String pdfFileName = t3.getText()+".pdf";
//                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFileName));
//                    document.open();
//
//                    // Get the PdfContentByte from the writer
//                    PdfContentByte canvas = writer.getDirectContentUnder();
//
//                    // Add background image to the PDF
//                    com.itextpdf.text.Image background = com.itextpdf.text.Image.getInstance("D:/Programing/My Projects/Softwear/LEANIA_CREATIONS/main project/src/img/Test.png");
//                    float pageWidth = PageSize.A4.getWidth();
//                    float pageHeight = PageSize.A4.getHeight();
//                    background.scaleAbsolute(pageWidth, pageHeight);
//                    background.setAbsolutePosition(0, 0);
//                    canvas.addImage(background);
//
//                    // Add a footer
//                    Phrase footer = new Phrase("Software by @Color Studio - 0703620555");
//                    ColumnText.showTextAligned(writer.getDirectContent(), com.itextpdf.text.Element.ALIGN_CENTER, footer,
//                            (document.right() - document.left()) / 2 + document.leftMargin(), document.bottom() - 10, 0);
//
//
//                    // Add some space before the table
//                    for (int i = 0; i < 10; i++) {
//                        document.add(new Paragraph(" "));
//                    }
//
//                    document.add(new Paragraph("        Customer: "+t3.getText()));
//                    document.add(new Paragraph("        Location: "+t4.getText()));
//                    document.add(new Paragraph("        Invoice Date: "+date.getText()));
//                    document.add(new Paragraph(" "));
//
//                    PdfPTable pdfTable = new PdfPTable(4);
//
//                    // Set column widths
//                    int[] columnWidths = {10, 3, 3, 3}; // Adjust as needed
//                    pdfTable.setWidths(columnWidths);
//                    pdfTable.setWidthPercentage(90);
//
//
//// Add table headers with centered alignment
//                    for (Object columnName : columns) {
//                        PdfPCell headerCell = new PdfPCell(new Phrase(String.valueOf(columnName)));
//                        headerCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
//                        pdfTable.addCell(headerCell);
//                    }
//
///// Add table rows
//                    for (int i = 0; i < table.getRowCount(); i++) {
//                        for (int j = 0; j < table.getColumnCount(); j++) {
//                            Object cellValue = table.getValueAt(i, j);
//                            System.out.println("Row: " + i + ", Column: " + j + ", Value: " + cellValue);
//
//                            PdfPCell dataCell = new PdfPCell(new Phrase(String.valueOf(cellValue)));
//
//                            // Align numeric values to the right for columns 2, 3, and 4
//                            if (cellValue instanceof Number && (j == 1 || j == 2 || j == 3)) {
//                                dataCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_RIGHT);
//                            }
//
//                            pdfTable.addCell(dataCell);
//                        }
//                    }
//
//
//
//                    document.add(pdfTable);
//
//                } catch (DocumentException | IOException ee) {
//                    ee.printStackTrace();
//                } finally {
//                    document.close();
//                }
//            }
//        });

        butp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4);

                try {
                    String pdfFileName = t3.getText() + ".pdf";
                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFileName));
                    document.open();

                    // Get the PdfContentByte from the writer
                    PdfContentByte canvas = writer.getDirectContentUnder();

                    // Add background image to the PDF
                    com.itextpdf.text.Image background = com.itextpdf.text.Image.getInstance("D:/Programing/My Projects/Softwear/LEANIA_CREATIONS/main project/src/img/Test.png");
                    float pageWidth = PageSize.A4.getWidth();
                    float pageHeight = PageSize.A4.getHeight();
                    background.scaleAbsolute(pageWidth, pageHeight);
                    background.setAbsolutePosition(0, 0);
                    canvas.addImage(background);

                    // Add a footer in small letters
                    Phrase footer = new Phrase(""+ mycontact.getText());
                    ColumnText.showTextAligned(writer.getDirectContent(), com.itextpdf.text.Element.ALIGN_CENTER, footer,
                            (document.right() - document.left()) / 2 + document.leftMargin(), document.bottom() - 10, 0);

                    // Add some space before the table
                    for (int i = 0; i < 10; i++) {
                        document.add(new Paragraph(" "));
                    }

                    document.add(new Paragraph("        Customer: " + t3.getText()));
                    document.add(new Paragraph("        Location: " + t4.getText()));
                    document.add(new Paragraph("        Invoice Date: " + date.getText()));
                    document.add(new Paragraph(" "));

                    PdfPTable pdfTable = new PdfPTable(4);

                    // Set column widths
                    int[] columnWidths = { 10, 3, 3, 3 }; // Adjust as needed
                    pdfTable.setWidths(columnWidths);
                    pdfTable.setWidthPercentage(90);

                    // Add table headers with centered alignment
                    for (Object columnName : columns) {
                        PdfPCell headerCell = new PdfPCell(new Phrase(String.valueOf(columnName)));
                        headerCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                        pdfTable.addCell(headerCell);
                    }

                    // Add table rows
                    for (int i = 0; i < table.getRowCount(); i++) {
                        for (int j = 0; j < table.getColumnCount(); j++) {
                            Object cellValue = table.getValueAt(i, j);
                            System.out.println("Row: " + i + ", Column: " + j + ", Value: " + cellValue);

                            PdfPCell dataCell = new PdfPCell(new Phrase(String.valueOf(cellValue)));

                            // Align numeric values to the right for columns 2, 3, and 4
                            if (cellValue instanceof Number && (j == 1 || j == 2 || j == 3)) {
                                dataCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_RIGHT);
                            } else {
                                // Align non-numeric values to the left for column 1
                                dataCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_LEFT);
                            }

                            pdfTable.addCell(dataCell);
                        }
                    }

                    // Add discount row
                    pdfTable.addCell(""); // Placeholder for the first column
                    pdfTable.addCell(""); // Placeholder for the second column
                    pdfTable.addCell("Discount"); // Text for the third column
                    pdfTable.addCell(""); // Placeholder for the fourth column

                    // Add total row
                    pdfTable.addCell(""); // Placeholder for the first column
                    pdfTable.addCell(""); // Placeholder for the second column
                    pdfTable.addCell("Total"); // Text for the third column
                    pdfTable.addCell(""); // Placeholder for the fourth column

                    document.add(pdfTable);

                } catch (DocumentException | IOException ee) {
                    ee.printStackTrace();
                } finally {
                    document.close();
                }
            }
        });




//==================================================================================================

//
//        butp.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//
//                Document document = new Document(PageSize.A4);
//
//                try {
//                    String pdfFileName = t3.getText() + ".pdf";
//                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFileName));
//                    document.open();
//
//                    // Get the PdfContentByte from the writer
//                    PdfContentByte canvas = writer.getDirectContentUnder();
//
//                    // Add background image to the PDF
//                    Image background = Image.getInstance("X:/Softwear/LEANIA_CREATIONS/main project/src/img/Test.png");
//                    float pageWidth = 595; // A4 width in points
//                    float pageHeight = 842; // A4 height in points
//                    background.scaleAbsolute(pageWidth, pageHeight);
//                    background.setAbsolutePosition(0, 0);
//                    canvas.addImage(background);
//
//                    // Add some space before the table
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph("        Customer: "+t3.getText()));
//                    document.add(new Paragraph("        location: "+t4.getText()));
//                    document.add(new Paragraph("        Invoice Date: "+date.getText()));
//                    document.add(new Paragraph(" "));
//                    document.add(new Paragraph(" "));
//
//
//
//
//                    PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
//
//                    // Set column widths
//                    int[] columnWidths = {10, 3, 3, 3}; // Adjust as needed
//                    pdfTable.setWidths(columnWidths);
//                    pdfTable.setWidthPercentage(90);
//
//
//                    // Add table headers with centered alignment
//
//
//                    for (Object columnName : columns) {
//                        PdfPCell headerCell = new PdfPCell(new Phrase(String.valueOf(columnName)));
//                        headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
//                        pdfTable.addCell(headerCell);
//                    }
//
////// Add table rows from JTable with right-aligned numeric values
//                    for (int i = 0; i < table.getRowCount(); i++) {
//                        for (int j = 0; j < table.getColumnCount(); j++) {
//                            Object cellValue = table.getValueAt(i, j);
//                            PdfPCell dataCell = new PdfPCell();
//
//                            // Align numeric values to the right for columns 2, 3, and 4
//                            if (cellValue instanceof Number && (j == 1 || j == 2 || j == 3)) {
//                                dataCell.setPhrase(new Phrase(String.valueOf(cellValue), com.lowagie.text.FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, com.lowagie.text.Font.NORMAL)));
//                                dataCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
//                            } else {
//                                dataCell.setPhrase(new Phrase(String.valueOf(cellValue), com.lowagie.text.FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, com.lowagie.text.Font.NORMAL)));
//                            }
//
//                            pdfTable.addCell(dataCell);
//                        }
//                    }
//
//
//
//
//                    document.add(pdfTable);
//
//                } catch (DocumentException | IOException ee) {
//                    ee.printStackTrace();
//                } finally {
//                    document.close();
//                }
//            }
//        });







//==================================================================================================

//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(959,547,31,27);
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("img/exit.png")));
        add(a2);
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                a2.setBounds(934,544,81,31);
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                exit.setForeground(Color.WHITE);
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.WHITE);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("img/Main page.png")));
        xmain.setBounds(0,0,1000,600);
        add(xmain);
//------------------------------------------------------------------------------------------------------------------------------
        setSize (1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }

    private void generatePdf() {

    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        Main_page Frame = new Main_page();

        Frame.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                mouseDownScreenCoords = e.getLocationOnScreen();
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });
        Frame.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }
            public void mouseDragged(MouseEvent e) {

                Point currCoords = e.getLocationOnScreen();
                Frame.setLocation(mouseDownScreenCoords.x + (currCoords.x -
                                mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                        mouseDownScreenCoords.y + (currCoords.y -
                                mouseDownScreenCoords.y) - mouseDownCompCoords.y);

            }
        });

}};