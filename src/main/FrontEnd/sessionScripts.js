
var c = document.getElementById("myCanvas");
var ctx = c.getContext("2d");
ctx.fillStyle = "#FFFFFF";
ctx.fillRect(0, 0, c.width, c.height);
ctx.canvas.width = window.innerWidth;
ctx.canvas.height = window.innerHeight;



function myFunction(event)
{
	var border = 5;
	var x = event.pageX - c.offsetLeft - 5;
	var y = event.pageY - c.offsetTop - 5;
	
	ctx.beginPath();
	ctx.arc(x, y, 1, 0, 2 * Math.PI);
	//need to map event coordinates to canvas coordinates
	ctx.stroke();
}