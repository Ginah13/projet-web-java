<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Les matrices</title>
</head>
<body>
	<h1>Les valeurs de la matrice</h1>
	<form method="POST" action="">
	
	<%
		double[][] matrice = (double[][]) request.getAttribute("matrice");
		double[] vecteur = (double[]) request.getAttribute("vecteur");

		MethodeGauss gauss = new MethodeGauss();
    	
    	gauss.triangulaire(matrice,vecteur);
    	double[] solution = gauss.resolution( matrice , vecteur);
	
    	if(solution!=null) {
	    	for (int i = 0; i < solution.length; i++) {
	    	    System.out.println("<p> x " + (i + 1) + " = " + solution[i] + "</p>");
	    		}
	    	}
	    	
		%>
	
	
	</form>
</body>
</html>