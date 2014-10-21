


import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf {
	
		public static void main(String args[]) {
				

				
				// 创建pdf文档 .rotate()
				Document pdfDoc = new Document(PageSize.A4);
				
				try {
					PdfWriter.getInstance(pdfDoc,  new FileOutputStream("D:/证据清单.pdf"));
					pdfDoc.open();
					// 字体对象
					ContentFont cf = new ContentFont();
					// 内容
					PdfPTable table = new PdfPTable(12);
					table.setTotalWidth(500);
					table.setLockedWidth(true);
					table.setSpacingBefore(5f);
					table.setSpacingAfter(5f);
					PdfPCell cell;
					
					/*PdfPCell cell;
					String sqczsj = "";
					String jdczsj = spb.getJdczsj();
					String cbrczsj = spb.getCbrczsj();
					String fzrczsj = spb.getFzrczsj();
					sqczsj = zsysp_base.getSqrq().substring(0,4)+"年"+zsysp_base.getSqrq().substring(5,7)+"月"+zsysp_base.getSqrq().substring(8,10)+"日";
					if(jdczsj.contains("-")){
						jdczsj = jdczsj.substring(0,4)+"年"+jdczsj.substring(5,7)+"月"+jdczsj.substring(8,10)+"日";
					}
					if(cbrczsj.contains("-")){
						cbrczsj = cbrczsj.substring(0,4)+"年"+cbrczsj.substring(5,7)+"月"+cbrczsj.substring(8,10)+"日";
					}
					if(fzrczsj.contains("-")){
						fzrczsj = fzrczsj.substring(0,4)+"年"+fzrczsj.substring(5,7)+"月"+fzrczsj.substring(8,10)+"日";
					}*/
					
					cell = new PdfPCell(new Phrase("vvvhjghj", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_LEFT);
					cell.setHorizontalAlignment(Element.ALIGN_LEFT);
					cell.setBorderWidth(0);
					cell.setBorderWidthBottom(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);

//					cell.setBorder(0);
					cell.setRowspan(17);
					table.addCell(cell);
					
					/*if(zsysp_base.getLx().equals("zsysp")){
						cell = new PdfPCell(new Phrase("", cf.getTitle1()));
					}else{
						cell = new PdfPCell(new Phrase("", cf.getTitle1()));
					}*/
					cell = new PdfPCell(new Phrase("", cf.getTitle1()));
					cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorder(0);
					cell.setBorderWidthBottom(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setFixedHeight(70);
					cell.setColspan(4);
					table.addCell(cell);

					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorder(0);
					cell.setBorderWidthBottom(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setRowspan(4);
					cell.setFixedHeight(150);
					cell.setLeading(1.2f,1.2f);//行间距
					table.addCell(cell);
					
					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_LEFT);
					cell.setHorizontalAlignment(Element.ALIGN_LEFT);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthBottom(0);
					cell.setBorder(0);
					cell.setBorderWidthBottom(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setColspan(3);
					cell.setFixedHeight(10);
					table.addCell(cell);
					
					/*String sqyj = spb.getSqyj();
					sqyj = sqyj.replace("　", "");
					sqyj = sqyj.replace(" ", "");
					sqyj = "　　"+sqyj;
					String sqyjst = "";
					int i = 0;
					while(i<sqyj.length()){
						if(sqyj.length()>=i+31){
							int k = i+31;
							String s = sqyj.substring(i,k);
							while(length(s)<61&&k<sqyj.length()){
								k++;
								s = sqyj.substring(i,k);
							}
							sqyjst += sqyj.substring(i,k);
							i = k-31;
						}else{
							sqyjst += sqyj.substring(i,sqyj.length());
						}
						while(sqyj.length()>=i+32){
							if(sqyj.substring(i+31,i+32).equals("，")
									||sqyj.substring(i+31,i+32).equals("；")
									||sqyj.substring(i+31,i+32).equals("》")
									||sqyj.substring(i+31,i+32).equals("？")
									||sqyj.substring(i+31,i+32).equals("。")){
								sqyjst += sqyj.substring(i+31,i+32);
								i++;
							}else{
								break;
							}
						}
						
						sqyjst += "\n";
						i +=31;		
					}*/
					
					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_LEFT);
					cell.setHorizontalAlignment(Element.ALIGN_LEFT);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthTop(0);
					cell.setBorderWidthBottom(0);
					cell.setColspan(3);
					cell.setBorder(0);
					cell.setBorderWidthBottom(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setFixedHeight(70);
					cell.setLeading(1.5f,1.5f);//行间距
					table.addCell(cell);

					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_CENTER);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorder(0);
					cell.setBorderWidthBottom(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setColspan(2);
					cell.setFixedHeight(30);
					table.addCell(cell);

					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_LEFT);
					cell.setHorizontalAlignment(Element.ALIGN_LEFT);
					cell.setBorderWidthTop(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthBottom(0);
					cell.setColspan(1);
					cell.setFixedHeight(30);
					table.addCell(cell);
					
					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_TOP);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorderWidthTop(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setColspan(1);
					cell.setFixedHeight(40);
					table.addCell(cell);
					
					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_TOP);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorderWidthTop(0);
					cell.setBorderWidthLeft(0);
					cell.setBorderWidthRight(0);
					cell.setColspan(1);
					cell.setFixedHeight(40);
					table.addCell(cell);
					
					cell = new PdfPCell(new Phrase("", cf.getContentFont1()));
					cell.setVerticalAlignment(Element.ALIGN_TOP);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorderWidthTop(0);
					cell.setBorderWidthLeft(0);
					cell.setColspan(1);
					cell.setFixedHeight(40);
					table.addCell(cell);

					
//					table.addCell(cell);s
					pdfDoc.add(table);
					pdfDoc.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
			
				public static int length(String value) {
			        int valueLength = 0;
			        String chinese = "[\u0391-\uFFE5]";
			        /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
			        for (int i = 0; i < value.length(); i++) {
			            /* 获取一个字符 */
			            String temp = value.substring(i, i + 1);
			            /* 判断是否为中文字符 */
			            if (temp.matches(chinese)) {
			                /* 中文字符长度为2 */
			                valueLength += 2;
			            } else {
			                /* 其他字符长度为1 */
			                valueLength += 1;
			            }
			        }
			        return valueLength;
			    }


}

