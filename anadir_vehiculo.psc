Algoritmo anadir_vehiculo
	Definir marca, fecha_salida,matricula,tipo_combustible,transmision,accion,modelo Como Caracter
	Definir visibilidad Como Caracter
	Definir kilometraje Como Caracter
	Definir vehiculos Como Caracter
	Definir vehiculo Como Caracter
	Dimension vehiculos[1]
	Escribir "Introduce la marca: "
	Leer marca
	Escribir "Introduce la fecha de salida "
	Leer fecha_salida
	Escribir "Introduce la matricula "
	Leer matricula
	Escribir "Introduce el tipo de combustible"
	Leer tipo_combustible
	Escribir "Introduce  el modelo"
	leer modelo
	Escribir "Introduce el tipo de transmision"
	leer transmision
	Escribir "Introduce si deseas vender o alquilar"
	leer accion
	Escribir "Introduce el kilometraje"
	leer kilometraje
	vehiculo<-"La marca: "+marca+" Fecha de salida: "+fecha_salida+ " Matricula: "+matricula+" Tipo de combustible "+tipo_combustible+" Modelo: "+modelo+" Accion "+accion+" Introduce el kilometraje "
	vehiculos[1]=vehiculo
	Escribir vehiculos[1]
FinAlgoritmo
