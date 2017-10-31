package indesapres.logica;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author oscme
 */
public class WordGenerator {

    public void createWordSocio(String parrafo1, String parrafo2, String parrafo3, String parrafo4,
            String parrafo5, String parrafo6, String parrafo7, String parrafo8, String parrafo9, String parrafo10,
            String parrafo11, String parrafo12, String parrafo13, String parrafo14, String parrafo15,
            String parrafo16, String nombre) throws IOException {
        String path = "templateSerieA.docx";
        XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

        XWPFParagraph paragraph1 = writedoc.createParagraph();
        XWPFRun run1 = paragraph1.createRun();
        run1.setFontSize(12);
        run1.setFontFamily("Calibri");
        run1.setText(parrafo1);
        paragraph1.setAlignment(ParagraphAlignment.DISTRIBUTE);

        XWPFParagraph paragraph2 = writedoc.createParagraph();
        XWPFRun run2 = paragraph2.createRun();
        run2.setFontSize(12);
        run2.setFontFamily("Calibri");
        run2.setText(parrafo2);
        paragraph2.setAlignment(ParagraphAlignment.LEFT);

        XWPFParagraph paragraph3 = writedoc.createParagraph();
        XWPFRun run3 = paragraph3.createRun();
        run3.setFontSize(12);
        run3.setFontFamily("Calibri");
        run3.setText(parrafo3);
        paragraph3.setAlignment(ParagraphAlignment.DISTRIBUTE);

        XWPFParagraph paragraph4 = writedoc.createParagraph();
        XWPFRun run4 = paragraph4.createRun();
        run4.setFontSize(12);
        run4.setFontFamily("Calibri");
        run4.setText(parrafo4);
        paragraph4.setAlignment(ParagraphAlignment.CENTER);

        XWPFParagraph paragraph5 = writedoc.createParagraph();
        XWPFRun run5 = paragraph5.createRun();
        run5.addBreak();
        run5.setFontSize(12);
        run5.setFontFamily("Calibri");
        run5.setText(parrafo5);
        paragraph5.setAlignment(ParagraphAlignment.LEFT);

        XWPFParagraph paragraph6 = writedoc.createParagraph();
        XWPFRun run6 = paragraph6.createRun();
        run6.addBreak();
        run6.setFontSize(12);
        run6.setFontFamily("Calibri");
        run6.setText(parrafo6);
        paragraph6.setAlignment(ParagraphAlignment.CENTER);

        XWPFParagraph paragraph7 = writedoc.createParagraph();
        XWPFRun run7 = paragraph7.createRun();
        run7.setFontSize(12);
        run7.setFontFamily("Calibri");
        run7.setText(parrafo7);
        paragraph7.setAlignment(ParagraphAlignment.LEFT);

        XWPFParagraph paragraph8 = writedoc.createParagraph();
        XWPFRun run8 = paragraph8.createRun();
        run8.addBreak();
        run8.setFontSize(12);
        run8.setFontFamily("Calibri");
        run8.setText(parrafo8);
        paragraph8.setAlignment(ParagraphAlignment.LEFT);

        XWPFParagraph paragraph9 = writedoc.createParagraph();
        XWPFRun run9 = paragraph9.createRun();
        run9.addBreak();
        run9.setFontSize(12);
        run9.setFontFamily("Calibri");
        run9.setText(parrafo9);
        paragraph9.setAlignment(ParagraphAlignment.LEFT);

        XWPFParagraph paragraph10 = writedoc.createParagraph();
        XWPFRun run10 = paragraph10.createRun();
        run10.addBreak();
        run10.setFontSize(12);
        run10.setFontFamily("Calibri");
        run10.setText(parrafo10);
        paragraph10.setAlignment(ParagraphAlignment.DISTRIBUTE);

        XWPFParagraph paragraph11 = writedoc.createParagraph();
        XWPFRun run11 = paragraph11.createRun();
        run11.addBreak();
        run11.setFontSize(12);
        run11.setFontFamily("Calibri");
        run11.setText(parrafo11);
        paragraph11.setAlignment(ParagraphAlignment.CENTER);

        XWPFParagraph paragraph12 = writedoc.createParagraph();
        XWPFRun run12 = paragraph12.createRun();
        run12.setFontSize(12);
        run12.setFontFamily("Calibri");
        run12.setText(parrafo12);
        paragraph12.setAlignment(ParagraphAlignment.RIGHT);

        XWPFParagraph paragraph13 = writedoc.createParagraph();
        XWPFRun run13 = paragraph13.createRun();
        run13.setFontSize(12);
        run13.setFontFamily("Calibri");
        run13.setText(parrafo13);
        paragraph13.setAlignment(ParagraphAlignment.RIGHT);

        XWPFParagraph paragraph14 = writedoc.createParagraph();
        XWPFRun run14 = paragraph14.createRun();
        run14.setFontSize(12);
        run14.setFontFamily("Calibri");
        run14.setText(parrafo14);
        paragraph14.setAlignment(ParagraphAlignment.RIGHT);

        XWPFParagraph paragraph15 = writedoc.createParagraph();
        XWPFRun run15 = paragraph15.createRun();
        run15.setFontSize(12);
        run15.setFontFamily("Calibri");
        run15.setText(parrafo15);
        paragraph15.setAlignment(ParagraphAlignment.RIGHT);

        XWPFParagraph paragraph16 = writedoc.createParagraph();
        XWPFRun run16 = paragraph16.createRun();
        run16.setFontSize(12);
        run16.setFontFamily("Calibri");
        run16.setText(parrafo16);
        paragraph16.setAlignment(ParagraphAlignment.RIGHT);

        try {
            try (FileOutputStream output = new FileOutputStream("SolicitudPrestamo_" + nombre + ".docx")) {
                writedoc.write(output);
            }
            JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
        } catch (HeadlessException | IOException e) {
        }
    }

    public void createWordIndesa(String parrafo1, String parrafo2, String parrafo3, String parrafo4, String parrafo5,
            String parrafo6, String parrafo7, String parrafo8, String parrafo9, String parrafo10, String parrafo11,
            String parrafo12, String parrafo13, String parrafo14, String parrafo15, String parrafo16, String parrafo17,
            String parrafo18, String parrafo19, String parrafo20, String parrafo21, String nombre) {
        try {
            String path = "templateSerieA1.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
            run1.setFontFamily("Calibri");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(12);
            run2.setFontFamily("Calibri");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(12);
            run3.setFontFamily("Calibri");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.setFontFamily("Calibri");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setFontFamily("Calibri");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph6 = writedoc.createParagraph();
            XWPFRun run6 = paragraph6.createRun();
            run6.setFontSize(12);
            run6.setFontFamily("Calibri");
            run6.setText(parrafo6);
            paragraph6.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph7 = writedoc.createParagraph();
            XWPFRun run7 = paragraph7.createRun();
            run7.setFontSize(12);
            run7.setFontFamily("Calibri");
            run7.setText(parrafo7);
            paragraph7.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph8 = writedoc.createParagraph();
            XWPFRun run8 = paragraph8.createRun();
            run8.setFontSize(12);
            run8.setFontFamily("Calibri");
            run8.setText(parrafo8);
            paragraph8.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph9 = writedoc.createParagraph();
            XWPFRun run9 = paragraph1.createRun();
            run9.setFontSize(12);
            run9.setFontFamily("Calibri");
            run9.setText(parrafo9);
            paragraph9.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph10 = writedoc.createParagraph();
            XWPFRun run10 = paragraph10.createRun();
            run10.setFontSize(12);
            run10.setFontFamily("Calibri");
            run10.setText(parrafo10);
            paragraph10.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph11 = writedoc.createParagraph();
            XWPFRun run11 = paragraph11.createRun();
            run11.setFontSize(12);
            run11.setFontFamily("Calibri");
            run11.setText(parrafo11);
            paragraph11.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph12 = writedoc.createParagraph();
            XWPFRun run12 = paragraph12.createRun();
            run12.setFontSize(12);
            run12.setFontFamily("Calibri");
            run12.setText(parrafo12);
            paragraph12.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph13 = writedoc.createParagraph();
            XWPFRun run13 = paragraph13.createRun();
            run13.setFontSize(12);
            run13.setFontFamily("Calibri");
            run13.setText(parrafo13);
            paragraph13.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph14 = writedoc.createParagraph();
            XWPFRun run14 = paragraph14.createRun();
            run14.setFontSize(12);
            run14.setFontFamily("Calibri");
            run14.setText(parrafo14);
            paragraph14.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph15 = writedoc.createParagraph();
            XWPFRun run15 = paragraph15.createRun();
            run15.setFontSize(12);
            run15.setFontFamily("Calibri");
            run15.setText(parrafo15);
            paragraph15.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph16 = writedoc.createParagraph();
            XWPFRun run16 = paragraph16.createRun();
            run16.setFontSize(12);
            run16.setFontFamily("Calibri");
            run16.setText(parrafo16);
            paragraph16.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph17 = writedoc.createParagraph();
            XWPFRun run17 = paragraph17.createRun();
            run17.setFontSize(12);
            run17.setFontFamily("Calibri");
            run17.setText(parrafo17);
            paragraph17.setAlignment(ParagraphAlignment.RIGHT);

            XWPFParagraph paragraph18 = writedoc.createParagraph();
            XWPFRun run18 = paragraph18.createRun();
            run18.setFontSize(12);
            run18.setFontFamily("Calibri");
            run18.setText(parrafo18);
            paragraph18.setAlignment(ParagraphAlignment.RIGHT);

            XWPFParagraph paragraph19 = writedoc.createParagraph();
            XWPFRun run19 = paragraph19.createRun();
            run19.setFontSize(12);
            run19.setFontFamily("Calibri");
            run19.setText(parrafo19);
            paragraph19.setAlignment(ParagraphAlignment.RIGHT);

            XWPFParagraph paragraph20 = writedoc.createParagraph();
            XWPFRun run20 = paragraph20.createRun();
            run20.setFontSize(12);
            run20.setFontFamily("Calibri");
            run20.setText(parrafo20);
            paragraph20.setAlignment(ParagraphAlignment.RIGHT);
            
            XWPFParagraph paragraph21 = writedoc.createParagraph();
            XWPFRun run21 = paragraph21.createRun();
            run21.setFontSize(12);
            run21.setFontFamily("Calibri");
            run21.setText(parrafo21);
            paragraph21.setAlignment(ParagraphAlignment.RIGHT);

            try {
                try (FileOutputStream output = new FileOutputStream("SolicitudPrestamo_" + nombre + ".docx")) {
                    writedoc.write(output);
                }
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            } catch (HeadlessException | IOException e) {
            }
        } catch (IOException ex) {
            Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createWordEmpleado(String parrafo1, String parrafo2, String parrafo3, String parrafo4, String parrafo5,
            String parrafo6, String parrafo7, String parrafo8, String parrafo9, String parrafo10, String parrafo11,
            String parrafo12, String parrafo13, String parrafo14, String parrafo15, String parrafo16, String parrafo17,
            String parrafo18, String parrafo29, String parrfo20, String nombre) {
        try {
            String path = "templateSerieB.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
            run1.setFontFamily("Calibri");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(12);
            run2.setFontFamily("Calibri");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(12);
            run3.setFontFamily("Calibri");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.setFontFamily("Calibri");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setFontFamily("Calibri");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph6 = writedoc.createParagraph();
            XWPFRun run6 = paragraph6.createRun();
            run6.setFontSize(12);
            run6.setFontFamily("Calibri");
            run6.setText(parrafo6);
            paragraph6.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph7 = writedoc.createParagraph();
            XWPFRun run7 = paragraph7.createRun();
            run7.setFontSize(12);
            run7.setFontFamily("Calibri");
            run7.setText(parrafo7);
            paragraph7.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph8 = writedoc.createParagraph();
            XWPFRun run8 = paragraph8.createRun();
            run8.setFontSize(12);
            run8.setFontFamily("Calibri");
            run8.setText(parrafo8);
            paragraph8.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph9 = writedoc.createParagraph();
            XWPFRun run9 = paragraph1.createRun();
            run9.setFontSize(12);
            run9.setFontFamily("Calibri");
            run9.setText(parrafo9);
            paragraph9.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph10 = writedoc.createParagraph();
            XWPFRun run10 = paragraph10.createRun();
            run10.setFontSize(12);
            run10.setFontFamily("Calibri");
            run10.setText(parrafo10);
            paragraph10.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph11 = writedoc.createParagraph();
            XWPFRun run11 = paragraph11.createRun();
            run11.setFontSize(12);
            run11.setFontFamily("Calibri");
            run11.setText(parrafo11);
            paragraph11.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph12 = writedoc.createParagraph();
            XWPFRun run12 = paragraph12.createRun();
            run12.setFontSize(12);
            run12.setFontFamily("Calibri");
            run12.setText(parrafo12);
            paragraph12.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph13 = writedoc.createParagraph();
            XWPFRun run13 = paragraph13.createRun();
            run13.setFontSize(12);
            run13.setFontFamily("Calibri");
            run13.setText(parrafo13);
            paragraph13.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph14 = writedoc.createParagraph();
            XWPFRun run14 = paragraph14.createRun();
            run14.setFontSize(12);
            run14.setFontFamily("Calibri");
            run14.setText(parrafo14);
            paragraph14.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph15 = writedoc.createParagraph();
            XWPFRun run15 = paragraph15.createRun();
            run15.setFontSize(12);
            run15.setFontFamily("Calibri");
            run15.setText(parrafo15);
            paragraph15.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph16 = writedoc.createParagraph();
            XWPFRun run16 = paragraph16.createRun();
            run16.setFontSize(12);
            run16.setFontFamily("Calibri");
            run16.setText(parrafo16);
            paragraph16.setAlignment(ParagraphAlignment.RIGHT);

            XWPFParagraph paragraph17 = writedoc.createParagraph();
            XWPFRun run17 = paragraph17.createRun();
            run17.setFontSize(12);
            run17.setFontFamily("Calibri");
            run17.setText(parrafo17);
            paragraph17.setAlignment(ParagraphAlignment.RIGHT);

            XWPFParagraph paragraph18 = writedoc.createParagraph();
            XWPFRun run18 = paragraph18.createRun();
            run18.setFontSize(12);
            run18.setFontFamily("Calibri");
            run18.setText(parrafo18);
            paragraph18.setAlignment(ParagraphAlignment.RIGHT);
            
            XWPFParagraph paragraph19 = writedoc.createParagraph();
            XWPFRun run19 = paragraph19.createRun();
            run19.setFontSize(12);
            run19.setFontFamily("Calibri");
            run19.setText(parrafo18);
            paragraph19.setAlignment(ParagraphAlignment.RIGHT);
            
            XWPFParagraph paragraph20 = writedoc.createParagraph();
            XWPFRun run20 = paragraph20.createRun();
            run20.setFontSize(12);
            run20.setFontFamily("Calibri");
            run20.setText(parrafo18);
            paragraph20.setAlignment(ParagraphAlignment.RIGHT);

            try {
                try (FileOutputStream output = new FileOutputStream("SolicitudPrestamo_" + nombre + ".docx")) {
                    writedoc.write(output);
                }
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            } catch (HeadlessException | IOException e) {
            }
        } catch (IOException ex) {
            Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createWordPagare(String titulo, String parrafo1, String parrafo2, String parrafo3, String parrafo4,
            String parrafo5, String parrafo6, String parrafo7, String nombre) {
        try {
            String path = "PAGARE.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph titulos = writedoc.createParagraph();
            XWPFRun runti = titulos.createRun();
            runti.setFontSize(16);
            runti.setFontFamily("Calibri");
            runti.setText(titulo);
            titulos.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(14);
            run1.setFontFamily("Calibri");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(14);
            run2.setFontFamily("Calibri");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(14);
            run3.setFontFamily("Calibri");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(14);
            run4.setFontFamily("Calibri");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(14);
            run5.setFontFamily("Calibri");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.DISTRIBUTE);

            XWPFParagraph paragraph6 = writedoc.createParagraph();
            XWPFRun run6 = paragraph6.createRun();
            run6.setFontSize(14);
            run6.setFontFamily("Calibri");
            run6.setText(parrafo6);
            paragraph6.setAlignment(ParagraphAlignment.CENTER);
            
            XWPFParagraph paragraph7 = writedoc.createParagraph();
            XWPFRun run7 = paragraph7.createRun();
            run7.setFontSize(14);
            run7.setFontFamily("Calibri");
            run7.setText(parrafo7);
            paragraph7.setAlignment(ParagraphAlignment.LEFT);

            try {
                try (FileOutputStream output = new FileOutputStream("Pagare_" + nombre + ".docx")) {
                    writedoc.write(output);
                }
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            } catch (HeadlessException | IOException e) {
            }
        } catch (IOException ex) {
            Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
