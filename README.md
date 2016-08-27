# customprogressbar
自定义动画进度条<br>
------------------
移动旋转圆心<br>
------------------
int screenWidth = canvas.getWidth();<br>
int screenHeight = canvas.getHeight();<br>
int x = prograss_bg.getWidth();<br>
int y = prograss_bg.getHeight();<br>
canvas.translate(screenWidth/2 - x/2, screenHeight/2 - y/2);<br>
旋转<br>
--------
canvas.rotate(a, x/2, y/2);<br>
canvas.drawBitmap( prograss_bg , 0, 0, new Paint());<br>
canvas.restore();<br>
canvas.save();<br>
Bitmap prograss = BitmapFactory.decodeResource(getResources(), R.drawable.loading00);<br>
canvas.translate(screenWidth/2 - x/2, screenHeight/2 - y/2);<br>
canvas.drawBitmap( prograss , 0, 0, new Paint());<br>
canvas.restore();<br>
注意canvas.restore();canvas.save();要成对使用
---------------------------------------------------
