package ssm_12_7;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class juggTest  {
	public static  void main(String []args)throws Exception{
		HSSFWorkbook wb = new HSSFWorkbook(); //������ HSSFWorkbook ����
		HSSFSheet sheet = wb.createSheet("new sheet"); //�����µ� sheet ����
		HSSFSheet sheet2 = wb.createSheet("new sheet2"); //�����µ� sheet ����
		HSSFRow row = sheet.createRow((short)0);
		HSSFRow row2 = sheet.createRow((short)1);
		HSSFRow row3 = sheet.createRow((short)2);
		
		//�� sheet �ﴴ��һ�У�����Ϊ�кţ���һ�У��˴�����������飩
		HSSFCell cell = row.createCell((short)0);		
		//�� row �ｨ���� cell����Ԫ�񣩣�����Ϊ�кţ���һ�У�
		cell.setCellValue(1); //���� cell ���������͵�ֵ
		row.createCell((short)1).setCellValue(1.2); //���� cell �������͵�ֵ
		row.createCell((short)2).setCellValue("test"); //���� cell �ַ����͵�ֵ
		row.createCell((short)3).setCellValue(true); //���� cell �������͵�ֵ
		
		HSSFCell cell2 = row.createCell((short)2);
		cell2.setCellValue(2);
		row2.createCell((short)1).setCellValue("���");
		row2.createCell((short)2).setCellValue("���");
		row2.createCell((short)3).setCellValue("���");
		row2.createCell((short)4).setCellValue("���");
		
		HSSFCell cell3 = row.createCell((short)2);
		cell3.setCellValue(0);
		row2.createCell((short)4).setCellValue("���");
		
		
		
		HSSFCellStyle cellStyle = wb.createCellStyle(); //�����µ� cell ��ʽ
		cellStyle.setDataFormat(HSSFDataFormat. getBuiltinFormat("m/d/yy h:mm"));
		//���� cell ��ʽΪ���Ƶ����ڸ�ʽ
		HSSFCell dCell =row.createCell((short)4);
		dCell.setCellValue(new Date()); //���� cell Ϊ�������͵�ֵ
		dCell.setCellStyle(cellStyle); //���ø� cell ���ڵ���ʾ��ʽ
		
		HSSFCell csCell =row.createCell((short)5);
		
		//csCell.setEncoding(HSSFCell.ENCODING_UTF_16);
		//���� cell ���������ĸ�λ�ֽڽض�
		csCell.setCellValue("���Ĳ���_Chinese Words Test"); //���������Ľ���ַ���
		row.createCell((short)6).setCellType(HSSFCell.CELL_TYPE_ERROR);
		//�������� cell
		
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\1\\Desktop\\1.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}
