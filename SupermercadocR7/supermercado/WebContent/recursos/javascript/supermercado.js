//obtener el objeto XMLHttpRequest

function obtenerXMLHttpRequest(){
	if (window.XMLHttpRequest){
	   return new XMLHttpRequest();
	}else
	    if (window.ActiveXObject){
		try{
		   return new ActiveXObject("Msxml2.XMLHTTP");
		}catch(e){
		    try{
			return new ActiveXObject("Microsoft.XMLHTTP");
		    }catch(e){}
		}
	   }
	return false;
}

function obtenerArticulos(){
	document.body.style.cursor = "wait";
	var claveDepartamento = document.getElementById("departamento").value;
	var xmlHttpRequest = obtenerXMLHttpRequest();

	xmlHttpRequest.onreadystatechange = function(){
	if (xmlHttpRequest.readyState==4 &&
	(xmlHttpRequest.status ==200 ||window.location.href.indexOf("http")==-1 )){
	    document.getElementById("articulo_span").innerHTML = xmlHttpRequest.responseText;
	    document.body.style.cursor = "default";

	}

	};
	xmlHttpRequest.open("GET",'/supermercado/articulo.do?do=obtenerArticulos&departamento='
		+ claveDepartamento, true);
		
	xmlHttpRequest.send(null);
}

function consultarUsuario(){
	document.body.style.cursor = "wait";
	var claveUsuario = document.getElementById("usuario").value;
	var xmlHttpRequest = obtenerXMLHttpRequest();

	xmlHttpRequest.onreadystatechange = function(){
	if (xmlHttpRequest.readyState==4 &&
	(xmlHttpRequest.status ==200 ||window.location.href.indexOf("http")==-1 )){
	    document.getElementById("lblNombre").innerHTML = xmlHttpRequest.responseXML.getElementsByTagName("nombre")[0].childNodes[0].nodeValue;
	    document.getElementById("lblApellido1").innerHTML = xmlHttpRequest.responseXML.getElementsByTagName("apellido1")[0].childNodes[0].nodeValue;
        document.getElementById("lblApellido2").innerHTML = xmlHttpRequest.responseXML.getElementsByTagName("apellido2")[0].childNodes[0].nodeValue;		    
	    document.body.style.cursor = "default";
	}

	};
	xmlHttpRequest.open("GET",'/supermercado/usuario.do?do=obtenerUsuario&usu='
		+ claveUsuario, true);
		
	xmlHttpRequest.send(null);
}
function consultarArticulo(){
	document.body.style.cursor="wait";
	var claveArticulo=document.getElementById("articulo").value;
	var xmlHttpRequest=obtenerXMLHttpRequest();
	
	xmlHttpRequest.onreadystatechange=function(){
	if(xmlHttpRequest.readyState==4&&
	(xmlHttpRequest.status==200||window.location.href.indexOf("http")==-1)){
		
		document.getElementById("lblNombre").innerHTML=xmlHttpRequest.responseXML.getElementsByTagName("nombre")[0].childNodes[0].nodeValue;
		document.getElementById("lblPrecio").innerHTML=xmlHttpRequest.responseXML.getElementsByTagName("precio")[0].childNodes[0].nodeValue;
		document.getElementById("lblCantidad").innerHTML=xmlHttpRequest.responseXML.getElementsByTagName("cantidad")[0].childNodes[0].nodeValue;
		document.body.style.cursor = "default";
	}
	
	};
	xmlHttpRequest.open("GET",'/supermercado/articulo.do?do=obtenerArticulo&art='
			+ claveArticulo, true);
			
		xmlHttpRequest.send(null);
}

function registrarVenta(){
	document.body.style.cursor = "wait";
	var claveA = document.getElementById("articulo").value;
	var claveUsuario = document.getElementById("usuario").value;
	var xmlHttpRequest = obtenerXMLHttpRequest();

	xmlHttpRequest.onreadystatechange = function(){
	if (xmlHttpRequest.readyState==4 &&
	(xmlHttpRequest.status ==200 ||window.location.href.indexOf("http")==-1 )){
	    alert("Venta Exitosa¡¡");	
	    document.body.style.cursor = "default";
		
	}

	};
	xmlHttpRequest.open("GET",'/supermercado/venta.do?do=registrarVenta&usu='
		+ claveUsuario + '&a=' + claveA, true);
		
	xmlHttpRequest.send(null);/*en el parentesis va null*/
}
