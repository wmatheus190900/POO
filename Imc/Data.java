package Imc;
import java.util.Calendar;
public class Data {
    Calendar hoje= Calendar.getInstance();
	private int dia;
	private int mes;
	private int ano;
	public Data() {
		this.dia=hoje.get(Calendar.DAY_OF_MONTH);
		this.mes=hoje.get(Calendar.MONTH);
		this.ano=hoje.get(Calendar.YEAR);
	}
	public Data(int dia,int mes,int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	public void setDia(int dia) {
		this.dia=dia;
	}
	public int getDia() {
		return dia;
	}
	public void setMes(int mes) {
		this.mes=mes;
	}
	public int getMes() {
		return mes;
	}
	public void setAno(int ano) {
		this.ano=ano;
	}
	public int getAno() {
		return ano;
	}
}
