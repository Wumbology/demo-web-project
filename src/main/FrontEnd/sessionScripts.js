
var c = document.getElementById("myCanvas");
var ctx = c.getContext("2d");
ctx.fillStyle = "#FFFFFF";
ctx.fillRect(0, 0, c.width, c.height);


function myFunction(event)
{
	ctx.beginPath();
	ctx.arc(event.x / 3, event.y / 3, 1, 0, 2 * Math.PI);
	//need to map event coordinates to canvas coordinates
	ctx.stroke();
}

