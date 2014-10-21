


import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPageEventHelper;

public class ContentFont extends PdfPageEventHelper{
	private Font title1;//���壬�����С22���Ӵ�
	private Font title2;//���壬�����С22���Ӵ�
	private Font title1_s;//���壬�����С20���Ӵ�(��Щ����̫��,ֻ����С)
	private Font title2_s;//���壬�����С20���Ӵ�(��Щ����̫��,ֻ����С)
	private Font contentFont1;//���壬�����С12�����Ӵ�
	private Font contentFont2;//���壬�����С12�����Ӵ�(�ĺ�����)
	private Font contentFont1_s;//���壬�����С11�����Ӵ�(С��)
	private Font contentFont1_b;//���壬�����С16�����Ӵ�(��������)
	private Font contentFont1Title;//���壬�����С12���Ӵ�

	public ContentFont() {
		try {
			BaseFont bfChinese1 = BaseFont.createFont("C:\\Windows\\Fonts\\SIMHEI.TTF",
					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            //����&������    (����������������.������)
//          BaseFont bfComic12 = BaseFont.createFont("c:\\windows\\fonts\\SIMSUN.TTC", null,BaseFont.NOT_EMBEDDED, BaseFont.NOT_EMBEDDED, null, null);
			BaseFont bfComic1 = BaseFont.createFont("C:\\WINDOWS\\Fonts\\SIMSUN.TTC,1", BaseFont.IDENTITY_H,true);
			//����
			BaseFont bfComic2 = BaseFont.createFont("c:\\windows\\fonts\\SIMHEI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
/*			// ������
			BaseFont bfComic3 = BaseFont.createFont("c:\\windows\\fonts\\simkai.ttf",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			// ��������
			BaseFont bfComic4 = BaseFont.createFont("c:\\windows\\fonts\\FZSTK.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			// ����Ҧ��
			BaseFont bfComic5 = BaseFont.createFont("c:\\windows\\fonts\\FZYTK.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//������
			BaseFont bfComic6 = BaseFont.createFont("c:\\windows\\fonts\\SIMFANG.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//���Ĳ���
			BaseFont bfComic7 = BaseFont.createFont("c:\\windows\\fonts\\STCAIYUN.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//���ķ���
			BaseFont bfComic8 = BaseFont.createFont("c:\\windows\\fonts\\STFANGSO.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//����ϸ��
			BaseFont bfComic9 = BaseFont.createFont("c:\\windows\\fonts\\STXIHEI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//������κ
			BaseFont bfComic10= BaseFont.createFont("c:\\windows\\fonts\\STXINWEI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//�����п�
			BaseFont bfComic11 = BaseFont.createFont("c:\\windows\\fonts\\STXINGKA.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			//��������
            BaseFont bfComic12 = BaseFont.createFont("c:\\windows\\fonts\\STZHONGS.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //����
            BaseFont bfComic13= BaseFont.createFont("c:\\windows\\fonts\\SIMLI.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //����&������    (����������������.������)
//            BaseFont bfComic12 = BaseFont.createFont("c:\\windows\\fonts\\SIMSUN.TTC", null,BaseFont.NOT_EMBEDDED, BaseFont.NOT_EMBEDDED, null, null);
            BaseFont bfComic14 = BaseFont.createFont("C:\\WINDOWS\\Fonts\\SIMSUN.TTC,1", BaseFont.IDENTITY_H,true);
            //����-���������ַ���
//            BaseFont bfComic13 = BaseFont.createFont("c:\\windows\\fonts\\SURSONG.TTF",BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //��Բ
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

