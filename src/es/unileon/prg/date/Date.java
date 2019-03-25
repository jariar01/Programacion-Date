package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia
		this.day = day;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	//El get sirve para devolver el dia en que estamos
	public int getDay(){
		return this.day;
	}
	//El get sirve para devolver el mes en que estamos
	public int getMonth(){
		return this.month;
	}
	//El get sirve para devolver el anio en que estamos
	public int getYear(){
		return this.year;
	}
	//El set asihna el valor al dia
	public void setDay(){
		 this.day=day;
	}
	//El set asigna el valor al anio
	public void setYear(){
		 this.year=year;
	}
	//El set asigna el valor al mes
	public void setMonth(){
		 this.month=month;
	}
	//Utilizamos la variable boolean ya que nos devolvera un true o un false al comprobar si coinciden los dias
	public boolean isSameDay(Date date){
		if(this.getDay()==getDay())
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	//Utilizamos la variable boolean ya que nos devolvera un true o un false al comprobar si coinciden los meses
	public boolean isSameMonth(Date date){
		if(this.getMonth()==getMonth())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Utilizamos la variable boolean ya que nos devolvera un true o un false al comprobar si coinciden los anios
	public boolean isSameYear(){
		if(this.getYear()==getYear())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Utilizamos la variable boolean ya que nos devolvera un true o un false al comprobar si coincide la fecha entera	
	public boolean isSame(){
		if((this.getDay()==getDay())&&(this.getMonth()==getMonth())&&(this.getYear()==getYear()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Realizamos los mismo metodos que antes pero suprimiendo el if
	public boolean isSameDay2(){
		return this.getDay()==getDay();
	}

	public boolean isSameMonth2(){
		return this.getMonth()==getMonth();
	}

	public boolean isSameYear2(){
		return this.getYear()==getYear();
	}
	//Este metodo utiliza un String ya que en este caso nos devolvera una palabra,que es el mes dado
	public String nombreDelMes(){
	StringBuffer mes=new StringBuffer();	
		switch(this.month){
			case 1:mes.append("Enero");
			break;
			case 2:mes.append("Febrero");
			break;
			case 3:mes.append("Marzo");
			break;
			case 4:mes.append("Abril");
			break;
			case 5:mes.append("Mayo");
			break;
			case 6:mes.append("Junio");
			break;
			case 7:mes.append("Julio");
			break;
			case 8:mes.append("Agosto");
			break;
			case 9:mes.append("Septiembre");
			break;
			case 10:mes.append("Octubre");
			break;
			case 11:mes.append("Noviembre");
			break;
			case 12:mes.append("Diciembre");
			break;
		}
	return mes.toString();
	}
	//Este metodo se encarga de comprobar si el dia dado pertenence al mes
	public boolean mesCorrecto(){
		boolean correcion=true;
		if((this.day>=1)&&(this.day<=30)){
			correcion=true;
		}
		else{
			correcion=false;
		}
	return correcion; 
	}
	//Este metodo sirve para comprobar en que estacion del año estaremos
	public String estacionMes(){
		StringBuffer estacion =new StringBuffer();
		switch(this.month){
			case 1:
			case 2:estacion.append("Invierno");
			break;
			case 3:estacion.append("Invierno hasta el dia 21,despues empieza la primavera");
			break;
			case 4:
			case 5:estacion.append("Primavera");
			break;
			case 6:estacion.append("Primavera hasta el dia 21,despues empieza el verano");
			break;
			case 7:
			case 8:estacion.append("Verano");
			break;
			case 9:estacion.append("Verano hasta el dia 22,despues empieza el otoño");
			break;
			case 10:
			case 11:estacion.append("Otoño");
			break;
			case 12:estacion.append("Otoño hasta el dia 21,despues empieza el invierno");
			break;
		}
		return estacion.toString();
	}
	//Este metodo calcula los meses restantes hasta final de anio
	public String mesesRestantes(){
		StringBuffer quedan=new StringBuffer();
		switch(this.month){
			case 1:quedan.append("Quedan 11 meses hasta final de año");
			break;
			case 2:quedan.append("Quedan 10 meses hasta final de año");
			break;
			case 3:quedan.append("Quedan 9 meses hasta final de año");
			break;
			case 4:quedan.append("Quedan 8 meses hasta final de año");
			break;
			case 5:quedan.append("Quedan 7 meses hasta final de año");
			break;
			case 6:quedan.append("Quedan 6 meses hasta final de año");
			break;
			case 7:quedan.append("Quedan 5 meses hasta final de año");
			break;
			case 8:quedan.append("Quedan 4 meses hasta final de año");
			break;
			case 9:quedan.append("Quedan 3 meses hasta final de año");
			break;
			case 10:quedan.append("Quedan 2 meses hasta final de año");
			break;
			case 11:quedan.append("Queda 1 mes hasta final de año");
			break;
			case 12:quedan.append("Ya estamos a final de año");
			break;
		}
		return quedan.toString();
	}
	//Escribe la fecha dada
	public String fecha(){
		StringBuffer fecha = new StringBuffer();
		fecha.append("Dia "+this.day+" del mes "+this.month+" del año "+this.year);
		return fecha.toString();
	}
	//Calcula los dias restantes hasta final de mes desde el dia dado
	public String diasRestantes(){
		StringBuffer dias =new StringBuffer();
		int resta=0;
		switch(this.month){
			case 2:resta=28-this.day;
				   dias.append("Queda(n) "+resta+" dia(n) hasta final de mes");
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:resta=31-this.day;
				    dias.append("Queda(n) "+resta+" dia(n) hasta final de mes");
			break;
			case 4:
			case 6:
			case 9:
			case 11:resta=30-this.day;
				    dias.append("Queda(n) "+resta+" dia(n) hasta final de mes");
			break;
		}
		return dias.toString();
	}
	//Te devuelve los meses con los mismos dias que el mes dado
	public String mismosDias(){
		StringBuffer dias=new StringBuffer();
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:dias.append("Este mes esta dentro de los meses con 31 dias,que son:Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.");
			break;
			case 4:
			case 6:
			case 9:
			case 11:dias.append("Este mes esta dentro de los meses con 30 dias,que son:Abril, Junio, Septiembre y Noviembre.");
			break;
			case 2:dias.append("Este mes no coincide en dias con ningun otro mes");
			break;
		}
	return dias.toString();
	}
	//Calcula los dias transcurridos desde que comenzo el anio
	public int diasPrincipio(){
		int dia=0;
		switch(this.month){
			case 1:dia=0+this.day;
			break;
			case 2:dia=31+this.day;
			break;
			case 3:dia=31+28+this.day;
			break;
			case 4:dia=31+28+31+this.day;
			break;
			case 5:dia=31+28+31+30+this.day;
			break;
			case 6:dia=31+28+31+30+31+this.day;
			break;
			case 7:dia=31+28+31+30+31+30+this.day;
			break;
			case 8:dia=31+28+31+30+31+30+31+this.day;
			break;
			case 9:dia=31+28+31+30+31+30+31+31+this.day;
			break;
			case 10:dia=31+28+31+30+31+30+31+31+30+this.day;
			break;
			case 11:dia=31+28+31+30+31+30+31+31+30+31+this.day;
			break;
			case 12:dia=31+28+31+30+31+30+31+31+30+31+30+this.day;
			break;	
		}
		return dia;
	}
	//Estos dos metodos(numeroIntentos y numeroIntentos2) lo que hacen es generar fechas al azar hasta que coincidan con la fecha dada e imprimen el numero de intentos que les llevo conseguirlo
	public int numeroIntentos(){
		int intentos=0,dias=0;
		while(this.diasPrincipio()!=dias){
			dias=(int)(Math.random()*((365-1)+1))+1;
			intentos++;
		}
		return intentos;
	}

	public int numeroIntentos2(){
		int intentos2=0,dias=0;
		do{
			dias=(int)(Math.random()*((365-1)+1))+1;
			intentos2++;
		}
		while(this.diasPrincipio()!=dias);
		return intentos2;
	}
	/*Este metodo se encargar de decirnos en que dia de la semana estamos dependiendo del dia y mes que estemos.
	(Se toma como referencia que el anio empieza en lunes)*/
	public String diaSemana(){
		StringBuffer dia=new StringBuffer();
		int semana=8,dias=8;
		int i=1;
		int resto=this.diasPrincipio();
		for(i=0;this.diasPrincipio()>semana;i++){
			resto=resto-7;
			semana=semana+7;
		}
		dias=dias-resto;
		if((dias==7)){
			dia.append("Lunes");
		}
		else if((dias==6)){
			dia.append("Martes");
		}
		else if(dias==5){
			dia.append("Miercoles");
		}
		else if(dias==4){
			dia.append("Jueves");
		}
		else if(dias==3){
			dia.append("Viernes");
		}
		else if(dias==2){
			dia.append("Sabado");
		}
		else if(dias==1){
			dia.append("Domingo");
		}
		else{
			dia.append("Lunes");
		}
		return dia.toString();
	}

}
