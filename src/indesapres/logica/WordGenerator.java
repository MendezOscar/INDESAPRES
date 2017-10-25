package indesapres.logica;

import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author oscme
 */
public class WordGenerator {

    public void createWord(String titulo, String parrafo1, String parrafo2, String parrafo3, String parrafo4,
            String parrafo5, String parrafo6, String parrafo7, String parrafo8) throws IOException {
        try {
            XWPFDocument writedoc = new XWPFDocument();
            
            XWPFParagraph paragraphPic = writedoc.createParagraph();
            XWPFRun runPic = paragraphPic.createRun();
            String imgFile = "Logo.png";
            try (FileInputStream is = new FileInputStream(imgFile)) {
                runPic.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, imgFile, Units.toEMU(100), Units.toEMU(50));
            }
            paragraphPic.setAlignment(ParagraphAlignment.LEFT);
            
            XWPFParagraph paragraph = writedoc.createParagraph();
            XWPFRun run1 = paragraph.createRun();
            run1.setText(titulo);
            run1.setFontSize(14);
            run1.setFontFamily("Times New Roman");
            run1.setUnderline(UnderlinePatterns.THICK);
            run1.setBold(true);
            paragraph.setAlignment(ParagraphAlignment.CENTER);
            
            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.addBreak();
            run2.setFontSize(12);
            run2.setFontFamily("Times New Roman");
            run2.setText(parrafo1);
            paragraph2.setAlignment(ParagraphAlignment.DISTRIBUTE);
            
            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.addBreak();
            run3.setFontSize(12);
            run3.setFontFamily("Times New Roman");
            run3.setText(parrafo2);
            paragraph3.setAlignment(ParagraphAlignment.LEFT);
            
            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.addBreak();
            run4.setFontSize(12);
            run4.setFontFamily("Times New Roman");
            run4.setText(parrafo3);
            paragraph4.setAlignment(ParagraphAlignment.DISTRIBUTE);
            
            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.addBreak();
            run5.setFontSize(12);
            run5.setFontFamily("Times New Roman");
            run5.setText(parrafo4);
            paragraph5.setAlignment(ParagraphAlignment.CENTER);
            
            XWPFParagraph paragraph6 = writedoc.createParagraph();
            XWPFRun run6 = paragraph6.createRun();
            run6.addBreak();
            run6.setFontSize(12);
            run6.setFontFamily("Times New Roman");
            run6.setText(parrafo5);
            paragraph6.setAlignment(ParagraphAlignment.CENTER);
            
            XWPFParagraph paragraph7 = writedoc.createParagraph();
            XWPFRun run7 = paragraph7.createRun();
            run7.addBreak();
            run7.setFontSize(12);
            run7.setFontFamily("Times New Roman");
            run7.setText(parrafo6);
            paragraph7.setAlignment(ParagraphAlignment.LEFT);
            
            XWPFParagraph paragraph8 = writedoc.createParagraph();
            XWPFRun run8 = paragraph8.createRun();
            run8.addBreak();
            run8.setFontSize(12);
            run8.setFontFamily("Times New Roman");
            run8.setText(parrafo7);
            paragraph8.setAlignment(ParagraphAlignment.CENTER);
            
            XWPFParagraph paragraph9 = writedoc.createParagraph();
            XWPFRun run9 = paragraph9.createRun();
            run9.addBreak();
            run9.setFontSize(12);
            run9.setFontFamily("Times New Roman");
            run9.setText(parrafo8);
            paragraph9.setAlignment(ParagraphAlignment.RIGHT);
            
            try {
                try (FileOutputStream output = new FileOutputStream("SolicitudPrestamo" + ".docx")) {
                    writedoc.write(output);
                }
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            } catch (HeadlessException | IOException e) {
            }
        } catch (InvalidFormatException ex) {
            Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
