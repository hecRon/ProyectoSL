<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Supermercado</title>
<script type="text/javascript" src="/supermercado/recursos/javascript/supermercado.js"></script>
<meta charset="utf-8">
<style type="text/css">
body,td,th {
	font-size: 18px;
}
</style>
</head>

<body background="/supermercado/recursos/imagenes/pocoyo.gif">

<body><center/>
  <table width="550" height="468" border="1" bgcolor="#CCCCCC">
    <tr>
      <td width="540" height="462"><div align="center">
        <form name="form1" method="post" action="">
          <label for="title"><h2>
           <font color="blue"><blink><strong>Registrar Venta</strong></blink><br></font></h2>         
          </label>          
        </form>
        
        <table width="434" border="1">
            <tr>
              <td><strong>Seleccionar Un Departamento:</strong></td>
              <td width="187">
              	<select id="departamento" onchange="obtenerArticulos()">
					<option value="-1">
					</option>
						<c:forEach items="${vdepartamentos}" var="departamento">
							<option value="${departamento.clave}">
								<c:out value="${departamento.nombre}">
								</c:out>
							</option>
						</c:forEach>
				</select>
              </td>
              <td>              	
              </td>              
            </tr>
            <tr>
              <td>
              	<strong>
                	<label for="articulo">Seleccionar Un Articulo
                	</label>
              	</strong>
              </td>
           <td>
			  <span id="articulo_span">
			  </span>
		   </td>
		   <td>
		   </td>
		   </tr>
            <tr>
				<td>
					<strong>
						<label for="usuario"> Usuario
						</label>
					</strong>
				</td>
				<td><input type="text" size="10" id="usuario">
				</td> 
				<td>
					<button type="button" id="btnConsultarUsuario" style="border: none;cursor: pointer;" onclick="consultarUsuario()">
						<img alt="Consultar" src="/supermercado/recursos/imagenes/lupa3.jpg">
					</button>
				</td>
			</tr>
            <tr>
              <td>
              	<strong>
                	<label>Nombre:
                	</label>
              	</strong>
              </td>
              <td>
              	<strong>
                	<label id="lblNombre">
                		</label>
              	</strong>
              </td>
              <td>
              </td>
            </tr>
            <tr>
              <td>
              	<strong>
                	<label>Primer Apellido:
                	</label>
              	</strong>
              </td>
              <td>
              	<strong>
                	<label id="lblApellido1">
                	</label>
              	</strong>
              </td>
              <td>
              </td>
            </tr>
            <tr>
              <td>
              	<strong>
                	<label>Segundo Apellido:
                	</label>
              	</strong>
              </td>
              <td>
              	<strong>
                	<label id="lblApellido2">
                	</label>
              	</strong>
              </td>
              <td>
              </td>
            </tr>
          </table>
          <table>
            <tr>
              <td>&nbsp;
              </td>
              <td>&nbsp;
              </td>
            </tr>
           	<tr>
				<td>
					<button type="button" id="btnRegistrar" style="border:none; cursor: pointer;" onclick="registrarVenta()">Registrar Venta
					</button>
				</td>
			</tr>
            <tr>
              <td>&nbsp;
              	<LI>Regresar
              		<blink>
              			<A href="/supermercado/index.html">MENU PRINCIPAL
              			</A>
              		</blink>
              	</LI>
              </td>
              <td>&nbsp;
              </td>
            </tr>
            <tr>
              <td>&nbsp;
              </td>
              <td>&nbsp;
              </td>
              <td width="22">&nbsp;
              </td>
            </tr>
          </table>
      </div></td>
    </tr>
  </table>
   </center>
</body>
</html>