package es.tragsatec.pssa.utilidades;

import java.io.FileOutputStream;

import es.tragsatec.pssa.model.Animales;
import es.tragsatec.pssa.model.AnimalesExample;
import java.io.IOException;
import java.io.PrintStream;

import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

class Main_AppxManifest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		generaSql();
	}

	/*
	 * public void generaOds()throws ParserConfigurationException, SAXException,
	 * IOException{ FileOutputStream scriptSql=new
	 * FileOutputStream("scriptSqlSalida.txt"); String stringScriptSql = "";
	 * PrintStream psScritpSql = new PrintStream(scriptSql); stringScriptSql =
	 * "INSERT INTO ANIMALES (crotal, fechaInicio, fechaFin, explotacionPertenencia, explotacionUbicacion,"
	 * +
	 * "fechaNacimiento, explotacionNacimiento, sexo, raza, crotalMadre, causaAlta, fechaAlta, "
	 * +
	 * "procedencia, CodigoLocalEntrada, CodigoRemoEntrada, causaBaja, destino, CodigoLocalSalida,"
	 * + "CodigoRemoSalida) VALUES ("; try {
	 * 
	 * Creacion del fichero .ods HSSFWorkbook libroOpenOfficeCalc = new
	 * HSSFWorkbook(); HSSFSheet hojaOpenOfficeCalc =
	 * libroOpenOfficeCalc.createSheet(); HSSFRow row; HSSFCell cell;
	 * FileOutputStream ficheroOpenOfficeCalc = new
	 * FileOutputStream(System.getProperty("user.home") +
	 * "/nombreHojaOpenOffice2.ods"); DocumentBuilderFactory fábricaCreadorDocumento
	 * = DocumentBuilderFactory.newInstance(); DocumentBuilder creadorDocumento =
	 * fábricaCreadorDocumento.newDocumentBuilder(); Document documento =
	 * creadorDocumento.parse("MGTestMGTestLibroRegistroAnimales.xml"); //Obtener el
	 * elemento raíz del documento Element raiz = documento.getDocumentElement();
	 * 
	 * //Obtener la lista de nodos que tienen etiqueta "Animal" NodeList
	 * listaAnimales = raiz.getElementsByTagName("Animal"); //Recorrer la lista de
	 * animales for(int i=0; i<listaAnimales.getLength(); i++) { //Obtener de la
	 * lista un animal tras otro Node animal = listaAnimales.item(i);
	 * //System.out.println("Animal "+i); //System.out.println("==========");
	 * 
	 * HSSFRow filaOpenOfficeCalc = hojaOpenOfficeCalc.createRow(i);
	 * 
	 * //Obtener la lista de los datos que contiene ese animal NodeList datosAnimal
	 * = animal.getChildNodes(); //Recorrer la lista de los datos que contiene el
	 * animal
	 * 
	 * for(int indiceColumna=0; indiceColumna<datosAnimal.getLength();
	 * indiceColumna++) { //Obtener de la lista de datos un dato tras otro Node dato
	 * = datosAnimal.item(indiceColumna);
	 *//** Pdm -> para que no muestre las columnas de nodos sin datos *//*
																		 * if (dato.getTextContent().length()>5){
																		 * indiceColumna++; }
																		 * 
																		 * 
																		 * //Comprobar que el dato se trata de un nodo
																		 * de tipo Element
																		 * if(dato.getNodeType()==Node.ELEMENT_NODE) {
																		 * //Mostrar el nombre del tipo de dato //
																		 * System.out.print(dato.getNodeName()+": ");
																		 * 
																		 * 
																		 * //El valor está contenido en un hijo del nodo
																		 * Element Node datoContenido =
																		 * dato.getFirstChild(); //Mostrar el valor
																		 * contenido en el nodo que debe ser de tipo
																		 * Text if(datoContenido!=null &&
																		 * datoContenido.getNodeType()==Node.TEXT_NODE){
																		 * String valorAInsertar = ""; para la primera
																		 * fila de la hoja de calculo, cogemos el nombre
																		 * del dato if (i==0){
																		 * //System.out.println(datoContenido.
																		 * getNodeValue()); HSSFCell celda =
																		 * filaOpenOfficeCalc.createCell(indiceColumna);
																		 * celda.setCellValue(datosAnimal.item(
																		 * indiceColumna).getNextSibling().getNodeName()
																		 * ); }else{ //System.out.println(datoContenido.
																		 * getNodeValue()); HSSFCell celda =
																		 * filaOpenOfficeCalc.createCell(indiceColumna);
																		 * celda.setCellValue(datoContenido.getNodeValue
																		 * ().toString());
																		 * valorAInsertar=datoContenido.getNodeValue().
																		 * toString(); stringScriptSql = stringScriptSql
																		 * + "\'" + valorAInsertar + "\',"; } } }
																		 * 
																		 * } } System.out.print(stringScriptSql); try {
																		 * libroOpenOfficeCalc.write(
																		 * ficheroOpenOfficeCalc); } catch (Exception e)
																		 * { e.printStackTrace(); }
																		 * 
																		 * finally { ficheroOpenOfficeCalc.close(); }
																		 * 
																		 * } catch (SAXException ex) { System.out.
																		 * println("ERROR: El formato XML del fichero no es correcto\n"
																		 * +ex.getMessage()); ex.printStackTrace(); }
																		 * catch (IOException ex) { System.out.
																		 * println("ERROR: Se ha producido un error el leer el fichero\n"
																		 * +ex.getMessage()); ex.printStackTrace(); }
																		 * catch (ParserConfigurationException ex) {
																		 * System.out.
																		 * println("ERROR: No se ha podido crear el generador de documentos XML\n"
																		 * +ex.getMessage()); ex.printStackTrace(); }
																		 * 
																		 * }
																		 */

	public static void generaSql() throws ParserConfigurationException, SAXException, IOException {

		FileOutputStream scriptSql = new FileOutputStream("scriptSqlSalida.txt");
		String stringScriptSqlInsert = "";
		String campo = "";
		String stringScriptSqlCreateTable = "";
		PrintStream psScritpSql = new PrintStream(scriptSql);
		stringScriptSqlInsert = "INSERT INTO ANIMALES (id, crotal, fechaInicio, fechaFin, explotacionPertenencia, explotacionUbicacion,"
				+ "fechaNacimiento, explotacionNacimiento, sexo, raza, crotalMadre, causaAlta, fechaAlta, "
				+ "procedencia, CodigoLocalEntrada, CodigoRemoEntrada, fechaBaja, causaBaja, destino, CodigoLocalSalida,"
				+ "CodigoRemoSalida) VALUES (DEFAULT,";

		stringScriptSqlCreateTable = "CREATE TABLE ANIMALES (";

		try {
			ArrayList<String> listCamposTabla = new ArrayList<String>();
			DocumentBuilderFactory fábricaCreadorDocumento = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorDocumento = fábricaCreadorDocumento.newDocumentBuilder();
			Document documento = creadorDocumento.parse("MGTest/AppxManifest.xml");
			// Obtener el elemento raíz del documento
			Element raiz = documento.getDocumentElement();

			// Obtener la lista de nodos que tienen etiqueta "Animal"
			NodeList listaAnimales = raiz.getElementsByTagName("Application");
			// Recorrer la lista de animales
			for (int i = 1; i < listaAnimales.getLength(); i++) {
				// Obtener de la lista un animal tras otro
				Node animal = listaAnimales.item(i);
				// Obtener la lista de los datos que contiene ese animal
				NodeList datosAnimal = animal.getChildNodes();
				// Recorrer la lista de los datos que contiene el animal

				for (int indiceColumna = 0; indiceColumna < datosAnimal.getLength(); indiceColumna++) {
					// Obtener de la lista de datos un dato tras otro
					Node dato = datosAnimal.item(indiceColumna);
					/** Pdm -> para que no muestre las columnas de nodos sin datos */
					// System.out.println("dato.getTextContent() " + dato.getTextContent());

					if (dato.getTextContent().length() > 5) {
						campo = dato.getTextContent();
						indiceColumna++;
						/** Añadimos un campo a la tabla, los vamos metiendo en un Array de strings */
						if (!listCamposTabla.contains(campo)) {
							listCamposTabla.add(dato.getTextContent());
						}

					}

					// Comprobar que el dato se trata de un nodo de tipo Element
					if (dato.getNodeType() == Node.ELEMENT_NODE) {
						// Mostrar el nombre del tipo de dato
						// System.out.print(dato.getNodeName()+": ");
						// El valor está contenido en un hijo del nodo Element
						Node datoContenido = dato.getFirstChild();

						// System.out.println("datocontenido.getFirstChild " + dato.getFirstChild());
						// Mostrar el valor contenido en el nodo que debe ser de tipo Text
						// if(datoContenido!=null && datoContenido.getNodeType()==Node.TEXT_NODE){

						if (datoContenido == null) {
							stringScriptSqlInsert = stringScriptSqlInsert + "\'" + " pdm " + "\',";
							System.out.println("pdm1 " + " nodename: " + dato.getNodeName());
						}
							
						if (datoContenido != null && datoContenido.getNodeType() == Node.TEXT_NODE) {
							System.out.println("pdm2 " + "dato.nodename " + dato.getNodeName());
							System.out.println("pdm2 " + "datocontenido.nodename " + datoContenido.getNodeName());
							// System.out.println ("datoContenido nodeType Not null " +
							// datoContenido.getNodeType());
							// System.out.println ("datoContenido Not null " + datoContenido.toString());
							// System.out.println("datoContenido.getNodeType() " +
							// datoContenido.getNodeType() );
							String valorAInsertar = "";
							/* para la primera fila de la hoja de calculo, cogemos el nombre del dato */
							// if (i==0){
							// System.out.println("i==0 " +
							// datosAnimal.item(indiceColumna).getNextSibling().getNodeName());
							// }else{
							valorAInsertar = datoContenido.getNodeValue().toString();
							stringScriptSqlInsert = stringScriptSqlInsert + "\'" + valorAInsertar + "\',";
						}
					} else {
						//System.out.println("PDM estamso ante un elemnto uqe no es nodo");
						//System.out.println(dato.getNodeType());
						System.out.println("pdm3 " + "dato.nodename " + dato.getNodeName());
						System.out.println("pdm3 " + "dato.nodetype " + dato.getNodeType());
						System.out.println("pdm3 " + "dato.nodeValue " + dato.getNodeValue());
						
						
					}
				}
				stringScriptSqlInsert = stringScriptSqlInsert.substring(0, (stringScriptSqlInsert.lastIndexOf(",")));
				stringScriptSqlInsert = stringScriptSqlInsert + "),(DEFAULT,";

			}

			stringScriptSqlInsert = stringScriptSqlInsert.substring(0, (stringScriptSqlInsert.lastIndexOf(",")));
			stringScriptSqlInsert = stringScriptSqlInsert + ");";

			// System.out.print(stringScriptSqlInsert);

		} catch (SAXException ex) {
			System.out.println("ERROR: El formato XML del fichero no es correcto\n" + ex.getMessage());
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("ERROR: Se ha producido un error el leer el fichero\n" + ex.getMessage());
			ex.printStackTrace();
		} catch (ParserConfigurationException ex) {
			System.out.println("ERROR: No se ha podido crear el generador de documentos XML\n" + ex.getMessage());
			ex.printStackTrace();
		}

	}
	
}
