


import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPageEventHelper;

public class ContentFont extends PdfPageEventHelper{
	private Font title1;//宋体，字体大小22，加粗
	private Font title2;//黑体，字体大小22，加粗
	private Font title1_s;//宋体，字体大小20，加粗(有些标题太长,只能缩小)
	private Font title2_s;//黑体，字体大小20，加粗(有些标题太长,只能缩小)
	private Font contentFont1;//宋体，字体大小12，不加粗
	private Font contentFont2;//黑体，字体大小12，不加粗(四号字体)
	private Font contentFont1_s;//宋体，字体大小11，不加粗(小四)
	private Font contentFont1_b;//宋体，字体大小16，不加粗(三号字体)
	private Font contentFont1Title;//宋体，字体大小12，加粗

	public ContentFont() {
		try {
			BaseFont bfChinese1 = BaseFont.createFont("C:\\Windows\\Fonts\\SIMHEI.TTF",
					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            //宋体&新宋体    (这种字体的输出不了.有问题)
//          BaseFont bfComic12 = BaseFont.createFont("c:\\windows\\fonts\\SIMSUN.TTC", null,BaseFont.NOT_EMBEDDED, BaseFont.NOT_EMBEDDED, null, null);
			BaseFont bfComic1 = BaseFont.createFont("C:\\WINDOWS\\Fonts\\SIMSUN.TTC,1", BaseFont.IDENTITY_H,true);
			//黑体
			BaseFont bfComic2 = BaseFont.createFont("c:\\windows\\fonts\\SIMHEI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
/*			// 楷体字
			BaseFont bfComic3 = BaseFont.createFont("c:\\windows\\fonts\\simkai.ttf",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			// 方正舒体
			BaseFont bfComic4 = BaseFont.createFont("c:\\windows\\fonts\\FZSTK.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			// 方正姚体
			BaseFont bfComic5 = BaseFont.createFont("c:\\windows\\fonts\\FZYTK.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//仿宋体
			BaseFont bfComic6 = BaseFont.createFont("c:\\windows\\fonts\\SIMFANG.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//华文彩云
			BaseFont bfComic7 = BaseFont.createFont("c:\\windows\\fonts\\STCAIYUN.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//华文仿宋
			BaseFont bfComic8 = BaseFont.createFont("c:\\windows\\fonts\\STFANGSO.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//华文细黑
			BaseFont bfComic9 = BaseFont.createFont("c:\\windows\\fonts\\STXIHEI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//华文新魏
			BaseFont bfComic10= BaseFont.createFont("c:\\windows\\fonts\\STXINWEI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//华文行楷
			BaseFont bfComic11 = BaseFont.createFont("c:\\windows\\fonts\\STXINGKA.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//华文中宋
            BaseFont bfComic12 = BaseFont.createFont("c:\\windows\\fonts\\STZHONGS.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //隶书
            BaseFont bfComic13= BaseFont.createFont("c:\\windows\\fonts\\SIMLI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //宋体&新宋体    (这种字体的输出不了.有问题)
//            BaseFont bfComic12 = BaseFont.createFont("c:\\windows\\fonts\\SIMSUN.TTC", null,BaseFont.NOT_EMBEDDED, BaseFont.NOT_EMBEDDED, null, null);
            BaseFont bfComic14 = BaseFont.createFont("C:\\WINDOWS\\Fonts\\SIMSUN.TTC,1", BaseFont.IDENTITY_H,true);
            //宋体-方正超大字符集
//            BaseFont bfComic13 = BaseFont.createFont("c:\\windows\\fonts\\SURSONG.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //幼圆
            BaseFont bfComic15 = BaseFont.createFont("c:\\windows\\fonts\\SIMYOU.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);*/
            title1 = new Font(bfComic1, 22, Font.BOLD);
            title2 = new Font(bfComic2, 22, Font.BOLD);
			title1_s = new Font(bfComic1, 20, Font.BOLD);
			title2_s = new Font(bfComic2, 20, Font.BOLD);
			contentFont1 = new Font(bfComic1, 12, Font.NORMAL);
			contentFont2 = new Font(bfComic2, 12, Font.NORMAL);
			contentFont1_s = new Font(bfComic1, 10, Font.NORMAL);
			contentFont1_b = new Font(bfComic1, 16, Font.NORMAL);
			contentFont1Title = new Font(bfComic1, 12, Font.BOLD);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Font getTitle1() {
		return title1;
	}

	public Font getTitle2() {
		return title2;
	}

	public Font getTitle1_s() {
		return title1_s;
	}

	public Font getTitle2_s() {
		return title2_s;
	}

	public Font getContentFont1() {
		return contentFont1;
	}

	public Font getContentFont2() {
		return contentFont2;
	}

	public Font getContentFont1_s() {
		return contentFont1_s;
	}

	public Font getContentFont1_b() {
		return contentFont1_b;
	}

	public Font getContentFont1Title() {
		return contentFont1Title;
	}

}

