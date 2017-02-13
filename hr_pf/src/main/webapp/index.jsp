<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HR Tool - Login</title>
</head>
<body>
 
	<center>
		<h2>Please enter your credentials:</h2>
		<h3>
			Name: <input type="text" id="name"> <br/>
			<a href="" onclick="this.href='homepage?name='+document.getElementById('name').value">Login</a>
			<br/><br/><br/>
			<input type="button" value="Let's make a story! :)" onclick="story()" />
			<br/><br/><br/>
			<input type="button" value="Simple Math! :)" onclick="simplemath()" />
		</h3>
	</center>
</body>

<script>
function story(){
	var noun = prompt("Enter a noun:");
	var verb = prompt("Enter a verb:");
	var adjective = prompt("Enter a adjective:");
	var adverb = prompt("Enter a adverb:");
	story = "The " + adjective + " " + noun + " " + verb + " " + adverb + ".";
	alert(story);
}

function simplemath(){
	var no1 = prompt("First number:");
	var no2 = prompt("Second number:");
	var a = Number(no1);
	var b = Number(no2);
	
	var sum=a+b;
	var dif=a-b;
	var prod=a*b;
	var quot=a/b;
	
	var sumdisp = no1+" + "+no2+" = "+sum.toString()+"\n";
	var difdisp = no1+" - "+no2+" = "+dif.toString()+"\n";
	var proddisp = no1+" * "+no2+" = "+prod.toString()+"\n";
	var quotdisp = no1+" / "+no2+" = "+quot.toString();
	
	alert (sumdisp+difdisp+proddisp+quotdisp);
}
</script>

</html>

