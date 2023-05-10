package es.tragsatec.pssa.utilidades;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
/*
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
*/
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

class Main_procesaPolizasXML {
	static String stringScriptSqlFaseLiquidacion = "INSERT INTO faseLiquidacion (PLAN, NUM_LIQUIDACION, TIPO_SEGURO, FECHA_LIQUIDACION, TOMADOR) VALUES (";
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
    	
    	String stringScriptSqlFaseLiquidacion = "INSERT INTO public.\"faseLiquidacion\" (\"PLAN\", \"NUM_LIQUIDACION\", \"TIPO_SEGURO\", \"FECHA_LIQUIDACION\") VALUES (";
    	String stringScriptSqlTomador = "INSERT INTO public.\"tomador\" (\"NIF_TOMADOR\", \"COLECTIVO\") VALUES (";
    	String stringScriptSqlColectivo =  "INSERT INTO public.\"colectivo\" (\"REF_COLECTIVO\", \"DIGITO_CONTROL_COLECTIVO\", \"LINEA\", \"COD_ENTIDAD_ASEGURADORA\") VALUES(";
    	
    	generaSql(stringScriptSqlFaseLiquidacion, "faseLiquidacion");
    	System.out.println();
    	generaSql(stringScriptSqlTomador, "tomador");
    	System.out.println();
    	generaSql(stringScriptSqlColectivo, "colectivo");
    	System.out.println();
    }
    
    
    public static void generaSql(String stringScriptSql, String tagName)throws ParserConfigurationException, SAXException, IOException{
    	FileOutputStream scriptSql=new FileOutputStream("scriptSqlSalida.txt");
		PrintStream psScritpSql = new PrintStream(scriptSql);		
    	try {    		
    	    DocumentBuilderFactory fábricaCreadorDocumento = DocumentBuilderFactory.newInstance();
    	    DocumentBuilder creadorDocumento = fábricaCreadorDocumento.newDocumentBuilder();
    	  //  Document documento = creadorDocumento.parse("LibroRegistroAnimales.xml");
    	    Document documento = creadorDocumento.parse("poliza.xml");
    	    //Obtener el elemento raíz del documento
    	    Element raiz = documento.getDocumentElement();
    	    //Obtener la lista de nodos que tienen etiqueta "Animal"
    	    //NodeList listaAnimales = raiz.getElementsByTagName("Animal");
    	    NodeList listaNodos = raiz.getElementsByTagName(tagName);
    	    //Recorrer la lista de animales
    	    for(int i=0; i<listaNodos.getLength(); i++) {
    	        //Obtener de la lista un animal tras otro
    	        Node animal = listaNodos.item(i);
    	        //Obtener la lista de los datos que contiene ese animal
    	        NodeList datosNodo = animal.getChildNodes();
    	        //Recorrer la lista de los datos que contiene el animal
    	        for(int indiceColumna=0; indiceColumna<datosNodo.getLength(); indiceColumna++) {
    	            //Obtener de la lista de datos un dato tras otro
    	            Node dato = datosNodo.item(indiceColumna);
    	            /** Pdm -> para que no muestre las columnas de nodos sin datos */
    	            //System.out.println("dato.getTextContent() " + dato.getTextContent());
    	            //Comprobar que el dato se trata de un nodo de tipo Element
    	            if(dato.getNodeType()==Node.ELEMENT_NODE) {
    	                //Mostrar el nombre del tipo de dato
    	                // System.out.print(dato.getNodeName()+": ");
    	                //El valor está contenido en un hijo del nodo Element
    	                Node datoContenido = dato.getFirstChild();
    	               // System.out.println("datocontenido.getFirstChild " + dato.getFirstChild());
    	                //Mostrar el valor contenido en el nodo que debe ser de tipo Text
    	                //if(datoContenido!=null && datoContenido.getNodeType()==Node.TEXT_NODE){
    	                if(datoContenido==null){
    	                	stringScriptSql = stringScriptSql + "\'" + " pdm " + "\',";
    	                }
    	                if(datoContenido!=null && datoContenido.getNodeType()==Node.TEXT_NODE){
    	                
    	                //	System.out.println ("datoContenido nodeType Not null " + datoContenido.getNodeType());
    	                //	System.out.println ("datoContenido Not null " + datoContenido.toString());
    	                	//System.out.println("datoContenido.getNodeType() " + datoContenido.getNodeType() );
    	                	String valorAInsertar = "";
    	                	/* para la primera fila de la hoja de calculo, cogemos el nombre del dato */
    	                	//if (i==0){
    	                	//	System.out.println("i==0 " + datosAnimal.item(indiceColumna).getNextSibling().getNodeName());
    	                	//}else{
    	                	
    	                		valorAInsertar=datoContenido.getNodeValue().toString();
    	                		//valorAInsertar=datoContenido.getNextSibling().getFirstChild().getNodeValue();
    	                				stringScriptSql = stringScriptSql + "\'" + valorAInsertar + "\',";
    	                }
    	               
    	            }else
    	            {
    	            	
    	            	if ((datosNodo.item(indiceColumna).getNextSibling()!=null)&&(i==1)){
    	            
    	            	//System.out.println("PDM NO ELEMENT_NODE_ " + datosAnimal.item(indiceColumna).getNextSibling().getNodeName());
    	            	}
    	            }
    	            
    	        }
    	        stringScriptSql = stringScriptSql.substring(0,(stringScriptSql.lastIndexOf(",")));
        	    //stringScriptSql = stringScriptSql + "),(DEFAULT,"; 
    	        stringScriptSql = stringScriptSql + "),("; 
    	    }
    	    
    	      stringScriptSql = stringScriptSql.substring(0,(stringScriptSql.lastIndexOf(",")));
    	      stringScriptSql = stringScriptSql + ";";
    	    
    	   System.out.print(stringScriptSql);
    	   
    	} catch (SAXException ex) {
    	    System.out.println("ERROR: El formato XML del fichero no es correcto\n"+ex.getMessage());
    	    ex.printStackTrace();
    	} catch (IOException ex) {
    	    System.out.println("ERROR: Se ha producido un error el leer el fichero\n"+ex.getMessage());
    	    ex.printStackTrace();
    	} catch (ParserConfigurationException ex) {
    	    System.out.println("ERROR: No se ha podido crear el generador de documentos XML\n"+ex.getMessage());
    	    ex.printStackTrace();
    	}
    	
    }
    	
    
}


