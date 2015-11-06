
var c = document.getElementById("myCanvas");
var ctx = c.getContext("2d");
ctx.fillStyle = "#FFFFFF";
ctx.fillRect(0, 0, c.width, c.height);


function myFunction(event)
{
	var x = event.pageX - c.offsetLeft - 5;	//5: border width
	var y = event.pageY - c.offsetTop - 5;
	//alert(x + ' ' + y);
	
	ctx.beginPath();
	ctx.arc(x, y, 1, 0, 2 * Math.PI);
	//need to map event coordinates to canvas coordinates
	ctx.stroke();
}