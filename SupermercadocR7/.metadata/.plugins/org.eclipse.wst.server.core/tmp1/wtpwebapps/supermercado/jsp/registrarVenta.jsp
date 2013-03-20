  <!DOCTYPE html>
<html>
<head>
<title>Supermercado</title>
<meta charset="utf-8">
<style type="text/css">
body,td,th {
	font-size: 18px;
}
</style>
</head>
<body><center>
  <table width="550" height="468" border="1" bgcolor="#CCCCCC">
    <tr>
      <td width="540" height="462"><div align="center">
        <form name="form1" method="post" action="">
          <label for="title"><br>
            <strong>Registrar Venta</strong><br>
            <br>
          </label>
          
        </form>
        <table width="434" border="1">
            <tr>
              <td><strong>Seleccionar Un Departamento:</strong></td>
              <td width="187"><strong>
                <select name="departamento" id="departamento">
                  <option value="-1"></option>
                  <option value="1">Farmacia</option>
                  <option value="2">Lacteos</option>
                  <option value="3">Carnes Frias</option>
                  <option value="4">Jugueteria</option>				  
                  <option value="4">Ropa</option>
                </select>
              </strong></td>
            </tr>
            <tr>
              <td><strong>
                <label for="articulo">Seleccionar Un Articulo</label>
              </strong></td>
              <td><strong>
                <select name="articulo" id="articulo">
                  <option value="-1"></option>
                  <option value="1">Jabon</option>
                  <option value="2">Leche</option>
                  <option value="3">Jamon pavo</option>
                  <option value="4">Balon</option>				  
                  <option value="5">Pantalon</option>
                  <option value="6">Shampoo</option>
                  <option value="8">Queso</option>
                </select>
              </strong></td>
            </tr>
            <tr>
              <td><strong>
                <label> Articulos Disponibles:</label>
              </strong></td>
              <td><strong>
                <label id="ib 1 No Copias"> X </label>
              </strong></td>
            </tr>
            <tr>
              <td><strong>
                <label>Nombre:</label>
              </strong></td>
              <td><strong>
                <label id="ib1Nombre"> ----- </label>
              </strong></td>
            </tr>
            <tr>
              <td><strong>
                <label>Primer Apellido:</label>
              </strong></td>
              <td><strong>
                <label id="ib1Apellido1"> ------- </label>
              </strong></td>
            </tr>
            <tr>
              <td><strong>
                <label>Segundo Apellido:</label>
              </strong></td>
              <td><strong>
                <label id="ib1Apellido2"> ------- </label>
              </strong></td>
            </tr>
          </table>
          <table>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td width="288"><div align="right">
                <button type="button" id="btnRegistrar" style="border-top-color:autofocus;cursor:pointer;">Registrar Venta</button>
              </div></td>
              <td width="127">&nbsp;</td>
            </tr>
 
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td width="22">&nbsp;</td>
            </tr>
   
          </table>
      </div></td>
    </tr>
  </table>
   </center>
</body>
</html>