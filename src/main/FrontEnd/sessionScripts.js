
var c = document.getElementById("myCanvas");
var ctx = c.getContext("2d");
ctx.fillStyle = "#FFFFFF";
ctx.fillRect(0, 0, c.width, c.height);
ctx.canvas.width = window.innerWidth;
ctx.canvas.height = window.innerHeight;
//need to load canvas state

var currentX, currentY;	//draw line/curve between points recorded by mouseMove
						//to get continuous drawing instead of individual circles


var brushSize = 1;	//get this from a setting

var border = 5;

var _mouseDown = false;

function mouseClick(event)
{
	draw(calcX(event.pageX), calcY(event.pageY), brushSize);
}

function mouseDown(event)
{
	_mouseDown = true;
	
	draw(calcX(event.pageX), calcY(event.pageY), brushSize);
}

function mouseUp(event)
{
	_mouseDown = false;
}

function mouseMove(event)
{
	if (_mouseDown)
	{
		draw(calcX(event.pageX), calcY(event.pageY), brushSize);
	}
}

function draw(x, y, size)
{
	
	ctx.beginPath();
	ctx.arc(x, y, size, 0, 2 * Math.PI);
	ctx.fillStyle = 'black';	//get this from a setting
	ctx.fill();
	ctx.stroke();
}

function calcX(rawX)
{
	return rawX - c.offsetLeft - border;
}

function calcY(rawY)
{
	return rawY - c.offsetTop - border;
}

function changeBrushSize(size)
{
	brushSize = size;
}